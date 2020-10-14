package com.jtfr.chapter225;

import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Properties;
import java.util.Vector;
import java.util.logging.Logger;

/**
 * 数据库链接池管理类
 *
 */
public class DBConnectionPool extends Pool {
    // TODO 未完成
    private static Logger LOGGER = Logger.getLogger(DBConnectionPool.class.getName());

    private int checkedOut; // 正在使用的连接数
    private Vector<Connection> freeConnections = new Vector<Connection>(); // 存放产生的连接对象容器
    private String userName = null; // username
    private String passWord = null; // password
    private String url = null; // connection string
    private static int num = 0; // idle connections number
    private static int numActive = 0; // current available connection
    private static DBConnectionPool pool = null; // connection pool variables


    /**
     * create data connection pool
     */
    public static synchronized DBConnectionPool getInstance(){
        if (pool == null){
            pool = new DBConnectionPool();
        }
        return pool;
    }

    /**
     * get on database connection pool instance
     */
    private DBConnectionPool(){
        try {
            init();
            // initial connection normalconnct
            for (int i = 0; i < normalConnect; i++) {
                Connection connection = newConnection();
                if (connection != null){
                    // container add connection object
                    freeConnections.add(connection);
                    // connection object total
                    num++;
                }
            }
        } catch (Exception e) {
            LOGGER.warning(e.toString());
        }
    }

    /**
     * init
     * @throws IOException
     */
    protected void init() throws IOException {
        InputStream is = DBConnectionPool.class.getResourceAsStream(propertiesName);
        Properties p = new Properties();
        p.load(is);
        this.userName = p.getProperty("userName");
        this.passWord = p.getProperty("passWord");
        this.driverName = p.getProperty("driverName");
        this.url = p.getProperty("url");
        this.driverName = p.getProperty("driverName");
        this.maxConnect = Integer.parseInt(p.getProperty("maxConnect"));
        this.normalConnect = Integer.parseInt(p.getProperty("normalConnect"));
    }

    public synchronized void freeConnections(Connection conn){
        freeConnections.addElement(conn);
        num++;
        checkedOut--;
        notifyAll();
    }

    /**
     * create new connction
     */
    private Connection newConnection(){
        Connection conn = null;
        try{
            conn = DriverManager.getConnection(url, userName, passWord);
        } catch (Exception e){
            LOGGER.info(e.toString());
        }
        return conn;
    }

    public void createPool() {
    }

    public synchronized Connection getConnection() {
        return null;
    }

    public Connection getConnection(long time) {
        return null;
    }

    public int getNum() {
        return num;
    }

    public int getNumActive() {
        return numActive ;
    }
}

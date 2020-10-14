package com.jtfr.chapter225;

import java.sql.Connection;
import java.util.Vector;

/**
 * 数据库链接池管理类
 */
public class DBConnectionPool extends Pool {

    private int checkedOut; // 正在使用的连接数
    private Vector<Connection> freeConnections = new Vector<Connection>(); // 存放产生的连接对象容器
    private String passWord = null; // 密码
    

    private DBConnectionPool(){

    }

    public void createPool() {

    }

    public Connection getConnection() {
        return null;
    }

    public Connection getConnection(long time) {
        return null;
    }

    public int getNum() {
        return 0;
    }

    public int getNumActive() {
        return 0;
    }
}

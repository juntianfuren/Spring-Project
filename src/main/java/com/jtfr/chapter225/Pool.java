package com.jtfr.chapter225;

import java.io.IOException;
import java.io.InputStream;
import java.sql.Driver;
import java.sql.DriverManager;
import java.util.Properties;

/**
 * 1. 自定义连接池 getInstance()，返回 Pool 的唯一实例，第一次调用时将执行构造函数。
 * 2. 构造函数 Pool() 调用驱动装载 loadDrivers() 函数；createPool() 函数创建连接池，loadDirvers() 装载驱动。
 * 3. getConnection() 返回一个连接实例，getConnection(long time) 添加时间限制
 * 4. freeConnection(Connection conn)将conn连接实例返回连接池，getNum() 返回空闲连接数
 * 5. getNumActive() 返回当前使用的连接数
 */
public class Pool {

    public String propertiesName = "connection-INF.properties";

    private static Pool instance = null; // 定义唯一实例

    protected int maxConnect = 108; // 最大连接数

    protected int normalConnect = 10; // 保持连接数

    protected String driverName = null; // 驱动字符串

    protected Driver driver = null; // 驱动变量

    private Pool(){
        try {
            init();
            loadDrivers(driverName);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * 初始化所有从配置文件中读取的成员变量
     */
    private void init() throws IOException {
        InputStream is = Pool.class.getResourceAsStream(propertiesName);
        Properties p = new Properties();
        p.load(is);
        this.driverName = p.getProperty("driverName");
        this.maxConnect = Integer.parseInt(p.getProperty("maxConnect"));
        this.normalConnect = Integer.parseInt(p.getProperty("normalConnect"));
    }

    /**
     * 装载和注册所有 JDBC 驱动程序
     * @param driverName
     */
    private void loadDrivers(String driverName) {
        String driverClassName = driverName;
        try {
            this.driver = (Driver) Class.forName(driverClassName).newInstance();
            DriverManager.registerDriver(this.driver);
            System.out.println("成功注册 JDBC 驱动程序"+ driverClassName);
        } catch (Exception e) {
            System.out.println("无法注册 JDBC 驱动程序："+driverClassName+", 错误："+e);
        }
    }
}

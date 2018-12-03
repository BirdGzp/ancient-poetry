package com.moon.ancientpoetry.common.util.spider.Dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class SqlConn {

    //驱动程序名
    static String driver = "com.mysql.jdbc.Driver";
    //URL指向要访问的数据库名mydata
    static String url = "jdbc:mysql://localhost:3306/ancient_article?autoReconnect=true&useUnicode=true&characterEncoding=utf8";
    //MySQL配置时的用户名
    static String user = "root";
    //MySQL配置时的密码
    static String password = "root";

    public static Connection getConn() throws ClassNotFoundException, SQLException {
        Class.forName(driver);
        //1.getConnection()方法，连接MySQL数据库！！
        return DriverManager.getConnection(url,user,password);
    }

    public static void close(Connection connection) throws SQLException {
        connection.close();
    }
}

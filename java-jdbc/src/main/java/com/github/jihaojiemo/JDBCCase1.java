package com.github.jihaojiemo;

import java.sql.*;
import java.time.LocalDateTime;

/**
 * Description: 演示JDBC开发流程（查询）
 * Author: admin
 * Create: 2019-06-30 10:03
 */
public class JDBCCase1 {

    public static void main(String[] args) {

        try {
            //1.加载数据库驱动
            Class.forName("com.mysql.jdbc.Driver");

            //2.创建连接 jdbc:mysql://服务器地址:端口/数据库名?参数名=参数值
            String url = "jdbc:mysql://127.0.0.1:4406/memo?user=root&password=jhj52000&useSSL=false";
            Connection connection = DriverManager.getConnection(url);

            //3.准备sql语句
            String sql = "select id,name,created_time,modify_time from memo_group";

            //4.创建命令
            Statement statement = connection.createStatement();

            //5.执行命令
            ResultSet resultSet = statement.executeQuery(sql);

            //6.返回结果处理
            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                String name = resultSet.getString("name");
                LocalDateTime created_time = resultSet.getTimestamp("created_time").toLocalDateTime();
                LocalDateTime modify_time = resultSet.getTimestamp("modify_time").toLocalDateTime();

                System.out.println(id + " " + name + " " + created_time + " " + modify_time);
            }

            //7.关闭结果处理
            resultSet.close();
            //8.关闭命令
            statement.close();
            //9.关闭连接
            connection.close();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}

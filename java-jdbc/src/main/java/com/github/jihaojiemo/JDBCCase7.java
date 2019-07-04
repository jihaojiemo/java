package com.github.jihaojiemo;

import java.sql.*;
import java.time.LocalDateTime;

/**
 * Description: 预编译指令（SQL中 ? 作为占位符）
 * Author: admin
 * Create: 2019-07-02 7:56
 */
public class JDBCCase7 {

    public static void queryMemoGroup(String groupName) {

        Connection connection = null;
        PreparedStatement statement = null;
        ResultSet resultSet = null;

        try {
            Class.forName("com.mysql.jdbc.Driver");
            String url = "jdbc:mysql://127.0.0.1:4406/memo?user=root&password=jhj52000&useSSL=false";
            connection = DriverManager.getConnection(url);
            String sql = "select id,name,created_time,modify_time from memo_group where name= ? ";
            statement = connection.prepareStatement(sql);

            //参数赋值 parameterIndex 从1开始
            statement.setString(1, groupName);

            resultSet = statement.executeQuery();
            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                String name = resultSet.getString("name");
                LocalDateTime createdTime = resultSet.getTimestamp("created_time").toLocalDateTime();
                LocalDateTime modifyTime = resultSet.getTimestamp("modify_time").toLocalDateTime();
                System.out.println(id + " " + name + " " + createdTime + " " + modifyTime);
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            if (resultSet != null) {
                try {
                    resultSet.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            if (statement != null) {
                try {
                    statement.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            if (connection != null) {
                try {
                    connection.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public static void main(String[] args) {

        //阻止了SQL注入攻击（参数赋值的方法）
        queryMemoGroup("' or 1=1 or name='");
        //select username,password from account where username='' and password=' ' or 1=1;
    }
}

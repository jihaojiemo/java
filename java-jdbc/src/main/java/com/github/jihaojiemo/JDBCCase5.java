package com.github.jihaojiemo;

import java.sql.*;
import java.time.LocalDateTime;

/**
 * Description: try-with-resources方式自动关闭资源
 * Author: admin
 * Create: 2019-07-01 18:33
 */
public class JDBCCase5 {

    public static void main(String[] args) {

        try {
            Class.forName("com.mysql.jdbc.Driver");
            String url = "jdbc:mysql://127.0.0.1:4406/useSSL=false";
            String sql = "select id,name,created_time,modify_time from memo_group";

            try(Connection connection = DriverManager.getConnection(url, "root", "jhj52000");
                    Statement statement = connection.createStatement();
                    ResultSet resultSet = statement.executeQuery(sql)
            ) {
                while (resultSet.next()) {
                    int id = resultSet.getInt("id");
                    String name = resultSet.getString("name");
                    LocalDateTime created_time = resultSet.getTimestamp("created_time").toLocalDateTime();
                    LocalDateTime modify_time = resultSet.getTimestamp("modify_time").toLocalDateTime();

                    System.out.println(id + " " + name + " " + created_time + " " + modify_time);
                }
            }
            //自动关闭就不用了关闭了
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}

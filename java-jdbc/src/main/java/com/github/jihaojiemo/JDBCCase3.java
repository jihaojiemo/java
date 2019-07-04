package com.github.jihaojiemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * Description: 演示JDBC开发流程（插入）
 * Author: admin
 * Create: 2019-07-01 17:18
 */
public class JDBCCase3 {

    public static void main(String[] args) {

        try {
            Class.forName("com.mysql.jdbc.Driver");
            String url = "jdbc:mysql://127.0.0.1:4406/memo?useSSL=false";
            Connection connection = DriverManager.getConnection(url, "root", "jhj52000");
            String sql = "insert into memo_group(name,created_time) values ('JDBC组','2019-06-30 10:00:00')";
            Statement statement = connection.createStatement();
            int effect = statement.executeUpdate(sql);
            if (effect == 1) {
                System.out.println("插入成功");
            }else {
                System.out.println("插入失败");
            }
            statement.close();
            connection.close();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}

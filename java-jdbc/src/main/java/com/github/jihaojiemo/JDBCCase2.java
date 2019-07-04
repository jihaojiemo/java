package com.github.jihaojiemo;

import java.sql.*;

/**
 * Description: 演示JDBC开发流程（删除）
 * Author: admin
 * Create: 2019-06-30 12:33
 */
public class JDBCCase2 {

    public static void main(String[] args) {

        Connection connection = null;
        Statement statement = null;
        ResultSet resultSet = null;

        try {
            //加载数据库驱动
            Class.forName("com.mysql.jdbc.Driver");
            //创建连接
            String url = "jdbc:mysql://127.0.0.1:4406/memo?useSSL=false";
            connection = DriverManager.getConnection(url, "root", "jhj52000");
            //创建命令 *
            String sql = "delete from memo_group where id = 666";
            statement = connection.createStatement();
            //执行命令 *
            int effect = statement.executeUpdate(sql);
            //返回处理结果 *
            if (effect == 1) {
                System.out.println("删除成功" + " " + effect);
            }else {
                System.out.println("删除失败" +  " " + effect);
            }

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
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
}

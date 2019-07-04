package com.github.jihaojiemo;

import java.sql.*;

/**
 * Description: 模板设计模式 + 函数接口
 * Author: admin
 * Create: 2019-07-02 10:06
 */
public class JDBCTemplate {

    private Connection connection;
    private Statement statement;
    private ResultSet resultSet;

    public final <P, R> R execute(String sql, Handler<P, R> handler) {

        R result = null;

        try {
            this.loadDriver();
            this.createConnection();
            this.createStatement();
            if (sql.trim().toUpperCase().startsWith("SELECT")) {
                this.callQuery(sql);
                result = handler.handle((P) this.resultSet);
            }else {
                Integer value = this.callUpdate(sql);
                result = handler.handle((P) value);
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return result;
    }

    private void loadDriver() throws ClassNotFoundException {
        Class.forName("com.mysql.jdbc.Driver");
    }

    private void createConnection() throws SQLException {
        String url = "jdbc:mysql://127.0.0.1:4406/memo?useSSL=false";
        this.connection= DriverManager.getConnection(url, "root", "jhj52000");
    }

    private void createStatement() throws SQLException {
        this.statement = this.connection.createStatement();
    }

    private void callQuery(String sql) throws SQLException {
        this.resultSet = this.statement.executeQuery(sql);
    }
    private Integer callUpdate(String sql) throws SQLException {
        return this.statement.executeUpdate(sql);
    }

    private void close() {
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

@FunctionalInterface
interface Handler<P, R> {

    R handle(P p) throws SQLException;
}


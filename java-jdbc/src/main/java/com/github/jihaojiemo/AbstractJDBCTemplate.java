package com.github.jihaojiemo;

import java.sql.*;
import java.time.LocalDateTime;

/**
 * Description: 模板设计模式
 * Author: admin
 * Create: 2019-07-02 8:00
 */
public abstract class AbstractJDBCTemplate {

    private Connection connection;
    private Statement statement;
    private ResultSet resultSet;

    //模板执行流程
    public final void execute(String sql) {
        try {
            this.loadDriver();
            this.createConnection();
            this.createStatement();
            //sql通过方法传入
            if (sql.trim().toUpperCase().startsWith("SELECT")) {
                this.callQuery(sql);
                this.handlerResult(this.resultSet);
            } else {
                Integer effect = callUpdate(sql);
                this.handlerResult(effect);
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

    //1.加载驱动
    private void loadDriver() throws ClassNotFoundException {
        Class.forName("com.mysql.jdbc.Driver");
    }

    //2.创建连接
    private void createConnection() throws SQLException {
        String url = "jdbc:mysql://127.0.0.1:4406/memo?useSSL=false";
        this.connection = DriverManager.getConnection(url, "root", "jhj52000");
    }

    //3.准备sql
    //public abstract String getSql();

    //4.创建命令
    private void createStatement() throws SQLException {
        this.statement=this.connection.createStatement();
    }

    //5.执行命令
    //public abstract void callStatement();
    private void callQuery(String sql) throws SQLException {
        this.resultSet = statement.executeQuery(sql);
    }
    private Integer callUpdate(String sql) throws SQLException {
        return this.statement.executeUpdate(sql);
    }

    //6.处理结果（ResuletSet、Integer）
    public abstract void handlerResult(ResultSet resultSet) throws SQLException;
    public abstract void handlerResult(Integer value);

    //7.关闭资源
    public void close() {
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

    public static void main(String[] args) {

        AbstractJDBCTemplate template = new JDBCTemplate1();
        template.execute("select id, name, created_time, modify_time from memo_group");
        template.execute("delete from memo_group where id= 667");
    }
}

class JDBCTemplate1 extends AbstractJDBCTemplate {

    @Override
    public void handlerResult(ResultSet resultSet) throws SQLException {
        while (resultSet.next()) {
            int id = resultSet.getInt("id");
            String name = resultSet.getString("name");
            LocalDateTime created_time = resultSet.getTimestamp("created_time").toLocalDateTime();
            LocalDateTime modify_time = resultSet.getTimestamp("modify_time").toLocalDateTime();
            System.out.println(id + " " + name + " " + created_time + " " + modify_time);
        }
    }

    @Override
    public void handlerResult(Integer value) {
        System.out.println("更新结果" + value);
    }
}
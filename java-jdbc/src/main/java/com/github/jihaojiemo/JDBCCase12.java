package com.github.jihaojiemo;

import java.sql.*;
import java.time.LocalDateTime;

/**
 * Description: 事务控制
 *  1. 方法中一组DML操作
 *  2. 事务提交：正确 且 符合业务逻辑
 *  3. 事务回滚：错误 或者 不符合业务逻辑
 * Author: admin
 * Create: 2019-07-02 15:32
 */
public class JDBCCase12 {

    //创建便签和便签组
    public static boolean createMemoInfo(MemoGroup memoGroup, MemoInfo memoInfo) {

        Connection connection = null;

        try {
            Class.forName("com.mysql.jdbc.Driver");
            String url = "jdbc:mysql://127.0.0.1:4406/memo?useSSL=false";
            connection = DriverManager.getConnection(url, "root", "jhj52000");

            //默认自动提交的，如果事务控制了，需要设置true
            connection.setAutoCommit(false);

            String insertMemoGroupSql = "insert into memo_group (id, name, created_time) values (?,?,?)";
            String insertMemoInfoSql = "insert into memo_info (id, group_id, title, content, created_time) values (?,?,?,?,?) ";

            int effectA = -1;
            int effectB = -1;

            //插入memo_group
            try (PreparedStatement statement = connection.prepareStatement(insertMemoGroupSql)) {
                statement.setInt(1, memoGroup.getId());
                statement.setString(2, memoGroup.getName());
                statement.setTimestamp(3, Timestamp.valueOf(memoGroup.getCreatedTime()));

                effectA = statement.executeUpdate();
            }

            //插入memo_info
            try (PreparedStatement statement = connection.prepareStatement(insertMemoInfoSql)) {
                statement.setInt(1, memoInfo.getId());
                statement.setInt(2, memoInfo.getGroupId());
                statement.setString(3, memoInfo.getTitle());
                statement.setString(4, memoInfo.getContent());
                statement.setTimestamp(5, Timestamp.valueOf(memoInfo.getCreatedTime()));

                effectB = statement.executeUpdate();
            }

            if (effectA == 1 && effectB == 1) {
                connection.commit();
                return true;
            }else {
                connection.rollback();
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            if (connection != null) {
                try {
                    connection.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {

        //准备数据
        MemoGroup memoGroup = new MemoGroup();
        memoGroup.setId(12);
        memoGroup.setName("Java8组");
        memoGroup.setCreatedTime(LocalDateTime.now());

        MemoInfo memoInfo = new MemoInfo();
        memoInfo.setId(10);
        memoInfo.setGroupId(memoGroup.getId());
        memoInfo.setTitle("JDBC笔记");
        memoInfo.setContent("~~~~~");
        memoInfo.setCreatedTime(LocalDateTime.now());

        boolean rs = createMemoInfo(memoGroup, memoInfo);

        if (rs) {
            System.out.println("创建组" + memoGroup + "和便签" + memoInfo + "成功");
        } else {
            System.out.println("创建组" + memoGroup + "和便签" + memoInfo + "失败");
        }
    }
}



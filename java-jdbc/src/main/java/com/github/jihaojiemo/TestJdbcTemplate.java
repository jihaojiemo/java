package com.github.jihaojiemo;

import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Description:
 * Author: admin
 * Create: 2019-07-02 20:36
 */
public class TestJdbcTemplate {

    public static void main(String[] args) {

        JDBCTemplate template = new JDBCTemplate();

        String sql = "select id, name from memo_group";
        String result = template.execute(sql, new Handler<ResultSet, String>() {
            @Override
            public String handle(ResultSet resultSet) throws SQLException {

                StringBuilder sb = new StringBuilder();
                while (resultSet.next()) {
                    sb.append(resultSet.getInt("id")).append(" ")
                            .append(resultSet.getString("name")).append("\n");

                }
                return sb.toString();
            }
        });
        System.out.println(result);


        sql = "select id, title, content from memo_info";
        result = template.execute(sql, new Handler<ResultSet, String>() {
            @Override
            public String handle(ResultSet resultSet) throws SQLException {

                StringBuilder sb = new StringBuilder();
                while (resultSet.next()) {
                    sb.append(resultSet.getInt("id")).append(" ")
                            .append(resultSet.getString("title")).append(" ")
                            .append(resultSet.getString("content")).append("\n");
                }
                return sb.toString();
            }
        });
        System.out.println(result);


        sql = "select count(*) as total from memo_group";
        Integer count = template.execute(sql, (Handler<ResultSet, Integer>) resultSet -> {
            Integer totalRow = 0;
            while (resultSet.next()) {
                totalRow = resultSet.getInt("total");
            }
            return totalRow;
        });
        System.out.println("Memo_group一共有" + count + "条记录");


        sql = "delete from memo_group where id=1";
        result = template.execute(sql, (Handler<Integer, String>) integer -> {
            if (integer == 1) {
                return "删除成功";
            }else {
                return "删除失败";
            }
        });
        System.out.println(result);
    }
}

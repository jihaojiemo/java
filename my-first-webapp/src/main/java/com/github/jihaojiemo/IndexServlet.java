package com.github.jihaojiemo;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDateTime;

public class IndexServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req,
                         HttpServletResponse resp) throws ServletException, IOException {

        resp.setCharacterEncoding("UTF-8");
        resp.setContentType("text/html");
        PrintWriter writer = resp.getWriter();

        writer.write("<html>");
            writer.write("<head>");
                writer.append("<title>").append("Servlet程序").append("</title>");
            writer.write("</head>");
            writer.write("<body>");
                writer.append("<h1>").append("当前时间").append("</h1>");
                writer.append("<p>").append(LocalDateTime.now().toString()).append("</p>");
            writer.write("</body>");
        writer.write("</body>");

        writer.flush();
    }
}

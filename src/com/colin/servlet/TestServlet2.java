package com.colin.servlet;

import com.colin.mysession.MySession;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author Wdttee
 * @description This is description of class
 * @datetime 9:48 2022/11/8 2022
 */
@WebServlet("/test2")
public class TestServlet2 extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        MySession session = MySession.getSession(req, resp);
        Object a = session.getAttribute("a");
        System.out.println(a);
    }
}

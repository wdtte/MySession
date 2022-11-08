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
 * @datetime 9:47 2022/11/8 2022
 */
@WebServlet("/test1")
public class TestServlet1 extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //Every time when the client request comes
        MySession session = MySession.getSession(req, resp);
        session.setAttribute("a", "wdte");
        //The server will give client a cookie that named "colin" at the first call of getSession() method.

        //Among the future call of getSession() method, the client will get its own session(MySession).
        System.out.println("The session id is : " + session.getId());
    }
}

package com.example.bt2;

import java.io.*;
import javax.servlet.ServletException;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

@WebServlet(name = "caculator", value = "/hello-servlet")
public class HelloServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        int operand1 = Integer.parseInt(req.getParameter("operand1"));
        int operand2 = Integer.parseInt(req.getParameter("operand2"));
        int select = Integer.parseInt(req.getParameter("select"));
        String error = null;
        float result = 0;

        if (select == 1) {
            result = operand1 + operand2;
        } else if (select == 2) {
            result = operand1 - operand2;
        } else if (select == 3) {
            result = operand1 * operand2;
        } else if (select == 4) {
            if (operand2 != 0) {
                result = operand1 / operand2;
            } else {
                error = "Không chia hết được cho 0";
            }
        }
        req.setAttribute("result", result);
        req.setAttribute("error", error);
        req.getRequestDispatcher("result.jsp").forward(req, resp);
    }
}
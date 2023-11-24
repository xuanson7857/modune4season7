package com.example.bt1;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet(name = "Customer", value = "/CustomerList")
public class Customers extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        List<Customer> customers = new ArrayList<>();
        customers.add(new Customer("Nguyễn Văn A", "1/1/1999", "Hà Nội", "https://imgt.taimienphi.vn/cf/Images/tt/2021/8/20/top-anh-dai-dien-dep-chat-39.jpg"));
        customers.add(new Customer("Nguyễn Văn B", "2/2/1998", "Nghệ An", "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcS_FKkoTktuqQXm1BlMD105ktOB5eyBfrazRw&usqp=CAU"));
        customers.add(new Customer("Nguyễn Văn C", "3/3/1997", "Hà Nội", "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTYSjbZzpV7Zi2iEJzG1zCiF7ESeHREtfWiQA&usqp=CAU"));
        customers.add(new Customer("Nguyễn Văn D", "4/4/1995", "Hà Nội", "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcR5gViuGUHbx3_fIQEIdeLqHwV0SR4bpGkPXw&usqp=CAU"));
        customers.add(new Customer("Nguyễn Văn E", "5/5/1994", "Hà Nội", "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSUeqtRbqmwhKHgwlczOfqDS9GgtlTG50-Dvw&usqp=CAU"));
        req.setAttribute("customers", customers);
        req.getRequestDispatcher("Customer.jsp").forward(req, resp);
    }
}
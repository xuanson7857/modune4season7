<%@ page import="java.util.Map" %>
<%@ page import="java.util.HashMap" %>
<%@ page import="java.io.PrintWriter" %><%--
  Created by IntelliJ IDEA.
  User: ASUS
  Date: 11/22/2023
  Time: 9:52 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%
    Map<String, String> dic = new HashMap<>();
%>
<%
    dic.put("hello","Xin chao");
    dic.put("how","The nao");
    dic.put("book","Quyen vo");
    dic.put("computer","May tinh");

    String search= request.getParameter("search");

    String result=dic.get(search);
    PrintWriter writer=response.getWriter();
    if(result!=null){
        writer.write("<h1>Vietnamese : "+search+"</h1>");
        writer.write("<h1>English : "+result+"</h1>");
    }else {
        writer.write("<h1>Not Found</h1>");
    }
%>

</body>
</html>

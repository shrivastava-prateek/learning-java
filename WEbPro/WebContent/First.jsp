<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%!
int i;
String s;
int m1(){return 10;}
%>

<%
i=10;
s="Hello world";
%>

<%= "i is : "+i %>
<%= "s is : "+s%>
<%= m1() %>

</body>
</html>
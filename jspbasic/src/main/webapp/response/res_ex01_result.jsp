<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	request.setCharacterEncoding("utf-8");
	int age =  Integer.parseInt(request.getParameter("age"));
	
	if (age >= 20) {
		response.sendRedirect("res_ex01_ok.jsp");
	}else if (age < 20) {
		response.sendRedirect("res_ex01_no.jsp");
	}
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

</body>
</html>
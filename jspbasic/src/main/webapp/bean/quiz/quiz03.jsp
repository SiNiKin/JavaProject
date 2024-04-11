<%@page import="com.bean.User"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	String id = request.getParameter("id");
	String pw = request.getParameter("pw");
%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>quiz03.jsp</title>
	</head>
	
	<body>
		<!-- 자바 코드 이용 -->
		<%
			User user = (User)request.getAttribute("user");
		%>
		<%=user.getId() %> 님 회원가입을 축하합니다. <br>
		비밀번호는 <%=user.getPw() %>입니다.
		
		
		<!-- 
		<%--
		<%=id %>님의 회원 가입을 축하합니다. <br>
		비밀번호는 <%=pw %>입니다.
		--%>
		 -->
	
	</body>
</html>
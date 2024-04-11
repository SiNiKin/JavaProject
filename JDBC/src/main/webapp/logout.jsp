<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	if(session.getAttribute("user_id") == null){
		response.sendRedirect("login.jsp");
	}else{
		session.removeAttribute("user_id");

		// 밑에 두개만 써도 됨
		// 로그아웃 처리 및 세션의 삭제, 리다이렉트
		session.invalidate();
		response.sendRedirect("login.jsp");	
	}
%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>logout.jsp</title>
	</head>
	
	<body>
	
	</body>
</html>
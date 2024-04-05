<%@page import="java.util.Random"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%!
	public static int method(){
		int result = 0;
		return result+= 1;	
	}
%>
    
<%
	Random ran = new Random();
	int num = ran.nextInt(10) + 1;
	
%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>tag_ex01</title>
	</head>
	
	<body>
		
		페이지 누적요청 : <%=method() %> <br>
		
		오늘의 숫자 : <%=num %>
		
	</body>
</html>
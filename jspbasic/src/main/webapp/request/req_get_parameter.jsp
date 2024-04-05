<%@page import="java.util.Arrays"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%
	String id = request.getParameter("id");
	String password = request.getParameter("password");
	String name = request.getParameter("name");
	String addr = request.getParameter("addr");
	// Checkbox는 values메서드를 이용해서 처리함.
	String[] intro = request.getParameterValues("intro");
	String major = request.getParameter("major");
	String phone = request.getParameter("phone");
	
%>

<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>req_getParameter.jsp</title>
	</head>
	
	<body>
		
		아이디 : <%=id %> <br>
		비밀번호 : <%=password %> <br>
		이름 : <%=name %> <br>
		주소 : <%=addr %> <br>
		관심분야 : <%=Arrays.toString(intro) %> <br>
		전공 : <%=major %> <br>
		통신사 : <%=phone %> <br>
		
		<br>
		<input type="submit" value="가입"><br>
		
	</body>
</html>
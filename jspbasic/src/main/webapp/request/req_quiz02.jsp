<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>req_quiz02</title>
	</head>
	
	<body>
		
		<form action="req_test02_post_parameter.jsp" method="post">
		
		<%
			for (int i = 1; i <= 30; i++) {
		%>
				<a href="req_test02_post_parameter.jsp?num=<%=i %>">
				<%=i %>번학생
				</a> <br>
		<%		
			}
		%>
		
		
		
		
		</form>
		
	</body>
</html>
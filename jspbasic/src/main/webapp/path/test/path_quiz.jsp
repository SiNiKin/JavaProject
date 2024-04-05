<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>path_quiz</title>
	</head>
	
	<body>
		<!-- a 태그를 이용하여 경로 이동 -->
		<!-- /jspbasic/path/test/path_quiz.jsp -->
		
		<!-- 1. jspbasic폴더에 03.express.jsp 파일로 접근 상대 / 절대 경로로 접근 -->
		<a href="../../jspbasic/03.expression.jsp">03.expression로 이동 (상대)</a> <br>
		<a href="/jspbasic/jspbasic/03.expression.jsp">03.expression로 이동 (절대)</a> <br>
		
		<!-- 2. TestServlet 서블릿 페이지로 상대/절대 경로로 접근 -->
		<a href="../../TestServlet">TestServlet로 이동 (상대)</a> <br>
		<a href="/jspbasic/TestServlet">TestServlet로 이동 (절대)</a> <br>
		
		<!-- 3. images 폴더에 있는 이미지 파일에 상대 경로로 접근 -->
		<img src="../../../HTML/images/80cd4e97b7019316ffc477d50f477034.jpg" width="100"> <br>
		
	</body>
</html>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Insert title here</title>
	</head>
	<body>
		<c:choose>
			<c:when test="${param.point >= 90 }">
			A입니다.
			</c:when>
			<c:when test="${param.point >= 80 }">
			B입니다.
			</c:when>
			<c:when test="${param.point >= 70 }">
			C입니다.
			</c:when>
			<c:when test="${param.point >= 60 }">
			D입니다.
			</c:when>
			<c:when test="${param.point < 50 }">
			F입니다.
			</c:when>
		</c:choose>
	</body>
</html>
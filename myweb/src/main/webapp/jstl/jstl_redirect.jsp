<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>jstl_redirect.jsp</title>
	</head>
	
	<body>
		<c:redirect url="jstl_etc2.jsp">
			<c:param name="abc" value="안녕!! redirect 테스트야~!! 뿡" />
			<c:param name="abc2" value="c:url로 넘겨주는 값 입니다... 대머리 깎아라 뿡" />
		</c:redirect>
		
		
	</body>
</html>
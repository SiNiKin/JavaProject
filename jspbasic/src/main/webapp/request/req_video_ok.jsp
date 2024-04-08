<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	String num = request.getParameter("num");
	Integer sel = Integer.parseInt(num);
%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>req_video_ok.jsp</title>
	</head>
	
	<body>
		<%
			if(num == null) {
		%>
				잘못된 접근입니다.
		<%		
			} else if (sel == 1) {
		%>
				<div align="center">
					<h2>무장강도 수업</h2>
					<p>무장강도 수업 중에 하나...</p>
					<hr>
					<iframe width="640" height="480" src="https://www.youtube.com/embed/bUk8PzfwpZg" title="FBI OPEN UP! 풀영상" frameborder="0" allow="accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture; web-share" referrerpolicy="strict-origin-when-cross-origin" allowfullscreen></iframe>
				</div>
		<%		
			} else if (sel == 2) { 
		%>
				<div align="center">
					<h2>간지 드라이브 수업</h2>
					<p>간지 쌈@뽕한 드라이브 수업 중에 하나...</p>
					<hr>
					<iframe width="640" height="480" src="https://www.youtube.com/embed/7fL7rr4pXPo" title="00년대 일본" frameborder="0" allow="accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture; web-share" referrerpolicy="strict-origin-when-cross-origin" allowfullscreen></iframe>
				</div>
		<%
			}
		%>
	</body>
</html>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>req_video.jsp</title>
	</head>
	
	<body>
		<!-- 
		테이블 페이지에서 a태그의 url 주소 뒤에 있는 title 변수로 각각의 식별값을 담아서 이동
		ok 페이지에서는 넘어오는 값에 따라서 if ~ else if ~ else 형태로 다른 화면이 보이게
		처리
		-->
		<div align="center">	<!-- 블럭을 만들어 사용하는 태그 -->
			<table border = "1">
				<tr>
					<th>이미지</td>
					<th>장르</td>
					<th>이름</td>
					<th>등록일</td>
				</tr>
				<tr>
					<td>
						<a href = "req_video_ok.jsp?num=1">
							<img alt="첫번째 영상" src="../images/IMG_9446.jpg" width = "100" hwight = "100">
						</a>
					</td>
					<td>실습</td>
					<td>무장강도 수업 중</td>
					<td>24.04.08</td>
				</tr>
				<tr>
					<td>
						<a href = "req_video_ok.jsp?num=2">
							<img alt="두번쨰 영상" src="../images/IMG_9447.jpg" width = "100" hwight = "100">
						</a>
					</td>
					<td>실습</td>
					<td>간지 드라이브 수업</td>
					<td>24.04.08</td>
				</tr>
			</table>
		
		</div>
		
	</body>
</html>
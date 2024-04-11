<%@page import="com.bean.User"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%
	/*
		1. 앞에서 넘어온 폼값을 받아서 처리
		2. pw와 pw_check가 같다면
		   User객체에 form에서 넘어온 id, pq를 저장하고,
		   User객체를 quiz03.jsp로 넘깁니다.
		   "화면에 id님의 회원 가입을 축하합니다. 비밀번호는 xxx입니다."
		3. pw와 pw_check가 다르다면
		   quiz04.jsp로 넘어가서 "회원가입에 실패했습니다." 출력
	*/
	request.setCharacterEncoding("utf-8");

	// 자바코드이용
	String id = request.getParameter("id");
	String pw = request.getParameter("pw");
	String pw_check = request.getParameter("pw_check");
	
	if(pw.equals(pw_check)) {	// 액션태그 사용시 if (user.getPw().equals(pw_check)) {
		User user = new User();
		user.setId(id);
		user.setPw(pw);
		
		request.setAttribute("user", user);
		
		RequestDispatcher dp = request.getRequestDispatcher("quiz03.jsp");
		dp.forward(request, response);
		
		/*
		<jsp:useBean id="user" class="com.bean.User" scope="request" />
 		<jsp:setProperty property="*" name="user"/>
		<jsp:forward page="quiz03.jsp" />
		*/
	}else{
		response.sendRedirect("quiz04.jsp");
	}
	

%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>quiz02.jsp</title>
	</head>
	
	<body>
	 	<!-- 
		<jsp:useBean id="user" class="com.bean.User" scope="request" />
		<jsp:getProperty property="id" name="user"/>
		<jsp:getProperty property="name" name="user"/>
		 -->
		 
		 <!--  
		 <%--
		 	if(pw.equals(pw_check)) {
		 %>
		 		<jsp:useBean id="user1" class="com.bean.User" scope="request" />
		 		<jsp:getProperty property="id" name="user1"/>
				<jsp:getProperty property="name" name="user1"/>
				<jsp:forward page="quiz03.jsp" />
		 <%
		 	}else{ %>
		 		<jsp:forward page="quiz04.jsp" />
		 <%}--%>
		-->
	</body>
</html>
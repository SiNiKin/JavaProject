<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%
	request.setCharacterEncoding("utf-8");
	String name = request.getParameter("name");
	String height = request.getParameter("height");
	String weight = request.getParameter("weight");
	
	
	double kg = Double.parseDouble(weight);
	double cm = Double.parseDouble(height);
	double bmi = kg / ((cm/100) * (cm/100));
	String str = String.format("%.2f", bmi);
%>
<!DOCTYPE html>
<html>

<!-- if을 통해 BMI지수가 25이상 과체중, 18 이하라면 저체중, 나머지는 정상으로 출력 -->
	<head>
		<meta charset="UTF-8">
		<title>req_test_post_parameter.jsp</title>
	</head>
	
	<body>
		이름 : <%=name %> <br>
		키 : <%=height %> <br>
		몸무게 : <%=weight %> <br>
		BMI 지수 : <%=str %> <br>
		
		<%
			if(bmi >= 25){
		%>
				과체중입니다.	
		<%
			} else if(bmi <= 18) {
		%>
				저체중입니다.
		<% 
			} else {
		%>
				정상입니다.
		<%
			}
		%>
		
		<br>
		<input type="submit" value="가입"><br>
	</body>
</html>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-idth, initial-scale=1">
   

    <title>Welcome to MyWorld</title>

    <!-- Bootstrap Core CSS -->
    <link href="../css/bootstrap.css" rel="stylesheet">

    <!-- Custom CSS -->
    <link href="../css/business-casual.css" rel="stylesheet">

    <!-- Fonts -->
    <link href="https://fonts.googleapis.com/css?family=Open+Sans:300italic,400italic,600italic,700italic,800italic,400,300,600,700,800" rel="stylesheet" type="text/css">
    <link href="https://fonts.googleapis.com/css?family=Josefin+Slab:100,300,400,600,700,100italic,300italic,400italic,600italic,700italic" rel="stylesheet" type="text/css">
	
	 <!-- jQuery -->
    <script src="../js/jquery.js"></script>

    <!-- Bootstrap Core JavaScript -->
    <script src="../js/bootstrap.min.js"></script>

</head>
<body>
	<!-- include/header.jsp 포함되는 곳 -->
	<%@ include file="../include/include_header.jsp" %>

	<section>
		<div align="center">
			<form name="regform" action="user_join_ok.jsp" method="post">
				<h2>회원 가입 페이지</h2>
				<table>
					<tr>
						<td>아이디</td>
						<td><input type="text" name="id" placeholder="4글자 이상 8글자 이하"></td>
					</tr>
					<tr>
						<td>비밀번호</td>
						<td><input type="password" name="pw"></td>
					</tr>
					<tr>
						<td>비밀번호 확인</td>
						<td><input type="password" name="pw_check"></td>
					</tr>
					<tr>
						<td>이름</td>
						<td><input type="text" name="name"></td>
					</tr>
					<tr>
						<td>이메일</td>
						<td><input type="email" name="email"></td>
					</tr>
					<tr>
						<td>주소</td>
						<td><input type="text" name="address"></td>
					</tr>
				</table>
				<br><br>
				<input type="button" value="회원가입" class="btn btn-primary" onclick="check()">
				<input type="button" value="로그인" class="btn btn-info" onclick="location.href='user_login.jsp'">
			</form>
		</div>
	</section>
    
	<!-- include/footer.jsp 포함되는 곳 -->
	<%@ include file="../include/include_footer.jsp" %>
	
	<script type="text/javascript">
		function check() {
			// form은 유일하게 document.태그이름으로 접근 가능...
			if(document.regform.id.value == '') {
				alert("아이디는 필수 사항입니다.");
				return;
			}else if(document.regform.id.value.length < 4 || document.regform.id.value.length > 8) {
				alert("아이디는 4글자 이상 8글자 이하로 입력해주세요.");
				return;
			}else if(document.regform.pw.value == '') {
				alert("비밀번호는 필수 사항입니다.");
				return;
			}else if(document.regform.pw.value != document.regform.pw_check.value) {
				alert("비밀번호 확인란을 확인해주세요.");
				return;
			}else if(document.regform.name.value == '') {
				alert("이름은 필수사항 입니다.");
				return;
			}else if(confirm("회원 가입을 하시겠습니까?")) {
				// confirm() - 확인 창을 띄워서 확인(true) 취소(false) 중 선택하는 메서드
				document.regform.submit();	// 자바스크립트의 submit 기능
			}
		}
	</script>
</body>
</html>
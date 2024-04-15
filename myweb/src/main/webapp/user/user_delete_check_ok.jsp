<%@page import="com.myweb.user.model.UserVO"%>
<%@page import="com.myweb.user.model.UserDAO"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%
	/*
		1. ������ �޽��ϴ�.
		2. login(id,pw) �޼��带 ��Ȱ���ؼ� ��й�ȣ�� �´��� Ȯ��
		3. login�޼��尡 0�� ��ȯ�ϸ�, "��й�ȣ�� Ȯ���ϼ���" ��� �� ������������ �̵�
		   login�޼��尡 1�� ��ȯ�ϸ�, delete()�� ����
		   
		4. ���� ������ "ȸ�� Ż��ó���Ǿ����ϴ�." ���. ������ ���� ����
		   /myweb���� �̵� (Ȩ ��������)
		   	 ���� ���н� "ȸ�� Ż�� �����߽��ϴ�." ���. ������������ �̵�"
		   	 
		   	 sql = "delete from users where id = ?"
	*/
	
	request.setCharacterEncoding("utf-8");
	
	if(session.getAttribute("user_id") == null) {
		response.sendRedirect("user_login.jsp");
	}
	
	String id = (String)session.getAttribute("user_id");
	String pw = request.getParameter("pw");
	
	UserDAO dao = UserDAO.getInstance();
	
	int result = dao.login(id, pw);
	
	if(result == 1) {
		int result2 = dao.delete(id);
		if(result2 == 1){ 
			session.invalidate();
		%>
			<script>
			alert("ȸ�� Ż��ó���Ǿ����ϴ�.");
			location.href='../index.jsp';
			</script>
		<%}else { %>
			<script>
			alert("ȸ�� Ż�� �����߽��ϴ�.");
			location.href='user_mypage.jsp';
			</script>
		<%}%>
	<%}else{ %>
		<script>
		alert("��й�ȣ�� Ȯ���ϼ���!")
		location.href='user_mypage.jsp';
		</script>
	<%}%>
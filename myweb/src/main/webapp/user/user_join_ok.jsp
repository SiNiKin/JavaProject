<%@page import="com.myweb.user.model.UserVO"%>
<%@page import="com.myweb.user.model.UserDAO"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>

<%
	request.setCharacterEncoding("utf-8");
	
	String id = request.getParameter("id");
	String pw = request.getParameter("pw");
	String name = request.getParameter("name");
	String email = request.getParameter("email");
	String address = request.getParameter("address");
	
	// DAO ��ü ���� (�̱���)
	UserDAO dao = UserDAO.getInstance();
	
	// VO ��ü ����
	UserVO vo = new UserVO(id, pw, name, email, address, null);
	
	// ȸ�� ���� ���� ���̵� �����ϴ� ���̵����� �˻�...
	int result = dao.IdConfirm(id);
	
	if (result == 1) {	// ���̵� �ߺ�, ��� ���� ȸ������ â���� ���ư��� %>
		<script>
			alert("���̵� �ߺ��Ǿ����ϴ�.");
			history.go(-1); // �ڷΰ���
		</script>
	<%}else {		// �ߺ��� ���� ���... ȸ������ ó�� ���� 
		// insert ���� (ȸ�� ����)
		int result2 = dao.join(vo);
	
		if (result2 == 1) {	// ȸ������ ���� %>
		
			<script>
				alert("ȸ�������� �����մϴ�.");
				location.href="user_login.jsp";
			</script>
			
			
	<%	} else { 	// ȸ������ ���� %>
	
			<script>
				alert("ȸ�����Կ� �����߽��ϴ�.");
				history.go(-1);
			</script>
			
	<%	} %>
	<%} %>
	
	
	
	
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%
	session.invalidate();
	response.sendRedirect("/myweb/index.jsp");
%>
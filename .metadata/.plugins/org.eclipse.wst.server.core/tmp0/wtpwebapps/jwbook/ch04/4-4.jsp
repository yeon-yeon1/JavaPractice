<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<title>Scripting Tag</title>
</head>
<%-- ����1 --%>
<%--���� �±� [�޼ҵ�] --%>
<%! int count=0; %>
<body>
page count is
<%-- ��Ŭ��Ʋ�� �±� --%>
<% out.println(++count); %>
</body>
</html>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<title>Scripting Tag</title>
</head>
<%-- 예제1 --%>
<%--선언문 태그 [메소드] --%>
<%! int count=0; %>
<body>
page count is
<%-- 스클립틀릿 태그 --%>
<% out.println(++count); %>
</body>
</html>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<title>Scripting Tag</title>
<link rel="stylesheet" href="../css/test.css">
</head>
<body> 

<!-- ����2 -->
<%--���� �±� [�޼ҵ�] --%>
<%! int sum(int a, int b){
	return a+b;
} %>
page count is
<%-- ��Ŭ��Ʋ�� �±� --%>
<% out.println("2+3="+sum(2,3)); %>

<br>
<br>
<!-- ����3 -->
<%! String makeItLower(String data){
	return data.toLowerCase();
} %>
<% out.println(makeItLower("<br><h1>Hello World</h1>"));%>

<br>
<br>
<%-- ����4 --%>
<%
	int a=2, b=3, sum;
	sum = a+b;
	out.println("2+3="+ sum);
%>

<br>
<br>
<%-- ����5 --%>
<%
	for (int i=0; i<=10; i++){
		if (i%2 == 0) {
			out.println(i+"<br>");
		}
	}
%>

<br>
<%-- ����6 --%>
<%
	int count=0;
%>
Page count is
<%= ++count %>

<br>
<%-- ����7 --%>
<p> Today's date: <%= new java.util.Date() %></p>

<br>
<%-- ����8 --%>
<% 
	int a2=10,b2=20,c2=30;
%>
<%= a2+b2+c2 %>




</body>
</html>
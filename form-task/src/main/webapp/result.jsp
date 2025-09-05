<%@ page contentType="text/html; charset=utf-8"%>
<html>
<head>
<title>폼 결과</title>
</head>
<body>
	<%
		request.setCharacterEncoding("UTF-8");		

		String stu_num = request.getParameter("stu_num");
		String name = request.getParameter("name");
		String phone = request.getParameter("phone");
		String phone2 = request.getParameter("phone2");
		String phone3 = request.getParameter("phone3");
		String[] subject = request.getParameterValues("subject");
		String comment = request.getParameter("comment");
		String agree = request.getParameter("agree");
	%>
	<h3>제출된 폼</h3>
	<p>학번 : <%=stu_num%></p>
	<p>이름 : <%=name%></p>
	<p>연락처 : 
		<%
			if (phone2 == "" || phone3 == "") {
				out.println(" ");
			} else {
				out.println(phone + "-" + phone2 + "-" + phone3);
			}
		%>
	</p>
	<p>수강과목 :	<%
			if (subject != null) {
				for (int i = 0; i < subject.length; i++) {
					out.println("&nbsp;" + (i+1) + ". " + subject[i] + "&nbsp;");
				}
			}
		%>	</p>
	<p>소감 : <%=comment%></p>
	<p>정보 제공 동의 : <%=agree%></p>
</body>
</html>
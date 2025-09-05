<%@ page contentType="text/html; charset=utf-8"%>
<html>
<head>
<title>폼 과제</title>
</head>
<body>
	<h3>폼을 입력해주세요.</h3>
	<form action="result.jsp" name="member" method="post">
		<p>학번 : <input type="text" name="stu_num"></p>
		<p>이름 : <input type="text" name="name"></p>
		<p>전화번호 : <select name="phone">
				<option value="010">010</option>
				<option value="011">011</option>
				<option value="016">016</option>
				<option value="017">017</option>
				<option value="019">019</option>
				</select> - <input type="text" maxlength="4" size="4" name="phone2"> -
				<input type="text" maxlength="4" size="4" name="phone3">
		</p>
		<p>수강과목: 
			    <input type="text" id="subjectInput" placeholder="과목명 입력">
  				<input type="button" value="추가" onclick="addSubject()">
  		</p>
  				<div id="subjectList"></div>
		
		<p><textarea name="comment" cols="30" rows="3"	placeholder="소감 입력"></textarea></p>
		<p>정보 제공에 동의하십니까?</p>
		<p><label for="yes">예</label><input id="yes" type="radio" name="agree" value="예" checked> 
		<label for="no">아니오</label><input id="no" type="radio" name="agree" value="아니오"> </p>
		<p><input type="submit" value="가입하기"> 
			<input type="reset"	value="다시쓰기">
		</p>
	</form>
<script>
	const form = document.querySelector("form");

	form.addEventListener("reset", function () {
  		document.getElementById("subjectList").innerHTML = "";
	});


  function addSubject() {
    const input = document.getElementById("subjectInput");
    const value = input.value.trim();
    if (value) {
      const subjectList = document.getElementById("subjectList");

      const div = document.createElement("div")
      
      const checkbox = document.createElement("input");
      checkbox.type = "checkbox";
      checkbox.name = "subject";
      checkbox.value = value;
      checkbox.checked = true; 
      
      const label = document.createElement("label");
      label.innerText = value;

      div.appendChild(checkbox);
      div.appendChild(label);
      subjectList.appendChild(div);

      input.value = "";
    }
  }
</script>
</body>
<html>
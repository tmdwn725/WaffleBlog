<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
	<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<!-- <link rel="stylesheet" href="common.css" type="text/css"> -->
<!-- <script src="../webjars/jquery/3.5.1/dist/jquery.min.js"></script> -->
<script type="text/javascript">
	function login(){
		document.getElementById('loginBtn').onclick = function() { 
			alert(document.getElementById('userId').value);
		}
	}

	/* $("#loginBtn").click(function() {
		alert("확인");		
	});	 */

</script>
</head>
<body>
<div>
<div id="header"><jsp:include page="../common/Header.jsp" /></div>
<div>
	<form name="loginInfo" method="post" action="loginCheck.do" >
		<div>
			아이디 : <input type="text" id="userId" name="userId">
		</div>
		<div>
			비밀번호 : <input type="text" id="userPw" name="userPw">
		</div>
		<button type="submit" id="loginBtn">로그인</button>
	</form>
</div>
</div>
</body>
</html>
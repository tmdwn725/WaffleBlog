<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="tiles" uri="http://tiles.apache.org/tags-tiles" %>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<!-- 
	Cache-Control
	no-cache : 캐시를 사용하기 전에 재검증을 위한 요청을 강제함.
	no-store : 클라이언트의 요청, 서버의 응답 등을 일체 저장하지 않음
	must-revalidate : 캐시를 사용하기 전에 반드시 만료된 것인지 검증을 함.
	-->
	<meta http-equiv="Cache-Control" content="no-cache, no-store, must-revalidate">
	<meta http-equiv="Pragma" content="no-cache">
	<title>Insert title here</title>
</head>
<!-- 제이쿼리 -->
<script src="http://code.jquery.com/jquery.min.js"></script>
<!-- 합쳐지고 최소화된 최신 CSS -->
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.2/css/bootstrap.min.css">
<!-- 부가적인 테마 -->
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.2/css/bootstrap-theme.min.css">
<!-- 합쳐지고 최소화된 최신 자바스크립트 -->
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.2/js/bootstrap.min.js"></script>
<!-- 공통 CSS -->
<link rel="stylesheet" href="/css/Common.css" />
<style>
	#content
	{
		display : grid;
		grid-template-rows : repeat(3, 1fr);
	}
	
	#body
	{
		border-top : 1px solid gray;
	}
	
	.main
	{
		margin : 0 10% 0 10%;
	}
</style>
<body>
	<div id="content">
		<div>
			<tiles:insertAttribute name="header" />
		</div>
		<div id="body" class="main">
		</div>
		<div>
			<tiles:insertAttribute name="footer" />
		</div>
	</div>
</body>
<script>
	
</script>
</html>
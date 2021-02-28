<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
</head>
<style>
	.list
	{
		margin-top : 20px;
	}

	#name
	{
		/* width : 100px; */
	}
</style>
<link rel="stylesheet" href="/css/Common.css" />
<body>
	<div class="center">
		<form action="">
			<div>
				<input name="div" type="radio" value="ATC" checked />게시글
				<input name="div" type="radio" value="SCH" />일정
				<input name="div" type="radio" value="ACC" />가계부
			</div>
			<div>
				<select name="" id="">
					<option value="">전체</option>
					<option value="">여행</option>
					<option value="">공부</option>
				</select>
				<input type="text" />
				<button type="button">검색</button>
			</div>
		</form>
	</div>
	<div class="list">
		<table id="searchList" align="center" border>
			<thead>
				<tr>
					<th id="no">번호</th>
					<th id="date">일자</th>
					<th id="div">구분</th>
					<th id="name">이름</th>
					<th id="des">내용</th>
				</tr>
			</thead>
			<tbody class="center">
				<tr>
					<td>1</td>
					<td>2020-02-27</td>
					<td>공부</td>
					<td>웹페이지</td>
					<td>맨날 형한테 들어도 쳐 까먹는다 븅신</td>
				</tr>
				<tr>
					<td>2</td>
					<td>2019-05-01</td>
					<td>여행</td>
					<td>유우나 소금사막</td>
					<td>비온 다음날 저녘에 차위에서 은하수를 손전등으로 비추면서 사진찍었다</td>
				</tr>
			</tbody>
		</table>
	</div>
</body>
</html>
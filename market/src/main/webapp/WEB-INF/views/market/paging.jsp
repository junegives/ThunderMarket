<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>메인페이지</title>
</head>
<body>

<div id="navi"> <%@ include file="../include/navi.jsp" %></div>
	<table>
		<thead>
			<tr>
				<th>번호</th>
				<th>카테고리</th>
				<th>이미지</th>
				<th>내용</th>
				<th>가격</th>
				<th>작성자</th>
				<th>작성일</th>
				<th>조회수</th>
				<th>상태</th>
			</tr>
		</thead>

		<tbody>

			<c:forEach items="${list}" var="list">
				<tr>
					<td>${list.bno}</td>
					<td>${list.category}</td>
					<td>${list.img}</td>
					<td>${list.content}</td>
					<td>${list.price}</td>
					<td>${list.writer}</td>
					<td><fmt:formatDate value="${list.regDate}" pattern="yyyy.MM.dd" /></td>
					<td>${list.viewCnt}</td>
					<td>
					<a href="/market/view?bno=${list.bno}">${list.state}</a>
					</td>
				</tr>
			</c:forEach>

		</tbody>

	</table>

	<div>
	<c:if test="${select ne 1}">
		<span>
		<a href="/market/paging?num=${select - 1}"><<</a>
		</span>
	</c:if>
	<c:if test="${select eq 1}">
		<span>
		<a href="/market/paging?num=${select}"><<</a>
		</span>
	</c:if>

	<c:forEach begin="${numStartPage}" end="${numEndPage}" var="num">
		<span>
		<c:if test="${select != num}">
			<a href="/market/paging?num=${num}">${num}</a>
		</c:if>
		<c:if test="${select == num}">
		<b>${num}</b>
		</c:if>
		</span>
	</c:forEach>

	<c:if test="${select ne numPage}">
		<span>
		<a href="/market/paging?num=${select + 1}">>></a>
		</span>
	</c:if>
	<c:if test="${select eq numPage}">
		<span>
		<a href="/market/paging?num=${select}">>></a>
		</span>
	</c:if>
	</div>
</body>
</html>
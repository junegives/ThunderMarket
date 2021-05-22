<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<div>
	<h3>Categories</h3>
	<a href="/market/paging?num=1">-ALL</a><br>
	<a href="/market/paging?num=1">-Toys</a><br>
	<a href="/market/paging?num=1">-Clothes</a><br>
	<a href="/market/paging?num=1">-Fruits</a><br>
	<a href="/market/paging?num=1">-Electronics</a><br><br>
</div>

<div>
	<c:if test="${select ne 1}">
		<span> <a href="/market/paging?num=${select - 1}"><<</a>
		</span>
	</c:if>
	<c:if test="${select eq 1}">
		<span> <a href="/market/paging?num=${select}"><<</a>
		</span>
	</c:if>

	<c:forEach begin="${numStartPage}" end="${numEndPage}" var="num">
		<span> <c:if test="${select != num}">
				<a href="/market/paging?num=${num}">${num}</a>
			</c:if> <c:if test="${select == num}">
				<b>${num}</b>
			</c:if>
		</span>
	</c:forEach>

	<c:if test="${select ne numPage}">
		<span> <a href="/market/paging?num=${select + 1}">>></a>
		</span>
	</c:if>
	<c:if test="${select eq numPage}">
		<span> <a href="/market/paging?num=${select}">>></a>
		</span>
	</c:if>
</div>
<div>
	<a href="/market/write">글쓰기</a>
</div>
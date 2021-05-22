<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<c:set var="path" value="${pageContext.request.contextPath}" />
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>view</title>
<link rel="stylesheet" type="text/css"
	href="${pageContext.request.contextPath}/resources/css/marketcss.css">
</head>
<body>
	<div class="container">
		<header>

			<h1><a href="/market/paging?num=1">천둥마켓</a></h1>

		</header>

		<section class="content">
			<nav id="navi">
				<%@ include file="../include/navi.jsp"%>
			</nav>
			<main>
	<div>PostNumber : ${view.bno}</div>
	<div>${view.img}</div>
	<div>
		작성자 ${view.writer}<br> 작성일
		<fmt:formatDate value="${view.regDate}" pattern="yyyy.MM.dd HH:mm" />
		<br> 조회수 ${view.viewCnt}<br> 상품설명<br> ${view.content}<br>
		가격<br> ${view.price} &#8361;
	</div>
	<div>
		<input style="width: 100px" type="password" maxlength="30"
			placeholder="게시글 비밀번호" id="pword" name="pword" />
		<button type="button" id="btn_modify">게시글 수정</button>
		<button type="button" id="btn_delete">게시글 삭제</button>
	</div>
	
	<ul>
	<c:forEach items="${reply}" var="reply">
	<li>
	<div>
		<p>${reply.writer } / 
		<fmt:formatDate value="${reply.regDate}" pattern="yyyy.MM.dd HH:mm" /></p>
		<p>${reply.content }</p>
		
	</div>
	</li>
	
	</c:forEach>
    <div>
    <form method="post" action="/reply/write">
    <input type="hidden" name="bno" value=${view.bno }>
	<p>
		<label>댓글 작성자</label> <input type="text" name="writer">
	</p>
	<p>
		<textarea rows="5" cols="50" name="content"></textarea>
	</p>
	<p>
		<button type="submit">댓글 작성</button>
	</p></form>
	</div>
</ul>

			</main>

		</section>

	</div>
</body>
</html>


<script>
	document.getElementById('btn_modify').onclick = function() {
		if (document.getElementById('pword').value == ${view.pword}) {
			location.href='/market/modify?bno='+${view.bno}
		} else {
			window.alert("비밀번호가 일치하지 않습니다.");
		}
		return false;
	}
	document.getElementById('btn_delete').onclick = function() {
		if (document.getElementById('pword').value == ${view.pword}) {
			location.href='/market/delete?bno='+${view.bno}
		} else {
			window.alert("비밀번호가 일치하지 않습니다.");
		}
		return false;
	}
</script>
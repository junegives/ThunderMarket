<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>view</title>
</head>
<body>
	<div>PostNumber : ${view.bno}</div>
	<div>${view.img}</div>
	<div>
		작성자 ${view.writer}<br> 작성일 ${view.regDate}<br> 조회수
		${view.viewCnt}<br> 상품설명<br> ${view.content}<br> 가격<br>
		${view.price} &#8361;
	</div>
	<div>
		<input style="width: 50px" type="password" maxlength="30"
			placeholder="게시글 비밀번호" id="pword" name="pword" />
		<button type="button" id="btn_modify"
			<c:if test="${view.state == '판매중'}">onclick = "location.href = '/market/modify?bno=${view.bno}'"</c:if>>게시물
			수정</button>
		<script>
			document.getElementById('btn_modify').onclick = function() {
				if (document.getElementById('pword').value == ${view.pword}) {
					location.href='/market/modify?bno='+${view.bno}
				} else {
					window.alert("비밀번호를 확인하세요.");
				}
				return false;
			}
		</script>
	</div>
</body>
</html>
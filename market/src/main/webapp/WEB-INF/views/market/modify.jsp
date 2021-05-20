<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>modify</title>
</head>
<body>

<div id="navi"> <%@ include file="../include/navi.jsp" %></div>
	<h2>게시글 수정</h2>
	<form id="modifyProduct" name="modifyProduct" method="post">
		<div>
			닉네임 <input style="width: 150px" type="text" id="writer"
				maxlength="10" name="writer" value="${view.writer}"/>
		</div>
		<div>
			비밀번호<input style="width: 150px" type="password" maxlength="30" id="pword" name="pword" value="${view.pword}"/>
			카테고리<select style="width: 150px" name="category" id="category">
				<option value="Toys" <c:if test="${view.category == 'Toys'}">selected</c:if>>Toys</option>
				<option value="Clothes" <c:if test="${view.category == 'Clothes'}">selected</c:if>>Clothes</option>
				<option value="Fruits" <c:if test="${view.category == 'Fruits'}">selected</c:if>>Fruits</option>
				<option value="Electronics" <c:if test="${view.category == 'Electronics'}">selected</c:if>>Electronics</option>
			</select>
		</div>
		<div>
			내&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;용
			<textarea style="width: 700px; resize: none" rows="7" cols="50"
				maxlength="300" id="content" name="content">${view.content}</textarea>
		</div>
		<div>
			가&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;격
			<input style="width: 150px"
				type="number" id="price" name="price" value="${view.price}"/>&nbsp;&#8361;
		</div>
		<div>
			<button>이미지 첨부</button>
			<input style="width: 150px" type="text" maxlength="200" id="img" name="img" value="${view.img}"/>
		</div>
		<div>
			판매중<input type="radio" name="state" value="판매중" <c:if test="${view.state == '판매중'}">checked="checked"</c:if>>
			예약중<input type="radio" name="state" value="예약중" <c:if test="${view.state == '예약중'}">checked="checked"</c:if>>
			판매완료<input type="radio" name="state" value="판매완료" <c:if test="${view.state == '판매완료'}">checked="checked"</c:if>>
			<button type="submit">등록</button>
		</div>
	</form>
</body>
</html>
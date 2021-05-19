<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>write</title>
</head>
<body>
	<h2>게시글 작성</h2>
	<form id="writeProduct" name="writeProduct" method="post">
		<div>
			닉네임 <input style="width: 150px" type="text" id="writer"
				maxlength="10" name="writer" /><
		</div>
		<div>
			비밀번호<input style="width: 150px" type="password" maxlength="30" id="pword" name="pword" />
			카테고리<select style="width: 150px" name="category" id="category">
				<option value="toys">Toys</option>
				<option value="clothes">Clothes</option>
				<option value="fruits">Fruits</option>
				<option value="electronics">Electronics</option>
			</select>
		</div>
		<div>
			내&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;용
			<textarea style="width: 700px; resize: none" rows="7" cols="50"
				maxlength="300" id="content" name="content"></textarea>
		</div>
		<div>
			가&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;격
			<input style="width: 150px"
				type="number" id="price" name="price" />&nbsp;&#8361;
		</div>
		<div>
			<button>이미지 첨부</button>
			<input style="width: 150px" type="text" maxlength="200" id="img" name="img" />
		</div>
		<div>
			판매중<input type="radio" name="state" value="0" checked="checked">
			예약중<input type="radio" name="state" value="1">
			판매완료<input type="radio" name="state" value="2">
			<button type="submit">등록</button>
		</div>
	</form>
</body>
</html>
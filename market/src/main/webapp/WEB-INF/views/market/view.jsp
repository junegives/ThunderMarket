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
</body>
</html>
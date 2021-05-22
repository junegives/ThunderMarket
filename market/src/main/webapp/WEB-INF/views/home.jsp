<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page session="false" %>
<c:set var="path" value="${pageContext.request.contextPath}"/>
<html>
<head>
	<title>Home</title>
</head>
<body>
<h1>
	천둥마켓  
</h1>

<P class="test">  The time on the server is ${serverTime}. </P>

<p><a href="/market/main">메인 페이지</a></p>
<a href="/market/write">게시물 작성</a>
</body>
</html>
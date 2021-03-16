<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>캘린더</title>
</head>
<body>

<c:forEach items="${list}" var="list">
		<p>${list.sNum}</p>
		<p>${list.id}</p>
		<p>${list.lName}</p>
		<p>${list.title}</p>
		<p>${list.degree}</p>
		<p>${list.aCheck}</p>
		<p>${list.con}</p>
		<p>${list.sDate}</p>
		<p>${list.eDate}</p>
</c:forEach>
</body>
</html>
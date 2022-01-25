<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="dec" uri="http://www.opensymphony.com/sitemesh/decorator" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<jsp:include page = "/layout/header.jsp" />
<title>
<dec:title/>
</title>
</head>
<body>
	<jsp:include page = "/layout/top-navigation.jsp"/>
	<h1>Default Layout</h1>
	<jsp:include page = "/layout/left-navigation.jsp"/>
	<dec:body />
	<jsp:include page="/layout/booter.jsp" />
</body>
</html>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" session="false"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Hello Page</title>
<h1>First spring mvc application demo</h1>
<h2>${welcomeMsg}</h2>
<c:set scope="request" var="path" value="${pageContext.request.contextPath}" />
<script language="javascript"> 
var contextpath="${path}";
</script>
<script src="https://code.jquery.com/jquery-3.7.1.min.js" integrity="sha256-/JqT3SQfawRcv/BIHPThkBvs0OEvtFFmqPF/lYI/Cxo=" crossorigin="anonymous"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/resources/js/ajaxTest.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/resources/js/ajaxshort.js"></script>
</head>
<body>
<input type="button" id="ajaxbutton" value=Click />
<input type="text" id="name" value="test" />
</body>
</html>
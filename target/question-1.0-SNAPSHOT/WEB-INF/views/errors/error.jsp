<%@ page contentType="text/html;charset=UTF-8"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<c:set var="ctx" value="${pageContext.request.contextPath}" />
<html>
<head>
<title>error</title>
</head>

<body>
<div>
<c:forEach items="${exception.stackTrace }" var="e">  
    ${e }<br />
	</c:forEach>
</div>
	
</body>
</html>

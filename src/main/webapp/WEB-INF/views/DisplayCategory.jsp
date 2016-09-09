<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html>
<body >
<%@include file="/WEB-INF/views/Header.jsp"%>
	<div align="center">

 	<c:forEach items="${category}" var="category" varStatus="loop">
 	<tr>
 	  <td><c:out value="${category}" /></td> 
 	  <td><c:out value="${categoryId}" /></td>
 	</tr>
	</c:forEach>
	</div>
</body>
</html>
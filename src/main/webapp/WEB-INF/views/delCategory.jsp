<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@include file="/WEB-INF/views/Header.jsp"%>
<body>
<div align="center">
 	<form:form method="POST" action="delCategory" commandName="cid">
		<table border="1">
  	   <tr>
        <td colspan="2" align="center"><h2>Adding category</h2></td></tr>
       <tr>
        <td>Category id:</td>
        <td><form:input type="text" path="categoryId" /></td>
       </tr>
       <tr>
        <td colspan="3">
            <input type="submit" value="DELETE"/>
        </td>
       </tr>
</table>  
</form:form>
</div>
</body>
</html>
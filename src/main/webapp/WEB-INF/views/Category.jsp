<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%@include file="/WEB-INF/views/Header.jsp"%>
<h2>Student Information</h2>
<form:form method="POST" action="addCategory" commandName="cat">
   <table>
    <tr>
        
        <td><form:input type="text" path="categoryId" /></td>
    </tr>
    <tr>
        
        <td><form:input type="text" path="categoryName" /></td>
    </tr>
    <tr>
        
        <td><form:input type="text" path="categoryDesc" /></td>
    </tr>
    <tr>
        <td colspan="2">
            <input type="submit" value="Submit" onClick="CategoryController"/>
        </td>
    </tr>
</table>  
</form:form>
</body>
</html>
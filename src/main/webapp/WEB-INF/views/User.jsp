<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>User details</title>
</head>
<body>
<table border="1|0" cellpadding="5" align="center">
<tr>
<td >UserId</td>
<td><input type="text" placeholder=" Id" ng-model="SearchText" /><br/></td>
</tr>
<tr>
<td>Customer name </td>
<td> <input type="text" placeholder=" Name" ng-model="SearchText"/><br/></td></tr>
<td>Mobile </td>
<td> <input type="text" placeholder=" Mobile num" ng-model="SearchText"/><br/></td></tr>
<td>Email </td>
<td> <input type="text" placeholder=" email id" ng-model="SearchText"/><br/></td></tr>
<td>Address</td>
<td> <input type="text" placeholder=" Address" ng-model="SearchText"/><br/></td></tr>
</table>
</body>
</html>
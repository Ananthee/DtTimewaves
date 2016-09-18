<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@include file="/WEB-INF/views/AdminHeader.jsp"%>
<body >
	<div align="center">
 	<form:form method="POST" action="addUser" commandName="user">
	<table border="1">
  	   <tr>
        <td colspan="2" align="center"><h2>Add User</h2></td></tr>
       <tr>
        <td>User id:</td>
        <td><form:input type="text" path="userId" /></td>
       </tr>
       <tr>
        <td>User name:</td>
        <td><form:input type="text" path="customerName" /></td>
       </tr>
       <tr>
        <td>Mobile number : </td>
        <td><form:input type="text" path="Moblie" /></td>
       </tr>
       <tr>
        <td>Email-id : </td>
        <td><form:input type="text" path="Email" /></td>
       </tr>
       <tr>
        <td>Address : </td>
        <td><form:input type="text" path="Address" /></td>
       </tr>
       <tr>
       <td colspan="3">
            <input type="submit" value="ADD"/>
       </td>
       </tr>
  </table>  
  </form:form>
  </div>
</body>

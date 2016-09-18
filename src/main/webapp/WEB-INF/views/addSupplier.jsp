<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@include file="/WEB-INF/views/AdminHeader.jsp"%>
<body >
	<div align="center">
 	<form:form method="POST" action="addSupplier" commandName="supplier">
	<table border="1" >
  	   <tr>
        <td style="color:white;" colspan="2" align="center"><h2>Add Supplier</h2></td></tr>
       <tr>
        <td style="color:white;">Supplier id:</td>
        <td><form:input type="text" path="supplierId" /></td>
       </tr>
       <tr>
        <td style="color:white;">Supplier name:</td>
        <td><form:input type="text" path="supplierName" /></td>
       </tr>
       <tr>
        <td style="color:white;">Supplier Description:</td>
        <td><form:input type="text" path="supplierAddress" /></td>
       </tr>
       <tr>
       <td align="center" colspan="3">
            <input type="submit" value="ADD"/>
       </td>
       </tr>
  </table>  
  </form:form>
  </div>
</body>

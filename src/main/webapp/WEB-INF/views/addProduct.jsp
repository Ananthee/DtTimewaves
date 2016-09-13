<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@include file="/WEB-INF/views/Header.jsp"%>
<body >
	<div align="center">
 	<form:form method="POST" action="addProduct" commandName="product">
	<table border="1">
  	   <tr>
        <td colspan="2" align="center"><h2>Add Supplier</h2></td></tr>
       <tr>
        <td>Product id:</td>
        <td><form:input type="text" path="productId" /></td>
       </tr>
       <tr>
        <td>Product name:</td>
        <td><form:input type="text" path="productName" /></td>
       </tr>
       <tr>
        <td>Seller id :</td>
        <td><form:input type="text" path="sellerId" /></td>
       </tr>
       <tr>
        <td>Quantity:</td>
        <td><form:input type="text" path="quantity" /></td>
       </tr>
       <tr>
        <td>Price :</td>
        <td><form:input type="text" path="price" /></td>
       </tr>
       <tr>
        <td>Description:</td>
        <td><form:input type="text" path="description" /></td>
       </tr>
       <tr>
        <td>Category id:</td>
        <td><form:input type="text" path="categoryId" /></td>
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

<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@include file="/WEB-INF/views/AdminHeader.jsp"%>
<body >
	<div align="center">
 <form method="POST" action="addCategory" commandName="category">
 <table border="1">
  	   <tr>
         <td style="color:white;" colspan="2" align="center"><h2>Adding category</h2></td></tr>
       <tr>
         <td style="color:white;">Category id:</td>
         <td ><input type="text" path="categoryId" /></td>
       </tr>
       <tr>
         <td style="color:white;">Category name:</td>
         <td><input type="text" path="categoryName" /></td>
       </tr>
       <tr>
         <td style="color:white;">Category Description:</td>
         <td><input type="text" path="categoryDesc" /></td>
       </tr>
       <tr>
         <td   align="center" colspan="3">
            <input type="submit" value="ADD"/>
         </td>
       </tr>
</table>  
</form>
</div>
</body>
</html>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<jsp:include page="AdminHeader.jsp"></jsp:include>
<div class="bg-content">
 <div class="container">

<form:form action="editCategory" method="POST" commandName="category">
<div  background="#D0C0D0" align="Center">
<h3 style="color:white;">Edit Category</h3>
<br/>
<br/>
  Category ID:<form:input type="text" path="categoryId" readonly="true" />
  <br/>
  <br/>
  Category Name:<form:input type="text" path="categoryName"  />
  <br/>
 <br/>
  Category Description:<form:input type="text" path="categoryDesc" />
 <br>
<br/>
	<input type="Submit" value="Update category"/>
	</div>
</form:form>
</div>
</div>


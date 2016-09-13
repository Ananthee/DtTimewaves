<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<jsp:include page="AdminHeader.jsp"></jsp:include>

<form:form action="editCategory" method="GET" commandName="category">

  Category ID:<form:input path="supplierId" readonly="true" />
  <br/>
  <br/>
  Category Name:<form:input path="supplierName" />
  <br/>
 <br/>
  Category Description:<form:input path="supplierAddress" />
 <br>
<br/>
	<input type="Submit" value="Edit"/>
</form:form>


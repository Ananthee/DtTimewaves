<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<jsp:include page="AdminHeader.jsp"></jsp:include>

<form:form action="editSupplier" method="GET" commandName="supplier">

  Supplier ID:<form:input path="supplierId" readonly="true" />
  <br/>
  <br/>
  Supplier Name:<form:input path="supplierName" />
  <br/>
 <br/>
  Supplier Description:<form:input path="supplierAddress" />
 <br>
<br/>
	<input type="Submit" value="Edit"/>
</form:form>


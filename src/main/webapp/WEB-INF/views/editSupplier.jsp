<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<jsp:include page="AdminHeader.jsp"></jsp:include>
<div class="bg-content">
 <div class="container">

<form:form action="editSupplier" method="POST" commandName="supplier">
<div background="#D0C0D0" align="Center">
<h3>Edit a supplier</h3>
<br/>
<br/>
  Supplier ID:<form:input type="text" path="supplierId" readonly="true" />
  <br/>
  <br/>
  Supplier Name:<form:input type="text" path="supplierName" />
  <br/>
 <br/>
  Supplier Description:<form:input type="text" path="supplierAddress" />
 <br>
<br/>
	<input type="Submit" value="Update supplier"/>
	</div>
</form:form>
</div>
</div>


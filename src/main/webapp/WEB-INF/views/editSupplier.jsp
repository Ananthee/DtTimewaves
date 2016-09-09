<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<jsp:include page="Admin.jsp"></jsp:include>

<form:form action="editSupplier" method="GET" commandName="editsupplier">

  Category ID:<form:input path="cid"  />
  <br/>
  <br/>
  Category Name:<form:input path="cname" />
  <br/>
 <br/>
  Category Description:<form:textarea path="cdesc" />
 <br>
<br/>
	<input type="Submit" value="Edit"/>
</form:form>


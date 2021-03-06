<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<script src="https://ajax.googleapis.com/ajax/libs/angularjs/1.5.6/angular.min.js"></script>
<script>
  var prod = ${list};
  angular.module('repeatSample',[]).controller('SupplierController', function($scope)
   {
          $scope.Supplier=prod
   
          $scope.sort = function(keyname)
          {
              $scope.sortKey = keyname;   //set the sortKey to the param passed
              $scope.reverse = !$scope.reverse; //if true make it false and vice versa
          }
              
    });
</script>
<jsp:include page="AdminHeader.jsp"></jsp:include>
  <div class="container" color="#D0C0D0;">
  <form:form commandName="viewSupplier">
  <div class="span12" style="text-align: justify; font-size: large; color:black;">
  <div ng-app="repeatSample" ng-controller="SupplierController">
  <br/><br/>
  <div class="row">
Search:<input type=text placeholder="Search" ng-model="searchText"/>
  <div id="headin2"><strong> <h4 align="center">SUPPLIER DETAILS </h4></strong></div>
  <table width=\"100%\" border=\"0\" id=\"tab\" align="center">
  <tr>
    <th id=\"td1\"> SUPPLIER ID	</th>
    <th id=\"td2\">	SUPPLIER NAME	</th>
    <th id=\"td3\">	DESCRIPTION	</th>
    <th id=\"td4\">	EDIT	</th>
    <th id=\"td5\">	DELETE	</th>
 </tr>
 <tr class="success" ng-repeat="sup in Supplier|filter:searchText">
 	<td>{{sup.supplierId}}</td>
 	<td>{{sup.supplierName}}</td>
 	<td>{{sup.supplierAddress}}</td>
 	<td><a href="editSupplier?Id={{sup.supplierId}}">Edit</a></td>
	<td><a href="delSupplier?Id={{sup.supplierId}}">Delete</a></td>
 </tr>
 </table>
</div>
</div>
</div>
</form:form>
</div>


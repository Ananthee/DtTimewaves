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
  <div style="color:#DDA0DD;" class="row">
     Search:<input type=text placeholder="Search" ng-model="searchText"/>
  <div id="headin2"><strong> <h4 align="center">SUPPLIER DETAILS </h4></strong></div>
  <table width=\"100%\" border="5 id=\"tab\" align="center">
  <tr>
    <th height="50" style="color:white;" id=\"td1\"> SUPPLIER ID	</th>
    <th height="50" style="color:white;" id=\"td2\"> SUPPLIER NAME	</th>
    <th height="50" style="color:white;" id=\"td3\"> DESCRIPTION	</th>
    <th height="50" style="color:white;" id=\"td4\"> EDIT	</th>
    <th height="50" style="color:white;" id=\"td5\"> DELETE	</th>
 </tr>
 <tr class="success" ng-repeat="sup in Supplier|filter:searchText">
 	<td height="50" style="color:white;">{{sup.supplierId}}</td>
 	<td height="50" style="color:white;">{{sup.supplierName}}</td>
 	<td height="50" style="color:white;">{{sup.supplierAddress}}</td>
 	<td height="50" ><a href="editSupplier?Id={{sup.supplierId}}">Edit</a></td>
	<td height="50"><a href="delSupplier?Id={{sup.supplierId}}">Delete</a></td>
 </tr>
 </table>
</div>
</div>
</div>
</form:form>
</div>


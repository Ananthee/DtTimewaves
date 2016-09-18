<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<script src="https://ajax.googleapis.com/ajax/libs/angularjs/1.5.6/angular.min.js"></script>
<script>
  var prod = ${list};
  angular.module('repeatSample',[]).controller('UserController', function($scope)
   {
          $scope.User=prod
   
          $scope.sort = function(keyname)
          {
              $scope.sortKey = keyname;   //set the sortKey to the param passed
              $scope.reverse = !$scope.reverse; //if true make it false and vice versa
          }
              
    });
</script>
<jsp:include page="AdminHeader.jsp"></jsp:include>
  <div class="container" color="#D0C0D0;">
  <form:form commandName="editUser">
  <div class="span12" style="text-align: justify; font-size: large; color:black;">
  <div ng-app="repeatSample" ng-controller="UserController">
  <br/><br/>
  <div class="row">
Search:<input type=text placeholder="Search" ng-model="searchText"/>
  </div>
  <div id="headin2"><strong> <h4>SUPPLIER DETAILS </h4></strong></div>
  <table width=\"100%\" border=\"0\" id=\"tab\">
  <tr>
    <th id=\"td1\"> USER ID	</th>
    <th id=\"td2\">	USER NAME	</th>
    <th id=\"td3\">	MOBILE	</th>
    <th id=\"td4\">	E-MAIL	</th>
    <th id=\"td5\">	ADDRESS	</th>
 </tr>
 <tr class="success" ng-repeat="us in User|filter:searchText">
 	<td>{{us.userId}}</td>
 	<td>{{us.customerName}}</td>
 	<td>{{us.Moblie}}</td>
 	<td>{{us.Email}}</td>
 	<td>{{us.Address}}</td>
 </tr>
 </table>
</div>
</div>
</form:form>
</div>


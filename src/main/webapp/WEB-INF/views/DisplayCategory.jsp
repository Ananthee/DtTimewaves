<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<script src="https://ajax.googleapis.com/ajax/libs/angularjs/1.5.6/angular.min.js"></script>
<script>
  var prod = ${list};
  angular.module('repeatSample',[]).controller('CategoryController', function($scope)
   {
          $scope.Category=prod
   
          $scope.sort = function(keyname)
          {
              $scope.sortKey = keyname;   //set the sortKey to the param passed
              $scope.reverse = !$scope.reverse; //if true make it false and vice versa
          }
              
    });
</script>
<jsp:include page="AdminHeader.jsp"></jsp:include>
  <div class="container" color="#D0C0D0;">
  <form:form commandName="DisplayCategory">
  <div class="span12" style="text-align: justify; font-size: large; color:black;">
  <div ng-app="repeatSample" ng-controller="CategoryController">
  <br/><br/>
  <div style="color:white;"  class="row">
Search:<input type=text placeholder="Search" ng-model="searchText"/>
  </div>
  <div style="color:white;"  id="headin2" align="justify"><strong> <h4 align="center">CATEGORY DETAILS </h4></strong></div>
  <table width=\"100%\" border=\"0\" id=\"tab\" align="center">
  <tr>
    <th style="color:white;" id=\"td1\"> CATEGORY ID	</th>
    <th style="color:white;" id=\"td2\"> CATEGORY NAME	</th>
    <th style="color:white;" id=\"td3\"> DESCRIPTION	</th>
    <th style="color:white;" id=\"td4\"> EDIT	</th>
    <th style="color:white;" id=\"td5\"> DELETE	</th>
 </tr>
 <tr class="success" ng-repeat="cat in Category | filter:searchText">
 	<td style="text-align: justify; font-size: large; color:white;">{{cat.categoryId}}</td>
 	<td style="text-align: justify; font-size: large; color:white;">{{cat.categoryName}}</td>
 	<td style="text-align: justify; font-size: large; color:white;">{{cat.categoryDesc}}</td>
 	<td><a href="editCategory?Id={{cat.categoryId}}">Edit</a></td>
	<td><a href="delCategory?Id={{cat.categoryId}}">Delete</a></td></tr>
 </table>
</div>
</div>
</form:form>
</div>


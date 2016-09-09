<script src="https://ajax.googleapis.com/ajax/libs/angularjs/1.5.6/angular.min.js"></script>
<script>
  var prod = ${list};
  angular.module('showProduct',[]).controller('SupplierController', function($scope)
   {
          $scope.Supplier=prod
   
          $scope.sort = function(keyname)
          {
              $scope.sortKey = keyname;   //set the sortKey to the param passed
              $scope.reverse = !$scope.reverse; //if true make it false and vice versa
          }
              
    });
</script>
<jsp:include page="Admin.jsp"></jsp:include>
  <div class="container">
<div class="span12" style="text-align: justify; font-size: large; color:silver;">
 <div ng-app="showSupplier" ng-controller="SupplierController">
 <br/><br/>
 <div class="row">
Search:<input type=text placeholder="Search" ng-model="searchText"/>
</div>
<div id="headin2"><strong> <h3>Supplier List </h3></strong></div>

<table width=\"100%\" border=\"0\" id=\"tab\">
<tr><th id=\"td1\">SUPPLIER ID</th><th id=\"td2\">SUPPLIER NAME</th>
              <th id=\"td3\">DESCRIPTION</th><th id=\"td4\">EDIT</th><th id=\"td5\">DELETE</th>
 </tr>
 <tr class="success" ng-repeat="sup in Supplier|filter:searchText">
 <td>{{sup.sid}}</td><td>{{sup.sname}}</td><td>{{sup.sdesc}}</td>
 <td><a href="editSupplier" name="edit" value="Edit">Edit</a></td>
<td><a href="delSupplier?{{sid=sup.sid}}" value="Delete" name="delete" >Delete</a>]</td></tr>
</table>
</div>
</div>
</div>


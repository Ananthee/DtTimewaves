
<script src="https://ajax.googleapis.com/ajax/libs/angularjs/1.5.6/angular.min.js"></script>
<script>
var prod = ${list};
angular.module('disp_product', []).controller('ProductController', function($scope)
 {
               $scope.prodts=prod;
 
        $scope.sort = function(list)
        {
            $scope.sortKey = list;   //set the sortKey to the param passed
            $scope.reverse = !$scope.reverse; //if true make it false and vice versa
        }
            
  });
</script>
<body>
<%@include file="/WEB-INF/views/Header.jsp"%>
<div ng-app="disp_product" ng-controller="ProductController" align="center">
Search : <input type="text" placeholder="Search " ng-model="SearchText"/>
<br/><br/>
<table border="5">
<tr class="success" ng-repeat="prodt in prodts|filter:SearchText">
<!-- <th>
  		<td>Product Id</td>
		<td>Product Name</td>
		<td>Seller Id</td>
		<td>Quantity</td>
		<td>Price</td>
		<td>Description</td>
		<td>Category</td>
</th> -->
                <td>{{prodt.productId}}</td>
                <td>{{prodt.productName}}</td>
                <td>{{prodt.sellerId}}</td>
                <td>{{prodt.quantity}}</td>
                <td>{{prodt.price}}</td>
                <td>{{prodt.description}}</td>
                <td>{{prodt.category}}</td>
                
                
</tr>
</table>
</div>
<%@include file="/WEB-INF/views/Footer.jsp"%>
</body>
</html>
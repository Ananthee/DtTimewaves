<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<script src="https://ajax.googleapis.com/ajax/libs/angularjs/1.5.6/angular.min.js"></script>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<jsp:include page="Header.jsp"></jsp:include>
<script>
	var prod = ${list1};
	angular.module('addtocart', []).controller('ProductController',function($scope) 
		{
				$scope.Product = prod;
				$scope.sort = function(keyname) 
				{
					$scope.sortKey = keyname; //set the sortKey to the param passed
					$scope.reverse = !$scope.reverse; //if true make it false and vice versa
				}

		});
</script>
<br/><br/><br/><br/>
<body background=" resources/admin1.jpg">
<div class="bg-content" bgcolor="#ffffff">
	<form:form commandName="Product">
		<h1 class="page-header">Products</h1>
		<div ng-app="addtocart" ng-controller="ProductController">
		<table width="100%" bgcolor="#dfdfdf">
		<tr>
			<td>
			 	<img src="resources/{{Product.productId}}.jpg" style="width: 230px; height: 215px" alt="error" height="300" width="300"/>
			</td>
			<td>
				<h1 align="center""color:black"><B>Description<B></B></h1>
				<p class="caption"><p><h3 style="color:black">Product Name:{{Product.productName}}</h3></p></p>
				<p class="caption"><p><h3 style="color:black">Product Id:{{Product.productId}}</p></h3></p>
				<p class="caption"><p><h3 style="color:black">Price:{{Product.price}}</p></h3></p>
				<p class="caption"><p><h3 style="color:black">Product Description:{{Product.description}}</p></h3></p>
			</td>
		</tr>
	
			<tr>
		<tr></tr>
			<td>
			</br>
			</br>
			<a href="AddToCart?addpid={{Product.productId}}"><img height="50" width="200" src="resources/addtocart.jpg"/></a>
			</td>
			<td>
			</br>
			</br>
			<a href="Login"><img height="50" width="200" src="resources/buynow.jpg"/></a>
			</td>
			</tr>
		
		</table>
	</div>
	</form:form>
</div>




 <jsp:include page="Footer.jsp"></jsp:include>
 
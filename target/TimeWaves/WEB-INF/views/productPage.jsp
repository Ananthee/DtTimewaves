<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@include file="/WEB-INF/views/Header.jsp"%>
<script src="https://ajax.googleapis.com/ajax/libs/angularjs/1.5.6/angular.min.js"></script>
<script>
var prod = ${list};
  angular.module('repeatSample', []).controller('ProductController', function($scope)
   {
                 $scope.Product=prod;
   
          $scope.sort = function(keyname)
          {
              $scope.sortKey = keyname;   //set the sortKey to the param passed
              $scope.reverse = !$scope.reverse; //if true make it false and vice versa
          }
              
    });
</script>
<br/><br/>
<body>
<div class="bg-content" >
<form:form commandName="Product">
  
    <div class="container">
        <div class="row">
            <div class="col-lg-12"> <h1 class="page-header">Products</h1> </div>
			<div ng-app="repeatSample" ng-controller="ProductController">
				<div class="row" ng-repeat="prodt in Product">
				<div class="col-lg-3 col-sm-12 thumb">
		<a  class="thumbnail" href="ProductDescription?id={{prodt.productId}}">	
		<p><h2 >{{prodt.productName}}</h2></p> 
		<img class="img-responsive" src="resources/{{prodt.productId}}.jpg" style="width: 230px; height: 215px"/>		
		<p ><h3 >{{prodt.price}}</h3></p>
		</a>
		</div>
		</div>
		</div>
		</div>
		</div>
	</form:form>
 				 	
</div>
<jsp:include page="Footer.jsp"></jsp:include>
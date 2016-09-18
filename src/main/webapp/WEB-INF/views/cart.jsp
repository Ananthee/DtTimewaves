<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<link href="//maxcdn.bootstrapcdn.com/font-awesome/4.1.0/css/font-awesome.min.css" rel="stylesheet">
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<jsp:include page="Header.jsp"/>
<script src="https://ajax.googleapis.com/ajax/libs/angularjs/1.5.6/angular.min.js"></script>
<script>
var prod = ${cart};
  angular.module('repeatSample', []).controller('SupplierController', function($scope)
   {
                 $scope.Supplier=prod;
                 $scope.value=1; 
                 $scope.change=function(value)
                 {
                     $scope.products.qty=Number($scope.value);
                      };           
    });
</script>
<div class="container" ng-app="repeatSample" ng-controller="SupplierController">
<table id="cart" class="table table-hover table-condensed">
    				<thead>
						<tr style="font-size: medium; color: white;">
							<th style="width:50%">Product</th>
							<th style="width:10%">Price</th>
							<th style="width:8%">Quantity</th>
							<th style="width:22%" class="text-center">Subtotal</th>
							<th style="width:10%"></th>
						</tr>
					</thead>
					<tbody>
						<tr  ng-repeat="ci in Supplier">
						
							<td data-th="Product" style="font-size: medium; color: white;">
								<div class="row center">
									<img src="resources/{{ci.productId}}.jpg" alt="..." height="100" width="100" class="img-responsive"/>
									<h4>{{ci.productName}}</h4>										
								</div>
							</td>
							<td data-th="Price"  style="font-size: medium; color: white;">{{ci.price}}</td>
							<td data-th="Quantity"  style="font-size: medium; color: white;">
								<input type="number" class="form-control text-center" ng-model="value"  ng-change="change(value)" min="1">
							</td>
							<td data-th="Subtotal" class="text-center"  style="font-size: medium; color: white;">{{value*ci.price}}</td>
							<td class="actions" data-th="">
								<a class="btn btn-danger btn-sm"  href="removeitem?productId={{ci.productId}}"><i class="fa fa-trash-o"></i></a>								
							</td>
						</tr>
					</tbody>
					<tfoot>
						<tr class="visible-xs">
							<td class="text-center"  style="font-size: medium; color: white;" ng-model="total"><strong>Total: </strong></td>
						</tr>
						<tr>
							<td><a href="ppage" class="btn btn-warning"><i class="fa fa-angle-left"></i> Continue Shopping</a></td>
							<td colspan="2" class="hidden-xs"></td>
							<td class="hidden-xs text-center"><strong>Total: </strong></td>
							<td><a href="checkout" class="btn btn-success btn-block">Checkout <i class="fa fa-angle-right"></i></a></td>
						</tr>
					</tfoot>
				</table>
</div>
</div>
		  
	<jsp:include page="Footer.jsp"/>
<script src="resources/js/bootstrap.js"></script>

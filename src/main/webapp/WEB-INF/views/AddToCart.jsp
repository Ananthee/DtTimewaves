<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

</body>
</html><script src="https://ajax.googleapis.com/ajax/libs/angularjs/1.5.6/angular.min.js"></script>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%-- <jsp:include page="Display.jsp"></jsp:include> --%>
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

<head>
<style type="text/css">
.table>tbody>tr>td, .table>tfoot>tr>td{
    vertical-align: middle;
}
@media screen and (max-width: 600px) {
    table#cart tbody td .form-control{
		width:20%;
		display: inline !important;
	}
	.actions .btn{
		width:36%;
		margin:1.5em 0;
	}
	
	.actions .btn-info{
		float:left;
	}
	.actions .btn-danger{
		float:right;
	}
		
	
	table#cart thead { display: none; }
	table#cart tbody td { display: block; padding: .6rem; min-width:320px;}
	table#cart tbody tr td:first-child { background: #333; color: #fff; }
	table#cart tbody td:before {
		content: attr(data-th); font-weight: bold;
		display: inline-block; width: 8rem;
	}
	
</style>
</head>
<link href="//maxcdn.bootstrapcdn.com/font-awesome/4.1.0/css/font-awesome.min.css" rel="stylesheet">
<div class="container">
<form:form commandName="Product">
		<h1 class="page-header">Products</h1>
		<div ng-app="addtocart" ng-controller="ProductController">
	<table id="cart" class="table table-hover table-condensed" border="1" border-color="black" bgcolor="#dfdfdf" >
    				<thead>
						<tr>
							<th style="width:50%"><h3 align="left">Product</h3></th>
							<th style="width:10%"><h3>Price</th></h3>
							<th style="width:8%"><h3 >Quantity</th></h3>
							<th style="width:22%" class="text-center">Subtotal</th></h3>
							<th style="width:10%"></th>
						</tr>
					</thead>
					<tbody>
						<tr>
							<td data-th="Product">
								<div class="row">
									<div class="col-sm-2 hidden-xs"><img src="resources/{{Product.productId}}.jpg" alt="..." class="img-responsive" height="150" width="150"/></div>
									<div class="col-sm-10">
										<h4 class="nomargin">{{Product.productName}}</h4></h3>
										<p>{{Product.description}}</p>
									</div>
								</div>
							</td>
							<td data-th="Price">{{Product.price}}</td></h3>
							<td data-th="Quantity">
								<input type="number" class="form-control text-center" value="1">
							</td>
							<td data-th="Subtotal" class="text-center">{{Product.price}}</td></h3>
							<td class="actions" data-th="">
								<button class="btn btn-info btn-sm"><i class="fa fa-refresh"></i></button>
								<button class="btn btn-danger btn-sm"><i class="fa fa-trash-o"></i></button>								
							</td>
						</tr>
					</tbody>
					<tfoot>
					<div align="right">
						
							<td class="text-center" align="right"><strong>Total {{Product.price}}</strong></td>
					
					</div>
						<tr>
							<td><a href="FullProduct"><img height="50" width="200" src="resources/continue.png"/></a></i> </a></td>
							<td colspan="2" class="hidden-xs">
							<td class="hidden-xs text-center"><strong>Total</strong></td>
							<td><a href="#"><img height="50" width="200" src="resources/checkout.gif"/></a> <i class="fa fa-angle-right"></i></a></td>        
						</tr>
					</tfoot>
				</table>
				</div>
				</form:form>
</div>




 <jsp:include page="Footer.jsp"></jsp:include>
 
<script
	src="https://ajax.googleapis.com/ajax/libs/angularjs/1.5.6/angular.min.js"></script>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<jsp:include page="AdminHeader.jsp" />
<script>
	var cat = ${catlist};
	var sell = ${supplist};
	
	angular.module('repeatSample1', []).controller('ProductController',function($scope) {
				$scope.Category1 = cat;
				$scope.Seller1 = sell;
				$scope.sort = function(keyname) {
					$scope.sortKey = keyname; //set the sortKey to the param passed
					$scope.reverse = !$scope.reverse; //if true make it false and vice versa
				}
			});
</script>

<div class="bg-content">

	<div class="container">
		<div class="span12"
			style="text-align: center; font-size: medium; font-family: Script MT Bold; color: white;">
			<h3>Edit a Product</h3>
			<div align="center" ng-app="repeatSample1">

				<form method="POST" action="UpdateProduct" command="product" enctype="multipart/form-data">

					<fieldset>

						<legend
							style="text-align: center; font-size: medium; font-family: Script MT Bold; color: white;">Product
							Information</legend>

						<p>

							<label for="title"
								style="text-align: center; font-size: medium; font-family: Script MT Bold; color: white;"
								required="true" >Product Id:</label>

							<input type="text" path="productId" readonly="true"/>

						</p>

						<p>
							<label for="title"
								style="text-align: center; font-size: medium; font-family: Script MT Bold; color: white;"
								required="true">Product Name:</label>

							<input type="text" path="productName" />
						</p>

						<div  ng-controller="reapeterController1">

							<p>
								<label for="genre"
									style="text-align: center; font-size: medium; font-family: Script MT Bold; color: white;">Category
									Id:</label>

								<select path="categoryId">

									<option ng-repeat="cat in Category1" value="{{cat.categoryId}}">{{cat.categoryName}}</option>
								</select>

							</p>
							<p>
								<label for="genre"
									style="text-align: center; font-size: medium; font-family: Script MT Bold; color: white;">Supplier
									Id:</label>

								<select path="supplierId">

									<option ng-repeat="sup in Seller1" value="{{sup.supplierId}}">{{sup.supplierName}}</option>

								</select>
							</p>

						</div>
						<p>
							<label for="year"
								style="text-align: center; font-size: medium; font-family: Script MT Bold; color: white;">Description:</label>

							<input type="text" path="description" />
						</p>
						<p>
							<label for="year"
								style="text-align: center; font-size: medium; font-family: Script MT Bold; color: white;">Quantity:</label>

							<input type="text" path="quantity" />

						</p>
						<p>
							<label for="year"
								style="text-align: center; font-size: medium; font-family: Script MT Bold; color: white;">Price:</label>

							<input type="text" path="price" />

						</p>
						<p>
							<label for="year"
								style="text-align: center; font-size: medium; font-family: Script MT Bold; color: white;">Image:</label>

							<input type="file" path="pimage" />
						</p>

						<p>
							<input type="submit" value="Update Product" />
						</p>

					</fieldset>
				</form>
			</div>
		</div>
	</div>
</div>

<script src="resources/js/bootstrap.js"></script>
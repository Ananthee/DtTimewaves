<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<script src="https://ajax.googleapis.com/ajax/libs/angularjs/1.5.6/angular.min.js"></script>
<script>
  var prod = ${list};
  
  angular.module('showProduct',[]).controller('ProductController', function($scope)
   {
          $scope.Product=prod;
       
   
          $scope.sort = function(keyname)
          {
              $scope.sortKey = keyname;   //set the sortKey to the param passed
              $scope.reverse = !$scope.reverse; //if true make it false and vice versa
          }
              
    });
</script>
<jsp:include page="AdminHeader.jsp"/>
<body >
  <div class="container" color="#D0C0D0;">
  <form:form commandName="Product">
<div class="span12" style="text-align: justify; font-size: large; color:black;">
 <div ng-app="showProduct" ng-controller="ProductController">
 <br/><br/>

<div id="headin2"><strong> <h3 align="center">Product List </h3></strong></div>
<div align="center">
<table bgcolor="#00FF00" width=\"100%\" border=\"0\" id=\"tab\" >
<tr>         <th  id=\"td1\">PRODUCT ID</th>
			 <th  id=\"td2\">PRODUCT NAME</th>
             <th  id=\"td3\" >PRODUT DESC</th>
             <th  id=\"td4\">CATEGORY ID</th>
             <th  id=\"td5\">SELLER ID</th>
             <th  id=\"td6\">PRODUCT IMAGE</th>
             <th  id=\"td7\">PRODUCT QUANTITY</th>
             <th  id=\"td8\">PRODUCT PRICE</th>
             <th  id=\"td9\">EDIT</th>
             <th  id=\"td10\">DELETE</th>
 </tr>
 <tr class="success" ng-repeat="prod in Product|filter:searchText">

 	<td >{{prod.productId}}</td>
 	<td >{{prod.productName}}</td>
 	<td >{{prod.description}}</td>
 	<td >{{prod.categoryId}}</td>
 	<td >{{prod.supplierId}}</td>
 	<!-- <td bgcolor="white"><img src="resources/{{prod.pid}}.jpg" height="40" width="40" align="middle"/></td>-->
 <td ><img src="<c:url value='/resources/{{prod.productId}}.jpg'/>" height="50" width="50" align="middle"/></img></td>
 	
    <td >{{prod.quantity}}</td><td >{{prod.price}}</td>
 	<td ><a href="editProduct?id={{productId=prod.productId}}" style="color:black">Edit</a></td>
 	<td ><a href="deleteProduct?id={{productId=prod.productId}}" style="color:black">Delete</a></td>
 
 </tr>
 </table>
 </div>
 </div>
 </div>
 </form:form>
 
</div>
</body>	
<jsp:include page="Footer.jsp"></jsp:include>




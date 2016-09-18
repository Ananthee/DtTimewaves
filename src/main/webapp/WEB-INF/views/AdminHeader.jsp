<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
  <script src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
  <style>
  .carousel-inner > .item > img,
  .carousel-inner > .item > a > img {
      width: 70%;
      margin: auto;
  }
  div.img {
    margin: 5px;
    border: 1px solid #ccc;
    float: left;
    width: 280px;
}
  </style>
  
</head>
<body background="resources\backg.jpg">

<nav class="navbar navbar-inverse" color="#D0C0D0;" >
  <div class="container-fluid" >
      <div class="navbar-header">
      <a class="navbar-brand" href="#">ADMIN PAGE</a>
    </div>
 <ul class="nav navbar-nav navbar-right">
 <li class="dropdown"><a class="dropdown-toggle" data-toggle="dropdown" href="Product" >Product <span class="caret"></span></a>
        <ul class="dropdown-menu">
          <li><a href="addProduct">Add</a></li>
          <li><a href="viewProduct">View</a></li>
         </ul>
</li>
<li class="dropdown"><a class="dropdown-toggle" data-toggle="dropdown" href="Category">Category<span class="caret"></span></a>
        <ul class="dropdown-menu">
          <li><a href="addCategory">Add</a></li>
          <li><a href="viewCategory">View</a></li>
        </ul>
</li>

<li class="dropdown"><a class="dropdown-toggle" data-toggle="dropdown" href="Supplier">Supplier <span class="caret"></span></a>
        <ul class="dropdown-menu">
          <li><a href="addSupplier">Add</a></li>
          <li><a href="viewSupplier">View</a></li>
        </ul>
</li>
<!-- <li class="dropdown"><a class="dropdown-toggle" data-toggle="dropdown" href="User">User<span class="caret"></span></a>
        <ul class="dropdown-menu">
          <li><a href="viewUser">View</a></li>
        </ul>
 </li> -->    
</ul>
  </div>
  </nav>
   
</body>
</html>


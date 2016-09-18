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
  </style>
  
</head>
<body>
<%@include file="/WEB-INF/views/Header.jsp"%>
<%@include file="/WEB-INF/views/Sliders.jsp"%>
<div class="container">
  <h2>Image Gallery</h2>
  <div class="row">
    <div class="col-md-4">
      <a href="resources/new1.jpg" class="thumbnail">
        <p>Matrix analog</p>
        <img src="resources/new1.jpg" class="img-circle"  style="width:150px;height:150px">
      </a>
    </div>
    <div class="col-md-4">
      <a href="resources/new2.jpg" class="thumbnail">
        <p>Current white</p>
        <img src="resources/new2.jpg" class="img-circle"style="width:150px;height:150px">
      </a>
    </div>
    <div class="col-md-4">
      <a href="resources/img3.jpg" class="thumbnail">
        <p>Espoir analog</p>
        <img src="resources/img3.jpg" class="img-circle" style="width:150px;height:150px">
      </a>
    </div>
  </div>
</div>


<%@include file="/WEB-INF/views/Footer.jsp"%>
</body>
</html>
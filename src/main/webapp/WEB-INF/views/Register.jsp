<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"  %>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Time Waves</title>
</head>
<%@include file="/WEB-INF/views/Header.jsp"%>
<body style="background-color:#D0C0D0;">


    <div class="container">
        <div class="row centered-form">
        <div class="col-xs-12 col-sm-8 col-md-4 col-sm-offset-2 col-md-offset-4">
        	<div class="panel panel-default">
        		<div class="panel-heading">
			    		<h3 class="panel-title">sign up</h3>
			 			</div>
			 			<div class="panel-body">
			    		<form:form id="registerForm" method="POST" name="Register" action="RegistrationSuccess" commandName="registerDetail">
			    		
			    			<div class="row">
			    				<div class="col-xs-6 col-sm-6 col-md-6">
			    					<div class="form-group">
			                <input type="text" name="FirstName" id="first_name" class="form-control input-sm" placeholder="First Name" required>
			    					</div>
			    				</div>
			    				<div class="col-xs-6 col-sm-6 col-md-6">
			    					<div class="form-group">
			    						<input type="text" name="LastName" id="last_name" class="form-control input-sm" placeholder="Last Name" required>
			    					</div>
			    				</div>
			    			</div>

			    			<div class="form-group">
			    				<input type="email" name="EmailId" id="email" class="form-control input-sm" placeholder="Email Address" required>
			    			</div>

			    			<div class="row">
			    				<div class="col-xs-6 col-sm-6 col-md-6">
			    					<div class="form-group">
			    						<input type="password" name="Password" id="password" class="form-control input-sm" placeholder="Password" required>
			    					</div>
			    				</div>
			    				<div class="col-xs-6 col-sm-6 col-md-6">
			    					<div class="form-group">
			    						<input type="password" name="ConfirmPassword" id="password_confirmation" class="form-control input-sm" placeholder="Confirm Password" required>
			    					</div>
			    				</div>
			    			</div>
			    			
			    			<input type="submit" value="Register" class="btn btn-info btn-block"  >
			    		
			    		</form:form>
			    	</div>
	    		</div>
    		</div>
    	</div>
    </div></body>
</html>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Timewaves</title>
</head>
<body style="background-color:#D0C0D0;" >
<%@include file="/WEB-INF/views/Header.jsp"%>
    <div class="container" style="margin-top:40px">
		<div class="row">
			<div class="col-sm-6 col-md-4 col-md-offset-4">
				<div class="panel panel-default">
					<div class="panel-heading" align="center" >
						<strong>  Sign-in </strong>
					</div>
					<div class="panel-body">
					<form action="perform_login" method="POST">
							<fieldset>
								<div class="row">
									<div class="center-block" align="center">
										<img src="resources/download.png" alt="">
									</div>
								</div>
								<div class="row">
									<div class="col-sm-12 col-md-10  col-md-offset-1 ">
										<div class="form-group">
											<div class="input-group">
												<span class="input-group-addon">
													<i class="glyphicon glyphicon-user"></i>
												</span> 
												<input type="text" placeholder="Username" required id="username" name="username" 
						pattern=".{5,10}" title="minimum length for username is 5"/>
											</div>
										</div>
										<div class="form-group">
											<div class="input-group">
												<span class="input-group-addon">
													<i class="glyphicon glyphicon-lock"></i>
												</span>
												<input type="password" placeholder="Password" required id="password" name="password" 
					title="Enter Valid credentials"/>
											</div>
										</div>
										<div class="form-group">
										<input type="submit" class="btn btn-lg btn-primary btn-block" value="Sign in"></input>
										</div>
									</div>
								</div>
								</fieldset>
								</form>
						
					</div>
					
                </div>
			</div>
		</div>
	</div>	
	<%@include file="/WEB-INF/views/Footer.jsp"%>
</body>
</html>
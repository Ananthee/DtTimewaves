<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body style="background-color:#D0C0D0;">
    <div class="container" style="margin-top:40px">
		<div class="row">
			<div class="col-sm-6 col-md-4 col-md-offset-4">
				<div class="panel panel-default">
					<div class="panel-heading" align="center" >
						<strong>  Sign-in </strong>
					</div>
					<div class="panel-body">
						<form:form class="form" method="POST" name="Login" action="LoginSuccess" commandName="LoginDetail">
							<fieldset>
								<div class="row">
									<div class="center-block" align="center">
										<img class="profile-img"
											src="https://lh5.googleusercontent.com/-b0-k99FZlyE/AAAAAAAAAAI/AAAAAAAAAAA/eu7opA4byxI/photo.jpg?sz=120" alt="">
									</div>
								</div>
								<div class="row">
									<div class="col-sm-12 col-md-10  col-md-offset-1 ">
										<div class="form-group">
											<div class="input-group">
												<span class="input-group-addon">
													<i class="glyphicon glyphicon-user"></i>
												</span> 
												<input class="form-control" placeholder="Username" name="loginname" type="text" autofocus required>
											</div>
										</div>
										<div class="form-group">
											<div class="input-group">
												<span class="input-group-addon">
													<i class="glyphicon glyphicon-lock"></i>
												</span>
												<form:input class="form-control" placeholder="Password" name="password" type="password" value="" required></form:input>
											</div>
										</div>
										<div class="form-group">
											<form:input type="submit" class="btn btn-lg btn-primary btn-block" value="Sign in"></form:input>
										</div>
									</div>
								</div>
							</fieldset>
						</form:form>
					</div>
					<div class="panel-footer ">
						Don't have an account! <a href="#" onClick=""> Sign Up Here </a>
					</div>
                </div>
			</div>
		</div>
	</div>	
	<%@include file="/WEB-INF/views/Footer.jsp"%>
</body>
</html>
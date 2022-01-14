<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<!DOCTYPE html>
<html lang="en" dir="ltr">
<head>
<meta charset="utf-8">
<title>Signup form</title>
<link rel="stylesheet" href="css/signup_style.css">
</head>
<body>

	<div class="center">
		<div class="img">
			<img src="https://img.icons8.com/fluency/50/000000/add-user-male.png" />
		</div>
		<h1>Signup Now</h1>

		<div class="container-fluid mt-3">
			<%@include file="components/message.jsp"%>
			<%@include file="components/message1.jsp"%>
		</div>

		<Form action="RegisterServlet" method="post">
			<div class="txt_field">
				<input name="userName" type="text" required> <span></span> <label>Name</label>
			</div>
			<div class="txt_field">
				<input name="userPassword" type="password" required> <span></span>
				<label>Password</label>
			</div>
			<div class="txt_field">
				<input name="userEmail" type="email" required> <span></span>
				<label>E-mail</label>
			</div>
			<div class="txt_field">
				<input name="userNumber" type="number" required> <span></span>
				<label>+91</label>
			</div>
			<input type="submit" value="Signup">
			<div class="link">
				Already a member? <a href="login.html">Login</a>
			</div>
		</form>
	</div>
</body>
</html>
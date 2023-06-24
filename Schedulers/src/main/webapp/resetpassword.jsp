<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet" href="css/reset.css">
<link rel="icon" type="image/x-icon" href="favicon.png">
</head>
<body>
	<header>
		<h2 class="logo">Scheduler</h2>
	</header>
	<div class="reset_box">
		<h2>Reset Password</h2>
		<label> Enter your Email : </label> <input type="email"
			id="forgetPassword" required>


		<button type="submit" class="forget_Submit" onclick="onSubmit()">Submit</button>
	</div>
	<div id="snackbar"></div>
	<script src="js/reset.js"></script>
</body>
</html>
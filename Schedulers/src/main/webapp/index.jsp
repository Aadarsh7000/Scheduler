<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Scheduler</title>
<link rel="stylesheet" href="css/stylesheet.css">
<link rel="icon" type="image/x-icon" href="favicon.png">
<script src="https://code.jquery.com/jquery-3.4.1.min.js"
	integrity="sha256-CSXorXvZcTkaix6Yvo6HppcZGetbYMGWSFlBw8HfCJo="
	crossorigin="anonymous"></script>
<script type="text/javascript"
	src="https://cdn.jsdelivr.net/npm/jquery-validation@1.19.0/dist/jquery.validate.min.js"></script>
</head>
<body>
	<header>
		<h2 class="logo">Scheduler</h2>
		<nav class="navigation">
			<a href="#">Home</a> <a href="#">About</a>
			<button class="btnLogin">Login</button>
		</nav>
	</header>
	<div class="wrapper">
		<span class="icon-close"><ion-icon name="close"></ion-icon></span>
		<div class="form-box_login">
			<h2>Login</h2>
			<form action="login" method="post" name="login" class="login">
				<div class="input-box">
					<span class="icon"><ion-icon name="mail"></ion-icon></span> <input
						type="email" required id="email" name="userEmail"> <label>Email</label>
				</div>
				<div class="input-box">
					<span class="icon"><ion-icon name="eye" id="togglePassword"></ion-icon></span>
					<input type="password" required id="password" name="userPassword">
					<label>Password</label>
	
				</div>
				<div class="remember_me">
					<label><input type="checkbox">Remember me</input> </label> <a
						href="#">Forget Password?</a>
				</div>
				<button type="submit" class="btn" id="submitBtn">Login</button>
				<div class="login-register">
					<p>
						Don't have an account?<a href="#" class="register-link">Register</a>
					</p>
					
					<br>	${message}
					
				</div>
				
			</form>
		</div>
		<div class="form-box_register">
			<h2>Registration</h2>
			<form action="register" method="post">
				<div class="input-box">
					<span class="icon"><ion-icon name="person"></ion-icon></span> <input
						type="text" required name="userName"> <label>Username</label>
				</div>

				<div class="input-box">
					<span class="icon"><ion-icon name="mail"></ion-icon></span> <input
						type="email" required name="userEmail"> <label>Email</label>
				</div>
				<div class="input-box">
					<span class="icon"><ion-icon name="eye" id="registerToggle"></ion-icon></span>
					<input type="password" id="rPassword" required name="userPassword">
					<label>Password</label>
				</div>
				<div class="remember_me">
					<label><input type="checkbox"></input> I agree to the terms
						& conditions </label>
				</div>
				<button type="submit" class="btn">Register</button>
				<div class="login-register">
					<p>
						Already have an account?<a href="#" class="login-link">Login</a>
					</p>
				</div>
			</form>
		</div>



	</div>

	<div class="footer">
		<p>Copyright</p>
	</div>
	<script src="js/script.js"></script>
	<script type="module"
		src="https://unpkg.com/ionicons@7.1.0/dist/ionicons/ionicons.esm.js"></script>
	<script nomodule
		src="https://unpkg.com/ionicons@7.1.0/dist/ionicons/ionicons.js"></script>
</body>

<script type="text/javascript" >
	$(document).ready(function() {
		$("#login").validate({
			rules : {
				email : {
					required : true,
					email : true
				},

				password : "required",
			},

			messages : {
				email : {
					required : "Please enter email",
					email : "Please enter a valid email address"
				},

				password : "Please enter password"
			}
		});

	});
</script>

</html>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Scheduler</title>
<link rel="stylesheet" href="css/Dashboard.css">
<link rel="icon" type="image/x-icon" href="favicon.png">
</head>
<body>
	<header>
		<h2 class="logo">Scheduler</h2>
		<nav class="navigation">
			<a href="Dashboard.jsp" >Home</a>
			<button class="addModal" id="myBtn">Add Task</button>
			<div class="dropdown">
				<button onclick="myFunction()" class="dropbtn">
					<ion-icon name="person"></ion-icon>
					Profile
				</button>
				<div id="myDropdown" class="dropdown-content">
					<a href="#"><ion-icon name="home"></ion-icon>My Task</a> <a
						href="#"><ion-icon name="pencil"></ion-icon>Edit Profile</a> <a
						href="index.jsp"><ion-icon name="log-out-outline"></ion-icon>Logout</a>
				</div>
			</div>
		</nav>
	</header>


	<div class="taskContainer">
		<!-- <button class="tasklst"> Task List</button> -->

		<!-- The Modal -->
		<div id="myModal" class="modal">

			<!-- Modal content -->
			<div class="modal-content">
				<span class="close">&times;</span>
				<h2 class="title">ADD TASK</h2>
				<form action="addtask" name="myform" method="post">

					<div class="input-box">
						<label class="heading" id="Title">Task:</label> <input
							class="inputbox-style" type="text" required id="Title"
							name="task_title">
					</div>

					<div class="input-box">
						<label class="heading" id="description">Description:</label> <input
							class="inputbox-style" type="text" required id="Title"
							name="description">
					</div>

					<div class="input-box">
						<label class="heading" id="date">Start Date:</label> <input
							class="inputbox-style" type="date" required id="currentDate"
							name="start_date">

					</div>
					<div class="input-box">
						<label class="heading" id="date">End Date:</label> <input
							class="inputbox-style" type="date" required id="currentDate"
							name="end_date">

					</div>

					<div class="Time">
						<div class="from">
							<label class="from-heading" id="from">From:</label> <input
								class="from-inputbox-style" type="time" required id="from"
								name="start_time">
						</div>
						<div class="to">
							<label class="to-heading" id="to">To:</label> <input
								class="to-inputbox-style" type="time" required id="date"
								name="end_time">
						</div>

					</div>

					<div class="input-box">
						<label class="heading margin" id="status">Status:</label> <input
							class="radioBtn" type="radio" name="status" value="pending">Pending
						<input class="radioBtn" type="radio" name="status" value="planned">Planned
						<input class="radioBtn" type="radio" name="status"
							value="completed">Completed

					</div>

					<div class="input-box">
						<label class="heading margin" id="status">Priority:</label> <input
							class="radioBtn" type="radio" name="priority" value="Low">Low
						<input class="radioBtn" type="radio" name="priority"
							value="Medium">Medium <input class="radioBtn"
							type="radio" name="priority" value="High">High

					</div>

					<button type="submit" class="btn" id="myBtn">Submit</button>
				</form>
			</div>


		</div>

	</div>



	<div class="cardview" name="card" id="cardview">
		<div class="List" onclick="allTable()" id="alllist">
			<div class="container">
				<h2>
					<b>All Task</b>
				</h2>
				<p>10</p>
			</div>

		</div>
		<div class="priorityList" onclick="priorityTable()">
			<div class="container" id="prioritylist">
				<h2>
					<b>High Priority Task</b>
				</h2>
				<p>5</p>
			</div>
		</div>
		<div class="pendingList" onclick="pendingTable()" id="pendinglist">
			<div class="container">
				<h2>
					<b>Pending Task</b>
				</h2>
				<p>10</p>
			</div>
		</div>


	</div>


	<div class="footer">
		<p>Copyright</p>
	</div>

	<script src="js/dashboard.js"></script>
	<script type="module"
		src="https://unpkg.com/ionicons@7.1.0/dist/ionicons/ionicons.esm.js"></script>
	<script nomodule
		src="https://unpkg.com/ionicons@7.1.0/dist/ionicons/ionicons.js"></script>
</body>

</html>
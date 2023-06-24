<%@ page import = "java.io.*,java.util.*,java.sql.*"%>
<%@ page import = "javax.servlet.http.*,javax.servlet.*" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix = "c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix = "sql"%>

<html>

<head>
  <title>Scheduler</title>
  <link rel="stylesheet" href="css/table.css">
  <link rel="icon" type="image/x-icon" href="favicon.png">
</head>

<body>

<sql:setDataSource var = "tasks" driver = "com.mysql.jdbc.Driver"
         url = "jdbc:mysql://localhost:3306/scheduler"
         user = "root"  password = "P@ssw0rd@2023"/>
 
 
      <sql:query dataSource = "${tasks}" var = "result">
         SELECT * from assined_task where priority="High"||"high";
      </sql:query>
      
  
  <header>
    <nav class="navigation">
     
      <div class="dropdown">
        <button onclick="myFunction()" class="dropbtn"><ion-icon name="person"></ion-icon>Profile</button>
        <div id="myDropdown" class="dropdown-content">
          <a href="#"><ion-icon name="home"></ion-icon>My Task</a>
          <a href="#"><ion-icon name="pencil"></ion-icon>Edit Profile</a>
          <a href="index.html"><ion-icon name="log-out-outline"></ion-icon>Logout</a>
        </div>
      </div>
    </nav>
  </header>

  <div class="sidenav">
    <h2 class="logo">Scheduler</h2>
      <a href="Table.jsp">My Tasks</a>
    <a href="PriorityTable.jsp">Priority Task</a>
    <a href="PendingTable.jsp">Pending Task</a>
    <a href="#">About</a>

  </div>
 
<div class="Table">  
  <h2> All Task Table</h2>
  
  <table>
    <thead><tr>
      <th>S No.</th>
      <th>Task</th>
      <th>Description</th>
      <th>Start Date</th>
      <th>End Date</th>
      <th>Start Time</th>
      <th>End Time</th>
      <th>Status</th>
      <th>Priority</th>
    </tr></thead>
    <tbody>
    <c:forEach var = "row" items = "${result.rows}"> 
    <tr>
      <td><c:out value = "${row.taskid}"/></td>
      <td><c:out value = "${row.task_title}"/></td>
      <td><c:out value = "${row.description}"/></td>
      <td><c:out value = "${row.start_date}"/></td>
      <td><c:out value = "${row.end_date}"/></td>
      <td><c:out value = "${row.start_time}"/></td>
      <td><c:out value = "${row.end_time}"/></td>
      <td><c:out value = "${row.status}"/></td>
      <td><c:out value = "${row.priority}"/></td>
    </tr>
    </c:forEach>
    
    
    </tbody>
    
   
  </table>

</div>


  

  <div class="footer">
    <p> Copyright</p>
  </div>

  <script src="dashboard.js"></script>
  <script type="module" src="https://unpkg.com/ionicons@7.1.0/dist/ionicons/ionicons.esm.js"></script>
  <script nomodule src="https://unpkg.com/ionicons@7.1.0/dist/ionicons/ionicons.js"></script>
</body>

</html>
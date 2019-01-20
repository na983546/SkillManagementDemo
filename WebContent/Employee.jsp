<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>Employee List</title>
<style>
	body {
		font-family: Arial, Helvetica, sans-serif;
	}
	#button:hover {
 		opacity: 0.8;
	}
	form {
		border: 3px solid #f1f1f1;
	}
	.my-button {
		padding: 15px 32px;
		background-color:#4CAF50;
		border-radius:15px;
		text-align: center;
		color:white;
		border-color:black;
		margin-top: 10px;
	}
	.field-label {
		text-align:left;
	}
	.container {
		margin :0 400px 0 400px;
 		padding: 16px;
 		background-color: #b7effb;
	}
</style>
</head>
<body style="background-color: #e3c6f0">
<h1 style="text-align: center">Skill Management System</h1>
<form class="container" action="EmployeeSkillServlet" method="post">
<center>
<div >
<table>
	<tr>
		<th class='field-label'>Technology:</th>
		<td><input type ='text' name='technology' required></td>
	</tr>
	<tr>
		<th class='field-label'>Skill Level:</th>
		<td><select name='level' required>
			<option value="">Select Level</option>
			<option value="BEGINNER">BEGINNER</option>
			<option value="PROFICIENT">PROFICIENT</option>
			<option value="INTERMEDIATE">INTERMEDIATE</option>
			</select>
		</td>
	</tr>	
</table>


		<input id="button" type="submit" class='my-button' name="action" value="FIND EMPLOYEE">

		
		<a href="index.html"><input id="button" type="button" class='my-button' name="action" value="HOME"></a>
</div>
</center>
</form>
</body>
</html>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>AddSkill</title>
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
<h3 style="text-align: center">Add New Skill!!!!</h3>
<form class="container" action="EmployeeSkillServlet" method="post">
<center>
<div >
<table>
	<tr>
		<th class='field-label'>Skill Id:</th>
		<td><input type ='text' name='skillId' required></td>
	</tr>
	<tr>
		<th class='field-label'>Emp Id:</th>
		<td><input type ='text' name='empId' required></td>
	</tr>
	<tr>
		<th class='field-label'>Technology:</th>
		<td><input type ='text' name='technology' required></td>
	</tr>
	<tr>
		<th class='field-label'>Skill Level:</th>
		<td><select name='level' required>
			<option value="0">Select Level</option>
			<option value="BEGINNER">BEGINNER</option>
			<option value="PROFICIENT">PROFICIENT</option>
			<option value="INTERMEDIATE">INTERMEDIATE</option>
			</select>
		</td>
	</tr>	
	<tr>
		<th class='field-label'>Experience:</th>
		<td><input type ='number'name='experience' min="0"  placeholder='Greater than 0' required></td>
	</tr>
</table>

		<input type="hidden" name ="action" value="ADD SKILL">
		<input id="button" type="submit" class='my-button' name="action" value="ADD SKILL">
</div>
</center>
</form>
</body>
</html>
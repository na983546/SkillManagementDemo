<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>AddEmployee</title>
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
<h3 style="text-align: center">Add New Employee!!!!</h3>
<form class="container" action="EmployeeSkillServlet" method = "post" >
<center>
<div >
<table>
	<tr>
		<th class='field-label'>Emp Id:</th>
		<td><input type ='text' name='empId' required></td>
	</tr>
	<tr>
		<th class='field-label'>Emp Name:</th>
		<td><input type ='text' name='empName' required></td>
	</tr>
	<tr>
		<th class='field-label'>Emp Location:</th>
		<td><select name='location' required>
			<option value="" hidden>Select Location</option>
			<option value="AHD">AHD</option>
			<option value="CHN">CHN</option>
			<option value="TVM">TVM</option>
			</select>
		</td>
	</tr>	
</table>
		<input id="button" type="submit" class='my-button' name="action" value="ADD EMPLOYEE">
		
</div>
</center>
</form>
</body>
</html>
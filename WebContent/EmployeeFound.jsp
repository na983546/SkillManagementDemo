<%@page import="java.util.HashSet"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>EmployeeFound</title>
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
	table{
		border: 1px solid black;
	}
	th,td{
		border: 1px solid black;
  		text-align: center;
	}
</style>
</head>
<%! int i = 1; %>
<body style="background-color: #e3c6f0">
<h1 style="text-align: center">Skill Management System</h1>
<form class="container" action="SkillManager" method="post">
<center>
<div >
		<% String msg = (String)request.getAttribute("msg"); %>
		<h2 style="color: #06adff;">Success!!!!!!!</h2>
		<h5><b><%= msg %></b></h5>
<table>
		<% HashSet<String> hs =(HashSet<String>)request.getAttribute("HashSet");%>
		<tr>
			<th>S.No</th>
			<th>NAME</th>
		</tr>
		<% for(String s : hs){ %>
		<tr>
			<td><%= i %> </td>
			<td><%= s %></td>
		</tr>
		<% i++; %>		
		<% } i=1;%>
		
</table>

		<input type="hidden" name ="action" value="HOME">
		<input id="button" type="submit" class='my-button' name="action" value="HOME">
</div>
</center>
</form>
</body>
</html>
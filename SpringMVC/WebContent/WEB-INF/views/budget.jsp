<?xml version="1.0" encoding="UTF-8" ?>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<title>Insert title here</title>
</head>
<body>
	<h3>This is the budget</h3>
	<br /> ${message}
	<br />
	<br>
		<form action="expense" method="post">
			<table>
				<tr>
					<td>Item Name</td>
					<td> <input type="text" name="itemName" /></td>
				</tr>
				<tr>
					<td>Item Amount</td>
					<td><input
				type="text" name="itemAmount" /></td>
				</tr>
				<tr>
					<td></td>
					<td><input type="submit"
					value="Submit" /></td>
				</tr>
			</table>
		</form>
		<br>
		<a href="getExpense"><button>Expenses</button></a>
		
</body>
</html>
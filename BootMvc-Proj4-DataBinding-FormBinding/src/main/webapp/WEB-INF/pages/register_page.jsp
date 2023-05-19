
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="frm"%>
<h1 style="color: blue; text-align: center;">Student Registration
	Form</h1>




<form action="register" method="POST">
	<table border="0" bgcolor="cyan" align="center">
		<tr>
			<td>Student Id::</td>
			<td><input type="text" name="sno"></td>
		</tr>
		<tr>
			<td>Student Name::</td>
			<td><input type="text" name="sname"></td>
		</tr>
		
		<tr>
			<td>Student Address::</td>
			<td><input type="text" name="saddrs"></td>
		</tr>
		
		<tr>
			<td>Student Marks::</td>
			<td><input type="text" name="smarks"></td>
		</tr>
		
		<tr>
			<td><input type="submit" value="register"></td>
			<td><input type="reset" value="cancel"></td>
		</tr>

	</table>

</form> 

<%@ taglib uri="http://www.springframework.org/tags/form" prefix="frm"%>
<h1 style="color: blue; text-align: center;">Student Registration
	Form</h1>


<frm:form action="register" method="post" modelAttribute="login" >
	<table border="0" bgcolor="cyan" align="center">
		<tr>
			<td>Student Id::</td>
			<td><frm:input path="sno"/> </td>
		</tr>
		<tr>
			<td>Student Name::</td>
			<td><frm:input path="sname"/> </td>
		</tr>

		<tr>
			<td>Student Address::</td>
			<td><frm:input path="saddrs"/> </td>
		</tr>

		<tr>
			<td>Student Marks::</td>
			<td><frm:input path="smarks"/> </td>
		</tr>

		<tr>
			<td><input type="submit" value="register"></td>
			<td><input type="reset" value="cancel"></td>
		</tr>

	</table>

</frm:form>




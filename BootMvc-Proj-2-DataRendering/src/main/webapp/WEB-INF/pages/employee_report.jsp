<%@ page isELIgnored="false" import="java.util.*"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<%-- <h1>Collection Of Employee</h1>
<b>First Collection::</b><br>
<c:forEach var="list" items="${EmployeeData}" >
${list},

</c:forEach> --%>

<c:choose>

	<c:when test="${!empty EmployeeData }">
		<table border="1" bgColor="cyan" align="center">
			<tr>
				<th>eno</th>
				<th>ename</th>
				<th>salary</th>
				<th>isVaccinated</th>
			</tr>

			<c:forEach var="Emp" items="${EmployeeData}">

				<tr>
					<td>${Emp.eno}</td>
					<td>${Emp.ename}</td>
					<td>${Emp.salary}</td>
					<td>${Emp.isVaccinated}</td>
				</tr>


			</c:forEach>

		</table>

	</c:when>
	<c:otherwise>
	<h1 style="color: red; text-align: center; " > Employee Not Found</h1>
	</c:otherwise>


</c:choose>
<br>
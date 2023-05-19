
<%@ page isELIgnored="false" import="java.util.*"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="c"%>

<h1>Model Attribute data is</h1>

<b>List Of Student::</b><br>
<c:forEach var="studentList" items="${student}">
 ${studentList}, 
</c:forEach>

<br>

<b> Set of phone numbers::</b><br>
<c:forEach var="phNo" items="${phoneNumbers}">
${phNo}, 
</c:forEach>
<br>

<b> favourite colours::</b><br>
<c:forEach var="favColors" items="${favColours}">
${favColors},
</c:forEach>
<br>

<b>Id details::</b><br>
<c:forEach var="Id" items="${idDetails}">
${Id.key},${Id.value }<br>
</c:forEach>

<br>

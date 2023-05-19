
<%@ page isELIgnored="false" import="java.util.*" %>

<h1>Model Attribute Data</h1>
<b style="color: red;text-align: center;">List Of Student::${student} </b>
<b><b></b>
<b style="color: aqua; ;text-align: center;">Set Of Phone Numbers::${phoneNumbers} </b>
<br><br><br></br>
<b style="color: blue;text-align: center;">Id Details::${idDetails} </b>
<b><b><b></b>
<b style="color: black;text-align: center;">Fav Colours::<%=Arrays.toString(((String[])request.getAttribute("favColours"))) %></b>
<b><b><b></b>


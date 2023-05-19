

<%@ page isELIgnored="false" import="java.util.*" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<c:if test="${!empty empdata }">
<b>
empInfo:: ${empdata.eno },${empdata.ename},${empdata.salary},${empdata.isVaccinated}
</b>

</c:if>
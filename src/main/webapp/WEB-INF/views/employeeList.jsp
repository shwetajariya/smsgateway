<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<body>
	<h1>Employee List</h1>
 
	<c:forEach items="${employeeList}" var="employee">
		${employee.firstName} ${employee.lastName}: ${employee.mobileNumber}
		<br />
	</c:forEach>
 
 </body>
</html>

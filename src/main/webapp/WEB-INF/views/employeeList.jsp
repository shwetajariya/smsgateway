<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<body>
	<h1>Employee List</h1>
	<center>
 <table border="1">
 <tr>
  <td>No.</td>
 <td>NAME</td>
 <td>Mobile Number</td>
 </tr>
	<c:forEach items="${employeeList}" var="employee" varStatus="theCount">
	<tr><td>${theCount.index + 1}</td><td>
		${employee.firstName} ${employee.lastName}</td><td> ${employee.firstNumber}-${employee.middleNumber}-${employee.lastNumber}</td>
		</tr>
	</c:forEach>
</table>
</center>
 
 </body>
</html>

<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<html>
<head>
<title>Employee</title>
</head>
<body>

	<h2>Employee Information</h2>
	<form:form method="POST" action="/smsgateway/employee">
		<table>
			<tr>
				<td><form:label path="id">Id</form:label></td>
				<td><form:input path="id" disabled="true" /></td>
			</tr>
			<tr>
				<td><form:label path="employeeNumber">Employee Number</form:label></td>
				<td><form:input path="employeeNumber" /></td>
			</tr>
			<tr>
				<td><form:label path="firstName">First Name</form:label></td>
				<td><form:input path="firstName" /></td>
			</tr>
			<tr>
				<td><form:label path="lastName">Last Name</form:label></td>
				<td><form:input path="lastName" /></td>
			</tr>
			<tr>
				<td><form:label path="company">Company</form:label></td>
				<td><form:input path="company" /></td>
			</tr>
			<tr>
				<td><form:label path="designation">Designation</form:label></td>
				<td><form:input path="designation" /></td>
			</tr>
			<tr>
				<td><form:label path="department">Department</form:label></td>
				<td><form:input path="department" /></td>
			</tr>
			<tr>
				<td><form:label path="section">Section</form:label></td>
				<td><form:input path="section" /></td>
			</tr>
			<tr>
				<td><form:label path="mobileNumber">Mobile Number</form:label></td>
				<td><form:input path="mobileNumber" /></td>
			</tr>
			<tr>
				<td><form:label path="ipContactNumber">IP Contact Number</form:label></td>
				<td><form:input path="ipContactNumber" /></td>
			</tr>
			<tr>
				<td><form:label path="priority">Priority</form:label></td>
				<td><form:input path="priority" /></td>
			</tr>
			<tr>
				<td><form:label path="email">Email</form:label></td>
				<td><form:input path="email" /></td>
			</tr>
			<tr>
				<td><form:label path="address">Address</form:label></td>
				<td><form:input path="address" /></td>
			</tr>
			<tr>
				<td><form:label path="area">Area</form:label></td>
				<td><form:input path="area" /></td>
			</tr>
			<tr>
				<td colspan="2"><input type="submit" value="Submit" /></td>
			</tr>
		</table>
	</form:form>
</body>
</html>
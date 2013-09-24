<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title><tiles:insertAttribute name="title" ignore="true" /></title>
<style type="text/css">
body {
	//background: #555;
	width: 400px;
	//border: 1px solid #fff;
	//padding: 0px;
}

div {
	//padding: 5px;
	//margin: 0px;
}

h1,h2,p {
	//padding: 0px;
	//margin: 0px;
}

#banner-style {
	//background: #3B3E37;
}

#title-style {
	//background: #665845;
}

#subtitle-style {
	//background: #9F8158;
}

#primary-style {
	//background: #EBC785;
}

#footer-style {
	//background: #733027;
}
</style>
</head>
<body>
	<table border="1" cellpadding="1" cellspacing="1" align="center">
		<tr>
			<td height="30" colspan="2"><div id="banner-style"><tiles:insertAttribute name="banner-content" /></div>
			</td>
		</tr>
		<tr>
			<td height="250"><tiles:insertAttribute name="menu-content" /></td>
			<td width="350"><div id="primary-style"><tiles:insertAttribute name="primary-content" /></div></td>
		</tr>
		<tr>
			<td height="30" colspan="2"><div id="footer-style"><tiles:insertAttribute name="footer-content" /></div>
			</td>
		</tr>
	</table>
</body>
</html>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title></title>
</head>
<body>
	<form:form action="/smsgateway/sendSmsOne" name="form_id">
		<li id="li_7"><label class="description" for="element_7">Mobile
				Number </label> <span> <form:input path="firstNumber"
					id="element_7_1" name="element_7_1" class="element text" size="3"
					maxlength="3" value="" type="text" /> - <label for="element_7_1">(###)</label>
		</span> <span> <form:input path="middleNumber" id="element_7_2"
					name="element_7_2" class="element text" size="3" maxlength="3"
					value="" type="text" /> - <label for="element_7_2">###</label>
		</span> <span> <form:input path="lastNumber" id="element_7_3"
					name="element_7_3" class="element text" size="4" maxlength="4"
					value="" type="text" /> <label for="element_7_3">####</label>
		</span>
			<p class="guidelines" id="guide_7">
				<small>Employee Mobile Number</small>
			</p></li>

		<li class="buttons"><input type="hidden" name="form_id"
			value="710961" /> <input id="saveForm" class="button_text"
			type="submit" name="submit" value="Send To One" /></li>
	</form:form>
	
	<li class="buttons"><input type="hidden" name="form_id"
			value="710961" /> <a href="/smsgateway/sendSmsAll">
			<input id="saveForm" class="button_text"
			type="submit" name="submit" value="Send To All" /></a></li>
</body>
</html>
<%--
/**
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */
--%>

<%@ include file="/mvcportlet2/init.jsp" %>

<portlet:actionURL var="actionURL">
<portlet:param  name="key1"  value="My Value1" />
<portlet:param  name="key2"  value="My Value2" />
</portlet:actionURL>

<aui:form action="<%=actionURL %>" method="post">
	<aui:input name="name" label="Enter Employee name: " title="Name" type="text"></aui:input><br>
	<aui:input name="address" label="Enter Address: " title="Address" type="text"></aui:input><br>
	<aui:input name="age" label="Enter Age: " title="age" type="number"></aui:input><br>
	<aui:button value="Submit" type="submit"></aui:button>
</aui:form>

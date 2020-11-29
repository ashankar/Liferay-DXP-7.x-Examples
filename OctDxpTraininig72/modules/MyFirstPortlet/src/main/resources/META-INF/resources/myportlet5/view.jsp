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

<%@ include file="/myportlet5/init.jsp" %>

<portlet:actionURL var="submitActionabs">
</portlet:actionURL>

<aui:form action="<%=submitActionabs %>" method="post">
	<aui:input name="alpha" label="Enter your name: " title="Name" type="text"></aui:input><br>
	<aui:button value="Submit" type="submit"></aui:button>
</aui:form>

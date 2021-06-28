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

<%@ include file="/myactionphaseportlet1/init.jsp" %>

<portlet:actionURL  var="actionURL" name="myProcessAction">
<portlet:param name="key1" value="100" />
</portlet:actionURL>

<portlet:actionURL  var="actionURL1" name="myProcessAction1">
<portlet:param name="key1" value="200" />
</portlet:actionURL>

<portlet:actionURL  var="actionURL2" name="myProcessAction2">
</portlet:actionURL>


<form action="<%=actionURL %>" method="post">
	<input name="<portlet:namespace/>alpha" type="text" /><br>
	<input type="submit" name="Submit"/>
</form>



<a href="<%=actionURL1%>">Click Me 1</a>

<a href="<%=actionURL2%>">Click Me 2</a>




<%-- <aui:form action="<%=actionURL %>" method="post">
	<aui:input name="alpha" label="Enter your name: " title="Name" type="text"></aui:input><br>
	<aui:button value="Submit" type="submit"></aui:button>
</aui:form> --%>


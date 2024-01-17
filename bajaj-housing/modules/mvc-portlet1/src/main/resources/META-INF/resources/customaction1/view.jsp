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

<%@ include file="/customaction1/init.jsp" %>

<portlet:actionURL  var="actionURL1" name="myAction1">
<portlet:param name="key1" value="My Value 1"/>
</portlet:actionURL>

<portlet:actionURL  var="actionURL2" name="myAction2">
<portlet:param name="key2" value="My Value 2"/>
</portlet:actionURL>
<a href="<%=actionURL1%>">Custom Action-1</a><br>
<a href="<%=actionURL2%>">Custom Action-2</a>




<form action="<%=actionURL1 %>" method="post">
	Enter your name:<br> 
	<input name="<portlet:namespace/>textboxname" type="text" /><br>
	<input name="Submit" type="Submit" /><br>
<form>





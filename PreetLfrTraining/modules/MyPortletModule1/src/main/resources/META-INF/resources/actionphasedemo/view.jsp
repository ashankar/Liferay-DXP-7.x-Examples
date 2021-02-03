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

<%@ include file="/actionphasedemo/init.jsp" %>

<portlet:actionURL  var="actionURL1" name="myCustomProcessAction1">
<portlet:param name="param1" value="Value 1"/>
</portlet:actionURL>

<portlet:actionURL  var="actionURL2" name="myCustomProcessAction2">
<portlet:param name="param1" value="Value 2"/>
</portlet:actionURL>

<portlet:actionURL  var="actionURL3" name="myCustomProcessAction3">
<portlet:param name="param1" value="Value 3"/>
</portlet:actionURL>

<a href="<%=actionURL1%>">Click Me1</a><br>
<a href="<%=actionURL2%>">Click Me2</a><br>
<a href="<%=actionURL3%>">Click Me3</a> <br>




<form action="<%=actionURL1 %>" method="post">
	Enter your name:<br> 
	<input name="<portlet:namespace/>alpha" type="text" /><br>
	<input name="Submit" type="Submit" /><br>
<form>











<%-- 
<aui:form action="<%=actionURL %>" method="post">
	<aui:input name="alpha" label="Enter your name: " title="Name" type="text"></aui:input><br>
	<aui:button value="Submit" type="submit"></aui:button>
</aui:form>


<%=renderRequest.getAttribute("attrib1") %>

 --%>







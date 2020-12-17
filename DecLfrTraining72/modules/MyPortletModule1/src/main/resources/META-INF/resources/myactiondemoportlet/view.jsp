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

<%@ include file="/myactiondemoportlet/init.jsp" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet" %>

<%@ taglib uri="http://liferay.com/tld/aui" prefix="aui" %><%@
taglib uri="http://liferay.com/tld/portlet" prefix="liferay-portlet" %><%@
taglib uri="http://liferay.com/tld/theme" prefix="liferay-theme" %><%@
taglib uri="http://liferay.com/tld/ui" prefix="liferay-ui" %>

<portlet:defineObjects />

<liferay-theme:defineObjects />

<portlet:actionURL var="myActionURL1" name="processAction1">
</portlet:actionURL>

<portlet:actionURL var="myActionURL2" name="processAction2">
</portlet:actionURL>

<portlet:actionURL var="myActionURL3" name="processAction3">
</portlet:actionURL>




<a href="<%=myActionURL1%>&<portlet:namespace/>key1=123">Call Process Action1</a> <br>

<a href="<%=myActionURL2%>&<portlet:namespace/>key2=123">Call Process Action2</a> <br>

<%-- <a href="<%=myActionURL3%>&<portlet:namespace/>key3=123">Call Process Action3</a> <br> --%>




<form action="<%=myActionURL3 %>" method="post">
	Enter your name:<br> 
	<input name="<portlet:namespace/>alpha" type="text" /><br>
	<input name="Submit" type="Submit" /><br>
<form>











<%-- <aui:form action="<%=myActionURL1 %>" method="post">
	<aui:input name="alpha" label="Enter your name: " title="Name" type="text"></aui:input><br>
	<aui:button value="Submit" type="submit"></aui:button>
</aui:form>

<br>

<h1> <%=renderResponse.getProperty("name") != null ? renderResponse.getProperty("name") : "" %> </h1> --%>














<%-- <a href="<%=myActionURL1%>&<portlet:namespace/>key1=123">Call Process Action</a> --%>




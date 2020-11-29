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

<%@page import="java.util.ArrayList"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet" %>

<%@ taglib uri="http://liferay.com/tld/aui" prefix="aui" %><%@
taglib uri="http://liferay.com/tld/portlet" prefix="liferay-portlet" %><%@
taglib uri="http://liferay.com/tld/theme" prefix="liferay-theme" %><%@
taglib uri="http://liferay.com/tld/ui" prefix="liferay-ui" %>

<portlet:defineObjects />

<liferay-theme:defineObjects />


<%@ include file="/myportlet3/init.jsp" %>



<portlet:renderURL var="url1">
<portlet:param name="x" value="Value X"/>
</portlet:renderURL>

<portlet:renderURL var="url2">
<portlet:param name="y" value="Value Y"/>
</portlet:renderURL>

<portlet:renderURL var="url3">
<portlet:param name="z" value="Value Z"/>
</portlet:renderURL>



<a href="<%=url1%>">Click X</a> <br>
<a href="<%=url2%>">Click Y</a><br>
<a href="<%=url3%>">Click Z</a>

 <br>
 <%--
Value of x: <%=renderResponse.getProperty("a") != null ? renderResponse.getProperty("a"): "" %> <br>
Value of y: <%=renderResponse.getProperty("b") != null ? renderResponse.getProperty("b"): "" %> <br>
Value of z: <%=renderResponse.getProperty("c") != null ? renderResponse.getProperty("c"): "" %> <br>
Value of d: <%=renderResponse.getProperty("d") != null ? renderResponse.getProperty("d"): "" %> <br> --%>
<% 

ArrayList<String> arrayData=(ArrayList<String>)renderRequest.getAttribute("alpha");

for(String dataItem: arrayData)
{
	out.println(dataItem);	
}

%>


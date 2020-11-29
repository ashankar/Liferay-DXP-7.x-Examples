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

<%@ include file="/mysecondportlet/init.jsp" %>


<portlet:actionURL  var="actionURL" /> 

<!-- <portlet:actionURL name="myAction"  var="actionURL2" >
<portlet:param name="mvcPath" value="/view.jsp" /> -->

</portlet:actionURL>


<aui:form action="<%=actionURL %>" method="post">
	<aui:input name="alpha" label="Enter your name: " title="Name" type="text"></aui:input><br>
	<aui:button value="Submit" type="submit"></aui:button>
</aui:form>


<%=renderResponse.getProperty("beta") !=null ? renderResponse.getProperty("beta") : "" %>





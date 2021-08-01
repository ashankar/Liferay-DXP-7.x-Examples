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

<%@page import="javax.portlet.RenderRequest"%>
<%@ include file="/myservicebuildertestportlet/init.jsp" %>

<portlet:actionURL var="myActionURL">
</portlet:actionURL>

<aui:form method="post" action="<%=myActionURL%>" >
<aui:input type="text" name="empId"   id="empId" label="Emp ID"/>
<aui:input type="text" name="name"   id="name" label="Name"/>
<aui:input type="text" name="address"   id="address" label="Address"/>
<aui:button type="submit" name="submit" value="Send" id="submit" />
</aui:form>


<%-- <% 

Employee emp=(Employee)renderRequest.getAttribute("emp");

%>

<%=emp.getEmpId() %>
<%=emp.getName() %>
<%=emp.getAddress() %> --%>



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

<%@ include file="/mycookiesipctest1/init.jsp" %>

<portlet:actionURL var="myActionURL">
</portlet:actionURL>

<aui:form method="post" action="<%=myActionURL%>" >
<aui:input type="text" name="textField1"   id="textField1" label="Name"/>
<aui:button type="submit" name="submit" value="Send" id="submit" />
</aui:form>

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
<portlet:param name="x" value="Value of X"/>
</portlet:renderURL>

<portlet:renderURL var="url2"> 
<portlet:param name="y" value="Value of Y"/>
</portlet:renderURL>

<portlet:renderURL var="url3"> 
<portlet:param name="z" value="Value of Z"/>
</portlet:renderURL>



<a href="<%=url1 %>">Click X</a><br>
<a href="<%=url2 %>">Click Y</a><br>
<a href="<%=url3 %>">Click Z</a><br>

<a href="http://localhost:8080/group/my-site1/blog">Blog</a><br>





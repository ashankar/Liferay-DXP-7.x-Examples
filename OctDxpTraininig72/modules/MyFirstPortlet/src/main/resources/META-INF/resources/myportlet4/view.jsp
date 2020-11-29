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

<%@ include file="/myportlet4/init.jsp" %>


<portlet:actionURL name="myAction1" var="actionURL1" >
<portlet:param name="x" value="Value X"/>
</portlet:actionURL>

 <portlet:actionURL name="myAction2" var="actionURL2" >
<portlet:param name="x" value="Value Y"/>
</portlet:actionURL>

<%--
<portlet:actionURL name="myAction3" var="actionURL3" >
<portlet:param name="x" value="Value Z"/>
</portlet:actionURL>


<a href="<%=actionURL1%>">Click X</a> <br>
<a href="<%=actionURL2%>">Click Y</a> <br>
<a href="<%=actionURL3%>">Click Z</a> <br> --%>




<form action="<%=actionURL1 %>" method="post">
	Enter your name:<br>
	<input name="<portlet:namespace/>alpha" type="text" /><br>
	<input name="Submit" type="submit" /><br>
</form>

<br>

<a href="<%=actionURL2%>&<portlet:namespace/>key2=My Value 2">Click Me</a>







<%-- <a href="<%=url2%>">Click Y</a><br>
<a href="<%=url3%>">Click Z</a> --%>

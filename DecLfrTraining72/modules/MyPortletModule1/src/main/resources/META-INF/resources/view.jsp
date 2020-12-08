<%@ include file="/init.jsp" %>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet" %>

<%@ taglib uri="http://liferay.com/tld/aui" prefix="aui" %><%@
taglib uri="http://liferay.com/tld/portlet" prefix="liferay-portlet" %><%@
taglib uri="http://liferay.com/tld/theme" prefix="liferay-theme" %><%@
taglib uri="http://liferay.com/tld/ui" prefix="liferay-ui" %>

<liferay-theme:defineObjects />

<portlet:defineObjects />



<portlet:renderURL var="url1">
<portlet:param name="key2" value="My Value2"/>
</portlet:renderURL>


<h1> Hello Portlet1</h1>


<%-- <a href="<%=url1%>&<portlet:namespace/>key2=My Value 2">Click Me</a> --%>


<a href="<%=url1%>&<portlet:namespace/>key1=123">Click Me</a>





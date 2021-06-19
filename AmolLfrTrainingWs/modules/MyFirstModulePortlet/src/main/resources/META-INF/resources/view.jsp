<%@ include file="/init.jsp" %>


<h1> Hello my First portlet </h1>


<portlet:renderURL var="url1">
<portlet:param name="key1" value="value1" />
<portlet:param name="key2" value="value2" />
</portlet:renderURL>

<a href="<%=url1%>&<portlet:namespace/>key3=Value3" >Click Me</a>



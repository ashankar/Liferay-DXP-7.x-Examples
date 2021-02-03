<%@ include file="/init.jsp" %>

<!-- <portlet:renderURL var="url1" /> -->

<%-- <a href="<%=url1%>">Click Me</a> --%>



<portlet:renderURL var="url1" >
<portlet:param name="param1" value="Value 1"/>
<portlet:param name="param2" value="100"/>
</portlet:renderURL>

<a href="<%=url1%>">Click Me</a>


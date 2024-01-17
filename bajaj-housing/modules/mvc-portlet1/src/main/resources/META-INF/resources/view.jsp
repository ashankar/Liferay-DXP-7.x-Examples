<%@ include file="/init.jsp" %>

<p>
	<b><liferay-ui:message key="mvcportlet1.caption"/></b>
</p>

<portlet:renderURL var="url1" />

<portlet:renderURL var="url2">
<portlet:param  name="key3"  value="My Value3" />
</portlet:renderURL>


<portlet:actionURL var="actionURL">
<portlet:param  name="key1"  value="My Value1" />
<portlet:param  name="key2"  value="My Value2" />
</portlet:actionURL>

<aui:form action="<%=actionURL %>" method="post">
	<aui:input name="alpha" label="Enter your name: " title="Name" type="text"></aui:input><br>
	<aui:button value="Submit" type="submit"></aui:button>
</aui:form>

<a href="<%=url1%>" %>Click Me Render URL Without Params </a> <br>
<a href="<%=url2%>" %>Click Me Render URL With Params </a> <br>

<a href="<%=actionURL%>" %>Click Me Action </a>


<a href="<%=url1%>&<portlet:namespace/>key3=My Value 3">Click Me for Query String</a>




<%@ include file="/init.jsp" %>


<h1>Welcome</h1>

<p> Hello Liferay DXP </p>


<portlet:actionURL  var="actionURL">

</portlet:actionURL>


<aui:form action="<%=actionURL %>" method="post">
	<aui:input name="alpha" label="Enter your name: " title="Name" type="text"></aui:input><br>
	<aui:button value="Submit" type="submit"></aui:button>
</aui:form>

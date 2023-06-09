<%@ include file="/init.jsp" %>


<portlet:actionURL var="submitActionabs">
</portlet:actionURL>

<aui:form action="<%=submitActionabs %>" method="post">
	<aui:input name="alpha" label="Enter your name: " title="Name" type="text"></aui:input><br>
	<aui:button value="Submit" type="submit"></aui:button>
</aui:form>

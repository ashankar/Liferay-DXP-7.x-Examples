<%@ include file="/init.jsp" %>

<portlet:defineObjects />
<portlet:actionURL var="myActionURL">
</portlet:actionURL>

<aui:form method="post" action="<%=myActionURL%>" >
<aui:input type="text" name="textField1"   id="textField1" label="Name"/>
<aui:button type="submit" name="submit" value="Send" id="submit" />
</aui:form>

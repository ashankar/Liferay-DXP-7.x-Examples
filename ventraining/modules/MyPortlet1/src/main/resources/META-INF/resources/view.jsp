<%@ include file="/init.jsp" %>


<%-- <portlet:actionURL  var="actionURL1" name="myAction1">
<portlet:param name="key1" value="My Value 1"/>
</portlet:actionURL>

<portlet:actionURL  var="actionURL2" name="myAction2">
<portlet:param name="key2" value="My Value 2"/>
</portlet:actionURL>


<a href="<%=actionURL1%>">Link-1</a><br>

<a href="<%=actionURL2%>">Link-2</a>
 --%>

 <portlet:actionURL  var="actionURL1" name="myAction1">
<portlet:param name="key1" value="My Value 1"/>
</portlet:actionURL>

<form action="<%=actionURL1 %>" method="post">
	Enter your name:<br> 
	<input name="<portlet:namespace/>alpha" type="text" /><br>
	<input name="Submit" type="Submit" /><br>
<form>
 
 
 
 
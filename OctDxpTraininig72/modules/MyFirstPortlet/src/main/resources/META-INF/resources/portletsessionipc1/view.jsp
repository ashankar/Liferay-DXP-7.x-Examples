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

<%@ include file="/portletsessionipc1/init.jsp" %>
<script src="http://ajax.googleapis.com/ajax/libs/jquery/1.10.2/jquery.min.js"></script>




<script>

$(document).on('ready',function(){
jQuery('#<portlet:namespace/>button1').click(function(event) {
var name = jQuery('#<portlet:namespace/>textField1').val();


Liferay.fire('myEvent', {param1:name});


});
});
</script>

<aui:form>
<aui:input type="text" name="textField1"   id="textField1" label="Name"/>
<aui:button type="button" name="button1" value="Send" id="button1" />
</aui:form>









<%-- 
<portlet:actionURL var="submitActionabs">
</portlet:actionURL>

<aui:form action="<%=submitActionabs %>" method="post">
	<aui:input name="alpha" label="Enter your name: " title="Name" type="text"></aui:input><br>
	<aui:button value="Submit" type="submit"></aui:button>
</aui:form> --%>

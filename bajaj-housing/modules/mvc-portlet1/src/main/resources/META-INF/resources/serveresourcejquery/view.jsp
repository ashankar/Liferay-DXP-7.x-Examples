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

<%@ include file="/serveresourcejquery/init.jsp" %>

<liferay-portlet:resourceURL var="myResourceURL" >
<portlet:param name="param3" value="My Value 3"/>
</liferay-portlet:resourceURL>

<a href="#" onclick="callAjax('Param Value1', 'Param Value2')">Click Me</a>

<script type="text/javascript">
function callAjax(param1, param2){
    $.ajax({
    type : "POST",
    url : '<%=myResourceURL%>',
    cache:false,
    dataType: "json",
    data: {
    	<portlet:namespace/>param1: param1, 
    	<portlet:namespace/>param2: param2
    },    
    success : function(data){
    	
    	console.log(data);

	jQuery('#recievedData').html(data.key2);

    },
    error : function(XMLHttpRequest, textStatus, errorThrown){
       alert(errorThrown);
       alert(textStatus);
    }
  });
};
</script>

<div id="recievedData">

</div>


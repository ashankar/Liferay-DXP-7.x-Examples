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


<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet" %>

<%@ taglib uri="http://liferay.com/tld/aui" prefix="aui" %><%@
taglib uri="http://liferay.com/tld/portlet" prefix="liferay-portlet" %><%@
taglib uri="http://liferay.com/tld/theme" prefix="liferay-theme" %><%@
taglib uri="http://liferay.com/tld/ui" prefix="liferay-ui" %>

<portlet:defineObjects />

<liferay-theme:defineObjects />


<%@ include file="/demoserveresource/init.jsp" %>


<portlet:resourceURL var="myResourceURL">
<portlet:param name="param3" value="My Value 1"/>
</portlet:resourceURL>


<a href="#" onclick="callAjax('Param Value1', 'Param Value2')">Click Me</a>

<input type="text" onkeypress="callAjax('Param Value1', 'Param Value2')">

<script type="text/javascript">
function callAjax(param1, param2){
	var url = '<%=myResourceURL%>';
    jQuery.ajax({
    type : "POST",
    url : url,
    cache:false,
    dataType: "json",
    data: {
    	<portlet:namespace/>param1: param1, 
    	<portlet:namespace/>param2: param2
    },    
    success : function(data){
    	
    	console.log(data);
    },
    error : function(XMLHttpRequest, textStatus, errorThrown){
       alert(errorThrown);
       alert(textStatus);
    }
  });
};
</script>






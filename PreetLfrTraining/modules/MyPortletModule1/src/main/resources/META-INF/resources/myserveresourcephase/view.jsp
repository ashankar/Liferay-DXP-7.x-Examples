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


<%@ include file="/myserveresourcephase/init.jsp" %>

<%-- <liferay-portlet:resourceURL var="myResourceURL" >
<liferay-portlet:param name="param1" value="My Value 1"/>
</liferay-portlet:resourceURL> --%>

<portlet:resourceURL var="myResourceURL">

</portlet:resourceURL>


<a href="#" onclick="callServeResource('Value 1', 'Value 2');">Click Me</a>


<script type="text/javascript">

function callServeResource(param1, param2){
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
    	
    	jQuery('#recievedData').html(data.key2);
    	
    	//alert(data);
    },
    error : function(XMLHttpRequest, textStatus, errorThrown){
       alert(errorThrown);
       alert(textStatus);
    }
  });
};




/* function callServeResource(){
	AUI().use('aui-io-request', function(A){
        A.io.request('${myResourceURL}', {
               method: 'post',
               data: {
            	   <portlet:namespace/>param2: 'My Value 2',
               },
               on: {
                   	success: function() {
                    alert(this.get('responseData'));
                   }
              }
        });
 
    });
} */
</script>



Here is the data:
<div id="recievedData"></div>

After



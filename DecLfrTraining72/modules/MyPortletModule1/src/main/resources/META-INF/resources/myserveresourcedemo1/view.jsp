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

<%@ include file="/myserveresourcedemo1/init.jsp" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet" %>

<%@ taglib uri="http://liferay.com/tld/aui" prefix="aui" %><%@
taglib uri="http://liferay.com/tld/portlet" prefix="liferay-portlet" %><%@
taglib uri="http://liferay.com/tld/theme" prefix="liferay-theme" %><%@
taglib uri="http://liferay.com/tld/ui" prefix="liferay-ui" %>

<portlet:defineObjects />

<liferay-theme:defineObjects />



<portlet:resourceURL var="MyResourceURL1">
<portlet:param name="param3" value="My Value 3"/>
</portlet:resourceURL>


<a href="#" onclick="callAjax('Param Value1', 'Param Value2')">Click Me</a>



<script type="text/javascript">
function callAjax(param1, param2){
	var url = '<%=MyResourceURL1%>';
    jQuery.ajax({
    type : "POST",
    url : url,
    cache:false,
    data: {
    	<portlet:namespace/>param1: param1, 
    	<portlet:namespace/>param2: param2
    },    
    success : function(data){
    	
    	//alert(data);
    	
    	jQuery('#recievedData').html(data.key1);
    	//jQuery('#recievedData').html("<code>"+data.key1+"</code>");
    	
    	
    	
    },
    error : function(XMLHttpRequest, textStatus, errorThrown){
       alert(errorThrown);
       alert(textStatus);
    }
  });
};
</script>



<div id="recievedData"></div>


























<!-- <script type="text/javascript">
function callServeResource(){
	AUI().use('aui-io-request', function(A){
        A.io.request('${MyResourceURL1}', {
               method: 'post',
               data: {
            	   <portlet:namespace/>param1: 'My Value 1',
               },
               on: {
                   	success: function() {
                    alert(this.get('responseData'));
                   }
              }
        });
 
    });
}
</script> -->


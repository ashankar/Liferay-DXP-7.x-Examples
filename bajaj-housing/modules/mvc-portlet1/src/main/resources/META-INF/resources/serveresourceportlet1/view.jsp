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

<%@ include file="/serveresourceportlet1/init.jsp" %>

<liferay-portlet:resourceURL var="myResourceURL" >
<liferay-portlet:param name="param1" value="My Value 1"/>
</liferay-portlet:resourceURL>


<a href="#" onclick="callServeResource();">Click Me</a>

<script type="text/javascript">
function callServeResource(){
    AUI().use('aui-io-request', function(A){
        A.io.request('${myResourceURL}', {
               method: 'post',
               data: {
            	   <portlet:namespace />param2: 'My Value 2',
               },
               on: {
                   	success: function() {
                    alert(this.get('responseData'));
                   }
              }
        });
 
    });
}
</script>




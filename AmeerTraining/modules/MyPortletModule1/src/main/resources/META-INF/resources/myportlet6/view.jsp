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

<script src="http://ajax.googleapis.com/ajax/libs/jquery/1.10.2/jquery.min.js"></script>

<%@ include file="/myportlet6/init.jsp" %>



<portlet:defineObjects />
<portlet:actionURL var="myActionURL">
</portlet:actionURL>

<aui:form method="post" action="<%=myActionURL%>" >
<aui:input type="text" name="textField1"   id="textField1" label="Name"/>
<aui:button type="submit" name="submit" value="Send" id="submit" />
</aui:form>
















<%-- 
<portlet:resourceURL var="myResourceURL">
</portlet:resourceURL>

<script>

$(document).on('ready',function(){
jQuery('#<portlet:namespace/>button1').click(function(event) {
var name = jQuery('#<portlet:namespace/>textField1').val();


  $.ajax({
	      url:'<%=myResourceURL%>',
	      dataType: "json",
	      data:{<portlet:namespace/>textField1:name,
	      		},
	      type: "get",
	      success: function(data){
	    	  
	    	 Liferay.fire('myEvent', {params:data});
	      
	      },
	      beforeSend: function(){
	    	  //before send this method will be called
			},
			complete: function(){
				//after completed request then this method will be called.
			},
	      error: function(){
	        $('#userContent').html('<span style="color:red">Connection problems</span>');
	      }
	    });
});
});
</script>

<aui:form method="post" >
<aui:input type="text" name="textField1"   id="textField1" label="Name"/>
<aui:button type="button" name="button1" value="Send" id="button1" />
</aui:form> --%>


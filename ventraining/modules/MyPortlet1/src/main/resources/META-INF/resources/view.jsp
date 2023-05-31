<%@ include file="/init.jsp" %>


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

	jQuery('#recievedData').html(data.key1);

    },
    error : function(XMLHttpRequest, textStatus, errorThrown){
       alert(errorThrown);
       alert(textStatus);
    }
  });
};
</script>


<div id="recievedData"></div>














<%-- <liferay-portlet:resourceURL var="myResourceURL" >
<portlet:param name="param3" value="My Value 3"/>
</liferay-portlet:resourceURL>


<a href="#" onclick="callAjax('Param Value1', 'Param Value2')">Click Me</a>

<script type="text/javascript">
function callAjax(param1, param2){
	var url = '<%=myResourceURL%>';
    jQuery.ajax({
    type : "POST",
    url : url,
    cache:false,
    data: {
    	<portlet:namespace/>param1: param1, 
    	<portlet:namespace/>param2: param2
    },    
    success : function(data){
    	
    	alert(data);
    },
    error : function(XMLHttpRequest, textStatus, errorThrown){
       alert(errorThrown);
       alert(textStatus);
    }
  });
};
</script> --%>











<!-- <liferay-portlet:resourceURL var="myResourceURL" >
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
</script> -->



















<%-- <portlet:actionURL  var="actionURL1" name="myAction1">
<portlet:param name="key1" value="My Value 1"/>
</portlet:actionURL>

<portlet:actionURL  var="actionURL2" name="myAction2">
<portlet:param name="key2" value="My Value 2"/>
</portlet:actionURL>


<a href="<%=actionURL1%>">Link-1</a><br>

<a href="<%=actionURL2%>">Link-2</a>
 --%>

<%--  <portlet:actionURL  var="actionURL1" name="myAction1">
<portlet:param name="key1" value="My Value 1"/>
</portlet:actionURL>

<form action="<%=actionURL1 %>" method="post">
	Enter your name:<br> 
	<input name="<portlet:namespace/>alpha" type="text" /><br>
	<input name="Submit" type="Submit" /><br>
<form>
  --%>
 
 
 
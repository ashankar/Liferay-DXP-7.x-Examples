<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet" %>

<%@ taglib uri="http://liferay.com/tld/aui" prefix="aui" %><%@
taglib uri="http://liferay.com/tld/portlet" prefix="liferay-portlet" %><%@
taglib uri="http://liferay.com/tld/theme" prefix="liferay-theme" %><%@
taglib uri="http://liferay.com/tld/ui" prefix="liferay-ui" %>

<liferay-theme:defineObjects />

<portlet:defineObjects />

<%@ include file="/init.jsp" %>



<liferay-portlet:resourceURL var="resourceURL">
<portlet:param name="x" value="Value of X"/>
</liferay-portlet:resourceURL>



<a href="#" onclick="callAjax('Value of Param1', 'Value of Param2');">Click X</a><br>


<script type="text/javascript">
function callAjax(param1, param2){
	var url = '<%=resourceURL%>';
		jQuery.ajax({
			type : "POST",
			url : url,
		    dataType: "json",
			cache : false,
			data : {
				<portlet:namespace/>param1 : param1,
				<portlet:namespace/>param2 : param2
			},
			success : function(data) {

				//console.log(data);
				//$('#my-element').html(data);
				
				$('#my-element').html("HHHHHHHHHHHHHHHHH");
			},
			error : function(XMLHttpRequest, textStatus, errorThrown) {
				alert(errorThrown);
				alert(textStatus);
			}
		});
	};
</script>




<div id="my-element"></div>


















<!-- <script type="text/javascript">
function callServeResource(){
    AUI().use('aui-io-request', function(A){
        A.io.request('${resourceURL}', {
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














<%-- <form action="<%=actionURL1 %>" method="post">
	Enter your name: 
	<input name="<portlet:namespace/>alpha" type="text" /><br>
	<input name="Submit" type="Submit" />
</form> --%>






<%-- <h2> <%=renderResponse.getProperty("val1") != null ? renderResponse.getProperty("val1") : "" %> </h2> --%>



<%@ include file="/init.jsp" %>

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

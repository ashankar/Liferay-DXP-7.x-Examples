<%@ include file="/init.jsp" %>

<script>
	Liferay.on('myEvent', function(event) {

		var htmlString = event.param1;

		jQuery('#recievedData').html(htmlString);
	});
</script>

<div id="recievedData"></div>

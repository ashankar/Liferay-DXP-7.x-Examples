<div class="MyGradleLayout1" id="main-content" role="main">
	
	<div class="portlet-layout row">
		<div class="col-md-2 portlet-column portlet-column-first" id="column-11">
			${processor.processColumn("column-11", "portlet-column-content portlet-column-content-first")}
		</div>

		<div class="col-md-3 portlet-column" id="column-12">
			${processor.processColumn("column-12", "portlet-column-content")}
		</div>

		<div class="col-md-3 portlet-column" id="column-12">
			${processor.processColumn("column-12", "portlet-column-content")}
		</div>

		<div class="col-md-4 portlet-column portlet-column-last" id="column-13">
			${processor.processColumn("column-13", "portlet-column-content portlet-column-content-last")}
		</div>

	</div>

	<div class="portlet-layout row">
		<div class="col-md-12 portlet-column portlet-column-only" id="column-2">
			${processor.processColumn("column-2", "portlet-column-content portlet-column-content-only")}
		</div>
	</div>
</div>
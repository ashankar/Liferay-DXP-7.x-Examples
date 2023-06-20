<div class="MyFirstLayout" id="main-content" role="main">
	<div class="portlet-layout row">
		<div class="col-md-12 portlet-column portlet-column-only" id="column-1">
			${processor.processColumn("column-1", "portlet-column-content portlet-column-content-only")}
		</div>
	</div>

	<div class="portlet-layout row">
		<div class="col-md-4 portlet-column portlet-column-first" id="column-21">
			${processor.processColumn("column-21", "portlet-column-content portlet-column-content-first")}
		</div>
		
		<div class="col-md-4 portlet-column portlet-column" id="column-22">
			${processor.processColumn("column-22", "portlet-column-content portlet-column-content")}
		</div>

		<div class="col-md-4 portlet-column portlet-column-last" id="column-23">
			${processor.processColumn("column-23", "portlet-column-content portlet-column-content-last")}
		</div>
	</div>

	<#-- <div class="portlet-layout row">
		<div class="col-md-12 portlet-column portlet-column-only" id="column-4">
			${processor.processColumn("column-4", "portlet-column-content portlet-column-content-only")}
		</div> 
	</div> -->
</div>
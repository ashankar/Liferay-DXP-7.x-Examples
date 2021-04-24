package com.training.custom.control.panel.application.list;

import com.training.custom.control.panel.constants.CustomControlPanelPanelCategoryKeys;
import com.training.custom.control.panel.constants.CustomControlPanelPortletKeys;

import com.liferay.application.list.BasePanelApp;
import com.liferay.application.list.PanelApp;
import com.liferay.portal.kernel.model.Portlet;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

/**
 * @author Anand
 */
@Component(
	immediate = true,
	property = {
		"panel.app.order:Integer=100",
		"panel.category.key=" + CustomControlPanelPanelCategoryKeys.CONTROL_PANEL_CATEGORY
	},
	service = PanelApp.class
)
public class MyControlPanelApp2 extends BasePanelApp {

	@Override
	public String getPortletId() {
		return CustomControlPanelPortletKeys.MY_CONTROL_PANEL_APP_2;
	}

	@Override
	@Reference(
		target = "(javax.portlet.name=" + CustomControlPanelPortletKeys.MY_CONTROL_PANEL_APP_2 + ")",
		unbind = "-"
	)
	public void setPortlet(Portlet portlet) {
		super.setPortlet(portlet);
	}

}
package com.training.application.list;

import com.training.constants.CustomControlPanelPanelCategoryKeys;
import com.training.constants.CustomControlPanelPortletKeys;

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
public class CustomControlPanelPanelApp extends BasePanelApp {

	@Override
	public String getPortletId() {
		return CustomControlPanelPortletKeys.CUSTOMCONTROLPANEL;
	}

	@Override
	@Reference(
		target = "(javax.portlet.name=" + CustomControlPanelPortletKeys.CUSTOMCONTROLPANEL + ")",
		unbind = "-"
	)
	public void setPortlet(Portlet portlet) {
		super.setPortlet(portlet);
	}

}
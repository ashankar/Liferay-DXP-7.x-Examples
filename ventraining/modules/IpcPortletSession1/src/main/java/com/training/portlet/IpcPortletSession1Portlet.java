package com.training.portlet;

import java.io.IOException;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
import javax.portlet.Portlet;
import javax.portlet.PortletException;
import javax.portlet.PortletSession;

import org.osgi.service.component.annotations.Component;

import com.liferay.portal.kernel.portlet.bridges.mvc.MVCPortlet;
import com.liferay.portal.kernel.util.ParamUtil;
import com.training.constants.IpcPortletSession1PortletKeys;

/**
 * @author Anand
 */
@Component(
	immediate = true,
	property = {
		"javax.portlet.version=3.0",
		"com.liferay.portlet.display-category=category.myapp",
		"com.liferay.portlet.header-portlet-css=/css/main.css",
		"com.liferay.portlet.instanceable=true",
		"javax.portlet.display-name=IpcPortletSession1",
		"javax.portlet.init-param.template-path=/",
		"javax.portlet.init-param.view-template=/view.jsp",
		"javax.portlet.name=" + IpcPortletSession1PortletKeys.IPCPORTLETSESSION1,
		"javax.portlet.resource-bundle=content.Language",
		"javax.portlet.security-role-ref=power-user,user"
	},
	service = Portlet.class
)
public class IpcPortletSession1Portlet extends MVCPortlet {
	
	@Override
	public void processAction(ActionRequest actionRequest, ActionResponse actionResponse)
			throws IOException, PortletException {

		
		System.out.println("In processAction");
		
		String s=ParamUtil.getString(actionRequest,"alpha");
		
		System.out.println(s);
		
		
		PortletSession portletSession=actionRequest.getPortletSession();
		portletSession.setAttribute("LIFERAY_SHARED_"+"alpha1", s+"sS", PortletSession.APPLICATION_SCOPE);

		
	}
}
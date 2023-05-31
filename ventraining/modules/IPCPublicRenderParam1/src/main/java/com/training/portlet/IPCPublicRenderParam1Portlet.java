package com.training.portlet;

import java.io.IOException;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
import javax.portlet.Portlet;
import javax.portlet.PortletException;
import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;

import org.osgi.service.component.annotations.Component;

import com.liferay.portal.kernel.portlet.bridges.mvc.MVCPortlet;
import com.liferay.portal.kernel.util.ParamUtil;
import com.training.constants.IPCPublicRenderParam1PortletKeys;

/**
 * @author Anand
 */
@Component(
	immediate = true,
	property = {
		"com.liferay.portlet.display-category=category.myapp",
		"com.liferay.portlet.header-portlet-css=/css/main.css",
		"com.liferay.portlet.instanceable=true",
		"javax.portlet.display-name=IPCPublicRenderParam1",
		"javax.portlet.init-param.template-path=/",
		"javax.portlet.init-param.view-template=/view.jsp",
		"javax.portlet.name=" + IPCPublicRenderParam1PortletKeys.IPCPUBLICRENDERPARAM1,
		"javax.portlet.resource-bundle=content.Language",
		"javax.portlet.security-role-ref=power-user,user",
		"javax.portlet.supported-public-render-parameter=id1"
	},
	service = Portlet.class
)
public class IPCPublicRenderParam1Portlet extends MVCPortlet {
	
	
	@Override
		public void doView(RenderRequest renderRequest, RenderResponse renderResponse)
				throws IOException, PortletException {

		
			System.out.println("Hello doView");
		
		super.doView(renderRequest, renderResponse);
		}
	
	
	@Override
	public void processAction(ActionRequest actionRequest, ActionResponse actionResponse)
			throws IOException, PortletException {

		System.out.println("In processAction");
		
		String s=ParamUtil.getString(actionRequest,"alpha");
		
		System.out.println(s);
		
		actionResponse.setRenderParameter("id1", s);
		
		
	}
}
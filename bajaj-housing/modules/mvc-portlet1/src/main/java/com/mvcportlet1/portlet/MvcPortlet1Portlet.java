package com.mvcportlet1.portlet;

import com.mvcportlet1.constants.MvcPortlet1PortletKeys;

import com.liferay.portal.kernel.portlet.bridges.mvc.MVCPortlet;
import com.liferay.portal.kernel.util.ParamUtil;

import java.io.IOException;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
import javax.portlet.Portlet;
import javax.portlet.PortletException;
import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;

import org.osgi.service.component.annotations.Component;

/**
 * @author Anand
 */
@Component(
	immediate = true,
	property = {
		"com.liferay.portlet.display-category=category.myapp",
		"com.liferay.portlet.header-portlet-css=/css/main.css",
		"com.liferay.portlet.instanceable=true",
		"javax.portlet.display-name=MvcPortlet1",
		"javax.portlet.init-param.template-path=/",
		"javax.portlet.init-param.view-template=/view.jsp",
		"javax.portlet.name=" + MvcPortlet1PortletKeys.MVCPORTLET1,
		"javax.portlet.resource-bundle=content.Language",
		"javax.portlet.security-role-ref=power-user,user"
	},
	service = Portlet.class
)
public class MvcPortlet1Portlet extends MVCPortlet {
	
	
	@Override
	public void doView(RenderRequest renderRequest, RenderResponse renderResponse)
			throws IOException, PortletException {

		
		System.out.println("Hello MvcPortlet1Portlet.doView()");
		System.out.println(ParamUtil.getString(renderRequest, "key3"));
		
		
		super.doView(renderRequest, renderResponse);
	}	
	
	@Override
		public void processAction(ActionRequest actionRequest, ActionResponse actionResponse)
				throws IOException, PortletException {
		

			System.out.println("Hello MvcPortlet1Portlet.processAction()");
			
			//System.out.println(actionRequest.getParameter("alpha"));
			System.out.println(ParamUtil.getString(actionRequest, "alpha"));
			System.out.println(ParamUtil.getString(actionRequest, "key1"));
			System.out.println(ParamUtil.getString(actionRequest, "key2"));
			System.out.println(ParamUtil.getString(actionRequest, "key3"));
		
			//super.processAction(actionRequest, actionResponse);
		}
	
	
	
	
}
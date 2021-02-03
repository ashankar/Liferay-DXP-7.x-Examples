package com.training.portlet;

import com.training.constants.MyPortletModule1PortletKeys;

import com.liferay.portal.kernel.portlet.bridges.mvc.MVCPortlet;
import com.liferay.portal.kernel.util.ParamUtil;

import java.io.IOException;

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
		"com.liferay.portlet.display-category=category.app",
		"com.liferay.portlet.header-portlet-css=/css/main.css",
		"com.liferay.portlet.instanceable=true",
		"javax.portlet.display-name=MyPortletModule1",
		"javax.portlet.init-param.template-path=/",
		"javax.portlet.init-param.view-template=/view.jsp",
		"javax.portlet.name=" + MyPortletModule1PortletKeys.MYPORTLETMODULE1,
		"javax.portlet.resource-bundle=content.Language",
		"javax.portlet.security-role-ref=power-user,user"
	},
	service = Portlet.class
)
public class MyPortletModule1Portlet extends MVCPortlet {
	
	
//	@Override
//		public void render(RenderRequest renderRequest, RenderResponse renderResponse)
//				throws IOException, PortletException {
//
//			System.out.println("Hello Render");
//		
//			super.render(renderRequest, renderResponse);
//		}
	
	
	@Override
	public void doView(RenderRequest renderRequest, RenderResponse renderResponse)
			throws IOException, PortletException {
		
		System.out.println("Hello doView");
		
		System.out.println(renderRequest.getParameter("param1"));
//		System.out.println(ParamUtil.getString(renderRequest, "param2"));
		
		System.out.println(ParamUtil.getInteger(renderRequest, "param2"));
		
		super.doView(renderRequest, renderResponse);
	}
	
	
}
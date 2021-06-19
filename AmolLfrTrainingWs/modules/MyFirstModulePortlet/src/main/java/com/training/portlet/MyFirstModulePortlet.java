package com.training.portlet;

import com.training.constants.MyFirstModulePortletKeys;

import java.io.IOException;

import com.liferay.portal.kernel.portlet.bridges.mvc.MVCPortlet;
import com.liferay.portal.kernel.util.ParamUtil;

import javax.portlet.Portlet;
import javax.portlet.PortletException;
import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;

import org.osgi.service.component.annotations.Component;

/**
 * @author anshankar
 */
@Component(
	immediate = true,
	property = {
		"com.liferay.portlet.display-category=category.app",
		"com.liferay.portlet.header-portlet-css=/css/main.css",
		"com.liferay.portlet.instanceable=true",
		"javax.portlet.display-name=MyFirstModule",
		"javax.portlet.init-param.template-path=/",
		"javax.portlet.init-param.view-template=/view.jsp",
		"javax.portlet.name=" + MyFirstModulePortletKeys.MYFIRSTMODULE,
		"javax.portlet.resource-bundle=content.Language",
		"javax.portlet.security-role-ref=power-user,user"
	},
	service = Portlet.class
)
public class MyFirstModulePortlet extends MVCPortlet {
	
	
	@Override
	public void doView(RenderRequest renderRequest, RenderResponse renderResponse)
			throws IOException, PortletException {

		System.out.println("Hello MyFirstModulePortlet:doView");
		
//		System.out.println(renderRequest.getParameter("key1"));
//		System.out.println(renderRequest.getParameter("key2"));
		
		
		System.out.println(ParamUtil.getString(renderRequest, "key1"));
		System.out.println(ParamUtil.getString(renderRequest, "key2"));
		System.out.println(ParamUtil.getString(renderRequest, "key3"));
		
		super.doView(renderRequest, renderResponse);
	}
	
	
}
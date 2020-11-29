package com.training.portlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.portlet.Portlet;
import javax.portlet.PortletException;
import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;
import javax.portlet.ResourceRequest;
import javax.portlet.ResourceResponse;

import org.osgi.service.component.annotations.Component;

import com.liferay.portal.kernel.json.JSONFactoryUtil;
import com.liferay.portal.kernel.json.JSONObject;
import com.liferay.portal.kernel.portlet.JSONPortletResponseUtil;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCPortlet;
import com.liferay.portal.kernel.util.ParamUtil;
import com.training.constants.MyModuleMainPortletKeys;

/**
 * @author anshankar
 */
@Component(immediate = true, property = { "com.liferay.portlet.display-category=category.app",
		"com.liferay.portlet.header-portlet-css=/css/main.css", "com.liferay.portlet.instanceable=true",
		"javax.portlet.display-name=MyModuleMain", "javax.portlet.init-param.template-path=/",
		"javax.portlet.init-param.view-template=/view.jsp",
		"javax.portlet.name=" + MyModuleMainPortletKeys.MYMODULEMAIN, "javax.portlet.resource-bundle=content.Language",
		"javax.portlet.security-role-ref=power-user,user" }, service = Portlet.class)
public class MyModuleMainPortlet extends MVCPortlet {

	String s1 = "";

	@Override
	public void doView(RenderRequest renderRequest, RenderResponse renderResponse)
			throws IOException, PortletException {

		System.out.println("Hello doView");

		super.doView(renderRequest, renderResponse);
	}

	
	
	
	
	@Override
		public void serveResource(ResourceRequest resourceRequest, ResourceResponse resourceResponse)
				throws IOException, PortletException {

		
				System.out.println("Serve Resource");
				
				String s1=ParamUtil.getString(resourceRequest, "x");
				String s2=ParamUtil.getString(resourceRequest, "param1");
				String s3=ParamUtil.getString(resourceRequest, "param2");
				
				System.out.println(s1);
				System.out.println(s2);
				System.out.println(s3);
				
				
				JSONObject json=JSONFactoryUtil.createJSONObject();
				json.put("key1", s1);
				json.put("key2", s2);
				json.put("key3", s3);
				json.put("key4", "This is extra value");

				JSONPortletResponseUtil.writeJSON(resourceRequest, resourceResponse, json);
				
		}
	
	
	


}
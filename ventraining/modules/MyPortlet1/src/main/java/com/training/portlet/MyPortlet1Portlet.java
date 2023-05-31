package com.training.portlet;

import java.io.IOException;

import javax.portlet.Portlet;
import javax.portlet.PortletException;
import javax.portlet.ResourceRequest;
import javax.portlet.ResourceResponse;

import org.osgi.service.component.annotations.Component;

import com.liferay.portal.kernel.json.JSONFactoryUtil;
import com.liferay.portal.kernel.json.JSONObject;
import com.liferay.portal.kernel.portlet.JSONPortletResponseUtil;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCPortlet;
import com.liferay.portal.kernel.util.ParamUtil;
import com.training.constants.MyPortlet1PortletKeys;

/**
 * @author Anand
 */
@Component(
	immediate = true,
	property = {
		"com.liferay.portlet.display-category=category.myapp",
		"com.liferay.portlet.header-portlet-css=/css/main.css",
		"com.liferay.portlet.instanceable=true",
		"javax.portlet.display-name=MyPortlet1",
		"javax.portlet.init-param.template-path=/",
		"javax.portlet.init-param.view-template=/view.jsp",
		"javax.portlet.name=" + MyPortlet1PortletKeys.MYPORTLET1,
		"javax.portlet.resource-bundle=content.Language",
		"javax.portlet.security-role-ref=power-user,user"
	},
	service = Portlet.class
)
public class MyPortlet1Portlet extends MVCPortlet {
	
	
	
@Override
public void serveResource(ResourceRequest resourceRequest, ResourceResponse resourceResponse)
		throws IOException, PortletException {

	System.out.println("Hello Portlet-1 serveResource-1");
	String s1 = ParamUtil.getString(resourceRequest, "param1");
	String s2 = ParamUtil.getString(resourceRequest, "param2");
	String s3 = ParamUtil.getString(resourceRequest, "param3");
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
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
//	
//	@Override
//	public void serveResource(ResourceRequest resourceRequest, ResourceResponse resourceResponse)
//			throws IOException, PortletException {
//
//		System.out.println("Hello serveResource");
//		String s1 = ParamUtil.getString(resourceRequest, "param1");
//		String s2 = ParamUtil.getString(resourceRequest, "param2");
//		String s3 = ParamUtil.getString(resourceRequest, "param3");
//		System.out.println(s1);
//		System.out.println(s2);
//		System.out.println(s3);
//		
//		PrintWriter out= resourceResponse.getWriter();
//		out.print("Hello serveResource Response");
//		out.flush();
//		
//		super.serveResource(resourceRequest, resourceResponse);
//	}
//	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	/*
	 * @Override public void serveResource(ResourceRequest resourceRequest,
	 * ResourceResponse resourceResponse) throws IOException, PortletException {
	 * 
	 * System.out.println("Hello serveResource"); String s1 =
	 * ParamUtil.getString(resourceRequest, "param1"); String s2 =
	 * ParamUtil.getString(resourceRequest, "param2"); System.out.println(s1);
	 * System.out.println(s2);
	 * 
	 * PrintWriter out= resourceResponse.getWriter();
	 * out.print("Hello serveResource Response"); out.flush();
	 * 
	 * super.serveResource(resourceRequest, resourceResponse); }
	 */
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	/*
	 * @Override public void doView(RenderRequest renderRequest, RenderResponse
	 * renderResponse) throws IOException, PortletException {
	 * 
	 * System.out.println("Hello doView");
	 * 
	 * super.doView(renderRequest, renderResponse); }
	 */
	
//	public void myAction1(ActionRequest actionRequest, ActionResponse actionResponse)
//			throws IOException, PortletException {
//	
//	
//			System.out.println("Hello myAction1");
//			System.out.println(ParamUtil.getString(actionRequest, "key1"));
//	
//	}
//	
//	public void myAction2(ActionRequest actionRequest, ActionResponse actionResponse)
//			throws IOException, PortletException {
//	
//			System.out.println("Hello myAction2");
//			
//			System.out.println(ParamUtil.getString(actionRequest, "key2"));
//	
//	}
//	
	
//	
//	public void myAction1(ActionRequest actionRequest, ActionResponse actionResponse)
//	throws IOException, PortletException {
//
//
//	System.out.println("Hello myAction1");
//	System.out.println(ParamUtil.getString(actionRequest, "key1"));
//	System.out.println(ParamUtil.getString(actionRequest, "alpha"));
//
//}
	
	
	
	
	
}
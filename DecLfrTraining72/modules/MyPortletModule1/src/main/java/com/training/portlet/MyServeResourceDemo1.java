/**
 * Copyright 2000-present Liferay, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.training.portlet;

import java.io.IOException;

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
import com.training.constants.MyPortlet1PortletKeys;

@Component(
	immediate = true,
	property = {
		"com.liferay.portlet.display-category=category.app",
		"com.liferay.portlet.instanceable=true",
		"javax.portlet.init-param.template-path=/",
		"javax.portlet.resource-bundle=content.Language",
		"javax.portlet.security-role-ref=power-user,user",
		"javax.portlet.init-param.view-template=/myserveresourcedemo1/view.jsp",
		"javax.portlet.name=" + MyPortlet1PortletKeys.MY_SERVE_RESOURCE_DEMO_1
	},
	service = Portlet.class
)
public class MyServeResourceDemo1 extends MVCPortlet {
	
	@Override
	public void doView(RenderRequest renderRequest, RenderResponse renderResponse)
			throws IOException, PortletException {

			System.out.println("In MyServeResourceDemo1: doView");
		
		super.doView(renderRequest, renderResponse);
	}
	
	
	@Override
	public void serveResource(ResourceRequest resourceRequest, ResourceResponse resourceResponse)
			throws IOException, PortletException {

		
		System.out.println("In MyServeResourceDemo1: serveResource");
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

		
//		PrintWriter out= resourceResponse.getWriter();
//		out.print("Hello serveResource Response" + s1);
//		out.flush();
		
		//super.serveResource(resourceRequest, resourceResponse);
		
	}
	
	
	
}
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

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
import javax.portlet.Portlet;
import javax.portlet.PortletException;
import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;

import com.liferay.portal.kernel.portlet.bridges.mvc.MVCPortlet;
import com.liferay.portal.kernel.util.ParamUtil;
import com.training.constants.MyPortlet1PortletKeys;

import org.osgi.service.component.annotations.Component;

@Component(
	immediate = true,
	property = {
		"com.liferay.portlet.display-category=category.app",
		"com.liferay.portlet.instanceable=true",
		"javax.portlet.init-param.template-path=/",
		"javax.portlet.resource-bundle=content.Language",
		"javax.portlet.security-role-ref=power-user,user",
		"javax.portlet.init-param.view-template=/myactiondemoportlet/view.jsp",
		"javax.portlet.name=" + MyPortlet1PortletKeys.MY_ACTION_DEMO_PORTLET
	},
	service = Portlet.class
)
public class MyActionDemoPortlet extends MVCPortlet {
	
	String name="";
	
	
	@Override
	public void doView(RenderRequest renderRequest, RenderResponse renderResponse)
			throws IOException, PortletException {

		System.out.println("In MyActionDemoPortlet:doView... ");
		
		renderResponse.setProperty("name", name);
		
		super.doView(renderRequest, renderResponse);
	}
	
	
	/*
	 * @Override public void processAction(ActionRequest actionRequest,
	 * ActionResponse actionResponse) throws IOException, PortletException {
	 * 
	 * 
	 * System.out.println("In MyActionDemoPortlet:processAction... ");
	 * 
	 * name=ParamUtil.getString(actionRequest, "alpha");
	 * 
	 * 
	 * name=name+"extra value";
	 * 
	 * System.out.println(name); // int s1=ParamUtil.getInteger(actionRequest,
	 * "key1"); // System.out.println(s1);
	 * 
	 * }
	 */
	
	
	
	public void processAction1(ActionRequest actionRequest, ActionResponse actionResponse)
			throws IOException, PortletException {

		System.out.println("In MyActionDemoPortlet:processAction1... ");
		
		int s1=ParamUtil.getInteger(actionRequest, "key1");
		System.out.println(s1);
		
	}
	
	public void processAction2(ActionRequest actionRequest, ActionResponse actionResponse)
			throws IOException, PortletException {

		System.out.println("In MyActionDemoPortlet:processAction2... ");
		
		int s1=ParamUtil.getInteger(actionRequest, "key2");
		System.out.println(s1);
		
	}
	
	public void processAction3(ActionRequest actionRequest, ActionResponse actionResponse)
			throws IOException, PortletException {

		System.out.println("In MyActionDemoPortlet:processAction3... ");
		
		String s1=ParamUtil.getString(actionRequest, "alpha");
		System.out.println(s1);
		
	}
	
}
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
import com.training.constants.MyPortletModule1PortletKeys;

import org.osgi.service.component.annotations.Component;

@Component(
	immediate = true,
	property = {
		"com.liferay.portlet.display-category=category.app",
		"com.liferay.portlet.instanceable=true",
		"javax.portlet.init-param.template-path=/",
		"javax.portlet.resource-bundle=content.Language",
		"javax.portlet.security-role-ref=power-user,user",
		"javax.portlet.init-param.view-template=/actionphasedemo/view.jsp",
		"javax.portlet.name=" + MyPortletModule1PortletKeys.ACTION_PHASE_DEMO
	},
	service = Portlet.class
)
public class ActionPhaseDemo extends MVCPortlet {
	
	
	private String s1="";
	
	@Override
	public void doView(RenderRequest renderRequest, RenderResponse renderResponse)
			throws IOException, PortletException {

		System.out.println("In ActionPhaseDemo: doView... ");
		
//		renderRequest.setAttribute("attrib1", s1);
		
		super.doView(renderRequest, renderResponse);
	}
	
	
	/*
	 * public void processAction(ActionRequest actionRequest, ActionResponse
	 * actionResponse) throws IOException, PortletException {
	 * 
	 * System.out.println("In ActionPhaseDemo: processAction... ");
	 * 
	 * 
	 * System.out.println(ParamUtil.getString(actionRequest, "param1"));
	 * 
	 * 
	 * // // s1=ParamUtil.getString(actionRequest, "alpha"); // // s1=s1 +
	 * " Extra text"; // // System.out.println(s1); //
	 * System.out.println(ParamUtil.getString(actionRequest, "param1")); //
	 * System.out.println(ParamUtil.getInteger(actionRequest, "param2")); //
	 * 
	 * }
	 */
	
	
	
	public void myCustomProcessAction1(ActionRequest actionRequest, ActionResponse actionResponse)
			throws IOException, PortletException {

		System.out.println("In ActionPhaseDemo: myCustomProcessAction1... ");
		System.out.println(ParamUtil.getString(actionRequest, "param1"));
		System.out.println(ParamUtil.getString(actionRequest,"alpha"));

	}

	public void myCustomProcessAction2(ActionRequest actionRequest, ActionResponse actionResponse)
			throws IOException, PortletException {

		System.out.println("In ActionPhaseDemo: myCustomProcessAction2... ");
		System.out.println(ParamUtil.getString(actionRequest, "param1"));

	}

	public void myCustomProcessAction3(ActionRequest actionRequest, ActionResponse actionResponse)
			throws IOException, PortletException {

		System.out.println("In ActionPhaseDemo: myCustomProcessAction3... ");
		System.out.println(ParamUtil.getString(actionRequest, "param1"));

	}
	
	
	
	
	
	
	
	
	
}
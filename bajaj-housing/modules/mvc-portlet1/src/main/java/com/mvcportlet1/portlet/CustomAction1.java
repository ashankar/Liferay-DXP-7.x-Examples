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
package com.mvcportlet1.portlet;

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
import com.mvcportlet1.constants.MvcPortlet1PortletKeys;

@Component(
	immediate = true,
	property = {
		"com.liferay.portlet.display-category=category.myapp",
		"com.liferay.portlet.instanceable=true",
		"javax.portlet.init-param.template-path=/",
		"javax.portlet.resource-bundle=content.Language",
		"javax.portlet.security-role-ref=power-user,user",
		"javax.portlet.init-param.view-template=/customaction1/view.jsp",
		"javax.portlet.name=" + MvcPortlet1PortletKeys.CUSTOM_ACTION1
	},
	service = Portlet.class
)
public class CustomAction1 extends MVCPortlet {
	
	@Override
	public void doView(RenderRequest renderRequest, RenderResponse renderResponse)
			throws IOException, PortletException {
		
		System.out.println("Hello CustomAction1 doView");
		
		super.doView(renderRequest, renderResponse);
	}
		
		
	public void myAction1(ActionRequest actionRequest, ActionResponse actionResponse)
			throws IOException, PortletException {

		System.out.println("Hello Action 1");

		String s2 = ParamUtil.getString(actionRequest, "key1");

		System.out.println(s2);
		
		System.out.println(ParamUtil.getString(actionRequest, "textboxname"));
	}
	
	public void myAction2(ActionRequest actionRequest, ActionResponse actionResponse)
			throws IOException, PortletException {

		System.out.println("Hello Action 2");

		String s2 = ParamUtil.getString(actionRequest, "key2");

		System.out.println(s2);

	}

	
}
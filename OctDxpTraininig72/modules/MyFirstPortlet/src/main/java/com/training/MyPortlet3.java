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
package com.training;

import java.io.IOException;
import java.util.ArrayList;

import javax.portlet.Portlet;
import javax.portlet.PortletException;
import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;

import org.osgi.service.component.annotations.Component;

import com.liferay.portal.kernel.portlet.bridges.mvc.MVCPortlet;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.kernel.xml.Element;
import com.training.constants.MyFirstPortletKeys;

@Component(
	immediate = true,
	property = {
		"com.liferay.portlet.display-category=category.app",
		"com.liferay.portlet.instanceable=true",
		"javax.portlet.init-param.template-path=/",
		"javax.portlet.resource-bundle=content.Language",
		"javax.portlet.security-role-ref=power-user,user",
		"javax.portlet.init-param.view-template=/myportlet3/view.jsp",
		"javax.portlet.name=" + MyFirstPortletKeys.MY_PORTLET3
	},
	service = Portlet.class
)
public class MyPortlet3 extends MVCPortlet {
	
	
	
	@Override
	public void doView(RenderRequest renderRequest, RenderResponse renderResponse)
			throws IOException, PortletException {

		System.out.println("Hello Portlet 3 doView");
		
		String x=ParamUtil.getString(renderRequest, "x");
		String y=ParamUtil.getString(renderRequest, "y");
		String z=ParamUtil.getString(renderRequest, "z");
		String d="This is my extra data";
		
		System.out.println(x);
		System.out.println(y);
		System.out.println(z);
		
		
//		renderResponse.setProperty("a", x);
//		renderResponse.setProperty("b", y);
//		renderResponse.setProperty("c", z);
//		renderResponse.setProperty("d", "This is my extra data");
		
		ArrayList<String> al=new ArrayList<String>();
		al.add(x);
		al.add(y);
		al.add(z);
		al.add(d);
		
		renderRequest.setAttribute("alpha", al);
		
//		renderResponse.setProperty("alpha", al);
		
//		Element el=ne
//				Element("<span>" + x + "</span>");
		
//		renderResponse.addProperty("x", el);
				
//		renderResponse.addProperty(key, element);
		
		
				
		super.doView(renderRequest, renderResponse);
	}
	
	
}
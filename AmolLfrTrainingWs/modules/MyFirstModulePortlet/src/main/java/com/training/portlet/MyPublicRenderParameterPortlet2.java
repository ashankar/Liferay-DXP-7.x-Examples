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

import com.liferay.portal.kernel.portlet.bridges.mvc.MVCPortlet;
import com.training.constants.MyFirstModulePortletKeys;

import org.osgi.service.component.annotations.Component;

@Component(
	immediate = true,
	property = {
		"javax.portlet.version=3.0",
		"com.liferay.portlet.display-category=category.app",
		"com.liferay.portlet.instanceable=true",
		"javax.portlet.init-param.template-path=/",
		"javax.portlet.resource-bundle=content.Language",
		"javax.portlet.security-role-ref=power-user,user",
		"javax.portlet.init-param.view-template=/mypublicrenderparameterportlet2/view.jsp",
		"javax.portlet.name=" + MyFirstModulePortletKeys.MY_PUBLIC_RENDER_PARAMETER_PORTLET_2,
		"javax.portlet.supported-public-render-parameter=id1"
	},
	service = Portlet.class
)
public class MyPublicRenderParameterPortlet2 extends MVCPortlet {
	
	@Override
	public void doView(RenderRequest renderRequest, RenderResponse renderResponse)
			throws IOException, PortletException {
	

//		System.out.println(">>>>>>>>>>>>>>>> " + renderRequest.getParameter("id1"));
		
		System.out.println(">>>>>>>>>>>>>>>> " + renderRequest.getRenderParameters().getValue("id1"));
		
		
		
		super.doView(renderRequest, renderResponse);
	}
	
}
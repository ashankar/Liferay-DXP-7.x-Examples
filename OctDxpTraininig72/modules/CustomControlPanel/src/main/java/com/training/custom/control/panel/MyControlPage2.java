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
package com.training.custom.control.panel;

import java.io.IOException;
import java.io.InputStream;

import javax.portlet.Portlet;
import javax.portlet.PortletException;
import javax.portlet.ResourceRequest;
import javax.portlet.ResourceResponse;

import com.liferay.expando.kernel.util.ExpandoBridgeFactoryUtil;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCPortlet;
import com.liferay.portal.kernel.util.ParamUtil;
import com.training.custom.control.panel.constants.CustomControlPanelPortletKeys;

import org.osgi.service.component.annotations.Component;

@Component(immediate = true, property = {

		"com.liferay.portlet.add-default-resource=true", "com.liferay.portlet.display-category=category.hidden",
		"com.liferay.portlet.header-portlet-css=/css/main.css", "com.liferay.portlet.layout-cacheable=true",
		"com.liferay.portlet.private-request-attributes=false", "com.liferay.portlet.private-session-attributes=false",
		"com.liferay.portlet.render-weight=50", "com.liferay.portlet.use-default-template=true",
		"javax.portlet.display-name=CustomControlPanel", "javax.portlet.expiration-cache=0",
		"com.liferay.portlet.instanceable=true", "javax.portlet.init-param.template-path=/",
		"javax.portlet.resource-bundle=content.Language", "javax.portlet.security-role-ref=power-user,user",
		"javax.portlet.init-param.view-template=/mycontrolpage2/view.jsp",
		"javax.portlet.name=" + CustomControlPanelPortletKeys.MY_CONTROL_PANEL_APP_2 }, service = Portlet.class)
public class MyControlPage2 extends MVCPortlet {
	
	
	
	@Override
	public void serveResource(ResourceRequest resourceRequest, ResourceResponse resourceResponse)
			throws IOException, PortletException {
		 
//		ParamUtil.get
		
		InputStream io= resourceRequest.getPart("fileToUpload").getInputStream();
		
//		ExpandoBridgeFactoryUtil
		
		
		super.serveResource(resourceRequest, resourceResponse);
	}
	
	
}
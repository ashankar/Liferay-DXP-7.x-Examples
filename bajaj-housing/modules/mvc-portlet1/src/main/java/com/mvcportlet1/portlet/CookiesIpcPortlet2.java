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

import javax.portlet.Portlet;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCPortlet;
import com.mvcportlet1.constants.MvcPortlet1PortletKeys;

import org.osgi.service.component.annotations.Component;

@Component(
	immediate = true,
	property = {
		"com.liferay.portlet.display-category=category.myapp",
		"com.liferay.portlet.instanceable=true",
		"javax.portlet.init-param.template-path=/",
		"javax.portlet.resource-bundle=content.Language",
		"javax.portlet.security-role-ref=power-user,user",
		"javax.portlet.init-param.view-template=/cookiesipcportlet2/view.jsp",
		"javax.portlet.name=" + MvcPortlet1PortletKeys.COOKIES_IPC_PORTLET2
	},
	service = Portlet.class
)
public class CookiesIpcPortlet2 extends MVCPortlet {
}
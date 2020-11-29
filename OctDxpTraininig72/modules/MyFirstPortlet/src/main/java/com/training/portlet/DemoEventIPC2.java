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

import javax.portlet.Event;
import javax.portlet.EventRequest;
import javax.portlet.EventResponse;
import javax.portlet.Portlet;
import javax.portlet.PortletException;
import javax.portlet.ProcessEvent;
import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;

import org.osgi.service.component.annotations.Component;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCPortlet;
import com.training.constants.MyFirstPortletKeys;

@Component(
	immediate = true,
	property = {
		"javax.portlet.version=3.0",
		"com.liferay.portlet.display-category=category.app",
		"com.liferay.portlet.instanceable=true",
		"javax.portlet.init-param.template-path=/",
		"javax.portlet.resource-bundle=content.Language",
		"javax.portlet.security-role-ref=power-user,user",
		"javax.portlet.init-param.view-template=/demoeventipc2/view.jsp",
		"javax.portlet.name=" + MyFirstPortletKeys.DEMO_EVENT_IPC2,
		"javax.portlet.supported-processing-event=id1;http://www.liferay.com"
	},
	service = Portlet.class
)
public class DemoEventIPC2 extends MVCPortlet {
	
	@Override
	public void doView(RenderRequest renderRequest, RenderResponse renderResponse)
			throws IOException, PortletException {

		System.out.println("In DemoEventIPC2: doView");
		
		super.doView(renderRequest, renderResponse);
	}
	
	
	
	@ProcessEvent(qname = "{http://www.liferay.com}id1")
	public void handleMyEvent(EventRequest eventRequest, EventResponse eventResponse) throws PortalException, IOException
	{
		Event event=eventRequest.getEvent();
		if(event != null)
		{
			String eventValue=event.getValue().toString();
			System.out.println("In handleMyEvent: Event Value: " + eventValue);
			eventResponse.getRenderParameters().setValue("alpha1", eventValue);
		}
	}

	
	
}
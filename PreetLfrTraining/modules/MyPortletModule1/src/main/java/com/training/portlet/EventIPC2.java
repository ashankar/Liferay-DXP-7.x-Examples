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
import javax.portlet.PortletRequest;
import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;
import javax.portlet.ResourceRequest;
import javax.portlet.ResourceResponse;

import org.osgi.service.component.annotations.Component;

import com.liferay.portal.kernel.portlet.bridges.mvc.MVCPortlet;
import com.training.constants.MyPortletModule1PortletKeys;

@Component(
	immediate = true,
	property = {
		"com.liferay.portlet.display-category=category.app",
		"com.liferay.portlet.instanceable=true",
		"javax.portlet.init-param.template-path=/",
		"javax.portlet.resource-bundle=content.Language",
		"javax.portlet.security-role-ref=power-user,user",
		"javax.portlet.init-param.view-template=/eventipc2/view.jsp",
		"javax.portlet.name=" + MyPortletModule1PortletKeys.EVENT_IPC_2,
		"javax.portlet.supported-processing-event=id1;http://www.liferay.com"
	},
	service = Portlet.class
)
public class EventIPC2 extends MVCPortlet {
	
//	String eventValue=null;
	
	@Override
	public void doView(RenderRequest renderRequest, RenderResponse renderResponse)
			throws IOException, PortletException {

		
//			System.out.println("doView: " + eventValue);
//			renderRequest.setAttribute("alpha1", eventValue);
		
		super.doView(renderRequest, renderResponse);
	}
	
	
	@Override
	public void processEvent(EventRequest request, EventResponse response) throws PortletException, IOException {

		System.out.println("Hello Process Event Default");
		
		Event event=request.getEvent();
		if(event != null)
		{
			String eventValue=event.getValue().toString();
			System.out.println("In processEvent: Event Value: " + eventValue);
			
			response.getRenderParameters().setValue("alpha1", eventValue);
			
//			response.setProperty("alpha1", eventValue);
//			request.setAttribute("alpha1", eventValue);
			
		}
		
	}
	
}
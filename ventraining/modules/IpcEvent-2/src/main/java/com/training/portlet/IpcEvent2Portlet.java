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
import com.training.constants.IpcEvent2PortletKeys;

/**
 * @author Anand
 */
@Component(
	immediate = true,
	property = {
		"com.liferay.portlet.display-category=category.myapp",
		"com.liferay.portlet.header-portlet-css=/css/main.css",
		"com.liferay.portlet.instanceable=true",
		"javax.portlet.display-name=IpcEvent2",
		"javax.portlet.init-param.template-path=/",
		"javax.portlet.init-param.view-template=/view.jsp",
		"javax.portlet.name=" + IpcEvent2PortletKeys.IPCEVENT2,
		"javax.portlet.resource-bundle=content.Language",
		"javax.portlet.security-role-ref=power-user,user",
		"javax.portlet.supported-processing-event=id1;http://www.liferay.com"
	},
	service = Portlet.class
)
public class IpcEvent2Portlet extends MVCPortlet {
	
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
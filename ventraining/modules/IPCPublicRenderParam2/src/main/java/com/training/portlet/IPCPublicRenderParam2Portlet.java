package com.training.portlet;

import com.training.constants.IPCPublicRenderParam2PortletKeys;

import com.liferay.portal.kernel.portlet.bridges.mvc.MVCPortlet;

import java.io.IOException;

import javax.portlet.Portlet;
import javax.portlet.PortletException;
import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;

import org.osgi.service.component.annotations.Component;

/**
 * @author Anand
 */
@Component(
	immediate = true,
	property = {
		"javax.portlet.version=3.0",
		"com.liferay.portlet.display-category=category.myapp",
		"com.liferay.portlet.header-portlet-css=/css/main.css",
		"com.liferay.portlet.instanceable=true",
		"javax.portlet.display-name=IPCPublicRenderParam2",
		"javax.portlet.init-param.template-path=/",
		"javax.portlet.init-param.view-template=/view.jsp",
		"javax.portlet.name=" + IPCPublicRenderParam2PortletKeys.IPCPUBLICRENDERPARAM2,
		"javax.portlet.resource-bundle=content.Language",
		"javax.portlet.security-role-ref=power-user,user",
		"javax.portlet.supported-public-render-parameter=id1"
	},
	service = Portlet.class
)
public class IPCPublicRenderParam2Portlet extends MVCPortlet {
	
	
	String myid=null;
	
	@Override
	public void doView(RenderRequest renderRequest, RenderResponse renderResponse)
			throws IOException, PortletException {
		
		
		System.out.println(" doView - Portlet-2");
		String param=renderRequest.getRenderParameters().getValue("id1");
		
		if(param != null)
		{
			myid=param;
		}
		
		
		System.out.println(myid);
		
		renderRequest.setAttribute("myid", myid);
		
		super.doView(renderRequest, renderResponse);
	}
	
}
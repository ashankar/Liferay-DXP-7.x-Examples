package com.training.portlet;

import java.io.IOException;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
import javax.portlet.Portlet;
import javax.portlet.PortletException;
import javax.xml.namespace.QName;

import org.osgi.service.component.annotations.Component;

import com.liferay.portal.kernel.portlet.bridges.mvc.MVCPortlet;
import com.liferay.portal.kernel.util.ParamUtil;
import com.training.constants.IpcEvent1PortletKeys;

/**
 * @author Anand
 */
@Component(
	immediate = true,
	property = {
		"com.liferay.portlet.display-category=category.myapp",
		"com.liferay.portlet.header-portlet-css=/css/main.css",
		"com.liferay.portlet.instanceable=true",
		"javax.portlet.display-name=IpcEvent1",
		"javax.portlet.init-param.template-path=/",
		"javax.portlet.init-param.view-template=/view.jsp",
		"javax.portlet.name=" + IpcEvent1PortletKeys.IPCEVENT1,
		"javax.portlet.resource-bundle=content.Language",
		"javax.portlet.security-role-ref=power-user,user",
		"javax.portlet.supported-publishing-event=id1;http://www.liferay.com"
	},
	service = Portlet.class
)
public class IpcEvent1Portlet extends MVCPortlet {
	
	
	@Override
	public void processAction(ActionRequest actionRequest, ActionResponse actionResponse)
			throws IOException, PortletException {

		
		System.out.println("In processAction");
		
		String s=ParamUtil.getString(actionRequest,"alpha");
		
		System.out.println(s);
		
		QName qName=new QName("http://www.liferay.com", "id1");
		
		actionResponse.setEvent(qName, s);

		
	}
}
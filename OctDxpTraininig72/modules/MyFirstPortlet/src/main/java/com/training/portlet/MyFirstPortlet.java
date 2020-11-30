package com.training.portlet;

import java.io.IOException;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
import javax.portlet.Portlet;
import javax.portlet.PortletException;
import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;

import org.osgi.service.component.annotations.Component;

import com.liferay.portal.kernel.portlet.bridges.mvc.MVCPortlet;
import com.training.constants.MyFirstPortletKeys;
import com.training.mysb.service.EmployeeLocalServiceUtil;

/**
 * @author anshankar
 */
@Component(
	immediate = true,
	property = {
		"com.liferay.portlet.display-category=category.app",
		"com.liferay.portlet.header-portlet-css=/css/main.css",
		"com.liferay.portlet.instanceable=true",
		"javax.portlet.display-name=MyFirst",
		"javax.portlet.init-param.template-path=/",
		"javax.portlet.init-param.view-template=/view.jsp",
		"javax.portlet.name=" + MyFirstPortletKeys.MYFIRST,
		"javax.portlet.resource-bundle=content.Language",
		"javax.portlet.security-role-ref=power-user,user"
	},
	service = Portlet.class
)
public class MyFirstPortlet extends MVCPortlet {
	
	
	@Override
	public void doView(RenderRequest renderRequest, RenderResponse renderResponse)
			throws IOException, PortletException {

		
		System.out.println("Hello doView Portlet 1");
		super.doView(renderRequest, renderResponse);
	}
	
	
	@Override
		public void processAction(ActionRequest actionRequest, ActionResponse actionResponse)
				throws IOException, PortletException {

		
		System.out.println("Hello Process Action Employee");
		
		
		try {
			
			long eid=1234l;
			
			EmployeeLocalServiceUtil.addNewEmployee(eid);
			
			
			/*
			 * Long x=123l;
			 * 
			 * 
			 * EmployeeLocalServiceUtil.createEmployee(x);
			 * 
			 * EmployeeLocalServiceUtil.
			 * 
			 * Employee employee=EmployeeLocalServiceUtil.createEmployee(x);
			 * 
			 * Employee employee=EmployeeUtil.create(x);
			 * 
			 * 
			 * 
			 * employee.setAddress("Street 2, LA, CA"); employee.setUserName("My Name");
			 * employee.setMobile(876768876);
			 * 
			 * 
			 * EmployeeLocalServiceUtil.addEmployee(employee);
			 */
			 
		
		System.out.println("record inserted");
		
		}catch (Exception e) {

		e.printStackTrace();
		}
		
		
		
		}
	
	
}
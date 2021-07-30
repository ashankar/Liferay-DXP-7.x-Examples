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

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
import javax.portlet.Portlet;
import javax.portlet.PortletException;
import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;

import org.osgi.service.component.annotations.Component;

import com.liferay.portal.kernel.model.Organization;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCPortlet;
import com.liferay.portal.kernel.service.OrganizationLocalServiceUtil;
import com.liferay.portal.kernel.util.ParamUtil;
import com.training.constants.MyFirstModulePortletKeys;
import com.training.sb.model.Department;
import com.training.sb.model.Employee;
import com.training.sb.service.DepartmentLocalServiceUtil;
import com.training.sb.service.EmployeeLocalServiceUtil;

@Component(
	immediate = true,
	property = {
		"com.liferay.portlet.display-category=category.app",
		"com.liferay.portlet.instanceable=true",
		"javax.portlet.init-param.template-path=/",
		"javax.portlet.resource-bundle=content.Language",
		"javax.portlet.security-role-ref=power-user,user",
		"javax.portlet.init-param.view-template=/myservicebuildertestportlet/view.jsp",
		"javax.portlet.name=" + MyFirstModulePortletKeys.MY_SERVICE_BUILDER_TEST_PORTLET
	},
	service = Portlet.class
)
public class MyServiceBuilderTestPortlet extends MVCPortlet {
	
	
	@Override
	public void doView(RenderRequest renderRequest, RenderResponse renderResponse)
			throws IOException, PortletException {

		try {
			
			Employee emp=EmployeeLocalServiceUtil.getEmployee(124);
			
			renderRequest.setAttribute("emp", emp);
			
			
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		
		
		super.doView(renderRequest, renderResponse);
	}
	
	
	
	
	@Override
	public void processAction(ActionRequest actionRequest, ActionResponse actionResponse)
			throws IOException, PortletException {

		long empId=ParamUtil.getLong(actionRequest, "empId");
		String name=ParamUtil.getString(actionRequest, "name");
		String address=ParamUtil.getString(actionRequest, "address");
		
		
		System.out.println(empId);
		System.out.println(name);
		System.out.println(address);
		
		try {
			
			
//			Employee employee=EmployeeLocalServiceUtil.getEmployee(123);
//			employee.setDeptId(1);
//			EmployeeLocalServiceUtil.updateEmployee(employee);
			
			
			
			
			
			Department dept=DepartmentLocalServiceUtil.createDepartment(3l);
			dept.setName("Admin");
//			
			DepartmentLocalServiceUtil.addDepartment(dept);
			

//			Employee employee=EmployeeLocalServiceUtil.getEmployee(123);
//			employee.setName("ABC1");
//			
//			
//			EmployeeLocalServiceUtil.updateEmployee(employee);
//			
			System.out.println("Record saved!");
//			
			
			
		
//			
//			Employee employee=EmployeeLocalServiceUtil.createEmployee(empId);
//			employee.setName(name);
//			employee.setAddress(address);
//			
//			System.out.println(employee.getEmpId());
//			System.out.println(employee.getName());
//			System.out.println(employee.getAddress());
//			
//			
//			EmployeeLocalServiceUtil.addEmployee(employee);
//			
//			System.out.println("Employee record saved!");
		
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		
	}
	
}
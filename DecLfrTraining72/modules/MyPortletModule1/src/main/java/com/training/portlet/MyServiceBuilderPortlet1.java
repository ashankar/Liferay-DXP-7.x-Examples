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
import java.util.List;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
import javax.portlet.Portlet;
import javax.portlet.PortletException;

import org.osgi.service.component.annotations.Component;

import com.liferay.counter.kernel.service.CounterLocalServiceUtil;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCPortlet;
import com.training.constants.MyPortlet1PortletKeys;
import com.training.mysb.model.Employee;
import com.training.mysb.service.EmployeeLocalServiceUtil;
import com.training.mysb.service.EmployeeServiceUtil;
import com.training.mysb.service.persistence.EmployeeUtil;

@Component(
	immediate = true,
	property = {
		"com.liferay.portlet.display-category=category.app",
		"com.liferay.portlet.instanceable=true",
		"javax.portlet.init-param.template-path=/",
		"javax.portlet.resource-bundle=content.Language",
		"javax.portlet.security-role-ref=power-user,user",
		"javax.portlet.init-param.view-template=/myservicebuilderportlet1/view.jsp",
		"javax.portlet.name=" + MyPortlet1PortletKeys.MY_SERVICE_BUILDER_PORTLET_1
	},
	service = Portlet.class
)
public class MyServiceBuilderPortlet1 extends MVCPortlet {
	
	
	@Override
	public void processAction(ActionRequest actionRequest, ActionResponse actionResponse)
			throws IOException, PortletException {

			System.out.println("In MyServiceBuilderPortlet1: processAction...");
			
		
		  try {
		  
		 
//			  Employee employee= EmployeeLocalServiceUtil.fetchEmployee(101);
//			  
//			  System.out.println(employee.getName());
			  
			  
//			  List<Employee> employees= EmployeeLocalServiceUtil.getEmployees(0, 5);
//			  
//			  for(Employee employee : employees)
//			  {
//				  
//				  System.out.println(employee.getName());
//				  
//			  }
			  
			  List<Employee> employees=EmployeeLocalServiceUtil.getEmployeeByName("Richard", "878765567");
			  
			  for(Employee employee : employees)
			  {
				  System.out.println(employee.getEmpId());
				  System.out.println(employee.getName());  
				  
			  }
			  
			  
			  
			  
			  
			  long empId= CounterLocalServiceUtil.increment(Employee.class.getName());
		  
		  Employee employee= EmployeeLocalServiceUtil.createEmployee(empId);
		 		  
		  employee.setName("Richard150"); employee.setMobile("99999999");
		  employee.setAddress("#876, LA, CA"); employee.setJobTitle("Manager");
		  
		  EmployeeLocalServiceUtil.addEmployee(employee);
		  
		  System.out.println("A row inserted");
			  
			  
			  
		  
		  } catch (Exception e) { e.printStackTrace(); }
		 
			
	}
	
}
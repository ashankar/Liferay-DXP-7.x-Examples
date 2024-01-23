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
package com.mvcportlet1;

import java.io.IOException;
import java.util.List;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
import javax.portlet.Portlet;
import javax.portlet.PortletException;

import com.bajaj.model.Department;
import com.bajaj.model.Employee;
import com.bajaj.service.DepartmentLocalServiceUtil;
import com.bajaj.service.EmployeeLocalServiceUtil;
import com.liferay.counter.kernel.service.CounterLocalServiceUtil;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCPortlet;
import com.liferay.portal.kernel.util.ParamUtil;
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
		"javax.portlet.init-param.view-template=/mvcportlet2/view.jsp",
		"javax.portlet.name=" + MvcPortlet1PortletKeys.MVCPORTLET2
	},
	service = Portlet.class
)
public class MvcPortlet2 extends MVCPortlet {
	
	
	@Override
	public void processAction(ActionRequest actionRequest, ActionResponse actionResponse)
			throws IOException, PortletException {

//		
//		long empId=CounterLocalServiceUtil.increment(Employee.class.getName());
//		String name=ParamUtil.getString(actionRequest, "name");
//		String address=ParamUtil.getString(actionRequest, "address");
//		int age=ParamUtil.getInteger(actionRequest, "age");
//		
//		System.out.println("MvcPortlet2.processAction(): inserting record in database...");
//		
		try {
//
//			//Example to save records
//			
//			
//			Department department= DepartmentLocalServiceUtil.getDepartment(101l);
//			
//			Employee employee = EmployeeLocalServiceUtil.createEmployee(empId);
//			employee.setName(name);
//			employee.setAddress(address);
//			employee.setAge(age);
//			employee.setDepId(department.getDepId());
//			EmployeeLocalServiceUtil.addEmployee(employee);
//
//			System.out.println("MvcPortlet2.processAction(): " + employee.getName() + "  added in database!");

			
			
			
			
			
			//Example to Fetch Record & Example to Update Record	 
			
//		Employee employee= EmployeeLocalServiceUtil.getEmployee(1);
//		employee.setAge(age);
//		
//		EmployeeLocalServiceUtil.updateEmployee(employee);
//		System.out.println("MvcPortlet2.processAction(): " + employee.getName() + "  updated in database!");
		
		
		
			//Example of Finder	
		
//			System.out.println(EmployeeLocalServiceUtil.getEmployeeByName(name));
			
		
		
 //List<Employee> employees=EmployeeLocalServiceUtil.getEmployeesWithDynamicQuery("name", "Vikram");
// System.out.println(employees);
		
		EmployeeLocalServiceUtil.callMyCustomQuery();
			
		
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	
}
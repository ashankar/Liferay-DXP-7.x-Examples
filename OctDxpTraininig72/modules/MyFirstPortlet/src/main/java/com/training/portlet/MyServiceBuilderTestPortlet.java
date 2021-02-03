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
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
import javax.portlet.Portlet;
import javax.portlet.PortletException;

import org.osgi.service.component.annotations.Component;

import com.liferay.portal.kernel.portlet.bridges.mvc.MVCPortlet;
import com.training.constants.MyFirstPortletKeys;
import com.training.mysb.model.Employee;
import com.training.mysb.service.EmployeeLocalServiceUtil;

@Component(
	immediate = true,
	property = {
		"com.liferay.portlet.display-category=category.app",
		"com.liferay.portlet.instanceable=true",
		"javax.portlet.init-param.template-path=/",
		"javax.portlet.resource-bundle=content.Language",
		"javax.portlet.security-role-ref=power-user,user",
		"javax.portlet.init-param.view-template=/myservicebuildertestportlet/view.jsp",
		"javax.portlet.name=" + MyFirstPortletKeys.MY_SERVICE_BUILDER_TEST_PORTLET
	},
	service = Portlet.class
)
public class MyServiceBuilderTestPortlet extends MVCPortlet {
	
	
	  public void processAction1(ActionRequest actionRequest, ActionResponse
	  actionResponse) throws IOException, PortletException {
	  
	  System.out.println("In MyServiceBuilderTestPortlet : processAction1");
	  
	  
	  
	  try {
		  
		  
		  
		  List<Employee> employees= EmployeeLocalServiceUtil.getResultFromCustomSQLQuery("My Name");
		  
		  
		  
//		  Map<String, Object> map=new HashMap<String, Object>();
		  
		  
//		 List<Employee> employees= EmployeeLocalServiceUtil.getResultFromDynamicQuery("mobile", 876678887, "employeeId", 200L);
		 
		  
		 
			/*
			 * for(Employee emp: employees) {
			 * 
			 * System.out.println(emp.getEmployeeId());
			 * System.out.println(emp.getUserName()); System.out.println(emp.getAddress());
			 * System.out.println(emp.getMobile());
			 * 
			 * }
			 */
		 
		 
		
	} catch (Exception e) {

		e.printStackTrace();
	
	}
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  /*
	  
	  
	  try {
	  
	  
	  Employee employee=EmployeeLocalServiceUtil.getEmployeeModel();
	  employee.setUserName(ParamUtil.getString(actionRequest, "empName"));
	  employee.setDob(ParamUtil.getDate(actionRequest, "dob", DateFormatFactoryUtil.getSimpleDateFormat("dd-MM-YYYY")));
	  employee.setMobile(ParamUtil.getInteger(actionRequest, "mobile"));
	  employee.setAddress(ParamUtil.getString(actionRequest, "address"));

	  EmployeeLocalServiceUtil.addNewEmployee(employee);
	  
	  
	  System.out.println("A row added...");
	  
	  }catch (Exception e) {
	  
	  e.printStackTrace(); }
	  
	  }
	  
	  
	  
	  public void processAction2(ActionRequest actionRequest, ActionResponse
				  actionResponse) throws IOException, PortletException {
		  
		  
		  try {
			  
			  
			  
//			 EmployeeUtil.findByEmployeeName(userName);
			  
			  
//			  int totalRows=EmployeeLocalServiceUtil.getEmployeesCount();
			  
//			 List<Employee> employees= EmployeeLocalServiceUtil.getEmployees(0, totalRows);
			 
			 List<Employee> employees= EmployeeLocalServiceUtil.getEmployeeByName("My Name");
			 
			 
			 for(Employee employee : employees)
			 {
				 System.out.println(employee.getEmployeeId());
				 System.out.println(employee.getUserName());
//				 System.out.println(employee.getMobile());
//				 System.out.println(employee.getDob());
//				 System.out.println(employee.getAddress());
			 }
			 
			  
//			  System.out.println(EmployeeLocalServiceUtil.getEmployeeByName("My Name").getEmployeeId());
			  
			  
			
		} catch (Exception e) {

			e.printStackTrace();
		}
	*/	  
		  
	  }
	  
	  
	  
	  
	  
	  
	/*
	 * 
	 * public void processAction2(ActionRequest actionRequest, ActionResponse
	 * actionResponse) throws IOException, PortletException {
	 * 
	 * System.out.println("In MyServiceBuilderTestPortlet : processAction2");
	 * 
	 * 
	 * try {
	 * 
	 * 
	 * List<Department> departments = DepartmentLocalServiceUtil.getDepartments(0,
	 * DepartmentLocalServiceUtil.getDepartmentsCount());
	 * 
	 * for(Department dept: departments) { System.out.println(dept.getName()); }
	 * 
	 * 
	 * long empId=CounterLocalServiceUtil.increment(Employee.class.getName());
	 * 
	 * Employee employee=EmployeeLocalServiceUtil.createEmployee(empId);
	 * employee.setUserName("My Name"); employee.setMobile(876678887);
	 * employee.setAddress("#3454, Street 34, CA");
	 * employee.setDeptId(departments.get(0).getDeptId());
	 * EmployeeLocalServiceUtil.addEmployee(employee);
	 * 
	 * 
	 * 
	 * long salId=CounterLocalServiceUtil.increment(Salary.class.getName()); Salary
	 * salary=SalaryLocalServiceUtil.createSalary(salId); salary.setAmount(50000);
	 * salary.setEmployeeId(employee.getEmployeeId());
	 * SalaryLocalServiceUtil.addSalary(salary);
	 * 
	 * System.out.println("A row added...");
	 * 
	 * }catch (Exception e) {
	 * 
	 * e.printStackTrace(); }
	 * 
	 * }
	 */
	
	
	  
	/*
	 * 
	 * public void processAction3(ActionRequest actionRequest, ActionResponse
	 * actionResponse) throws IOException, PortletException {
	 * 
	 * System.out.println("In MyServiceBuilderTestPortlet : processAction3");
	 * 
	 * 
	 * 
	 * 
	 * try {
	 * 
	 * long docId=CounterLocalServiceUtil.increment(Doctor.class.getName());
	 * 
	 * Doctor doctor=DoctorLocalServiceUtil.createDoctor(docId);
	 * doctor.setName("My Name" + docId); doctor.setSpeciality("Speciality" +
	 * docId);
	 * 
	 * DoctorLocalServiceUtil.addDoctor(doctor);
	 * 
	 * System.out.println("A row added...");
	 * 
	 * 
	 * }catch (Exception e) {
	 * 
	 * e.printStackTrace(); }
	 * 
	 * }
	 */
	
	
}
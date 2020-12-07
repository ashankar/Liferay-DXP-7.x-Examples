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

import org.osgi.service.component.annotations.Component;

import com.liferay.counter.kernel.service.CounterLocalServiceUtil;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCPortlet;
import com.sb2.training.model.Doctor;
import com.sb2.training.service.DoctorLocalServiceUtil;
import com.training.constants.MyFirstPortletKeys;

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
	
	/*
	 * public void processAction1(ActionRequest actionRequest, ActionResponse
	 * actionResponse) throws IOException, PortletException {
	 * 
	 * System.out.println("In MyServiceBuilderTestPortlet : processAction1");
	 * 
	 * 
	 * try {
	 * 
	 * long deptId=CounterLocalServiceUtil.increment(Department.class.getName());
	 * 
	 * Department department=DepartmentLocalServiceUtil.createDepartment(deptId);
	 * department.setName("Dept"+deptId); department.setHod("HOD"+deptId);
	 * DepartmentLocalServiceUtil.addDepartment(department);
	 * 
	 * System.out.println("A row added...");
	 * 
	 * }catch (Exception e) {
	 * 
	 * e.printStackTrace(); }
	 * 
	 * }
	 * 
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
	
	
	
	public void processAction3(ActionRequest actionRequest, ActionResponse actionResponse)
			throws IOException, PortletException {

		System.out.println("In MyServiceBuilderTestPortlet : processAction3");
		
		
		try {
			
			  long docId=CounterLocalServiceUtil.increment(Doctor.class.getName());
			  
			  Doctor doctor=DoctorLocalServiceUtil.createDoctor(docId);
			  doctor.setName("My Name" + docId);
			  doctor.setSpeciality("Speciality" + docId);
			  
			  DoctorLocalServiceUtil.addDoctor(doctor);
			  
			  System.out.println("A row added...");
			 
		
		}catch (Exception e) {
		
			e.printStackTrace();
		}
		
	}
	
	
	
}
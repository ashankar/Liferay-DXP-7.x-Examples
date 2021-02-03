/**
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package com.training.mysb.service.impl;

import java.util.List;

import org.osgi.service.component.annotations.Component;

import com.liferay.counter.kernel.service.CounterLocalServiceUtil;
import com.liferay.portal.aop.AopService;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.dao.orm.OrderFactoryUtil;
import com.liferay.portal.kernel.dao.orm.ProjectionFactoryUtil;
import com.liferay.portal.kernel.dao.orm.RestrictionsFactoryUtil;
import com.liferay.portal.kernel.dao.orm.SQLQuery;
import com.liferay.portal.kernel.dao.orm.Session;
import com.training.mysb.model.Employee;
import com.training.mysb.service.EmployeeLocalServiceUtil;
import com.training.mysb.service.base.EmployeeLocalServiceBaseImpl;
import com.training.mysb.service.persistence.EmployeeUtil;

/**
 * The implementation of the employee local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the <code>com.training.mysb.service.EmployeeLocalService</code> interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see EmployeeLocalServiceBaseImpl
 */
@Component(
	property = "model.class.name=com.training.mysb.model.Employee",
	service = AopService.class
)
public class EmployeeLocalServiceImpl extends EmployeeLocalServiceBaseImpl {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this class directly. Use <code>com.training.mysb.service.EmployeeLocalService</code> via injection or a <code>org.osgi.util.tracker.ServiceTracker</code> or use <code>com.training.mysb.service.EmployeeLocalServiceUtil</code>.
	 */
	
	
	public void createNewEmployeeRecord(long groupId, String empName)
	{
		
		try {
			
			Employee employee= getEmployeeModel();
			
			employee.setGroupId(groupId);
			employee.setUserName(empName);
			EmployeeLocalServiceUtil.addEmployee(employee);
			
			
		} catch (Exception e) {

			e.printStackTrace();
		}
		
		
		
		
	}
	
	
	
	public boolean isEmployeeAvailable(String empName)
	{
		boolean isAvailable=false;
		
		try {
			
			List<Employee> employees= EmployeeUtil.findByEmployeeName(empName);
			
			if(employees == null || employees.size() == 0)
			{
				isAvailable=false;
				
			}else {
				isAvailable=true;
			}
				
			
		} catch (Exception e) {

			e.printStackTrace();
		}		
		
		return isAvailable;
	}
	
	
	
	
	
	
	
	public List<Employee> getEmployeeByNameWithCustomQuery(String colName, String empName)
	{
	
		List<Employee> employees=null;
		
		
		Session session = null;

		try {

			session = employeePersistence.openSession();

			SQLQuery query = session.createSQLQuery("select * from employee where employeeid=? and groupid=?");

			query.setCacheable(false);
			query.setInteger(0, 202);
			query.setInteger(1, 203);

			List<Object[]> rows = query.list();

			for (Object[] row : rows) {
				System.out.println(row[0]);
				System.out.println(row[1]);
				System.out.println(row[2]);

			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			employeePersistence.closeSession(session);
		}

		
		
		
		
		
		
		
		
		
		
		return employees;
	}
	
	
	
	
	
	
	
	
	
	public List<Employee> getEmployeeByNameWithDynamicQuery(String colName, String empName)
	{
		
		List<Employee> employees=null;

		try {
			
			System.out.println("In EmployeeLocalServiceImpl: getEmployeeByNameWithDynamicQuery");
			
			DynamicQuery dq=dynamicQuery()
					.add(RestrictionsFactoryUtil.ge("employeeId", 400L))
//					.add(RestrictionsFactoryUtil.ilike("userName", "My%"))
					.setProjection(ProjectionFactoryUtil.property("employeeId"))
//					.setProjection(ProjectionFactoryUtil.property("userName"))
					.addOrder(OrderFactoryUtil.desc("employeeId"))
					;
									
			
			System.out.println(dynamicQuery(dq));
			
			
//			employees=dynamicQuery(dq);
			
		} catch (Exception e) {

		e.printStackTrace();
		}
		
		
		return employees;
	}
	
	
	
	

	public Employee getEmployeeModel()
	{
		
		Employee employee=null;
		
		try {
			long empId=CounterLocalServiceUtil.increment(Employee.class.getName());
			
			System.out.println(">>>>>>>>>>>>>>>>>>>" + empId);
			
			employee=EmployeeLocalServiceUtil.createEmployee(empId);
			
			
		} catch (Exception e) {

			e.printStackTrace();
		}
		
		
		return employee;
	}
	
	public List<Employee> getEmployeeByName(String empName)
	{
		
		 List<Employee> employees=null;
		
		try {
			
			
			employees= EmployeeUtil.findByEmployeeName(empName);
			
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		
		return employees;
		
	}
	
	
	
	
	
}
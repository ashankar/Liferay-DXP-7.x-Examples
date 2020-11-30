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

import com.liferay.portal.aop.AopService;
import com.training.mysb.model.Employee;
import com.training.mysb.service.EmployeeLocalServiceUtil;
import com.training.mysb.service.base.EmployeeLocalServiceBaseImpl;
import com.training.mysb.service.persistence.EmployeeUtil;

import org.osgi.service.component.annotations.Component;

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
	
	
	public void addNewEmployee(long empId)
	{
		
		try {
			
		Employee employee= EmployeeLocalServiceUtil.createEmployee(empId);
		
		
		  employee.setAddress("Street 2, LA, CA"); 
		  employee.setUserName("My Name");
		  employee.setMobile(876768876);
		  
		  
		  EmployeeLocalServiceUtil.addEmployee(employee);
		  
		  
		  System.out.println("record inserted from Impl");
		}catch (Exception e) {

		e.printStackTrace();
			
		}
		  
	}
	
	
	
	
}
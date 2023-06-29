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

package com.sb2.training.service.impl;

import java.util.List;

import org.osgi.service.component.annotations.Component;

import com.liferay.portal.aop.AopService;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.dao.orm.OrderFactoryUtil;
import com.liferay.portal.kernel.dao.orm.ProjectionFactoryUtil;
import com.liferay.portal.kernel.dao.orm.RestrictionsFactoryUtil;
import com.liferay.portal.kernel.dao.orm.SQLQuery;
import com.liferay.portal.kernel.dao.orm.Session;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.poller.PollerException;
import com.sb2.training.exception.MyExceptionException;
import com.sb2.training.exception.NoSuchEmployeeException;
import com.sb2.training.model.Employee;
import com.sb2.training.service.base.EmployeeLocalServiceBaseImpl;
import com.sb2.training.service.persistence.EmployeeUtil;

/**
 * The implementation of the employee local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the <code>com.sb2.training.service.EmployeeLocalService</code> interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see EmployeeLocalServiceBaseImpl
 */
@Component(
	property = "model.class.name=com.sb2.training.model.Employee",
	service = AopService.class
)
public class EmployeeLocalServiceImpl extends EmployeeLocalServiceBaseImpl {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this class directly. Use <code>com.sb2.training.service.EmployeeLocalService</code> via injection or a <code>org.osgi.util.tracker.ServiceTracker</code> or use <code>com.sb2.training.service.EmployeeLocalServiceUtil</code>.
	 */
	
	
	public Employee getEmpByUserName(String userName)
	{
		Employee emp=null;
		
		try {
			
			emp=EmployeeUtil.findByUserName(userName);
			
			
		} catch (NoSuchEmployeeException e) {
			e.printStackTrace();
		}
		
		return emp;
		
	}
	
	public void demoRestriction()
	{
		
		List<Employee> employees=null;
		
		try {
			
			System.out.println("Dynamic query: Restriction!" );
			
			DynamicQuery dq=dynamicQuery().add(RestrictionsFactoryUtil.eq("userName", "Venkata")).add(RestrictionsFactoryUtil.ge("age", 20)).addOrder(OrderFactoryUtil.asc("age"));
			
			employees=dynamicQuery(dq);
			
			
			System.out.println("Got employee" + employees);
			
			
			
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		
		
	}
	
	
	public List<Employee> getEmployeeWithProjectionDQ(String address)
	{
		
		List<Employee> employees=null;
		
		try {
				DynamicQuery dq=dynamicQuery().setProjection(ProjectionFactoryUtil.max("empId"));
				employees=dynamicQuery(dq);
				
			
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		
		return employees;
		
	}
	
	public List<Object[]> excuteMyCustomQuery(String sqlQuery)
	{
		
		Session session=null;
		List<Object[]> rows=null;
		
		try {
			
				session=employeePersistence.openSession();
				
				SQLQuery query=session.createSQLQuery(sqlQuery);
				rows= query.list();
				
			
		} catch (Exception e) {
			e.printStackTrace();
		
		}
		
		return rows;
		
	}
	
	
	
	
	
}
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

package com.bajaj.service.impl;

import java.util.List;

import org.osgi.service.component.annotations.Component;

import com.bajaj.model.Employee;
import com.bajaj.service.base.EmployeeLocalServiceBaseImpl;
import com.bajaj.service.persistence.EmployeeUtil;
import com.liferay.portal.aop.AopService;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.dao.orm.ProjectionFactoryUtil;
import com.liferay.portal.kernel.dao.orm.RestrictionsFactoryUtil;
import com.liferay.portal.kernel.dao.orm.SQLQuery;
import com.liferay.portal.kernel.dao.orm.Session;

/**
 * @author Brian Wing Shun Chan
 */
@Component(
	property = "model.class.name=com.bajaj.model.Employee",
	service = AopService.class
)
public class EmployeeLocalServiceImpl extends EmployeeLocalServiceBaseImpl {
	
	public List<Employee> getEmployeeByName(String name) {
		List<Employee> employees = null;

		employees=EmployeeUtil.findByEmployeeName(name);
		
		return employees;

	}
	
	public List<Employee> getEmployeesWithDynamicQuery(String colName, String searchValue) {

		List<Employee> employees = null;

//		try {
//
//			DynamicQuery dq = dynamicQuery().add(RestrictionsFactoryUtil.eq(colName, searchValue));
//			employees = dynamicQuery(dq);
//
//				} catch (Exception e) {
//
//					e.printStackTrace();
//				}
		
		
		try {

			DynamicQuery dq = dynamicQuery().add(RestrictionsFactoryUtil.eq(colName, searchValue)).setProjection(ProjectionFactoryUtil.max("age"));
			
			// For order
//			.addOrder(OrderFactoryUtil.asc("name"))
			
			employees = dynamicQuery(dq);

				} catch (Exception e) {

					e.printStackTrace();
				}
				return employees;
			}
	
	
	public void callMyCustomQuery() {

		Session session = null;

		try {

			session = employeePersistence.openSession();

			SQLQuery query = session.createSQLQuery("select * from mybj_employee");

			query.setCacheable(false);

			List<Object[]> rows = query.list();

			for (Object[] row : rows) {
				System.out.println(row[0]);
				System.out.println(row[1]);

			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			employeePersistence.closeSession(session);
		}
	}


}
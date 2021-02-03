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

package com.training.mysb.service;

import com.liferay.portal.kernel.service.ServiceWrapper;

import org.osgi.annotation.versioning.ProviderType;

/**
 * Provides a wrapper for {@link EmployeeService}.
 *
 * @author Brian Wing Shun Chan
 * @see EmployeeService
 * @generated
 */
@ProviderType
public class EmployeeServiceWrapper
	implements EmployeeService, ServiceWrapper<EmployeeService> {

	public EmployeeServiceWrapper(EmployeeService employeeService) {
		_employeeService = employeeService;
	}

	@Override
	public void createNewEmployeeRecord(long groupId, String empName) {
		_employeeService.createNewEmployeeRecord(groupId, empName);
	}

	@Override
	public String getEmployeeThroughWs() {
		return _employeeService.getEmployeeThroughWs();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _employeeService.getOSGiServiceIdentifier();
	}

	@Override
	public boolean isEmployeeAvailable(String empName) {
		return _employeeService.isEmployeeAvailable(empName);
	}

	@Override
	public EmployeeService getWrappedService() {
		return _employeeService;
	}

	@Override
	public void setWrappedService(EmployeeService employeeService) {
		_employeeService = employeeService;
	}

	private EmployeeService _employeeService;

}
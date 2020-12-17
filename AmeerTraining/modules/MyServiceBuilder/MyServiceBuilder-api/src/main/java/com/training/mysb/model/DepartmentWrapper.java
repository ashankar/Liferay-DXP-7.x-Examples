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

package com.training.mysb.model;

import com.liferay.portal.kernel.model.ModelWrapper;
import com.liferay.portal.kernel.model.wrapper.BaseModelWrapper;

import java.util.HashMap;
import java.util.Map;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <p>
 * This class is a wrapper for {@link Department}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see Department
 * @generated
 */
@ProviderType
public class DepartmentWrapper
	extends BaseModelWrapper<Department>
	implements Department, ModelWrapper<Department> {

	public DepartmentWrapper(Department department) {
		super(department);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("uuid", getUuid());
		attributes.put("dpetId", getDpetId());
		attributes.put("name", getName());
		attributes.put("employeeId", getEmployeeId());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		String uuid = (String)attributes.get("uuid");

		if (uuid != null) {
			setUuid(uuid);
		}

		String dpetId = (String)attributes.get("dpetId");

		if (dpetId != null) {
			setDpetId(dpetId);
		}

		String name = (String)attributes.get("name");

		if (name != null) {
			setName(name);
		}

		Long employeeId = (Long)attributes.get("employeeId");

		if (employeeId != null) {
			setEmployeeId(employeeId);
		}
	}

	/**
	 * Returns the dpet ID of this department.
	 *
	 * @return the dpet ID of this department
	 */
	@Override
	public String getDpetId() {
		return model.getDpetId();
	}

	/**
	 * Returns the employee ID of this department.
	 *
	 * @return the employee ID of this department
	 */
	@Override
	public long getEmployeeId() {
		return model.getEmployeeId();
	}

	/**
	 * Returns the name of this department.
	 *
	 * @return the name of this department
	 */
	@Override
	public String getName() {
		return model.getName();
	}

	/**
	 * Returns the primary key of this department.
	 *
	 * @return the primary key of this department
	 */
	@Override
	public String getPrimaryKey() {
		return model.getPrimaryKey();
	}

	/**
	 * Returns the uuid of this department.
	 *
	 * @return the uuid of this department
	 */
	@Override
	public String getUuid() {
		return model.getUuid();
	}

	@Override
	public void persist() {
		model.persist();
	}

	/**
	 * Sets the dpet ID of this department.
	 *
	 * @param dpetId the dpet ID of this department
	 */
	@Override
	public void setDpetId(String dpetId) {
		model.setDpetId(dpetId);
	}

	/**
	 * Sets the employee ID of this department.
	 *
	 * @param employeeId the employee ID of this department
	 */
	@Override
	public void setEmployeeId(long employeeId) {
		model.setEmployeeId(employeeId);
	}

	/**
	 * Sets the name of this department.
	 *
	 * @param name the name of this department
	 */
	@Override
	public void setName(String name) {
		model.setName(name);
	}

	/**
	 * Sets the primary key of this department.
	 *
	 * @param primaryKey the primary key of this department
	 */
	@Override
	public void setPrimaryKey(String primaryKey) {
		model.setPrimaryKey(primaryKey);
	}

	/**
	 * Sets the uuid of this department.
	 *
	 * @param uuid the uuid of this department
	 */
	@Override
	public void setUuid(String uuid) {
		model.setUuid(uuid);
	}

	@Override
	protected DepartmentWrapper wrap(Department department) {
		return new DepartmentWrapper(department);
	}

}
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
 * This class is a wrapper for {@link Salary}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see Salary
 * @generated
 */
@ProviderType
public class SalaryWrapper
	extends BaseModelWrapper<Salary> implements Salary, ModelWrapper<Salary> {

	public SalaryWrapper(Salary salary) {
		super(salary);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("uuid", getUuid());
		attributes.put("salId", getSalId());
		attributes.put("amount", getAmount());
		attributes.put("employeeId", getEmployeeId());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		String uuid = (String)attributes.get("uuid");

		if (uuid != null) {
			setUuid(uuid);
		}

		Long salId = (Long)attributes.get("salId");

		if (salId != null) {
			setSalId(salId);
		}

		Long amount = (Long)attributes.get("amount");

		if (amount != null) {
			setAmount(amount);
		}

		Long employeeId = (Long)attributes.get("employeeId");

		if (employeeId != null) {
			setEmployeeId(employeeId);
		}
	}

	/**
	 * Returns the amount of this salary.
	 *
	 * @return the amount of this salary
	 */
	@Override
	public long getAmount() {
		return model.getAmount();
	}

	/**
	 * Returns the employee ID of this salary.
	 *
	 * @return the employee ID of this salary
	 */
	@Override
	public long getEmployeeId() {
		return model.getEmployeeId();
	}

	/**
	 * Returns the primary key of this salary.
	 *
	 * @return the primary key of this salary
	 */
	@Override
	public long getPrimaryKey() {
		return model.getPrimaryKey();
	}

	/**
	 * Returns the sal ID of this salary.
	 *
	 * @return the sal ID of this salary
	 */
	@Override
	public long getSalId() {
		return model.getSalId();
	}

	/**
	 * Returns the uuid of this salary.
	 *
	 * @return the uuid of this salary
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
	 * Sets the amount of this salary.
	 *
	 * @param amount the amount of this salary
	 */
	@Override
	public void setAmount(long amount) {
		model.setAmount(amount);
	}

	/**
	 * Sets the employee ID of this salary.
	 *
	 * @param employeeId the employee ID of this salary
	 */
	@Override
	public void setEmployeeId(long employeeId) {
		model.setEmployeeId(employeeId);
	}

	/**
	 * Sets the primary key of this salary.
	 *
	 * @param primaryKey the primary key of this salary
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		model.setPrimaryKey(primaryKey);
	}

	/**
	 * Sets the sal ID of this salary.
	 *
	 * @param salId the sal ID of this salary
	 */
	@Override
	public void setSalId(long salId) {
		model.setSalId(salId);
	}

	/**
	 * Sets the uuid of this salary.
	 *
	 * @param uuid the uuid of this salary
	 */
	@Override
	public void setUuid(String uuid) {
		model.setUuid(uuid);
	}

	@Override
	protected SalaryWrapper wrap(Salary salary) {
		return new SalaryWrapper(salary);
	}

}
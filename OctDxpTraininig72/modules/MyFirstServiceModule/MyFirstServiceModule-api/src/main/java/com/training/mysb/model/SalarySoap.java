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

import java.io.Serializable;

import java.util.ArrayList;
import java.util.List;

import org.osgi.annotation.versioning.ProviderType;

/**
 * This class is used by SOAP remote services, specifically {@link com.training.mysb.service.http.SalaryServiceSoap}.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@ProviderType
public class SalarySoap implements Serializable {

	public static SalarySoap toSoapModel(Salary model) {
		SalarySoap soapModel = new SalarySoap();

		soapModel.setUuid(model.getUuid());
		soapModel.setSalId(model.getSalId());
		soapModel.setAmount(model.getAmount());
		soapModel.setEmployeeId(model.getEmployeeId());

		return soapModel;
	}

	public static SalarySoap[] toSoapModels(Salary[] models) {
		SalarySoap[] soapModels = new SalarySoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static SalarySoap[][] toSoapModels(Salary[][] models) {
		SalarySoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new SalarySoap[models.length][models[0].length];
		}
		else {
			soapModels = new SalarySoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static SalarySoap[] toSoapModels(List<Salary> models) {
		List<SalarySoap> soapModels = new ArrayList<SalarySoap>(models.size());

		for (Salary model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new SalarySoap[soapModels.size()]);
	}

	public SalarySoap() {
	}

	public long getPrimaryKey() {
		return _salId;
	}

	public void setPrimaryKey(long pk) {
		setSalId(pk);
	}

	public String getUuid() {
		return _uuid;
	}

	public void setUuid(String uuid) {
		_uuid = uuid;
	}

	public long getSalId() {
		return _salId;
	}

	public void setSalId(long salId) {
		_salId = salId;
	}

	public long getAmount() {
		return _amount;
	}

	public void setAmount(long amount) {
		_amount = amount;
	}

	public long getEmployeeId() {
		return _employeeId;
	}

	public void setEmployeeId(long employeeId) {
		_employeeId = employeeId;
	}

	private String _uuid;
	private long _salId;
	private long _amount;
	private long _employeeId;

}
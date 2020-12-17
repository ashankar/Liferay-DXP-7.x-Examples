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
 * This class is used by SOAP remote services, specifically {@link com.training.mysb.service.http.DepartmentServiceSoap}.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@ProviderType
public class DepartmentSoap implements Serializable {

	public static DepartmentSoap toSoapModel(Department model) {
		DepartmentSoap soapModel = new DepartmentSoap();

		soapModel.setUuid(model.getUuid());
		soapModel.setDpetId(model.getDpetId());
		soapModel.setName(model.getName());
		soapModel.setEmployeeId(model.getEmployeeId());

		return soapModel;
	}

	public static DepartmentSoap[] toSoapModels(Department[] models) {
		DepartmentSoap[] soapModels = new DepartmentSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static DepartmentSoap[][] toSoapModels(Department[][] models) {
		DepartmentSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new DepartmentSoap[models.length][models[0].length];
		}
		else {
			soapModels = new DepartmentSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static DepartmentSoap[] toSoapModels(List<Department> models) {
		List<DepartmentSoap> soapModels = new ArrayList<DepartmentSoap>(
			models.size());

		for (Department model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new DepartmentSoap[soapModels.size()]);
	}

	public DepartmentSoap() {
	}

	public String getPrimaryKey() {
		return _dpetId;
	}

	public void setPrimaryKey(String pk) {
		setDpetId(pk);
	}

	public String getUuid() {
		return _uuid;
	}

	public void setUuid(String uuid) {
		_uuid = uuid;
	}

	public String getDpetId() {
		return _dpetId;
	}

	public void setDpetId(String dpetId) {
		_dpetId = dpetId;
	}

	public String getName() {
		return _name;
	}

	public void setName(String name) {
		_name = name;
	}

	public long getEmployeeId() {
		return _employeeId;
	}

	public void setEmployeeId(long employeeId) {
		_employeeId = employeeId;
	}

	private String _uuid;
	private String _dpetId;
	private String _name;
	private long _employeeId;

}
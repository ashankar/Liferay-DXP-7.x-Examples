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

package com.sb2.training.model;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.List;

import org.osgi.annotation.versioning.ProviderType;

/**
 * This class is used by SOAP remote services.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@ProviderType
public class DoctorSoap implements Serializable {

	public static DoctorSoap toSoapModel(Doctor model) {
		DoctorSoap soapModel = new DoctorSoap();

		soapModel.setDocId(model.getDocId());
		soapModel.setName(model.getName());
		soapModel.setSpeciality(model.getSpeciality());

		return soapModel;
	}

	public static DoctorSoap[] toSoapModels(Doctor[] models) {
		DoctorSoap[] soapModels = new DoctorSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static DoctorSoap[][] toSoapModels(Doctor[][] models) {
		DoctorSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new DoctorSoap[models.length][models[0].length];
		}
		else {
			soapModels = new DoctorSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static DoctorSoap[] toSoapModels(List<Doctor> models) {
		List<DoctorSoap> soapModels = new ArrayList<DoctorSoap>(models.size());

		for (Doctor model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new DoctorSoap[soapModels.size()]);
	}

	public DoctorSoap() {
	}

	public long getPrimaryKey() {
		return _docId;
	}

	public void setPrimaryKey(long pk) {
		setDocId(pk);
	}

	public long getDocId() {
		return _docId;
	}

	public void setDocId(long docId) {
		_docId = docId;
	}

	public String getName() {
		return _name;
	}

	public void setName(String name) {
		_name = name;
	}

	public String getSpeciality() {
		return _speciality;
	}

	public void setSpeciality(String speciality) {
		_speciality = speciality;
	}

	private long _docId;
	private String _name;
	private String _speciality;

}
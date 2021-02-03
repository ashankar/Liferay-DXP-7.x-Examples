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
 * This class is used by SOAP remote services, specifically {@link com.training.mysb.service.http.CustomUserServiceSoap}.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@ProviderType
public class CustomUserSoap implements Serializable {

	public static CustomUserSoap toSoapModel(CustomUser model) {
		CustomUserSoap soapModel = new CustomUserSoap();

		soapModel.setId(model.getId());

		return soapModel;
	}

	public static CustomUserSoap[] toSoapModels(CustomUser[] models) {
		CustomUserSoap[] soapModels = new CustomUserSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static CustomUserSoap[][] toSoapModels(CustomUser[][] models) {
		CustomUserSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new CustomUserSoap[models.length][models[0].length];
		}
		else {
			soapModels = new CustomUserSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static CustomUserSoap[] toSoapModels(List<CustomUser> models) {
		List<CustomUserSoap> soapModels = new ArrayList<CustomUserSoap>(
			models.size());

		for (CustomUser model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new CustomUserSoap[soapModels.size()]);
	}

	public CustomUserSoap() {
	}

	public long getPrimaryKey() {
		return _id;
	}

	public void setPrimaryKey(long pk) {
		setId(pk);
	}

	public long getId() {
		return _id;
	}

	public void setId(long id) {
		_id = id;
	}

	private long _id;

}
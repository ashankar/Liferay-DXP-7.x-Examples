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
public class XyzOrgSoap implements Serializable {

	public static XyzOrgSoap toSoapModel(XyzOrg model) {
		XyzOrgSoap soapModel = new XyzOrgSoap();

		soapModel.setUuid(model.getUuid());
		soapModel.setDepId(model.getDepId());
		soapModel.setDepName(model.getDepName());

		return soapModel;
	}

	public static XyzOrgSoap[] toSoapModels(XyzOrg[] models) {
		XyzOrgSoap[] soapModels = new XyzOrgSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static XyzOrgSoap[][] toSoapModels(XyzOrg[][] models) {
		XyzOrgSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new XyzOrgSoap[models.length][models[0].length];
		}
		else {
			soapModels = new XyzOrgSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static XyzOrgSoap[] toSoapModels(List<XyzOrg> models) {
		List<XyzOrgSoap> soapModels = new ArrayList<XyzOrgSoap>(models.size());

		for (XyzOrg model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new XyzOrgSoap[soapModels.size()]);
	}

	public XyzOrgSoap() {
	}

	public long getPrimaryKey() {
		return _depId;
	}

	public void setPrimaryKey(long pk) {
		setDepId(pk);
	}

	public String getUuid() {
		return _uuid;
	}

	public void setUuid(String uuid) {
		_uuid = uuid;
	}

	public long getDepId() {
		return _depId;
	}

	public void setDepId(long depId) {
		_depId = depId;
	}

	public String getDepName() {
		return _depName;
	}

	public void setDepName(String depName) {
		_depName = depName;
	}

	private String _uuid;
	private long _depId;
	private String _depName;

}
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
 * This class is used by SOAP remote services, specifically {@link com.training.mysb.service.http.AddressServiceSoap}.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@ProviderType
public class AddressSoap implements Serializable {

	public static AddressSoap toSoapModel(Address model) {
		AddressSoap soapModel = new AddressSoap();

		soapModel.setUuid(model.getUuid());
		soapModel.setAddrId(model.getAddrId());
		soapModel.setHouseNo(model.getHouseNo());
		soapModel.setStreetNo(model.getStreetNo());
		soapModel.setCity(model.getCity());
		soapModel.setState(model.getState());
		soapModel.setCountry(model.getCountry());
		soapModel.setEmployeeId(model.getEmployeeId());

		return soapModel;
	}

	public static AddressSoap[] toSoapModels(Address[] models) {
		AddressSoap[] soapModels = new AddressSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static AddressSoap[][] toSoapModels(Address[][] models) {
		AddressSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new AddressSoap[models.length][models[0].length];
		}
		else {
			soapModels = new AddressSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static AddressSoap[] toSoapModels(List<Address> models) {
		List<AddressSoap> soapModels = new ArrayList<AddressSoap>(
			models.size());

		for (Address model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new AddressSoap[soapModels.size()]);
	}

	public AddressSoap() {
	}

	public String getPrimaryKey() {
		return _addrId;
	}

	public void setPrimaryKey(String pk) {
		setAddrId(pk);
	}

	public String getUuid() {
		return _uuid;
	}

	public void setUuid(String uuid) {
		_uuid = uuid;
	}

	public String getAddrId() {
		return _addrId;
	}

	public void setAddrId(String addrId) {
		_addrId = addrId;
	}

	public String getHouseNo() {
		return _houseNo;
	}

	public void setHouseNo(String houseNo) {
		_houseNo = houseNo;
	}

	public String getStreetNo() {
		return _StreetNo;
	}

	public void setStreetNo(String StreetNo) {
		_StreetNo = StreetNo;
	}

	public String getCity() {
		return _city;
	}

	public void setCity(String city) {
		_city = city;
	}

	public String getState() {
		return _state;
	}

	public void setState(String state) {
		_state = state;
	}

	public String getCountry() {
		return _country;
	}

	public void setCountry(String country) {
		_country = country;
	}

	public long getEmployeeId() {
		return _employeeId;
	}

	public void setEmployeeId(long employeeId) {
		_employeeId = employeeId;
	}

	private String _uuid;
	private String _addrId;
	private String _houseNo;
	private String _StreetNo;
	private String _city;
	private String _state;
	private String _country;
	private long _employeeId;

}
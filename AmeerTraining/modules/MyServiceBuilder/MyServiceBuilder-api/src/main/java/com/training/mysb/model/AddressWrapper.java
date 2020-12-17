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
 * This class is a wrapper for {@link Address}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see Address
 * @generated
 */
@ProviderType
public class AddressWrapper
	extends BaseModelWrapper<Address>
	implements Address, ModelWrapper<Address> {

	public AddressWrapper(Address address) {
		super(address);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("uuid", getUuid());
		attributes.put("addrId", getAddrId());
		attributes.put("houseNo", getHouseNo());
		attributes.put("StreetNo", getStreetNo());
		attributes.put("city", getCity());
		attributes.put("state", getState());
		attributes.put("country", getCountry());
		attributes.put("employeeId", getEmployeeId());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		String uuid = (String)attributes.get("uuid");

		if (uuid != null) {
			setUuid(uuid);
		}

		String addrId = (String)attributes.get("addrId");

		if (addrId != null) {
			setAddrId(addrId);
		}

		String houseNo = (String)attributes.get("houseNo");

		if (houseNo != null) {
			setHouseNo(houseNo);
		}

		String StreetNo = (String)attributes.get("StreetNo");

		if (StreetNo != null) {
			setStreetNo(StreetNo);
		}

		String city = (String)attributes.get("city");

		if (city != null) {
			setCity(city);
		}

		String state = (String)attributes.get("state");

		if (state != null) {
			setState(state);
		}

		String country = (String)attributes.get("country");

		if (country != null) {
			setCountry(country);
		}

		Long employeeId = (Long)attributes.get("employeeId");

		if (employeeId != null) {
			setEmployeeId(employeeId);
		}
	}

	/**
	 * Returns the addr ID of this address.
	 *
	 * @return the addr ID of this address
	 */
	@Override
	public String getAddrId() {
		return model.getAddrId();
	}

	/**
	 * Returns the city of this address.
	 *
	 * @return the city of this address
	 */
	@Override
	public String getCity() {
		return model.getCity();
	}

	/**
	 * Returns the country of this address.
	 *
	 * @return the country of this address
	 */
	@Override
	public String getCountry() {
		return model.getCountry();
	}

	/**
	 * Returns the employee ID of this address.
	 *
	 * @return the employee ID of this address
	 */
	@Override
	public long getEmployeeId() {
		return model.getEmployeeId();
	}

	/**
	 * Returns the house no of this address.
	 *
	 * @return the house no of this address
	 */
	@Override
	public String getHouseNo() {
		return model.getHouseNo();
	}

	/**
	 * Returns the primary key of this address.
	 *
	 * @return the primary key of this address
	 */
	@Override
	public String getPrimaryKey() {
		return model.getPrimaryKey();
	}

	/**
	 * Returns the state of this address.
	 *
	 * @return the state of this address
	 */
	@Override
	public String getState() {
		return model.getState();
	}

	/**
	 * Returns the street no of this address.
	 *
	 * @return the street no of this address
	 */
	@Override
	public String getStreetNo() {
		return model.getStreetNo();
	}

	/**
	 * Returns the uuid of this address.
	 *
	 * @return the uuid of this address
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
	 * Sets the addr ID of this address.
	 *
	 * @param addrId the addr ID of this address
	 */
	@Override
	public void setAddrId(String addrId) {
		model.setAddrId(addrId);
	}

	/**
	 * Sets the city of this address.
	 *
	 * @param city the city of this address
	 */
	@Override
	public void setCity(String city) {
		model.setCity(city);
	}

	/**
	 * Sets the country of this address.
	 *
	 * @param country the country of this address
	 */
	@Override
	public void setCountry(String country) {
		model.setCountry(country);
	}

	/**
	 * Sets the employee ID of this address.
	 *
	 * @param employeeId the employee ID of this address
	 */
	@Override
	public void setEmployeeId(long employeeId) {
		model.setEmployeeId(employeeId);
	}

	/**
	 * Sets the house no of this address.
	 *
	 * @param houseNo the house no of this address
	 */
	@Override
	public void setHouseNo(String houseNo) {
		model.setHouseNo(houseNo);
	}

	/**
	 * Sets the primary key of this address.
	 *
	 * @param primaryKey the primary key of this address
	 */
	@Override
	public void setPrimaryKey(String primaryKey) {
		model.setPrimaryKey(primaryKey);
	}

	/**
	 * Sets the state of this address.
	 *
	 * @param state the state of this address
	 */
	@Override
	public void setState(String state) {
		model.setState(state);
	}

	/**
	 * Sets the street no of this address.
	 *
	 * @param StreetNo the street no of this address
	 */
	@Override
	public void setStreetNo(String StreetNo) {
		model.setStreetNo(StreetNo);
	}

	/**
	 * Sets the uuid of this address.
	 *
	 * @param uuid the uuid of this address
	 */
	@Override
	public void setUuid(String uuid) {
		model.setUuid(uuid);
	}

	@Override
	protected AddressWrapper wrap(Address address) {
		return new AddressWrapper(address);
	}

}
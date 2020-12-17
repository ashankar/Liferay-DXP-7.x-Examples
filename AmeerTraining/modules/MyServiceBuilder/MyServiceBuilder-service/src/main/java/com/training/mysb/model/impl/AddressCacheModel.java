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

package com.training.mysb.model.impl;

import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;

import com.training.mysb.model.Address;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The cache model class for representing Address in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@ProviderType
public class AddressCacheModel implements CacheModel<Address>, Externalizable {

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof AddressCacheModel)) {
			return false;
		}

		AddressCacheModel addressCacheModel = (AddressCacheModel)obj;

		if (addrId.equals(addressCacheModel.addrId)) {
			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, addrId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(17);

		sb.append("{uuid=");
		sb.append(uuid);
		sb.append(", addrId=");
		sb.append(addrId);
		sb.append(", houseNo=");
		sb.append(houseNo);
		sb.append(", StreetNo=");
		sb.append(StreetNo);
		sb.append(", city=");
		sb.append(city);
		sb.append(", state=");
		sb.append(state);
		sb.append(", country=");
		sb.append(country);
		sb.append(", employeeId=");
		sb.append(employeeId);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public Address toEntityModel() {
		AddressImpl addressImpl = new AddressImpl();

		if (uuid == null) {
			addressImpl.setUuid("");
		}
		else {
			addressImpl.setUuid(uuid);
		}

		if (addrId == null) {
			addressImpl.setAddrId("");
		}
		else {
			addressImpl.setAddrId(addrId);
		}

		if (houseNo == null) {
			addressImpl.setHouseNo("");
		}
		else {
			addressImpl.setHouseNo(houseNo);
		}

		if (StreetNo == null) {
			addressImpl.setStreetNo("");
		}
		else {
			addressImpl.setStreetNo(StreetNo);
		}

		if (city == null) {
			addressImpl.setCity("");
		}
		else {
			addressImpl.setCity(city);
		}

		if (state == null) {
			addressImpl.setState("");
		}
		else {
			addressImpl.setState(state);
		}

		if (country == null) {
			addressImpl.setCountry("");
		}
		else {
			addressImpl.setCountry(country);
		}

		addressImpl.setEmployeeId(employeeId);

		addressImpl.resetOriginalValues();

		return addressImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		uuid = objectInput.readUTF();
		addrId = objectInput.readUTF();
		houseNo = objectInput.readUTF();
		StreetNo = objectInput.readUTF();
		city = objectInput.readUTF();
		state = objectInput.readUTF();
		country = objectInput.readUTF();

		employeeId = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		if (uuid == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(uuid);
		}

		if (addrId == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(addrId);
		}

		if (houseNo == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(houseNo);
		}

		if (StreetNo == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(StreetNo);
		}

		if (city == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(city);
		}

		if (state == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(state);
		}

		if (country == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(country);
		}

		objectOutput.writeLong(employeeId);
	}

	public String uuid;
	public String addrId;
	public String houseNo;
	public String StreetNo;
	public String city;
	public String state;
	public String country;
	public long employeeId;

}
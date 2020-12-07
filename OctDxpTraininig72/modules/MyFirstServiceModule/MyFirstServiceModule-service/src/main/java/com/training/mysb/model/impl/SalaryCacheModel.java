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

import com.training.mysb.model.Salary;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The cache model class for representing Salary in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@ProviderType
public class SalaryCacheModel implements CacheModel<Salary>, Externalizable {

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof SalaryCacheModel)) {
			return false;
		}

		SalaryCacheModel salaryCacheModel = (SalaryCacheModel)obj;

		if (salId == salaryCacheModel.salId) {
			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, salId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(9);

		sb.append("{uuid=");
		sb.append(uuid);
		sb.append(", salId=");
		sb.append(salId);
		sb.append(", amount=");
		sb.append(amount);
		sb.append(", employeeId=");
		sb.append(employeeId);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public Salary toEntityModel() {
		SalaryImpl salaryImpl = new SalaryImpl();

		if (uuid == null) {
			salaryImpl.setUuid("");
		}
		else {
			salaryImpl.setUuid(uuid);
		}

		salaryImpl.setSalId(salId);
		salaryImpl.setAmount(amount);
		salaryImpl.setEmployeeId(employeeId);

		salaryImpl.resetOriginalValues();

		return salaryImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		uuid = objectInput.readUTF();

		salId = objectInput.readLong();

		amount = objectInput.readLong();

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

		objectOutput.writeLong(salId);

		objectOutput.writeLong(amount);

		objectOutput.writeLong(employeeId);
	}

	public String uuid;
	public long salId;
	public long amount;
	public long employeeId;

}
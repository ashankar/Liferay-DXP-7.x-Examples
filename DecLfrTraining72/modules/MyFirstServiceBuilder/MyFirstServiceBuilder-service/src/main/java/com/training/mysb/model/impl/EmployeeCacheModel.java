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

import com.training.mysb.model.Employee;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing Employee in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class EmployeeCacheModel
	implements CacheModel<Employee>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof EmployeeCacheModel)) {
			return false;
		}

		EmployeeCacheModel employeeCacheModel = (EmployeeCacheModel)object;

		if (empId == employeeCacheModel.empId) {
			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, empId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(21);

		sb.append("{empId=");
		sb.append(empId);
		sb.append(", name=");
		sb.append(name);
		sb.append(", mobile=");
		sb.append(mobile);
		sb.append(", address=");
		sb.append(address);
		sb.append(", jobTitle=");
		sb.append(jobTitle);
		sb.append(", groupId=");
		sb.append(groupId);
		sb.append(", userId=");
		sb.append(userId);
		sb.append(", userName=");
		sb.append(userName);
		sb.append(", createDate=");
		sb.append(createDate);
		sb.append(", modifiedDate=");
		sb.append(modifiedDate);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public Employee toEntityModel() {
		EmployeeImpl employeeImpl = new EmployeeImpl();

		employeeImpl.setEmpId(empId);

		if (name == null) {
			employeeImpl.setName("");
		}
		else {
			employeeImpl.setName(name);
		}

		if (mobile == null) {
			employeeImpl.setMobile("");
		}
		else {
			employeeImpl.setMobile(mobile);
		}

		if (address == null) {
			employeeImpl.setAddress("");
		}
		else {
			employeeImpl.setAddress(address);
		}

		if (jobTitle == null) {
			employeeImpl.setJobTitle("");
		}
		else {
			employeeImpl.setJobTitle(jobTitle);
		}

		employeeImpl.setGroupId(groupId);
		employeeImpl.setUserId(userId);

		if (userName == null) {
			employeeImpl.setUserName("");
		}
		else {
			employeeImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			employeeImpl.setCreateDate(null);
		}
		else {
			employeeImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			employeeImpl.setModifiedDate(null);
		}
		else {
			employeeImpl.setModifiedDate(new Date(modifiedDate));
		}

		employeeImpl.resetOriginalValues();

		return employeeImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		empId = objectInput.readLong();
		name = objectInput.readUTF();
		mobile = objectInput.readUTF();
		address = objectInput.readUTF();
		jobTitle = objectInput.readUTF();

		groupId = objectInput.readLong();

		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		objectOutput.writeLong(empId);

		if (name == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(name);
		}

		if (mobile == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(mobile);
		}

		if (address == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(address);
		}

		if (jobTitle == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(jobTitle);
		}

		objectOutput.writeLong(groupId);

		objectOutput.writeLong(userId);

		if (userName == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(userName);
		}

		objectOutput.writeLong(createDate);
		objectOutput.writeLong(modifiedDate);
	}

	public long empId;
	public String name;
	public String mobile;
	public String address;
	public String jobTitle;
	public long groupId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;

}
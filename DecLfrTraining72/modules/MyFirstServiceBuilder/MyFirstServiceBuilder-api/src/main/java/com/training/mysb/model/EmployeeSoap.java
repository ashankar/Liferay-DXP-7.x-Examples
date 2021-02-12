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
import java.util.Date;
import java.util.List;

/**
 * This class is used by SOAP remote services, specifically {@link com.training.mysb.service.http.EmployeeServiceSoap}.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class EmployeeSoap implements Serializable {

	public static EmployeeSoap toSoapModel(Employee model) {
		EmployeeSoap soapModel = new EmployeeSoap();

		soapModel.setEmpId(model.getEmpId());
		soapModel.setName(model.getName());
		soapModel.setMobile(model.getMobile());
		soapModel.setAddress(model.getAddress());
		soapModel.setJobTitle(model.getJobTitle());
		soapModel.setGroupId(model.getGroupId());
		soapModel.setUserId(model.getUserId());
		soapModel.setUserName(model.getUserName());
		soapModel.setCreateDate(model.getCreateDate());
		soapModel.setModifiedDate(model.getModifiedDate());

		return soapModel;
	}

	public static EmployeeSoap[] toSoapModels(Employee[] models) {
		EmployeeSoap[] soapModels = new EmployeeSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static EmployeeSoap[][] toSoapModels(Employee[][] models) {
		EmployeeSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new EmployeeSoap[models.length][models[0].length];
		}
		else {
			soapModels = new EmployeeSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static EmployeeSoap[] toSoapModels(List<Employee> models) {
		List<EmployeeSoap> soapModels = new ArrayList<EmployeeSoap>(
			models.size());

		for (Employee model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new EmployeeSoap[soapModels.size()]);
	}

	public EmployeeSoap() {
	}

	public long getPrimaryKey() {
		return _empId;
	}

	public void setPrimaryKey(long pk) {
		setEmpId(pk);
	}

	public long getEmpId() {
		return _empId;
	}

	public void setEmpId(long empId) {
		_empId = empId;
	}

	public String getName() {
		return _name;
	}

	public void setName(String name) {
		_name = name;
	}

	public String getMobile() {
		return _mobile;
	}

	public void setMobile(String mobile) {
		_mobile = mobile;
	}

	public String getAddress() {
		return _address;
	}

	public void setAddress(String address) {
		_address = address;
	}

	public String getJobTitle() {
		return _jobTitle;
	}

	public void setJobTitle(String jobTitle) {
		_jobTitle = jobTitle;
	}

	public long getGroupId() {
		return _groupId;
	}

	public void setGroupId(long groupId) {
		_groupId = groupId;
	}

	public long getUserId() {
		return _userId;
	}

	public void setUserId(long userId) {
		_userId = userId;
	}

	public String getUserName() {
		return _userName;
	}

	public void setUserName(String userName) {
		_userName = userName;
	}

	public Date getCreateDate() {
		return _createDate;
	}

	public void setCreateDate(Date createDate) {
		_createDate = createDate;
	}

	public Date getModifiedDate() {
		return _modifiedDate;
	}

	public void setModifiedDate(Date modifiedDate) {
		_modifiedDate = modifiedDate;
	}

	private long _empId;
	private String _name;
	private String _mobile;
	private String _address;
	private String _jobTitle;
	private long _groupId;
	private long _userId;
	private String _userName;
	private Date _createDate;
	private Date _modifiedDate;

}
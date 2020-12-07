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

import com.liferay.portal.kernel.model.ModelWrapper;
import com.liferay.portal.kernel.model.wrapper.BaseModelWrapper;

import java.util.HashMap;
import java.util.Map;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <p>
 * This class is a wrapper for {@link Doctor}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see Doctor
 * @generated
 */
@ProviderType
public class DoctorWrapper
	extends BaseModelWrapper<Doctor> implements Doctor, ModelWrapper<Doctor> {

	public DoctorWrapper(Doctor doctor) {
		super(doctor);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("docId", getDocId());
		attributes.put("name", getName());
		attributes.put("speciality", getSpeciality());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long docId = (Long)attributes.get("docId");

		if (docId != null) {
			setDocId(docId);
		}

		String name = (String)attributes.get("name");

		if (name != null) {
			setName(name);
		}

		String speciality = (String)attributes.get("speciality");

		if (speciality != null) {
			setSpeciality(speciality);
		}
	}

	/**
	 * Returns the doc ID of this doctor.
	 *
	 * @return the doc ID of this doctor
	 */
	@Override
	public long getDocId() {
		return model.getDocId();
	}

	/**
	 * Returns the name of this doctor.
	 *
	 * @return the name of this doctor
	 */
	@Override
	public String getName() {
		return model.getName();
	}

	/**
	 * Returns the primary key of this doctor.
	 *
	 * @return the primary key of this doctor
	 */
	@Override
	public long getPrimaryKey() {
		return model.getPrimaryKey();
	}

	/**
	 * Returns the speciality of this doctor.
	 *
	 * @return the speciality of this doctor
	 */
	@Override
	public String getSpeciality() {
		return model.getSpeciality();
	}

	@Override
	public void persist() {
		model.persist();
	}

	/**
	 * Sets the doc ID of this doctor.
	 *
	 * @param docId the doc ID of this doctor
	 */
	@Override
	public void setDocId(long docId) {
		model.setDocId(docId);
	}

	/**
	 * Sets the name of this doctor.
	 *
	 * @param name the name of this doctor
	 */
	@Override
	public void setName(String name) {
		model.setName(name);
	}

	/**
	 * Sets the primary key of this doctor.
	 *
	 * @param primaryKey the primary key of this doctor
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		model.setPrimaryKey(primaryKey);
	}

	/**
	 * Sets the speciality of this doctor.
	 *
	 * @param speciality the speciality of this doctor
	 */
	@Override
	public void setSpeciality(String speciality) {
		model.setSpeciality(speciality);
	}

	@Override
	protected DoctorWrapper wrap(Doctor doctor) {
		return new DoctorWrapper(doctor);
	}

}
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

package com.sb2.training.model.impl;

import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;

import com.sb2.training.model.Doctor;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The cache model class for representing Doctor in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@ProviderType
public class DoctorCacheModel implements CacheModel<Doctor>, Externalizable {

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof DoctorCacheModel)) {
			return false;
		}

		DoctorCacheModel doctorCacheModel = (DoctorCacheModel)obj;

		if (docId == doctorCacheModel.docId) {
			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, docId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(7);

		sb.append("{docId=");
		sb.append(docId);
		sb.append(", name=");
		sb.append(name);
		sb.append(", speciality=");
		sb.append(speciality);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public Doctor toEntityModel() {
		DoctorImpl doctorImpl = new DoctorImpl();

		doctorImpl.setDocId(docId);

		if (name == null) {
			doctorImpl.setName("");
		}
		else {
			doctorImpl.setName(name);
		}

		if (speciality == null) {
			doctorImpl.setSpeciality("");
		}
		else {
			doctorImpl.setSpeciality(speciality);
		}

		doctorImpl.resetOriginalValues();

		return doctorImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		docId = objectInput.readLong();
		name = objectInput.readUTF();
		speciality = objectInput.readUTF();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		objectOutput.writeLong(docId);

		if (name == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(name);
		}

		if (speciality == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(speciality);
		}
	}

	public long docId;
	public String name;
	public String speciality;

}
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

import com.sb2.training.model.XyzOrg;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The cache model class for representing XyzOrg in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@ProviderType
public class XyzOrgCacheModel implements CacheModel<XyzOrg>, Externalizable {

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof XyzOrgCacheModel)) {
			return false;
		}

		XyzOrgCacheModel xyzOrgCacheModel = (XyzOrgCacheModel)obj;

		if (depId == xyzOrgCacheModel.depId) {
			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, depId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(7);

		sb.append("{uuid=");
		sb.append(uuid);
		sb.append(", depId=");
		sb.append(depId);
		sb.append(", depName=");
		sb.append(depName);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public XyzOrg toEntityModel() {
		XyzOrgImpl xyzOrgImpl = new XyzOrgImpl();

		if (uuid == null) {
			xyzOrgImpl.setUuid("");
		}
		else {
			xyzOrgImpl.setUuid(uuid);
		}

		xyzOrgImpl.setDepId(depId);

		if (depName == null) {
			xyzOrgImpl.setDepName("");
		}
		else {
			xyzOrgImpl.setDepName(depName);
		}

		xyzOrgImpl.resetOriginalValues();

		return xyzOrgImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		uuid = objectInput.readUTF();

		depId = objectInput.readLong();
		depName = objectInput.readUTF();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		if (uuid == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(uuid);
		}

		objectOutput.writeLong(depId);

		if (depName == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(depName);
		}
	}

	public String uuid;
	public long depId;
	public String depName;

}
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
 * This class is a wrapper for {@link XyzOrg}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see XyzOrg
 * @generated
 */
@ProviderType
public class XyzOrgWrapper
	extends BaseModelWrapper<XyzOrg> implements XyzOrg, ModelWrapper<XyzOrg> {

	public XyzOrgWrapper(XyzOrg xyzOrg) {
		super(xyzOrg);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("uuid", getUuid());
		attributes.put("depId", getDepId());
		attributes.put("depName", getDepName());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		String uuid = (String)attributes.get("uuid");

		if (uuid != null) {
			setUuid(uuid);
		}

		Long depId = (Long)attributes.get("depId");

		if (depId != null) {
			setDepId(depId);
		}

		String depName = (String)attributes.get("depName");

		if (depName != null) {
			setDepName(depName);
		}
	}

	/**
	 * Returns the dep ID of this xyz org.
	 *
	 * @return the dep ID of this xyz org
	 */
	@Override
	public long getDepId() {
		return model.getDepId();
	}

	/**
	 * Returns the dep name of this xyz org.
	 *
	 * @return the dep name of this xyz org
	 */
	@Override
	public String getDepName() {
		return model.getDepName();
	}

	/**
	 * Returns the primary key of this xyz org.
	 *
	 * @return the primary key of this xyz org
	 */
	@Override
	public long getPrimaryKey() {
		return model.getPrimaryKey();
	}

	/**
	 * Returns the uuid of this xyz org.
	 *
	 * @return the uuid of this xyz org
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
	 * Sets the dep ID of this xyz org.
	 *
	 * @param depId the dep ID of this xyz org
	 */
	@Override
	public void setDepId(long depId) {
		model.setDepId(depId);
	}

	/**
	 * Sets the dep name of this xyz org.
	 *
	 * @param depName the dep name of this xyz org
	 */
	@Override
	public void setDepName(String depName) {
		model.setDepName(depName);
	}

	/**
	 * Sets the primary key of this xyz org.
	 *
	 * @param primaryKey the primary key of this xyz org
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		model.setPrimaryKey(primaryKey);
	}

	/**
	 * Sets the uuid of this xyz org.
	 *
	 * @param uuid the uuid of this xyz org
	 */
	@Override
	public void setUuid(String uuid) {
		model.setUuid(uuid);
	}

	@Override
	protected XyzOrgWrapper wrap(XyzOrg xyzOrg) {
		return new XyzOrgWrapper(xyzOrg);
	}

}
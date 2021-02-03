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

package com.training.mysb.service;

import com.liferay.portal.kernel.service.ServiceWrapper;

import org.osgi.annotation.versioning.ProviderType;

/**
 * Provides a wrapper for {@link CustomUserService}.
 *
 * @author Brian Wing Shun Chan
 * @see CustomUserService
 * @generated
 */
@ProviderType
public class CustomUserServiceWrapper
	implements CustomUserService, ServiceWrapper<CustomUserService> {

	public CustomUserServiceWrapper(CustomUserService customUserService) {
		_customUserService = customUserService;
	}

	@Override
	public Object createLiferayUser(
		String firstName, String lastName, String email, String screenName,
		String password) {

		return _customUserService.createLiferayUser(
			firstName, lastName, email, screenName, password);
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _customUserService.getOSGiServiceIdentifier();
	}

	@Override
	public CustomUserService getWrappedService() {
		return _customUserService;
	}

	@Override
	public void setWrappedService(CustomUserService customUserService) {
		_customUserService = customUserService;
	}

	private CustomUserService _customUserService;

}
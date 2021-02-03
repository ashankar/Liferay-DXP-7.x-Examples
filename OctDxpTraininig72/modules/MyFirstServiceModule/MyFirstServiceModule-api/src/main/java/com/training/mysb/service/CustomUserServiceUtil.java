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

import org.osgi.annotation.versioning.ProviderType;
import org.osgi.framework.Bundle;
import org.osgi.framework.FrameworkUtil;
import org.osgi.util.tracker.ServiceTracker;

/**
 * Provides the remote service utility for CustomUser. This utility wraps
 * <code>com.training.mysb.service.impl.CustomUserServiceImpl</code> and is an
 * access point for service operations in application layer code running on a
 * remote server. Methods of this service are expected to have security checks
 * based on the propagated JAAS credentials because this service can be
 * accessed remotely.
 *
 * @author Brian Wing Shun Chan
 * @see CustomUserService
 * @generated
 */
@ProviderType
public class CustomUserServiceUtil {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to <code>com.training.mysb.service.impl.CustomUserServiceImpl</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static Object createLiferayUser(
		String firstName, String lastName, String email, String screenName,
		String password) {

		return getService().createLiferayUser(
			firstName, lastName, email, screenName, password);
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	public static String getOSGiServiceIdentifier() {
		return getService().getOSGiServiceIdentifier();
	}

	public static CustomUserService getService() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<CustomUserService, CustomUserService>
		_serviceTracker;

	static {
		Bundle bundle = FrameworkUtil.getBundle(CustomUserService.class);

		ServiceTracker<CustomUserService, CustomUserService> serviceTracker =
			new ServiceTracker<CustomUserService, CustomUserService>(
				bundle.getBundleContext(), CustomUserService.class, null);

		serviceTracker.open();

		_serviceTracker = serviceTracker;
	}

}
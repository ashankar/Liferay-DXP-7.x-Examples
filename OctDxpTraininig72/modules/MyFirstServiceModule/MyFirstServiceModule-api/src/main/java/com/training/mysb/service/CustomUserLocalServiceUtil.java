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
 * Provides the local service utility for CustomUser. This utility wraps
 * <code>com.training.mysb.service.impl.CustomUserLocalServiceImpl</code> and
 * is an access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author Brian Wing Shun Chan
 * @see CustomUserLocalService
 * @generated
 */
@ProviderType
public class CustomUserLocalServiceUtil {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to <code>com.training.mysb.service.impl.CustomUserLocalServiceImpl</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * Adds the custom user to the database. Also notifies the appropriate model listeners.
	 *
	 * @param customUser the custom user
	 * @return the custom user that was added
	 */
	public static com.training.mysb.model.CustomUser addCustomUser(
		com.training.mysb.model.CustomUser customUser) {

		return getService().addCustomUser(customUser);
	}

	public static void addLiferayUser(
		String firstName, String lastName, String email, String screenName,
		String password) {

		getService().addLiferayUser(
			firstName, lastName, email, screenName, password);
	}

	/**
	 * Creates a new custom user with the primary key. Does not add the custom user to the database.
	 *
	 * @param id the primary key for the new custom user
	 * @return the new custom user
	 */
	public static com.training.mysb.model.CustomUser createCustomUser(long id) {
		return getService().createCustomUser(id);
	}

	/**
	 * Deletes the custom user from the database. Also notifies the appropriate model listeners.
	 *
	 * @param customUser the custom user
	 * @return the custom user that was removed
	 */
	public static com.training.mysb.model.CustomUser deleteCustomUser(
		com.training.mysb.model.CustomUser customUser) {

		return getService().deleteCustomUser(customUser);
	}

	/**
	 * Deletes the custom user with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param id the primary key of the custom user
	 * @return the custom user that was removed
	 * @throws PortalException if a custom user with the primary key could not be found
	 */
	public static com.training.mysb.model.CustomUser deleteCustomUser(long id)
		throws com.liferay.portal.kernel.exception.PortalException {

		return getService().deleteCustomUser(id);
	}

	/**
	 * @throws PortalException
	 */
	public static com.liferay.portal.kernel.model.PersistedModel
			deletePersistedModel(
				com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return getService().deletePersistedModel(persistedModel);
	}

	public static com.liferay.portal.kernel.dao.orm.DynamicQuery
		dynamicQuery() {

		return getService().dynamicQuery();
	}

	/**
	 * Performs a dynamic query on the database and returns the matching rows.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the matching rows
	 */
	public static <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {

		return getService().dynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>com.training.mysb.model.impl.CustomUserModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param dynamicQuery the dynamic query
	 * @param start the lower bound of the range of model instances
	 * @param end the upper bound of the range of model instances (not inclusive)
	 * @return the range of matching rows
	 */
	public static <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) {

		return getService().dynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>com.training.mysb.model.impl.CustomUserModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param dynamicQuery the dynamic query
	 * @param start the lower bound of the range of model instances
	 * @param end the upper bound of the range of model instances (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching rows
	 */
	public static <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<T> orderByComparator) {

		return getService().dynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * Returns the number of rows matching the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the number of rows matching the dynamic query
	 */
	public static long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {

		return getService().dynamicQueryCount(dynamicQuery);
	}

	/**
	 * Returns the number of rows matching the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @param projection the projection to apply to the query
	 * @return the number of rows matching the dynamic query
	 */
	public static long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery,
		com.liferay.portal.kernel.dao.orm.Projection projection) {

		return getService().dynamicQueryCount(dynamicQuery, projection);
	}

	public static com.training.mysb.model.CustomUser fetchCustomUser(long id) {
		return getService().fetchCustomUser(id);
	}

	public static com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return getService().getActionableDynamicQuery();
	}

	/**
	 * Returns the custom user with the primary key.
	 *
	 * @param id the primary key of the custom user
	 * @return the custom user
	 * @throws PortalException if a custom user with the primary key could not be found
	 */
	public static com.training.mysb.model.CustomUser getCustomUser(long id)
		throws com.liferay.portal.kernel.exception.PortalException {

		return getService().getCustomUser(id);
	}

	/**
	 * Returns a range of all the custom users.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>com.training.mysb.model.impl.CustomUserModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of custom users
	 * @param end the upper bound of the range of custom users (not inclusive)
	 * @return the range of custom users
	 */
	public static java.util.List<com.training.mysb.model.CustomUser>
		getCustomUsers(int start, int end) {

		return getService().getCustomUsers(start, end);
	}

	/**
	 * Returns the number of custom users.
	 *
	 * @return the number of custom users
	 */
	public static int getCustomUsersCount() {
		return getService().getCustomUsersCount();
	}

	public static
		com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
			getIndexableActionableDynamicQuery() {

		return getService().getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	public static String getOSGiServiceIdentifier() {
		return getService().getOSGiServiceIdentifier();
	}

	public static com.liferay.portal.kernel.model.PersistedModel
			getPersistedModel(java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return getService().getPersistedModel(primaryKeyObj);
	}

	/**
	 * Updates the custom user in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * @param customUser the custom user
	 * @return the custom user that was updated
	 */
	public static com.training.mysb.model.CustomUser updateCustomUser(
		com.training.mysb.model.CustomUser customUser) {

		return getService().updateCustomUser(customUser);
	}

	public static CustomUserLocalService getService() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker
		<CustomUserLocalService, CustomUserLocalService> _serviceTracker;

	static {
		Bundle bundle = FrameworkUtil.getBundle(CustomUserLocalService.class);

		ServiceTracker<CustomUserLocalService, CustomUserLocalService>
			serviceTracker =
				new ServiceTracker
					<CustomUserLocalService, CustomUserLocalService>(
						bundle.getBundleContext(), CustomUserLocalService.class,
						null);

		serviceTracker.open();

		_serviceTracker = serviceTracker;
	}

}
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

package com.training.mysb.service.persistence;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import com.training.mysb.model.CustomUser;

import java.io.Serializable;

import java.util.List;
import java.util.Map;
import java.util.Set;

import org.osgi.annotation.versioning.ProviderType;
import org.osgi.framework.Bundle;
import org.osgi.framework.FrameworkUtil;
import org.osgi.util.tracker.ServiceTracker;

/**
 * The persistence utility for the custom user service. This utility wraps <code>com.training.mysb.service.persistence.impl.CustomUserPersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see CustomUserPersistence
 * @generated
 */
@ProviderType
public class CustomUserUtil {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#clearCache()
	 */
	public static void clearCache() {
		getPersistence().clearCache();
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#clearCache(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static void clearCache(CustomUser customUser) {
		getPersistence().clearCache(customUser);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#countWithDynamicQuery(DynamicQuery)
	 */
	public static long countWithDynamicQuery(DynamicQuery dynamicQuery) {
		return getPersistence().countWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#fetchByPrimaryKeys(Set)
	 */
	public static Map<Serializable, CustomUser> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<CustomUser> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {

		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<CustomUser> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<CustomUser> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<CustomUser> orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static CustomUser update(CustomUser customUser) {
		return getPersistence().update(customUser);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static CustomUser update(
		CustomUser customUser, ServiceContext serviceContext) {

		return getPersistence().update(customUser, serviceContext);
	}

	/**
	 * Caches the custom user in the entity cache if it is enabled.
	 *
	 * @param customUser the custom user
	 */
	public static void cacheResult(CustomUser customUser) {
		getPersistence().cacheResult(customUser);
	}

	/**
	 * Caches the custom users in the entity cache if it is enabled.
	 *
	 * @param customUsers the custom users
	 */
	public static void cacheResult(List<CustomUser> customUsers) {
		getPersistence().cacheResult(customUsers);
	}

	/**
	 * Creates a new custom user with the primary key. Does not add the custom user to the database.
	 *
	 * @param id the primary key for the new custom user
	 * @return the new custom user
	 */
	public static CustomUser create(long id) {
		return getPersistence().create(id);
	}

	/**
	 * Removes the custom user with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param id the primary key of the custom user
	 * @return the custom user that was removed
	 * @throws NoSuchCustomUserException if a custom user with the primary key could not be found
	 */
	public static CustomUser remove(long id)
		throws com.training.mysb.exception.NoSuchCustomUserException {

		return getPersistence().remove(id);
	}

	public static CustomUser updateImpl(CustomUser customUser) {
		return getPersistence().updateImpl(customUser);
	}

	/**
	 * Returns the custom user with the primary key or throws a <code>NoSuchCustomUserException</code> if it could not be found.
	 *
	 * @param id the primary key of the custom user
	 * @return the custom user
	 * @throws NoSuchCustomUserException if a custom user with the primary key could not be found
	 */
	public static CustomUser findByPrimaryKey(long id)
		throws com.training.mysb.exception.NoSuchCustomUserException {

		return getPersistence().findByPrimaryKey(id);
	}

	/**
	 * Returns the custom user with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param id the primary key of the custom user
	 * @return the custom user, or <code>null</code> if a custom user with the primary key could not be found
	 */
	public static CustomUser fetchByPrimaryKey(long id) {
		return getPersistence().fetchByPrimaryKey(id);
	}

	/**
	 * Returns all the custom users.
	 *
	 * @return the custom users
	 */
	public static List<CustomUser> findAll() {
		return getPersistence().findAll();
	}

	/**
	 * Returns a range of all the custom users.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>CustomUserModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of custom users
	 * @param end the upper bound of the range of custom users (not inclusive)
	 * @return the range of custom users
	 */
	public static List<CustomUser> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	 * Returns an ordered range of all the custom users.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>CustomUserModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @deprecated As of Mueller (7.2.x), replaced by {@link #findAll(int, int, OrderByComparator)}
	 * @param start the lower bound of the range of custom users
	 * @param end the upper bound of the range of custom users (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of custom users
	 */
	@Deprecated
	public static List<CustomUser> findAll(
		int start, int end, OrderByComparator<CustomUser> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns an ordered range of all the custom users.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>CustomUserModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of custom users
	 * @param end the upper bound of the range of custom users (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of custom users
	 */
	public static List<CustomUser> findAll(
		int start, int end, OrderByComparator<CustomUser> orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	 * Removes all the custom users from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of custom users.
	 *
	 * @return the number of custom users
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static CustomUserPersistence getPersistence() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<CustomUserPersistence, CustomUserPersistence>
		_serviceTracker;

	static {
		Bundle bundle = FrameworkUtil.getBundle(CustomUserPersistence.class);

		ServiceTracker<CustomUserPersistence, CustomUserPersistence>
			serviceTracker =
				new ServiceTracker
					<CustomUserPersistence, CustomUserPersistence>(
						bundle.getBundleContext(), CustomUserPersistence.class,
						null);

		serviceTracker.open();

		_serviceTracker = serviceTracker;
	}

}
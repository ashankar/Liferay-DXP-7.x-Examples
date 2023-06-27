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

package com.sb2.training.service.persistence;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import com.sb2.training.model.XyzOrg;

import java.io.Serializable;

import java.util.List;
import java.util.Map;
import java.util.Set;

import org.osgi.annotation.versioning.ProviderType;
import org.osgi.framework.Bundle;
import org.osgi.framework.FrameworkUtil;
import org.osgi.util.tracker.ServiceTracker;

/**
 * The persistence utility for the xyz org service. This utility wraps <code>com.sb2.training.service.persistence.impl.XyzOrgPersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see XyzOrgPersistence
 * @generated
 */
@ProviderType
public class XyzOrgUtil {

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
	public static void clearCache(XyzOrg xyzOrg) {
		getPersistence().clearCache(xyzOrg);
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
	public static Map<Serializable, XyzOrg> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<XyzOrg> findWithDynamicQuery(DynamicQuery dynamicQuery) {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<XyzOrg> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<XyzOrg> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<XyzOrg> orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static XyzOrg update(XyzOrg xyzOrg) {
		return getPersistence().update(xyzOrg);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static XyzOrg update(XyzOrg xyzOrg, ServiceContext serviceContext) {
		return getPersistence().update(xyzOrg, serviceContext);
	}

	/**
	 * Returns all the xyz orgs where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching xyz orgs
	 */
	public static List<XyzOrg> findByUuid(String uuid) {
		return getPersistence().findByUuid(uuid);
	}

	/**
	 * Returns a range of all the xyz orgs where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>XyzOrgModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of xyz orgs
	 * @param end the upper bound of the range of xyz orgs (not inclusive)
	 * @return the range of matching xyz orgs
	 */
	public static List<XyzOrg> findByUuid(String uuid, int start, int end) {
		return getPersistence().findByUuid(uuid, start, end);
	}

	/**
	 * Returns an ordered range of all the xyz orgs where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>XyzOrgModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @deprecated As of Mueller (7.2.x), replaced by {@link #findByUuid(String, int, int, OrderByComparator)}
	 * @param uuid the uuid
	 * @param start the lower bound of the range of xyz orgs
	 * @param end the upper bound of the range of xyz orgs (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching xyz orgs
	 */
	@Deprecated
	public static List<XyzOrg> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<XyzOrg> orderByComparator, boolean useFinderCache) {

		return getPersistence().findByUuid(
			uuid, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns an ordered range of all the xyz orgs where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>XyzOrgModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of xyz orgs
	 * @param end the upper bound of the range of xyz orgs (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching xyz orgs
	 */
	public static List<XyzOrg> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<XyzOrg> orderByComparator) {

		return getPersistence().findByUuid(uuid, start, end, orderByComparator);
	}

	/**
	 * Returns the first xyz org in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching xyz org
	 * @throws NoSuchXyzOrgException if a matching xyz org could not be found
	 */
	public static XyzOrg findByUuid_First(
			String uuid, OrderByComparator<XyzOrg> orderByComparator)
		throws com.sb2.training.exception.NoSuchXyzOrgException {

		return getPersistence().findByUuid_First(uuid, orderByComparator);
	}

	/**
	 * Returns the first xyz org in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching xyz org, or <code>null</code> if a matching xyz org could not be found
	 */
	public static XyzOrg fetchByUuid_First(
		String uuid, OrderByComparator<XyzOrg> orderByComparator) {

		return getPersistence().fetchByUuid_First(uuid, orderByComparator);
	}

	/**
	 * Returns the last xyz org in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching xyz org
	 * @throws NoSuchXyzOrgException if a matching xyz org could not be found
	 */
	public static XyzOrg findByUuid_Last(
			String uuid, OrderByComparator<XyzOrg> orderByComparator)
		throws com.sb2.training.exception.NoSuchXyzOrgException {

		return getPersistence().findByUuid_Last(uuid, orderByComparator);
	}

	/**
	 * Returns the last xyz org in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching xyz org, or <code>null</code> if a matching xyz org could not be found
	 */
	public static XyzOrg fetchByUuid_Last(
		String uuid, OrderByComparator<XyzOrg> orderByComparator) {

		return getPersistence().fetchByUuid_Last(uuid, orderByComparator);
	}

	/**
	 * Returns the xyz orgs before and after the current xyz org in the ordered set where uuid = &#63;.
	 *
	 * @param depId the primary key of the current xyz org
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next xyz org
	 * @throws NoSuchXyzOrgException if a xyz org with the primary key could not be found
	 */
	public static XyzOrg[] findByUuid_PrevAndNext(
			long depId, String uuid,
			OrderByComparator<XyzOrg> orderByComparator)
		throws com.sb2.training.exception.NoSuchXyzOrgException {

		return getPersistence().findByUuid_PrevAndNext(
			depId, uuid, orderByComparator);
	}

	/**
	 * Removes all the xyz orgs where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	public static void removeByUuid(String uuid) {
		getPersistence().removeByUuid(uuid);
	}

	/**
	 * Returns the number of xyz orgs where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching xyz orgs
	 */
	public static int countByUuid(String uuid) {
		return getPersistence().countByUuid(uuid);
	}

	/**
	 * Caches the xyz org in the entity cache if it is enabled.
	 *
	 * @param xyzOrg the xyz org
	 */
	public static void cacheResult(XyzOrg xyzOrg) {
		getPersistence().cacheResult(xyzOrg);
	}

	/**
	 * Caches the xyz orgs in the entity cache if it is enabled.
	 *
	 * @param xyzOrgs the xyz orgs
	 */
	public static void cacheResult(List<XyzOrg> xyzOrgs) {
		getPersistence().cacheResult(xyzOrgs);
	}

	/**
	 * Creates a new xyz org with the primary key. Does not add the xyz org to the database.
	 *
	 * @param depId the primary key for the new xyz org
	 * @return the new xyz org
	 */
	public static XyzOrg create(long depId) {
		return getPersistence().create(depId);
	}

	/**
	 * Removes the xyz org with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param depId the primary key of the xyz org
	 * @return the xyz org that was removed
	 * @throws NoSuchXyzOrgException if a xyz org with the primary key could not be found
	 */
	public static XyzOrg remove(long depId)
		throws com.sb2.training.exception.NoSuchXyzOrgException {

		return getPersistence().remove(depId);
	}

	public static XyzOrg updateImpl(XyzOrg xyzOrg) {
		return getPersistence().updateImpl(xyzOrg);
	}

	/**
	 * Returns the xyz org with the primary key or throws a <code>NoSuchXyzOrgException</code> if it could not be found.
	 *
	 * @param depId the primary key of the xyz org
	 * @return the xyz org
	 * @throws NoSuchXyzOrgException if a xyz org with the primary key could not be found
	 */
	public static XyzOrg findByPrimaryKey(long depId)
		throws com.sb2.training.exception.NoSuchXyzOrgException {

		return getPersistence().findByPrimaryKey(depId);
	}

	/**
	 * Returns the xyz org with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param depId the primary key of the xyz org
	 * @return the xyz org, or <code>null</code> if a xyz org with the primary key could not be found
	 */
	public static XyzOrg fetchByPrimaryKey(long depId) {
		return getPersistence().fetchByPrimaryKey(depId);
	}

	/**
	 * Returns all the xyz orgs.
	 *
	 * @return the xyz orgs
	 */
	public static List<XyzOrg> findAll() {
		return getPersistence().findAll();
	}

	/**
	 * Returns a range of all the xyz orgs.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>XyzOrgModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of xyz orgs
	 * @param end the upper bound of the range of xyz orgs (not inclusive)
	 * @return the range of xyz orgs
	 */
	public static List<XyzOrg> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	 * Returns an ordered range of all the xyz orgs.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>XyzOrgModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @deprecated As of Mueller (7.2.x), replaced by {@link #findAll(int, int, OrderByComparator)}
	 * @param start the lower bound of the range of xyz orgs
	 * @param end the upper bound of the range of xyz orgs (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of xyz orgs
	 */
	@Deprecated
	public static List<XyzOrg> findAll(
		int start, int end, OrderByComparator<XyzOrg> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns an ordered range of all the xyz orgs.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>XyzOrgModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of xyz orgs
	 * @param end the upper bound of the range of xyz orgs (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of xyz orgs
	 */
	public static List<XyzOrg> findAll(
		int start, int end, OrderByComparator<XyzOrg> orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	 * Removes all the xyz orgs from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of xyz orgs.
	 *
	 * @return the number of xyz orgs
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static XyzOrgPersistence getPersistence() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<XyzOrgPersistence, XyzOrgPersistence>
		_serviceTracker;

	static {
		Bundle bundle = FrameworkUtil.getBundle(XyzOrgPersistence.class);

		ServiceTracker<XyzOrgPersistence, XyzOrgPersistence> serviceTracker =
			new ServiceTracker<XyzOrgPersistence, XyzOrgPersistence>(
				bundle.getBundleContext(), XyzOrgPersistence.class, null);

		serviceTracker.open();

		_serviceTracker = serviceTracker;
	}

}
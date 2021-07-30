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

package com.training.sb.service.persistence;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import com.training.sb.model.Organization;

import java.io.Serializable;

import java.util.List;
import java.util.Map;
import java.util.Set;

import org.osgi.annotation.versioning.ProviderType;
import org.osgi.framework.Bundle;
import org.osgi.framework.FrameworkUtil;
import org.osgi.util.tracker.ServiceTracker;

/**
 * The persistence utility for the organization service. This utility wraps <code>com.training.sb.service.persistence.impl.OrganizationPersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see OrganizationPersistence
 * @generated
 */
@ProviderType
public class OrganizationUtil {

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
	public static void clearCache(Organization organization) {
		getPersistence().clearCache(organization);
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
	public static Map<Serializable, Organization> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<Organization> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {

		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<Organization> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<Organization> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<Organization> orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static Organization update(Organization organization) {
		return getPersistence().update(organization);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static Organization update(
		Organization organization, ServiceContext serviceContext) {

		return getPersistence().update(organization, serviceContext);
	}

	/**
	 * Caches the organization in the entity cache if it is enabled.
	 *
	 * @param organization the organization
	 */
	public static void cacheResult(Organization organization) {
		getPersistence().cacheResult(organization);
	}

	/**
	 * Caches the organizations in the entity cache if it is enabled.
	 *
	 * @param organizations the organizations
	 */
	public static void cacheResult(List<Organization> organizations) {
		getPersistence().cacheResult(organizations);
	}

	/**
	 * Creates a new organization with the primary key. Does not add the organization to the database.
	 *
	 * @param orgId the primary key for the new organization
	 * @return the new organization
	 */
	public static Organization create(long orgId) {
		return getPersistence().create(orgId);
	}

	/**
	 * Removes the organization with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param orgId the primary key of the organization
	 * @return the organization that was removed
	 * @throws NoSuchOrganizationException if a organization with the primary key could not be found
	 */
	public static Organization remove(long orgId)
		throws com.training.sb.exception.NoSuchOrganizationException {

		return getPersistence().remove(orgId);
	}

	public static Organization updateImpl(Organization organization) {
		return getPersistence().updateImpl(organization);
	}

	/**
	 * Returns the organization with the primary key or throws a <code>NoSuchOrganizationException</code> if it could not be found.
	 *
	 * @param orgId the primary key of the organization
	 * @return the organization
	 * @throws NoSuchOrganizationException if a organization with the primary key could not be found
	 */
	public static Organization findByPrimaryKey(long orgId)
		throws com.training.sb.exception.NoSuchOrganizationException {

		return getPersistence().findByPrimaryKey(orgId);
	}

	/**
	 * Returns the organization with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param orgId the primary key of the organization
	 * @return the organization, or <code>null</code> if a organization with the primary key could not be found
	 */
	public static Organization fetchByPrimaryKey(long orgId) {
		return getPersistence().fetchByPrimaryKey(orgId);
	}

	/**
	 * Returns all the organizations.
	 *
	 * @return the organizations
	 */
	public static List<Organization> findAll() {
		return getPersistence().findAll();
	}

	/**
	 * Returns a range of all the organizations.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>OrganizationModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of organizations
	 * @param end the upper bound of the range of organizations (not inclusive)
	 * @return the range of organizations
	 */
	public static List<Organization> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	 * Returns an ordered range of all the organizations.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>OrganizationModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @deprecated As of Mueller (7.2.x), replaced by {@link #findAll(int, int, OrderByComparator)}
	 * @param start the lower bound of the range of organizations
	 * @param end the upper bound of the range of organizations (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of organizations
	 */
	@Deprecated
	public static List<Organization> findAll(
		int start, int end, OrderByComparator<Organization> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns an ordered range of all the organizations.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>OrganizationModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of organizations
	 * @param end the upper bound of the range of organizations (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of organizations
	 */
	public static List<Organization> findAll(
		int start, int end, OrderByComparator<Organization> orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	 * Removes all the organizations from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of organizations.
	 *
	 * @return the number of organizations
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static OrganizationPersistence getPersistence() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker
		<OrganizationPersistence, OrganizationPersistence> _serviceTracker;

	static {
		Bundle bundle = FrameworkUtil.getBundle(OrganizationPersistence.class);

		ServiceTracker<OrganizationPersistence, OrganizationPersistence>
			serviceTracker =
				new ServiceTracker
					<OrganizationPersistence, OrganizationPersistence>(
						bundle.getBundleContext(),
						OrganizationPersistence.class, null);

		serviceTracker.open();

		_serviceTracker = serviceTracker;
	}

}
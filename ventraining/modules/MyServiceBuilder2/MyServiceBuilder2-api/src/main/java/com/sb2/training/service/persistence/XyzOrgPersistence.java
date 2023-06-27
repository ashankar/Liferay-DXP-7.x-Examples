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

import com.liferay.portal.kernel.service.persistence.BasePersistence;
import com.liferay.portal.kernel.util.OrderByComparator;

import com.sb2.training.exception.NoSuchXyzOrgException;
import com.sb2.training.model.XyzOrg;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the xyz org service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see XyzOrgUtil
 * @generated
 */
@ProviderType
public interface XyzOrgPersistence extends BasePersistence<XyzOrg> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link XyzOrgUtil} to access the xyz org persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns all the xyz orgs where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching xyz orgs
	 */
	public java.util.List<XyzOrg> findByUuid(String uuid);

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
	public java.util.List<XyzOrg> findByUuid(String uuid, int start, int end);

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
	public java.util.List<XyzOrg> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<XyzOrg> orderByComparator, boolean useFinderCache);

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
	public java.util.List<XyzOrg> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<XyzOrg> orderByComparator);

	/**
	 * Returns the first xyz org in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching xyz org
	 * @throws NoSuchXyzOrgException if a matching xyz org could not be found
	 */
	public XyzOrg findByUuid_First(
			String uuid, OrderByComparator<XyzOrg> orderByComparator)
		throws NoSuchXyzOrgException;

	/**
	 * Returns the first xyz org in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching xyz org, or <code>null</code> if a matching xyz org could not be found
	 */
	public XyzOrg fetchByUuid_First(
		String uuid, OrderByComparator<XyzOrg> orderByComparator);

	/**
	 * Returns the last xyz org in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching xyz org
	 * @throws NoSuchXyzOrgException if a matching xyz org could not be found
	 */
	public XyzOrg findByUuid_Last(
			String uuid, OrderByComparator<XyzOrg> orderByComparator)
		throws NoSuchXyzOrgException;

	/**
	 * Returns the last xyz org in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching xyz org, or <code>null</code> if a matching xyz org could not be found
	 */
	public XyzOrg fetchByUuid_Last(
		String uuid, OrderByComparator<XyzOrg> orderByComparator);

	/**
	 * Returns the xyz orgs before and after the current xyz org in the ordered set where uuid = &#63;.
	 *
	 * @param depId the primary key of the current xyz org
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next xyz org
	 * @throws NoSuchXyzOrgException if a xyz org with the primary key could not be found
	 */
	public XyzOrg[] findByUuid_PrevAndNext(
			long depId, String uuid,
			OrderByComparator<XyzOrg> orderByComparator)
		throws NoSuchXyzOrgException;

	/**
	 * Removes all the xyz orgs where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	public void removeByUuid(String uuid);

	/**
	 * Returns the number of xyz orgs where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching xyz orgs
	 */
	public int countByUuid(String uuid);

	/**
	 * Caches the xyz org in the entity cache if it is enabled.
	 *
	 * @param xyzOrg the xyz org
	 */
	public void cacheResult(XyzOrg xyzOrg);

	/**
	 * Caches the xyz orgs in the entity cache if it is enabled.
	 *
	 * @param xyzOrgs the xyz orgs
	 */
	public void cacheResult(java.util.List<XyzOrg> xyzOrgs);

	/**
	 * Creates a new xyz org with the primary key. Does not add the xyz org to the database.
	 *
	 * @param depId the primary key for the new xyz org
	 * @return the new xyz org
	 */
	public XyzOrg create(long depId);

	/**
	 * Removes the xyz org with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param depId the primary key of the xyz org
	 * @return the xyz org that was removed
	 * @throws NoSuchXyzOrgException if a xyz org with the primary key could not be found
	 */
	public XyzOrg remove(long depId) throws NoSuchXyzOrgException;

	public XyzOrg updateImpl(XyzOrg xyzOrg);

	/**
	 * Returns the xyz org with the primary key or throws a <code>NoSuchXyzOrgException</code> if it could not be found.
	 *
	 * @param depId the primary key of the xyz org
	 * @return the xyz org
	 * @throws NoSuchXyzOrgException if a xyz org with the primary key could not be found
	 */
	public XyzOrg findByPrimaryKey(long depId) throws NoSuchXyzOrgException;

	/**
	 * Returns the xyz org with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param depId the primary key of the xyz org
	 * @return the xyz org, or <code>null</code> if a xyz org with the primary key could not be found
	 */
	public XyzOrg fetchByPrimaryKey(long depId);

	/**
	 * Returns all the xyz orgs.
	 *
	 * @return the xyz orgs
	 */
	public java.util.List<XyzOrg> findAll();

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
	public java.util.List<XyzOrg> findAll(int start, int end);

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
	public java.util.List<XyzOrg> findAll(
		int start, int end, OrderByComparator<XyzOrg> orderByComparator,
		boolean useFinderCache);

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
	public java.util.List<XyzOrg> findAll(
		int start, int end, OrderByComparator<XyzOrg> orderByComparator);

	/**
	 * Removes all the xyz orgs from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of xyz orgs.
	 *
	 * @return the number of xyz orgs
	 */
	public int countAll();

}
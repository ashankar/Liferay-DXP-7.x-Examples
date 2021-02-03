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

import com.liferay.portal.kernel.service.persistence.BasePersistence;
import com.liferay.portal.kernel.util.OrderByComparator;

import com.training.mysb.exception.NoSuchCustomUserException;
import com.training.mysb.model.CustomUser;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the custom user service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see CustomUserUtil
 * @generated
 */
@ProviderType
public interface CustomUserPersistence extends BasePersistence<CustomUser> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link CustomUserUtil} to access the custom user persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Caches the custom user in the entity cache if it is enabled.
	 *
	 * @param customUser the custom user
	 */
	public void cacheResult(CustomUser customUser);

	/**
	 * Caches the custom users in the entity cache if it is enabled.
	 *
	 * @param customUsers the custom users
	 */
	public void cacheResult(java.util.List<CustomUser> customUsers);

	/**
	 * Creates a new custom user with the primary key. Does not add the custom user to the database.
	 *
	 * @param id the primary key for the new custom user
	 * @return the new custom user
	 */
	public CustomUser create(long id);

	/**
	 * Removes the custom user with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param id the primary key of the custom user
	 * @return the custom user that was removed
	 * @throws NoSuchCustomUserException if a custom user with the primary key could not be found
	 */
	public CustomUser remove(long id) throws NoSuchCustomUserException;

	public CustomUser updateImpl(CustomUser customUser);

	/**
	 * Returns the custom user with the primary key or throws a <code>NoSuchCustomUserException</code> if it could not be found.
	 *
	 * @param id the primary key of the custom user
	 * @return the custom user
	 * @throws NoSuchCustomUserException if a custom user with the primary key could not be found
	 */
	public CustomUser findByPrimaryKey(long id)
		throws NoSuchCustomUserException;

	/**
	 * Returns the custom user with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param id the primary key of the custom user
	 * @return the custom user, or <code>null</code> if a custom user with the primary key could not be found
	 */
	public CustomUser fetchByPrimaryKey(long id);

	/**
	 * Returns all the custom users.
	 *
	 * @return the custom users
	 */
	public java.util.List<CustomUser> findAll();

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
	public java.util.List<CustomUser> findAll(int start, int end);

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
	public java.util.List<CustomUser> findAll(
		int start, int end, OrderByComparator<CustomUser> orderByComparator,
		boolean useFinderCache);

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
	public java.util.List<CustomUser> findAll(
		int start, int end, OrderByComparator<CustomUser> orderByComparator);

	/**
	 * Removes all the custom users from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of custom users.
	 *
	 * @return the number of custom users
	 */
	public int countAll();

}
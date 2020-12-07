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

import com.sb2.training.exception.NoSuchDoctorException;
import com.sb2.training.model.Doctor;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the doctor service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see DoctorUtil
 * @generated
 */
@ProviderType
public interface DoctorPersistence extends BasePersistence<Doctor> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link DoctorUtil} to access the doctor persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Caches the doctor in the entity cache if it is enabled.
	 *
	 * @param doctor the doctor
	 */
	public void cacheResult(Doctor doctor);

	/**
	 * Caches the doctors in the entity cache if it is enabled.
	 *
	 * @param doctors the doctors
	 */
	public void cacheResult(java.util.List<Doctor> doctors);

	/**
	 * Creates a new doctor with the primary key. Does not add the doctor to the database.
	 *
	 * @param docId the primary key for the new doctor
	 * @return the new doctor
	 */
	public Doctor create(long docId);

	/**
	 * Removes the doctor with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param docId the primary key of the doctor
	 * @return the doctor that was removed
	 * @throws NoSuchDoctorException if a doctor with the primary key could not be found
	 */
	public Doctor remove(long docId) throws NoSuchDoctorException;

	public Doctor updateImpl(Doctor doctor);

	/**
	 * Returns the doctor with the primary key or throws a <code>NoSuchDoctorException</code> if it could not be found.
	 *
	 * @param docId the primary key of the doctor
	 * @return the doctor
	 * @throws NoSuchDoctorException if a doctor with the primary key could not be found
	 */
	public Doctor findByPrimaryKey(long docId) throws NoSuchDoctorException;

	/**
	 * Returns the doctor with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param docId the primary key of the doctor
	 * @return the doctor, or <code>null</code> if a doctor with the primary key could not be found
	 */
	public Doctor fetchByPrimaryKey(long docId);

	/**
	 * Returns all the doctors.
	 *
	 * @return the doctors
	 */
	public java.util.List<Doctor> findAll();

	/**
	 * Returns a range of all the doctors.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>DoctorModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of doctors
	 * @param end the upper bound of the range of doctors (not inclusive)
	 * @return the range of doctors
	 */
	public java.util.List<Doctor> findAll(int start, int end);

	/**
	 * Returns an ordered range of all the doctors.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>DoctorModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @deprecated As of Mueller (7.2.x), replaced by {@link #findAll(int, int, OrderByComparator)}
	 * @param start the lower bound of the range of doctors
	 * @param end the upper bound of the range of doctors (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of doctors
	 */
	@Deprecated
	public java.util.List<Doctor> findAll(
		int start, int end, OrderByComparator<Doctor> orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns an ordered range of all the doctors.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>DoctorModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of doctors
	 * @param end the upper bound of the range of doctors (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of doctors
	 */
	public java.util.List<Doctor> findAll(
		int start, int end, OrderByComparator<Doctor> orderByComparator);

	/**
	 * Removes all the doctors from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of doctors.
	 *
	 * @return the number of doctors
	 */
	public int countAll();

}
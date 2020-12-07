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

package com.sb2.training.service;

import com.liferay.portal.kernel.service.ServiceWrapper;

import org.osgi.annotation.versioning.ProviderType;

/**
 * Provides a wrapper for {@link DoctorLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see DoctorLocalService
 * @generated
 */
@ProviderType
public class DoctorLocalServiceWrapper
	implements DoctorLocalService, ServiceWrapper<DoctorLocalService> {

	public DoctorLocalServiceWrapper(DoctorLocalService doctorLocalService) {
		_doctorLocalService = doctorLocalService;
	}

	/**
	 * Adds the doctor to the database. Also notifies the appropriate model listeners.
	 *
	 * @param doctor the doctor
	 * @return the doctor that was added
	 */
	@Override
	public com.sb2.training.model.Doctor addDoctor(
		com.sb2.training.model.Doctor doctor) {

		return _doctorLocalService.addDoctor(doctor);
	}

	/**
	 * Creates a new doctor with the primary key. Does not add the doctor to the database.
	 *
	 * @param docId the primary key for the new doctor
	 * @return the new doctor
	 */
	@Override
	public com.sb2.training.model.Doctor createDoctor(long docId) {
		return _doctorLocalService.createDoctor(docId);
	}

	/**
	 * Deletes the doctor from the database. Also notifies the appropriate model listeners.
	 *
	 * @param doctor the doctor
	 * @return the doctor that was removed
	 */
	@Override
	public com.sb2.training.model.Doctor deleteDoctor(
		com.sb2.training.model.Doctor doctor) {

		return _doctorLocalService.deleteDoctor(doctor);
	}

	/**
	 * Deletes the doctor with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param docId the primary key of the doctor
	 * @return the doctor that was removed
	 * @throws PortalException if a doctor with the primary key could not be found
	 */
	@Override
	public com.sb2.training.model.Doctor deleteDoctor(long docId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _doctorLocalService.deleteDoctor(docId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _doctorLocalService.deletePersistedModel(persistedModel);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _doctorLocalService.dynamicQuery();
	}

	/**
	 * Performs a dynamic query on the database and returns the matching rows.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the matching rows
	 */
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {

		return _doctorLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>com.sb2.training.model.impl.DoctorModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param dynamicQuery the dynamic query
	 * @param start the lower bound of the range of model instances
	 * @param end the upper bound of the range of model instances (not inclusive)
	 * @return the range of matching rows
	 */
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) {

		return _doctorLocalService.dynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>com.sb2.training.model.impl.DoctorModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param dynamicQuery the dynamic query
	 * @param start the lower bound of the range of model instances
	 * @param end the upper bound of the range of model instances (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching rows
	 */
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<T> orderByComparator) {

		return _doctorLocalService.dynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * Returns the number of rows matching the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the number of rows matching the dynamic query
	 */
	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {

		return _doctorLocalService.dynamicQueryCount(dynamicQuery);
	}

	/**
	 * Returns the number of rows matching the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @param projection the projection to apply to the query
	 * @return the number of rows matching the dynamic query
	 */
	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery,
		com.liferay.portal.kernel.dao.orm.Projection projection) {

		return _doctorLocalService.dynamicQueryCount(dynamicQuery, projection);
	}

	@Override
	public com.sb2.training.model.Doctor fetchDoctor(long docId) {
		return _doctorLocalService.fetchDoctor(docId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _doctorLocalService.getActionableDynamicQuery();
	}

	/**
	 * Returns the doctor with the primary key.
	 *
	 * @param docId the primary key of the doctor
	 * @return the doctor
	 * @throws PortalException if a doctor with the primary key could not be found
	 */
	@Override
	public com.sb2.training.model.Doctor getDoctor(long docId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _doctorLocalService.getDoctor(docId);
	}

	/**
	 * Returns a range of all the doctors.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>com.sb2.training.model.impl.DoctorModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of doctors
	 * @param end the upper bound of the range of doctors (not inclusive)
	 * @return the range of doctors
	 */
	@Override
	public java.util.List<com.sb2.training.model.Doctor> getDoctors(
		int start, int end) {

		return _doctorLocalService.getDoctors(start, end);
	}

	/**
	 * Returns the number of doctors.
	 *
	 * @return the number of doctors
	 */
	@Override
	public int getDoctorsCount() {
		return _doctorLocalService.getDoctorsCount();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _doctorLocalService.getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _doctorLocalService.getOSGiServiceIdentifier();
	}

	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _doctorLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	 * Updates the doctor in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * @param doctor the doctor
	 * @return the doctor that was updated
	 */
	@Override
	public com.sb2.training.model.Doctor updateDoctor(
		com.sb2.training.model.Doctor doctor) {

		return _doctorLocalService.updateDoctor(doctor);
	}

	@Override
	public DoctorLocalService getWrappedService() {
		return _doctorLocalService;
	}

	@Override
	public void setWrappedService(DoctorLocalService doctorLocalService) {
		_doctorLocalService = doctorLocalService;
	}

	private DoctorLocalService _doctorLocalService;

}
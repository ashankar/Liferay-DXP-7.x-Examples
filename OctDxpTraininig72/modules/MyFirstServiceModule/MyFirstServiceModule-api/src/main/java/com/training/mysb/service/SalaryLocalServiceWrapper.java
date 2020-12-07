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
 * Provides a wrapper for {@link SalaryLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see SalaryLocalService
 * @generated
 */
@ProviderType
public class SalaryLocalServiceWrapper
	implements SalaryLocalService, ServiceWrapper<SalaryLocalService> {

	public SalaryLocalServiceWrapper(SalaryLocalService salaryLocalService) {
		_salaryLocalService = salaryLocalService;
	}

	/**
	 * Adds the salary to the database. Also notifies the appropriate model listeners.
	 *
	 * @param salary the salary
	 * @return the salary that was added
	 */
	@Override
	public com.training.mysb.model.Salary addSalary(
		com.training.mysb.model.Salary salary) {

		return _salaryLocalService.addSalary(salary);
	}

	/**
	 * Creates a new salary with the primary key. Does not add the salary to the database.
	 *
	 * @param salId the primary key for the new salary
	 * @return the new salary
	 */
	@Override
	public com.training.mysb.model.Salary createSalary(long salId) {
		return _salaryLocalService.createSalary(salId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _salaryLocalService.deletePersistedModel(persistedModel);
	}

	/**
	 * Deletes the salary with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param salId the primary key of the salary
	 * @return the salary that was removed
	 * @throws PortalException if a salary with the primary key could not be found
	 */
	@Override
	public com.training.mysb.model.Salary deleteSalary(long salId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _salaryLocalService.deleteSalary(salId);
	}

	/**
	 * Deletes the salary from the database. Also notifies the appropriate model listeners.
	 *
	 * @param salary the salary
	 * @return the salary that was removed
	 */
	@Override
	public com.training.mysb.model.Salary deleteSalary(
		com.training.mysb.model.Salary salary) {

		return _salaryLocalService.deleteSalary(salary);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _salaryLocalService.dynamicQuery();
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

		return _salaryLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>com.training.mysb.model.impl.SalaryModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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

		return _salaryLocalService.dynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>com.training.mysb.model.impl.SalaryModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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

		return _salaryLocalService.dynamicQuery(
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

		return _salaryLocalService.dynamicQueryCount(dynamicQuery);
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

		return _salaryLocalService.dynamicQueryCount(dynamicQuery, projection);
	}

	@Override
	public com.training.mysb.model.Salary fetchSalary(long salId) {
		return _salaryLocalService.fetchSalary(salId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _salaryLocalService.getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _salaryLocalService.getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _salaryLocalService.getOSGiServiceIdentifier();
	}

	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _salaryLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	 * Returns a range of all the salaries.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>com.training.mysb.model.impl.SalaryModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of salaries
	 * @param end the upper bound of the range of salaries (not inclusive)
	 * @return the range of salaries
	 */
	@Override
	public java.util.List<com.training.mysb.model.Salary> getSalaries(
		int start, int end) {

		return _salaryLocalService.getSalaries(start, end);
	}

	/**
	 * Returns the number of salaries.
	 *
	 * @return the number of salaries
	 */
	@Override
	public int getSalariesCount() {
		return _salaryLocalService.getSalariesCount();
	}

	/**
	 * Returns the salary with the primary key.
	 *
	 * @param salId the primary key of the salary
	 * @return the salary
	 * @throws PortalException if a salary with the primary key could not be found
	 */
	@Override
	public com.training.mysb.model.Salary getSalary(long salId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _salaryLocalService.getSalary(salId);
	}

	/**
	 * Updates the salary in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * @param salary the salary
	 * @return the salary that was updated
	 */
	@Override
	public com.training.mysb.model.Salary updateSalary(
		com.training.mysb.model.Salary salary) {

		return _salaryLocalService.updateSalary(salary);
	}

	@Override
	public SalaryLocalService getWrappedService() {
		return _salaryLocalService;
	}

	@Override
	public void setWrappedService(SalaryLocalService salaryLocalService) {
		_salaryLocalService = salaryLocalService;
	}

	private SalaryLocalService _salaryLocalService;

}
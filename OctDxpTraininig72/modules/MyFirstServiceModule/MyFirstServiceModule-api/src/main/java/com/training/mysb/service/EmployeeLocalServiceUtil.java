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
 * Provides the local service utility for Employee. This utility wraps
 * <code>com.training.mysb.service.impl.EmployeeLocalServiceImpl</code> and
 * is an access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author Brian Wing Shun Chan
 * @see EmployeeLocalService
 * @generated
 */
@ProviderType
public class EmployeeLocalServiceUtil {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to <code>com.training.mysb.service.impl.EmployeeLocalServiceImpl</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * Adds the employee to the database. Also notifies the appropriate model listeners.
	 *
	 * @param employee the employee
	 * @return the employee that was added
	 */
	public static com.training.mysb.model.Employee addEmployee(
		com.training.mysb.model.Employee employee) {

		return getService().addEmployee(employee);
	}

	public static void addNewEmployee(
		com.training.mysb.model.Employee employee) {

		getService().addNewEmployee(employee);
	}

	/**
	 * Creates a new employee with the primary key. Does not add the employee to the database.
	 *
	 * @param employeeId the primary key for the new employee
	 * @return the new employee
	 */
	public static com.training.mysb.model.Employee createEmployee(
		long employeeId) {

		return getService().createEmployee(employeeId);
	}

	/**
	 * Deletes the employee from the database. Also notifies the appropriate model listeners.
	 *
	 * @param employee the employee
	 * @return the employee that was removed
	 */
	public static com.training.mysb.model.Employee deleteEmployee(
		com.training.mysb.model.Employee employee) {

		return getService().deleteEmployee(employee);
	}

	/**
	 * Deletes the employee with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param employeeId the primary key of the employee
	 * @return the employee that was removed
	 * @throws PortalException if a employee with the primary key could not be found
	 */
	public static com.training.mysb.model.Employee deleteEmployee(
			long employeeId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return getService().deleteEmployee(employeeId);
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
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>com.training.mysb.model.impl.EmployeeModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>com.training.mysb.model.impl.EmployeeModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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

	public static com.training.mysb.model.Employee fetchEmployee(
		long employeeId) {

		return getService().fetchEmployee(employeeId);
	}

	public static com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return getService().getActionableDynamicQuery();
	}

	/**
	 * Returns the employee with the primary key.
	 *
	 * @param employeeId the primary key of the employee
	 * @return the employee
	 * @throws PortalException if a employee with the primary key could not be found
	 */
	public static com.training.mysb.model.Employee getEmployee(long employeeId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return getService().getEmployee(employeeId);
	}

	public static java.util.List<com.training.mysb.model.Employee>
		getEmployeeByName(String empName) {

		return getService().getEmployeeByName(empName);
	}

	public static com.training.mysb.model.Employee getEmployeeModel() {
		return getService().getEmployeeModel();
	}

	/**
	 * Returns a range of all the employees.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>com.training.mysb.model.impl.EmployeeModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of employees
	 * @param end the upper bound of the range of employees (not inclusive)
	 * @return the range of employees
	 */
	public static java.util.List<com.training.mysb.model.Employee> getEmployees(
		int start, int end) {

		return getService().getEmployees(start, end);
	}

	/**
	 * Returns the number of employees.
	 *
	 * @return the number of employees
	 */
	public static int getEmployeesCount() {
		return getService().getEmployeesCount();
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

	public static java.util.List<com.training.mysb.model.Employee>
		getResultFromCustomSQLQuery(String empName) {

		return getService().getResultFromCustomSQLQuery(empName);
	}

	public static java.util.List<com.training.mysb.model.Employee>
		getResultFromDynamicQuery(
			String colName1, int searchValue1, String colName2,
			long searchValue2) {

		return getService().getResultFromDynamicQuery(
			colName1, searchValue1, colName2, searchValue2);
	}

	public static boolean isEmployeeAvailable(String empName) {
		return getService().isEmployeeAvailable(empName);
	}

	/**
	 * Updates the employee in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * @param employee the employee
	 * @return the employee that was updated
	 */
	public static com.training.mysb.model.Employee updateEmployee(
		com.training.mysb.model.Employee employee) {

		return getService().updateEmployee(employee);
	}

	public static EmployeeLocalService getService() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<EmployeeLocalService, EmployeeLocalService>
		_serviceTracker;

	static {
		Bundle bundle = FrameworkUtil.getBundle(EmployeeLocalService.class);

		ServiceTracker<EmployeeLocalService, EmployeeLocalService>
			serviceTracker =
				new ServiceTracker<EmployeeLocalService, EmployeeLocalService>(
					bundle.getBundleContext(), EmployeeLocalService.class,
					null);

		serviceTracker.open();

		_serviceTracker = serviceTracker;
	}

}
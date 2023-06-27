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
 * Provides a wrapper for {@link XyzOrgLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see XyzOrgLocalService
 * @generated
 */
@ProviderType
public class XyzOrgLocalServiceWrapper
	implements XyzOrgLocalService, ServiceWrapper<XyzOrgLocalService> {

	public XyzOrgLocalServiceWrapper(XyzOrgLocalService xyzOrgLocalService) {
		_xyzOrgLocalService = xyzOrgLocalService;
	}

	/**
	 * Adds the xyz org to the database. Also notifies the appropriate model listeners.
	 *
	 * @param xyzOrg the xyz org
	 * @return the xyz org that was added
	 */
	@Override
	public com.sb2.training.model.XyzOrg addXyzOrg(
		com.sb2.training.model.XyzOrg xyzOrg) {

		return _xyzOrgLocalService.addXyzOrg(xyzOrg);
	}

	/**
	 * Creates a new xyz org with the primary key. Does not add the xyz org to the database.
	 *
	 * @param depId the primary key for the new xyz org
	 * @return the new xyz org
	 */
	@Override
	public com.sb2.training.model.XyzOrg createXyzOrg(long depId) {
		return _xyzOrgLocalService.createXyzOrg(depId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _xyzOrgLocalService.deletePersistedModel(persistedModel);
	}

	/**
	 * Deletes the xyz org with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param depId the primary key of the xyz org
	 * @return the xyz org that was removed
	 * @throws PortalException if a xyz org with the primary key could not be found
	 */
	@Override
	public com.sb2.training.model.XyzOrg deleteXyzOrg(long depId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _xyzOrgLocalService.deleteXyzOrg(depId);
	}

	/**
	 * Deletes the xyz org from the database. Also notifies the appropriate model listeners.
	 *
	 * @param xyzOrg the xyz org
	 * @return the xyz org that was removed
	 */
	@Override
	public com.sb2.training.model.XyzOrg deleteXyzOrg(
		com.sb2.training.model.XyzOrg xyzOrg) {

		return _xyzOrgLocalService.deleteXyzOrg(xyzOrg);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _xyzOrgLocalService.dynamicQuery();
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

		return _xyzOrgLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>com.sb2.training.model.impl.XyzOrgModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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

		return _xyzOrgLocalService.dynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>com.sb2.training.model.impl.XyzOrgModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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

		return _xyzOrgLocalService.dynamicQuery(
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

		return _xyzOrgLocalService.dynamicQueryCount(dynamicQuery);
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

		return _xyzOrgLocalService.dynamicQueryCount(dynamicQuery, projection);
	}

	@Override
	public com.sb2.training.model.XyzOrg fetchXyzOrg(long depId) {
		return _xyzOrgLocalService.fetchXyzOrg(depId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _xyzOrgLocalService.getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _xyzOrgLocalService.getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _xyzOrgLocalService.getOSGiServiceIdentifier();
	}

	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _xyzOrgLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	 * Returns the xyz org with the primary key.
	 *
	 * @param depId the primary key of the xyz org
	 * @return the xyz org
	 * @throws PortalException if a xyz org with the primary key could not be found
	 */
	@Override
	public com.sb2.training.model.XyzOrg getXyzOrg(long depId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _xyzOrgLocalService.getXyzOrg(depId);
	}

	/**
	 * Returns a range of all the xyz orgs.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>com.sb2.training.model.impl.XyzOrgModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of xyz orgs
	 * @param end the upper bound of the range of xyz orgs (not inclusive)
	 * @return the range of xyz orgs
	 */
	@Override
	public java.util.List<com.sb2.training.model.XyzOrg> getXyzOrgs(
		int start, int end) {

		return _xyzOrgLocalService.getXyzOrgs(start, end);
	}

	/**
	 * Returns the number of xyz orgs.
	 *
	 * @return the number of xyz orgs
	 */
	@Override
	public int getXyzOrgsCount() {
		return _xyzOrgLocalService.getXyzOrgsCount();
	}

	/**
	 * Updates the xyz org in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * @param xyzOrg the xyz org
	 * @return the xyz org that was updated
	 */
	@Override
	public com.sb2.training.model.XyzOrg updateXyzOrg(
		com.sb2.training.model.XyzOrg xyzOrg) {

		return _xyzOrgLocalService.updateXyzOrg(xyzOrg);
	}

	@Override
	public XyzOrgLocalService getWrappedService() {
		return _xyzOrgLocalService;
	}

	@Override
	public void setWrappedService(XyzOrgLocalService xyzOrgLocalService) {
		_xyzOrgLocalService = xyzOrgLocalService;
	}

	private XyzOrgLocalService _xyzOrgLocalService;

}
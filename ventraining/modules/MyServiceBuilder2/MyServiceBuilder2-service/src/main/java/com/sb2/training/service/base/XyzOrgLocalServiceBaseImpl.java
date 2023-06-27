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

package com.sb2.training.service.base;

import com.liferay.portal.aop.AopService;
import com.liferay.portal.kernel.dao.db.DB;
import com.liferay.portal.kernel.dao.db.DBManagerUtil;
import com.liferay.portal.kernel.dao.jdbc.SqlUpdate;
import com.liferay.portal.kernel.dao.jdbc.SqlUpdateFactoryUtil;
import com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery;
import com.liferay.portal.kernel.dao.orm.DefaultActionableDynamicQuery;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.dao.orm.DynamicQueryFactoryUtil;
import com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery;
import com.liferay.portal.kernel.dao.orm.Projection;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.model.PersistedModel;
import com.liferay.portal.kernel.module.framework.service.IdentifiableOSGiService;
import com.liferay.portal.kernel.search.Indexable;
import com.liferay.portal.kernel.search.IndexableType;
import com.liferay.portal.kernel.service.BaseLocalServiceImpl;
import com.liferay.portal.kernel.service.PersistedModelLocalService;
import com.liferay.portal.kernel.transaction.Transactional;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.PortalUtil;

import com.sb2.training.model.XyzOrg;
import com.sb2.training.service.XyzOrgLocalService;
import com.sb2.training.service.persistence.EmployeePersistence;
import com.sb2.training.service.persistence.XyzOrgPersistence;

import java.io.Serializable;

import java.util.List;

import javax.sql.DataSource;

import org.osgi.annotation.versioning.ProviderType;
import org.osgi.service.component.annotations.Reference;

/**
 * Provides the base implementation for the xyz org local service.
 *
 * <p>
 * This implementation exists only as a container for the default service methods generated by ServiceBuilder. All custom service methods should be put in {@link com.sb2.training.service.impl.XyzOrgLocalServiceImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see com.sb2.training.service.impl.XyzOrgLocalServiceImpl
 * @generated
 */
@ProviderType
public abstract class XyzOrgLocalServiceBaseImpl
	extends BaseLocalServiceImpl
	implements XyzOrgLocalService, AopService, IdentifiableOSGiService {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Use <code>XyzOrgLocalService</code> via injection or a <code>org.osgi.util.tracker.ServiceTracker</code> or use <code>com.sb2.training.service.XyzOrgLocalServiceUtil</code>.
	 */

	/**
	 * Adds the xyz org to the database. Also notifies the appropriate model listeners.
	 *
	 * @param xyzOrg the xyz org
	 * @return the xyz org that was added
	 */
	@Indexable(type = IndexableType.REINDEX)
	@Override
	public XyzOrg addXyzOrg(XyzOrg xyzOrg) {
		xyzOrg.setNew(true);

		return xyzOrgPersistence.update(xyzOrg);
	}

	/**
	 * Creates a new xyz org with the primary key. Does not add the xyz org to the database.
	 *
	 * @param depId the primary key for the new xyz org
	 * @return the new xyz org
	 */
	@Override
	@Transactional(enabled = false)
	public XyzOrg createXyzOrg(long depId) {
		return xyzOrgPersistence.create(depId);
	}

	/**
	 * Deletes the xyz org with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param depId the primary key of the xyz org
	 * @return the xyz org that was removed
	 * @throws PortalException if a xyz org with the primary key could not be found
	 */
	@Indexable(type = IndexableType.DELETE)
	@Override
	public XyzOrg deleteXyzOrg(long depId) throws PortalException {
		return xyzOrgPersistence.remove(depId);
	}

	/**
	 * Deletes the xyz org from the database. Also notifies the appropriate model listeners.
	 *
	 * @param xyzOrg the xyz org
	 * @return the xyz org that was removed
	 */
	@Indexable(type = IndexableType.DELETE)
	@Override
	public XyzOrg deleteXyzOrg(XyzOrg xyzOrg) {
		return xyzOrgPersistence.remove(xyzOrg);
	}

	@Override
	public DynamicQuery dynamicQuery() {
		Class<?> clazz = getClass();

		return DynamicQueryFactoryUtil.forClass(
			XyzOrg.class, clazz.getClassLoader());
	}

	/**
	 * Performs a dynamic query on the database and returns the matching rows.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the matching rows
	 */
	@Override
	public <T> List<T> dynamicQuery(DynamicQuery dynamicQuery) {
		return xyzOrgPersistence.findWithDynamicQuery(dynamicQuery);
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
	public <T> List<T> dynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return xyzOrgPersistence.findWithDynamicQuery(dynamicQuery, start, end);
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
	public <T> List<T> dynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<T> orderByComparator) {

		return xyzOrgPersistence.findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * Returns the number of rows matching the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the number of rows matching the dynamic query
	 */
	@Override
	public long dynamicQueryCount(DynamicQuery dynamicQuery) {
		return xyzOrgPersistence.countWithDynamicQuery(dynamicQuery);
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
		DynamicQuery dynamicQuery, Projection projection) {

		return xyzOrgPersistence.countWithDynamicQuery(
			dynamicQuery, projection);
	}

	@Override
	public XyzOrg fetchXyzOrg(long depId) {
		return xyzOrgPersistence.fetchByPrimaryKey(depId);
	}

	/**
	 * Returns the xyz org with the primary key.
	 *
	 * @param depId the primary key of the xyz org
	 * @return the xyz org
	 * @throws PortalException if a xyz org with the primary key could not be found
	 */
	@Override
	public XyzOrg getXyzOrg(long depId) throws PortalException {
		return xyzOrgPersistence.findByPrimaryKey(depId);
	}

	@Override
	public ActionableDynamicQuery getActionableDynamicQuery() {
		ActionableDynamicQuery actionableDynamicQuery =
			new DefaultActionableDynamicQuery();

		actionableDynamicQuery.setBaseLocalService(xyzOrgLocalService);
		actionableDynamicQuery.setClassLoader(getClassLoader());
		actionableDynamicQuery.setModelClass(XyzOrg.class);

		actionableDynamicQuery.setPrimaryKeyPropertyName("depId");

		return actionableDynamicQuery;
	}

	@Override
	public IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		IndexableActionableDynamicQuery indexableActionableDynamicQuery =
			new IndexableActionableDynamicQuery();

		indexableActionableDynamicQuery.setBaseLocalService(xyzOrgLocalService);
		indexableActionableDynamicQuery.setClassLoader(getClassLoader());
		indexableActionableDynamicQuery.setModelClass(XyzOrg.class);

		indexableActionableDynamicQuery.setPrimaryKeyPropertyName("depId");

		return indexableActionableDynamicQuery;
	}

	protected void initActionableDynamicQuery(
		ActionableDynamicQuery actionableDynamicQuery) {

		actionableDynamicQuery.setBaseLocalService(xyzOrgLocalService);
		actionableDynamicQuery.setClassLoader(getClassLoader());
		actionableDynamicQuery.setModelClass(XyzOrg.class);

		actionableDynamicQuery.setPrimaryKeyPropertyName("depId");
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public PersistedModel deletePersistedModel(PersistedModel persistedModel)
		throws PortalException {

		return xyzOrgLocalService.deleteXyzOrg((XyzOrg)persistedModel);
	}

	@Override
	public PersistedModel getPersistedModel(Serializable primaryKeyObj)
		throws PortalException {

		return xyzOrgPersistence.findByPrimaryKey(primaryKeyObj);
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
	public List<XyzOrg> getXyzOrgs(int start, int end) {
		return xyzOrgPersistence.findAll(start, end);
	}

	/**
	 * Returns the number of xyz orgs.
	 *
	 * @return the number of xyz orgs
	 */
	@Override
	public int getXyzOrgsCount() {
		return xyzOrgPersistence.countAll();
	}

	/**
	 * Updates the xyz org in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * @param xyzOrg the xyz org
	 * @return the xyz org that was updated
	 */
	@Indexable(type = IndexableType.REINDEX)
	@Override
	public XyzOrg updateXyzOrg(XyzOrg xyzOrg) {
		return xyzOrgPersistence.update(xyzOrg);
	}

	@Override
	public Class<?>[] getAopInterfaces() {
		return new Class<?>[] {
			XyzOrgLocalService.class, IdentifiableOSGiService.class,
			PersistedModelLocalService.class
		};
	}

	@Override
	public void setAopProxy(Object aopProxy) {
		xyzOrgLocalService = (XyzOrgLocalService)aopProxy;
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return XyzOrgLocalService.class.getName();
	}

	protected Class<?> getModelClass() {
		return XyzOrg.class;
	}

	protected String getModelClassName() {
		return XyzOrg.class.getName();
	}

	/**
	 * Performs a SQL query.
	 *
	 * @param sql the sql query
	 */
	protected void runSQL(String sql) {
		try {
			DataSource dataSource = xyzOrgPersistence.getDataSource();

			DB db = DBManagerUtil.getDB();

			sql = db.buildSQL(sql);
			sql = PortalUtil.transformSQL(sql);

			SqlUpdate sqlUpdate = SqlUpdateFactoryUtil.getSqlUpdate(
				dataSource, sql);

			sqlUpdate.update();
		}
		catch (Exception e) {
			throw new SystemException(e);
		}
	}

	@Reference
	protected EmployeePersistence employeePersistence;

	protected XyzOrgLocalService xyzOrgLocalService;

	@Reference
	protected XyzOrgPersistence xyzOrgPersistence;

	@Reference
	protected com.liferay.counter.kernel.service.CounterLocalService
		counterLocalService;

	@Reference
	protected com.liferay.portal.kernel.service.ClassNameLocalService
		classNameLocalService;

	@Reference
	protected com.liferay.portal.kernel.service.ResourceLocalService
		resourceLocalService;

	@Reference
	protected com.liferay.portal.kernel.service.UserLocalService
		userLocalService;

}
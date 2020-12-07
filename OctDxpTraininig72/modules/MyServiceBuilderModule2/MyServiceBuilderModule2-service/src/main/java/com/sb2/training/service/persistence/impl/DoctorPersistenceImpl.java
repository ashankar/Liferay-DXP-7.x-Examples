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

package com.sb2.training.service.persistence.impl;

import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.configuration.Configuration;
import com.liferay.portal.kernel.dao.orm.EntityCache;
import com.liferay.portal.kernel.dao.orm.FinderCache;
import com.liferay.portal.kernel.dao.orm.FinderPath;
import com.liferay.portal.kernel.dao.orm.Query;
import com.liferay.portal.kernel.dao.orm.QueryUtil;
import com.liferay.portal.kernel.dao.orm.Session;
import com.liferay.portal.kernel.dao.orm.SessionFactory;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.service.persistence.impl.BasePersistenceImpl;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.OrderByComparator;

import com.sb2.training.exception.NoSuchDoctorException;
import com.sb2.training.model.Doctor;
import com.sb2.training.model.impl.DoctorImpl;
import com.sb2.training.model.impl.DoctorModelImpl;
import com.sb2.training.service.persistence.DoctorPersistence;
import com.sb2.training.service.persistence.impl.constants.mysbnsPersistenceConstants;

import java.io.Serializable;

import java.util.Collections;
import java.util.List;
import java.util.Map;

import javax.sql.DataSource;

import org.osgi.annotation.versioning.ProviderType;
import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Deactivate;
import org.osgi.service.component.annotations.Reference;

/**
 * The persistence implementation for the doctor service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@Component(service = DoctorPersistence.class)
@ProviderType
public class DoctorPersistenceImpl
	extends BasePersistenceImpl<Doctor> implements DoctorPersistence {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use <code>DoctorUtil</code> to access the doctor persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY =
		DoctorImpl.class.getName();

	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List1";

	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List2";

	private FinderPath _finderPathWithPaginationFindAll;
	private FinderPath _finderPathWithoutPaginationFindAll;
	private FinderPath _finderPathCountAll;

	public DoctorPersistenceImpl() {
		setModelClass(Doctor.class);

		setModelImplClass(DoctorImpl.class);
		setModelPKClass(long.class);
	}

	/**
	 * Caches the doctor in the entity cache if it is enabled.
	 *
	 * @param doctor the doctor
	 */
	@Override
	public void cacheResult(Doctor doctor) {
		entityCache.putResult(
			entityCacheEnabled, DoctorImpl.class, doctor.getPrimaryKey(),
			doctor);

		doctor.resetOriginalValues();
	}

	/**
	 * Caches the doctors in the entity cache if it is enabled.
	 *
	 * @param doctors the doctors
	 */
	@Override
	public void cacheResult(List<Doctor> doctors) {
		for (Doctor doctor : doctors) {
			if (entityCache.getResult(
					entityCacheEnabled, DoctorImpl.class,
					doctor.getPrimaryKey()) == null) {

				cacheResult(doctor);
			}
			else {
				doctor.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all doctors.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(DoctorImpl.class);

		finderCache.clearCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the doctor.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(Doctor doctor) {
		entityCache.removeResult(
			entityCacheEnabled, DoctorImpl.class, doctor.getPrimaryKey());

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<Doctor> doctors) {
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (Doctor doctor : doctors) {
			entityCache.removeResult(
				entityCacheEnabled, DoctorImpl.class, doctor.getPrimaryKey());
		}
	}

	/**
	 * Creates a new doctor with the primary key. Does not add the doctor to the database.
	 *
	 * @param docId the primary key for the new doctor
	 * @return the new doctor
	 */
	@Override
	public Doctor create(long docId) {
		Doctor doctor = new DoctorImpl();

		doctor.setNew(true);
		doctor.setPrimaryKey(docId);

		return doctor;
	}

	/**
	 * Removes the doctor with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param docId the primary key of the doctor
	 * @return the doctor that was removed
	 * @throws NoSuchDoctorException if a doctor with the primary key could not be found
	 */
	@Override
	public Doctor remove(long docId) throws NoSuchDoctorException {
		return remove((Serializable)docId);
	}

	/**
	 * Removes the doctor with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the doctor
	 * @return the doctor that was removed
	 * @throws NoSuchDoctorException if a doctor with the primary key could not be found
	 */
	@Override
	public Doctor remove(Serializable primaryKey) throws NoSuchDoctorException {
		Session session = null;

		try {
			session = openSession();

			Doctor doctor = (Doctor)session.get(DoctorImpl.class, primaryKey);

			if (doctor == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchDoctorException(
					_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			return remove(doctor);
		}
		catch (NoSuchDoctorException nsee) {
			throw nsee;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	@Override
	protected Doctor removeImpl(Doctor doctor) {
		Session session = null;

		try {
			session = openSession();

			if (!session.contains(doctor)) {
				doctor = (Doctor)session.get(
					DoctorImpl.class, doctor.getPrimaryKeyObj());
			}

			if (doctor != null) {
				session.delete(doctor);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (doctor != null) {
			clearCache(doctor);
		}

		return doctor;
	}

	@Override
	public Doctor updateImpl(Doctor doctor) {
		boolean isNew = doctor.isNew();

		Session session = null;

		try {
			session = openSession();

			if (doctor.isNew()) {
				session.save(doctor);

				doctor.setNew(false);
			}
			else {
				doctor = (Doctor)session.merge(doctor);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (isNew) {
			finderCache.removeResult(_finderPathCountAll, FINDER_ARGS_EMPTY);
			finderCache.removeResult(
				_finderPathWithoutPaginationFindAll, FINDER_ARGS_EMPTY);
		}

		entityCache.putResult(
			entityCacheEnabled, DoctorImpl.class, doctor.getPrimaryKey(),
			doctor, false);

		doctor.resetOriginalValues();

		return doctor;
	}

	/**
	 * Returns the doctor with the primary key or throws a <code>com.liferay.portal.kernel.exception.NoSuchModelException</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the doctor
	 * @return the doctor
	 * @throws NoSuchDoctorException if a doctor with the primary key could not be found
	 */
	@Override
	public Doctor findByPrimaryKey(Serializable primaryKey)
		throws NoSuchDoctorException {

		Doctor doctor = fetchByPrimaryKey(primaryKey);

		if (doctor == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchDoctorException(
				_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
		}

		return doctor;
	}

	/**
	 * Returns the doctor with the primary key or throws a <code>NoSuchDoctorException</code> if it could not be found.
	 *
	 * @param docId the primary key of the doctor
	 * @return the doctor
	 * @throws NoSuchDoctorException if a doctor with the primary key could not be found
	 */
	@Override
	public Doctor findByPrimaryKey(long docId) throws NoSuchDoctorException {
		return findByPrimaryKey((Serializable)docId);
	}

	/**
	 * Returns the doctor with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param docId the primary key of the doctor
	 * @return the doctor, or <code>null</code> if a doctor with the primary key could not be found
	 */
	@Override
	public Doctor fetchByPrimaryKey(long docId) {
		return fetchByPrimaryKey((Serializable)docId);
	}

	/**
	 * Returns all the doctors.
	 *
	 * @return the doctors
	 */
	@Override
	public List<Doctor> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

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
	@Override
	public List<Doctor> findAll(int start, int end) {
		return findAll(start, end, null);
	}

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
	@Override
	public List<Doctor> findAll(
		int start, int end, OrderByComparator<Doctor> orderByComparator,
		boolean useFinderCache) {

		return findAll(start, end, orderByComparator);
	}

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
	@Override
	public List<Doctor> findAll(
		int start, int end, OrderByComparator<Doctor> orderByComparator) {

		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
			(orderByComparator == null)) {

			pagination = false;
			finderPath = _finderPathWithoutPaginationFindAll;
			finderArgs = FINDER_ARGS_EMPTY;
		}
		else {
			finderPath = _finderPathWithPaginationFindAll;
			finderArgs = new Object[] {start, end, orderByComparator};
		}

		List<Doctor> list = (List<Doctor>)finderCache.getResult(
			finderPath, finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(
					2 + (orderByComparator.getOrderByFields().length * 2));

				query.append(_SQL_SELECT_DOCTOR);

				appendOrderByComparator(
					query, _ORDER_BY_ENTITY_ALIAS, orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_DOCTOR;

				if (pagination) {
					sql = sql.concat(DoctorModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<Doctor>)QueryUtil.list(
						q, getDialect(), start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<Doctor>)QueryUtil.list(
						q, getDialect(), start, end);
				}

				cacheResult(list);

				finderCache.putResult(finderPath, finderArgs, list);
			}
			catch (Exception e) {
				finderCache.removeResult(finderPath, finderArgs);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return list;
	}

	/**
	 * Removes all the doctors from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (Doctor doctor : findAll()) {
			remove(doctor);
		}
	}

	/**
	 * Returns the number of doctors.
	 *
	 * @return the number of doctors
	 */
	@Override
	public int countAll() {
		Long count = (Long)finderCache.getResult(
			_finderPathCountAll, FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(_SQL_COUNT_DOCTOR);

				count = (Long)q.uniqueResult();

				finderCache.putResult(
					_finderPathCountAll, FINDER_ARGS_EMPTY, count);
			}
			catch (Exception e) {
				finderCache.removeResult(
					_finderPathCountAll, FINDER_ARGS_EMPTY);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return count.intValue();
	}

	@Override
	protected EntityCache getEntityCache() {
		return entityCache;
	}

	@Override
	protected String getPKDBName() {
		return "docId";
	}

	@Override
	protected String getSelectSQL() {
		return _SQL_SELECT_DOCTOR;
	}

	@Override
	protected Map<String, Integer> getTableColumnsMap() {
		return DoctorModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the doctor persistence.
	 */
	@Activate
	public void activate() {
		DoctorModelImpl.setEntityCacheEnabled(entityCacheEnabled);
		DoctorModelImpl.setFinderCacheEnabled(finderCacheEnabled);

		_finderPathWithPaginationFindAll = new FinderPath(
			entityCacheEnabled, finderCacheEnabled, DoctorImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);

		_finderPathWithoutPaginationFindAll = new FinderPath(
			entityCacheEnabled, finderCacheEnabled, DoctorImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll",
			new String[0]);

		_finderPathCountAll = new FinderPath(
			entityCacheEnabled, finderCacheEnabled, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll",
			new String[0]);
	}

	@Deactivate
	public void deactivate() {
		entityCache.removeCache(DoctorImpl.class.getName());
		finderCache.removeCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	@Reference(
		target = mysbnsPersistenceConstants.ORIGIN_BUNDLE_SYMBOLIC_NAME_FILTER,
		unbind = "-"
	)
	public void setConfiguration(Configuration configuration) {
		super.setConfiguration(configuration);

		_columnBitmaskEnabled = GetterUtil.getBoolean(
			configuration.get(
				"value.object.column.bitmask.enabled.com.sb2.training.model.Doctor"),
			true);
	}

	@Override
	@Reference(
		target = mysbnsPersistenceConstants.ORIGIN_BUNDLE_SYMBOLIC_NAME_FILTER,
		unbind = "-"
	)
	public void setDataSource(DataSource dataSource) {
		super.setDataSource(dataSource);
	}

	@Override
	@Reference(
		target = mysbnsPersistenceConstants.ORIGIN_BUNDLE_SYMBOLIC_NAME_FILTER,
		unbind = "-"
	)
	public void setSessionFactory(SessionFactory sessionFactory) {
		super.setSessionFactory(sessionFactory);
	}

	private boolean _columnBitmaskEnabled;

	@Reference
	protected EntityCache entityCache;

	@Reference
	protected FinderCache finderCache;

	private static final String _SQL_SELECT_DOCTOR =
		"SELECT doctor FROM Doctor doctor";

	private static final String _SQL_COUNT_DOCTOR =
		"SELECT COUNT(doctor) FROM Doctor doctor";

	private static final String _ORDER_BY_ENTITY_ALIAS = "doctor.";

	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY =
		"No Doctor exists with the primary key ";

	private static final Log _log = LogFactoryUtil.getLog(
		DoctorPersistenceImpl.class);

	static {
		try {
			Class.forName(mysbnsPersistenceConstants.class.getName());
		}
		catch (ClassNotFoundException cnfe) {
			throw new ExceptionInInitializerError(cnfe);
		}
	}

}
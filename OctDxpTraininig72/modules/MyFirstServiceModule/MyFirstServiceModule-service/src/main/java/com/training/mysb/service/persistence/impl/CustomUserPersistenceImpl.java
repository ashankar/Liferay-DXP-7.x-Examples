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

package com.training.mysb.service.persistence.impl;

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
import com.liferay.portal.kernel.util.SetUtil;

import com.training.mysb.exception.NoSuchCustomUserException;
import com.training.mysb.model.CustomUser;
import com.training.mysb.model.impl.CustomUserImpl;
import com.training.mysb.model.impl.CustomUserModelImpl;
import com.training.mysb.service.persistence.CustomUserPersistence;
import com.training.mysb.service.persistence.impl.constants.MyFirstSbNsPersistenceConstants;

import java.io.Serializable;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import javax.sql.DataSource;

import org.osgi.annotation.versioning.ProviderType;
import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Deactivate;
import org.osgi.service.component.annotations.Reference;

/**
 * The persistence implementation for the custom user service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@Component(service = CustomUserPersistence.class)
@ProviderType
public class CustomUserPersistenceImpl
	extends BasePersistenceImpl<CustomUser> implements CustomUserPersistence {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use <code>CustomUserUtil</code> to access the custom user persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY =
		CustomUserImpl.class.getName();

	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List1";

	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List2";

	private FinderPath _finderPathWithPaginationFindAll;
	private FinderPath _finderPathWithoutPaginationFindAll;
	private FinderPath _finderPathCountAll;

	public CustomUserPersistenceImpl() {
		setModelClass(CustomUser.class);

		setModelImplClass(CustomUserImpl.class);
		setModelPKClass(long.class);

		Map<String, String> dbColumnNames = new HashMap<String, String>();

		dbColumnNames.put("id", "id_");

		setDBColumnNames(dbColumnNames);
	}

	/**
	 * Caches the custom user in the entity cache if it is enabled.
	 *
	 * @param customUser the custom user
	 */
	@Override
	public void cacheResult(CustomUser customUser) {
		entityCache.putResult(
			entityCacheEnabled, CustomUserImpl.class,
			customUser.getPrimaryKey(), customUser);

		customUser.resetOriginalValues();
	}

	/**
	 * Caches the custom users in the entity cache if it is enabled.
	 *
	 * @param customUsers the custom users
	 */
	@Override
	public void cacheResult(List<CustomUser> customUsers) {
		for (CustomUser customUser : customUsers) {
			if (entityCache.getResult(
					entityCacheEnabled, CustomUserImpl.class,
					customUser.getPrimaryKey()) == null) {

				cacheResult(customUser);
			}
			else {
				customUser.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all custom users.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(CustomUserImpl.class);

		finderCache.clearCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the custom user.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(CustomUser customUser) {
		entityCache.removeResult(
			entityCacheEnabled, CustomUserImpl.class,
			customUser.getPrimaryKey());

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<CustomUser> customUsers) {
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (CustomUser customUser : customUsers) {
			entityCache.removeResult(
				entityCacheEnabled, CustomUserImpl.class,
				customUser.getPrimaryKey());
		}
	}

	/**
	 * Creates a new custom user with the primary key. Does not add the custom user to the database.
	 *
	 * @param id the primary key for the new custom user
	 * @return the new custom user
	 */
	@Override
	public CustomUser create(long id) {
		CustomUser customUser = new CustomUserImpl();

		customUser.setNew(true);
		customUser.setPrimaryKey(id);

		return customUser;
	}

	/**
	 * Removes the custom user with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param id the primary key of the custom user
	 * @return the custom user that was removed
	 * @throws NoSuchCustomUserException if a custom user with the primary key could not be found
	 */
	@Override
	public CustomUser remove(long id) throws NoSuchCustomUserException {
		return remove((Serializable)id);
	}

	/**
	 * Removes the custom user with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the custom user
	 * @return the custom user that was removed
	 * @throws NoSuchCustomUserException if a custom user with the primary key could not be found
	 */
	@Override
	public CustomUser remove(Serializable primaryKey)
		throws NoSuchCustomUserException {

		Session session = null;

		try {
			session = openSession();

			CustomUser customUser = (CustomUser)session.get(
				CustomUserImpl.class, primaryKey);

			if (customUser == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchCustomUserException(
					_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			return remove(customUser);
		}
		catch (NoSuchCustomUserException nsee) {
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
	protected CustomUser removeImpl(CustomUser customUser) {
		Session session = null;

		try {
			session = openSession();

			if (!session.contains(customUser)) {
				customUser = (CustomUser)session.get(
					CustomUserImpl.class, customUser.getPrimaryKeyObj());
			}

			if (customUser != null) {
				session.delete(customUser);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (customUser != null) {
			clearCache(customUser);
		}

		return customUser;
	}

	@Override
	public CustomUser updateImpl(CustomUser customUser) {
		boolean isNew = customUser.isNew();

		Session session = null;

		try {
			session = openSession();

			if (customUser.isNew()) {
				session.save(customUser);

				customUser.setNew(false);
			}
			else {
				customUser = (CustomUser)session.merge(customUser);
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
			entityCacheEnabled, CustomUserImpl.class,
			customUser.getPrimaryKey(), customUser, false);

		customUser.resetOriginalValues();

		return customUser;
	}

	/**
	 * Returns the custom user with the primary key or throws a <code>com.liferay.portal.kernel.exception.NoSuchModelException</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the custom user
	 * @return the custom user
	 * @throws NoSuchCustomUserException if a custom user with the primary key could not be found
	 */
	@Override
	public CustomUser findByPrimaryKey(Serializable primaryKey)
		throws NoSuchCustomUserException {

		CustomUser customUser = fetchByPrimaryKey(primaryKey);

		if (customUser == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchCustomUserException(
				_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
		}

		return customUser;
	}

	/**
	 * Returns the custom user with the primary key or throws a <code>NoSuchCustomUserException</code> if it could not be found.
	 *
	 * @param id the primary key of the custom user
	 * @return the custom user
	 * @throws NoSuchCustomUserException if a custom user with the primary key could not be found
	 */
	@Override
	public CustomUser findByPrimaryKey(long id)
		throws NoSuchCustomUserException {

		return findByPrimaryKey((Serializable)id);
	}

	/**
	 * Returns the custom user with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param id the primary key of the custom user
	 * @return the custom user, or <code>null</code> if a custom user with the primary key could not be found
	 */
	@Override
	public CustomUser fetchByPrimaryKey(long id) {
		return fetchByPrimaryKey((Serializable)id);
	}

	/**
	 * Returns all the custom users.
	 *
	 * @return the custom users
	 */
	@Override
	public List<CustomUser> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

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
	@Override
	public List<CustomUser> findAll(int start, int end) {
		return findAll(start, end, null);
	}

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
	@Override
	public List<CustomUser> findAll(
		int start, int end, OrderByComparator<CustomUser> orderByComparator,
		boolean useFinderCache) {

		return findAll(start, end, orderByComparator);
	}

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
	@Override
	public List<CustomUser> findAll(
		int start, int end, OrderByComparator<CustomUser> orderByComparator) {

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

		List<CustomUser> list = (List<CustomUser>)finderCache.getResult(
			finderPath, finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(
					2 + (orderByComparator.getOrderByFields().length * 2));

				query.append(_SQL_SELECT_CUSTOMUSER);

				appendOrderByComparator(
					query, _ORDER_BY_ENTITY_ALIAS, orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_CUSTOMUSER;

				if (pagination) {
					sql = sql.concat(CustomUserModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<CustomUser>)QueryUtil.list(
						q, getDialect(), start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<CustomUser>)QueryUtil.list(
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
	 * Removes all the custom users from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (CustomUser customUser : findAll()) {
			remove(customUser);
		}
	}

	/**
	 * Returns the number of custom users.
	 *
	 * @return the number of custom users
	 */
	@Override
	public int countAll() {
		Long count = (Long)finderCache.getResult(
			_finderPathCountAll, FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(_SQL_COUNT_CUSTOMUSER);

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
	public Set<String> getBadColumnNames() {
		return _badColumnNames;
	}

	@Override
	protected EntityCache getEntityCache() {
		return entityCache;
	}

	@Override
	protected String getPKDBName() {
		return "id_";
	}

	@Override
	protected String getSelectSQL() {
		return _SQL_SELECT_CUSTOMUSER;
	}

	@Override
	protected Map<String, Integer> getTableColumnsMap() {
		return CustomUserModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the custom user persistence.
	 */
	@Activate
	public void activate() {
		CustomUserModelImpl.setEntityCacheEnabled(entityCacheEnabled);
		CustomUserModelImpl.setFinderCacheEnabled(finderCacheEnabled);

		_finderPathWithPaginationFindAll = new FinderPath(
			entityCacheEnabled, finderCacheEnabled, CustomUserImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);

		_finderPathWithoutPaginationFindAll = new FinderPath(
			entityCacheEnabled, finderCacheEnabled, CustomUserImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll",
			new String[0]);

		_finderPathCountAll = new FinderPath(
			entityCacheEnabled, finderCacheEnabled, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll",
			new String[0]);
	}

	@Deactivate
	public void deactivate() {
		entityCache.removeCache(CustomUserImpl.class.getName());
		finderCache.removeCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	@Reference(
		target = MyFirstSbNsPersistenceConstants.ORIGIN_BUNDLE_SYMBOLIC_NAME_FILTER,
		unbind = "-"
	)
	public void setConfiguration(Configuration configuration) {
		super.setConfiguration(configuration);

		_columnBitmaskEnabled = GetterUtil.getBoolean(
			configuration.get(
				"value.object.column.bitmask.enabled.com.training.mysb.model.CustomUser"),
			true);
	}

	@Override
	@Reference(
		target = MyFirstSbNsPersistenceConstants.ORIGIN_BUNDLE_SYMBOLIC_NAME_FILTER,
		unbind = "-"
	)
	public void setDataSource(DataSource dataSource) {
		super.setDataSource(dataSource);
	}

	@Override
	@Reference(
		target = MyFirstSbNsPersistenceConstants.ORIGIN_BUNDLE_SYMBOLIC_NAME_FILTER,
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

	private static final String _SQL_SELECT_CUSTOMUSER =
		"SELECT customUser FROM CustomUser customUser";

	private static final String _SQL_COUNT_CUSTOMUSER =
		"SELECT COUNT(customUser) FROM CustomUser customUser";

	private static final String _ORDER_BY_ENTITY_ALIAS = "customUser.";

	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY =
		"No CustomUser exists with the primary key ";

	private static final Log _log = LogFactoryUtil.getLog(
		CustomUserPersistenceImpl.class);

	private static final Set<String> _badColumnNames = SetUtil.fromArray(
		new String[] {"id"});

	static {
		try {
			Class.forName(MyFirstSbNsPersistenceConstants.class.getName());
		}
		catch (ClassNotFoundException cnfe) {
			throw new ExceptionInInitializerError(cnfe);
		}
	}

}
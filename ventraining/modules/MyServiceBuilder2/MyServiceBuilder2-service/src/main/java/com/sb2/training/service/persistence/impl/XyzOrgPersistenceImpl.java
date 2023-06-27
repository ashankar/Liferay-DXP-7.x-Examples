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
import com.liferay.portal.kernel.dao.orm.QueryPos;
import com.liferay.portal.kernel.dao.orm.QueryUtil;
import com.liferay.portal.kernel.dao.orm.Session;
import com.liferay.portal.kernel.dao.orm.SessionFactory;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.service.persistence.impl.BasePersistenceImpl;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.SetUtil;
import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.kernel.uuid.PortalUUIDUtil;

import com.sb2.training.exception.NoSuchXyzOrgException;
import com.sb2.training.model.XyzOrg;
import com.sb2.training.model.impl.XyzOrgImpl;
import com.sb2.training.model.impl.XyzOrgModelImpl;
import com.sb2.training.service.persistence.XyzOrgPersistence;
import com.sb2.training.service.persistence.impl.constants.vtPersistenceConstants;

import java.io.Serializable;

import java.lang.reflect.InvocationHandler;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

import javax.sql.DataSource;

import org.osgi.annotation.versioning.ProviderType;
import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Deactivate;
import org.osgi.service.component.annotations.Reference;

/**
 * The persistence implementation for the xyz org service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@Component(service = XyzOrgPersistence.class)
@ProviderType
public class XyzOrgPersistenceImpl
	extends BasePersistenceImpl<XyzOrg> implements XyzOrgPersistence {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use <code>XyzOrgUtil</code> to access the xyz org persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY =
		XyzOrgImpl.class.getName();

	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List1";

	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List2";

	private FinderPath _finderPathWithPaginationFindAll;
	private FinderPath _finderPathWithoutPaginationFindAll;
	private FinderPath _finderPathCountAll;
	private FinderPath _finderPathWithPaginationFindByUuid;
	private FinderPath _finderPathWithoutPaginationFindByUuid;
	private FinderPath _finderPathCountByUuid;

	/**
	 * Returns all the xyz orgs where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching xyz orgs
	 */
	@Override
	public List<XyzOrg> findByUuid(String uuid) {
		return findByUuid(uuid, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

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
	@Override
	public List<XyzOrg> findByUuid(String uuid, int start, int end) {
		return findByUuid(uuid, start, end, null);
	}

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
	@Override
	public List<XyzOrg> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<XyzOrg> orderByComparator, boolean useFinderCache) {

		return findByUuid(uuid, start, end, orderByComparator);
	}

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
	@Override
	public List<XyzOrg> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<XyzOrg> orderByComparator) {

		uuid = Objects.toString(uuid, "");

		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
			(orderByComparator == null)) {

			pagination = false;
			finderPath = _finderPathWithoutPaginationFindByUuid;
			finderArgs = new Object[] {uuid};
		}
		else {
			finderPath = _finderPathWithPaginationFindByUuid;
			finderArgs = new Object[] {uuid, start, end, orderByComparator};
		}

		List<XyzOrg> list = (List<XyzOrg>)finderCache.getResult(
			finderPath, finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (XyzOrg xyzOrg : list) {
				if (!uuid.equals(xyzOrg.getUuid())) {
					list = null;

					break;
				}
			}
		}

		if (list == null) {
			StringBundler query = null;

			if (orderByComparator != null) {
				query = new StringBundler(
					3 + (orderByComparator.getOrderByFields().length * 2));
			}
			else {
				query = new StringBundler(3);
			}

			query.append(_SQL_SELECT_XYZORG_WHERE);

			boolean bindUuid = false;

			if (uuid.isEmpty()) {
				query.append(_FINDER_COLUMN_UUID_UUID_3);
			}
			else {
				bindUuid = true;

				query.append(_FINDER_COLUMN_UUID_UUID_2);
			}

			if (orderByComparator != null) {
				appendOrderByComparator(
					query, _ORDER_BY_ENTITY_ALIAS, orderByComparator);
			}
			else if (pagination) {
				query.append(XyzOrgModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindUuid) {
					qPos.add(uuid);
				}

				if (!pagination) {
					list = (List<XyzOrg>)QueryUtil.list(
						q, getDialect(), start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<XyzOrg>)QueryUtil.list(
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
	 * Returns the first xyz org in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching xyz org
	 * @throws NoSuchXyzOrgException if a matching xyz org could not be found
	 */
	@Override
	public XyzOrg findByUuid_First(
			String uuid, OrderByComparator<XyzOrg> orderByComparator)
		throws NoSuchXyzOrgException {

		XyzOrg xyzOrg = fetchByUuid_First(uuid, orderByComparator);

		if (xyzOrg != null) {
			return xyzOrg;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("uuid=");
		msg.append(uuid);

		msg.append("}");

		throw new NoSuchXyzOrgException(msg.toString());
	}

	/**
	 * Returns the first xyz org in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching xyz org, or <code>null</code> if a matching xyz org could not be found
	 */
	@Override
	public XyzOrg fetchByUuid_First(
		String uuid, OrderByComparator<XyzOrg> orderByComparator) {

		List<XyzOrg> list = findByUuid(uuid, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last xyz org in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching xyz org
	 * @throws NoSuchXyzOrgException if a matching xyz org could not be found
	 */
	@Override
	public XyzOrg findByUuid_Last(
			String uuid, OrderByComparator<XyzOrg> orderByComparator)
		throws NoSuchXyzOrgException {

		XyzOrg xyzOrg = fetchByUuid_Last(uuid, orderByComparator);

		if (xyzOrg != null) {
			return xyzOrg;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("uuid=");
		msg.append(uuid);

		msg.append("}");

		throw new NoSuchXyzOrgException(msg.toString());
	}

	/**
	 * Returns the last xyz org in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching xyz org, or <code>null</code> if a matching xyz org could not be found
	 */
	@Override
	public XyzOrg fetchByUuid_Last(
		String uuid, OrderByComparator<XyzOrg> orderByComparator) {

		int count = countByUuid(uuid);

		if (count == 0) {
			return null;
		}

		List<XyzOrg> list = findByUuid(
			uuid, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the xyz orgs before and after the current xyz org in the ordered set where uuid = &#63;.
	 *
	 * @param depId the primary key of the current xyz org
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next xyz org
	 * @throws NoSuchXyzOrgException if a xyz org with the primary key could not be found
	 */
	@Override
	public XyzOrg[] findByUuid_PrevAndNext(
			long depId, String uuid,
			OrderByComparator<XyzOrg> orderByComparator)
		throws NoSuchXyzOrgException {

		uuid = Objects.toString(uuid, "");

		XyzOrg xyzOrg = findByPrimaryKey(depId);

		Session session = null;

		try {
			session = openSession();

			XyzOrg[] array = new XyzOrgImpl[3];

			array[0] = getByUuid_PrevAndNext(
				session, xyzOrg, uuid, orderByComparator, true);

			array[1] = xyzOrg;

			array[2] = getByUuid_PrevAndNext(
				session, xyzOrg, uuid, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected XyzOrg getByUuid_PrevAndNext(
		Session session, XyzOrg xyzOrg, String uuid,
		OrderByComparator<XyzOrg> orderByComparator, boolean previous) {

		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(
				4 + (orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_XYZORG_WHERE);

		boolean bindUuid = false;

		if (uuid.isEmpty()) {
			query.append(_FINDER_COLUMN_UUID_UUID_3);
		}
		else {
			bindUuid = true;

			query.append(_FINDER_COLUMN_UUID_UUID_2);
		}

		if (orderByComparator != null) {
			String[] orderByConditionFields =
				orderByComparator.getOrderByConditionFields();

			if (orderByConditionFields.length > 0) {
				query.append(WHERE_AND);
			}

			for (int i = 0; i < orderByConditionFields.length; i++) {
				query.append(_ORDER_BY_ENTITY_ALIAS);
				query.append(orderByConditionFields[i]);

				if ((i + 1) < orderByConditionFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(WHERE_GREATER_THAN_HAS_NEXT);
					}
					else {
						query.append(WHERE_LESSER_THAN_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(WHERE_GREATER_THAN);
					}
					else {
						query.append(WHERE_LESSER_THAN);
					}
				}
			}

			query.append(ORDER_BY_CLAUSE);

			String[] orderByFields = orderByComparator.getOrderByFields();

			for (int i = 0; i < orderByFields.length; i++) {
				query.append(_ORDER_BY_ENTITY_ALIAS);
				query.append(orderByFields[i]);

				if ((i + 1) < orderByFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(ORDER_BY_ASC_HAS_NEXT);
					}
					else {
						query.append(ORDER_BY_DESC_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(ORDER_BY_ASC);
					}
					else {
						query.append(ORDER_BY_DESC);
					}
				}
			}
		}
		else {
			query.append(XyzOrgModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		if (bindUuid) {
			qPos.add(uuid);
		}

		if (orderByComparator != null) {
			for (Object orderByConditionValue :
					orderByComparator.getOrderByConditionValues(xyzOrg)) {

				qPos.add(orderByConditionValue);
			}
		}

		List<XyzOrg> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the xyz orgs where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	@Override
	public void removeByUuid(String uuid) {
		for (XyzOrg xyzOrg :
				findByUuid(uuid, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {

			remove(xyzOrg);
		}
	}

	/**
	 * Returns the number of xyz orgs where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching xyz orgs
	 */
	@Override
	public int countByUuid(String uuid) {
		uuid = Objects.toString(uuid, "");

		FinderPath finderPath = _finderPathCountByUuid;

		Object[] finderArgs = new Object[] {uuid};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_XYZORG_WHERE);

			boolean bindUuid = false;

			if (uuid.isEmpty()) {
				query.append(_FINDER_COLUMN_UUID_UUID_3);
			}
			else {
				bindUuid = true;

				query.append(_FINDER_COLUMN_UUID_UUID_2);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindUuid) {
					qPos.add(uuid);
				}

				count = (Long)q.uniqueResult();

				finderCache.putResult(finderPath, finderArgs, count);
			}
			catch (Exception e) {
				finderCache.removeResult(finderPath, finderArgs);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return count.intValue();
	}

	private static final String _FINDER_COLUMN_UUID_UUID_2 = "xyzOrg.uuid = ?";

	private static final String _FINDER_COLUMN_UUID_UUID_3 =
		"(xyzOrg.uuid IS NULL OR xyzOrg.uuid = '')";

	public XyzOrgPersistenceImpl() {
		setModelClass(XyzOrg.class);

		setModelImplClass(XyzOrgImpl.class);
		setModelPKClass(long.class);

		Map<String, String> dbColumnNames = new HashMap<String, String>();

		dbColumnNames.put("uuid", "uuid_");

		setDBColumnNames(dbColumnNames);
	}

	/**
	 * Caches the xyz org in the entity cache if it is enabled.
	 *
	 * @param xyzOrg the xyz org
	 */
	@Override
	public void cacheResult(XyzOrg xyzOrg) {
		entityCache.putResult(
			entityCacheEnabled, XyzOrgImpl.class, xyzOrg.getPrimaryKey(),
			xyzOrg);

		xyzOrg.resetOriginalValues();
	}

	/**
	 * Caches the xyz orgs in the entity cache if it is enabled.
	 *
	 * @param xyzOrgs the xyz orgs
	 */
	@Override
	public void cacheResult(List<XyzOrg> xyzOrgs) {
		for (XyzOrg xyzOrg : xyzOrgs) {
			if (entityCache.getResult(
					entityCacheEnabled, XyzOrgImpl.class,
					xyzOrg.getPrimaryKey()) == null) {

				cacheResult(xyzOrg);
			}
			else {
				xyzOrg.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all xyz orgs.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(XyzOrgImpl.class);

		finderCache.clearCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the xyz org.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(XyzOrg xyzOrg) {
		entityCache.removeResult(
			entityCacheEnabled, XyzOrgImpl.class, xyzOrg.getPrimaryKey());

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<XyzOrg> xyzOrgs) {
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (XyzOrg xyzOrg : xyzOrgs) {
			entityCache.removeResult(
				entityCacheEnabled, XyzOrgImpl.class, xyzOrg.getPrimaryKey());
		}
	}

	/**
	 * Creates a new xyz org with the primary key. Does not add the xyz org to the database.
	 *
	 * @param depId the primary key for the new xyz org
	 * @return the new xyz org
	 */
	@Override
	public XyzOrg create(long depId) {
		XyzOrg xyzOrg = new XyzOrgImpl();

		xyzOrg.setNew(true);
		xyzOrg.setPrimaryKey(depId);

		String uuid = PortalUUIDUtil.generate();

		xyzOrg.setUuid(uuid);

		return xyzOrg;
	}

	/**
	 * Removes the xyz org with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param depId the primary key of the xyz org
	 * @return the xyz org that was removed
	 * @throws NoSuchXyzOrgException if a xyz org with the primary key could not be found
	 */
	@Override
	public XyzOrg remove(long depId) throws NoSuchXyzOrgException {
		return remove((Serializable)depId);
	}

	/**
	 * Removes the xyz org with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the xyz org
	 * @return the xyz org that was removed
	 * @throws NoSuchXyzOrgException if a xyz org with the primary key could not be found
	 */
	@Override
	public XyzOrg remove(Serializable primaryKey) throws NoSuchXyzOrgException {
		Session session = null;

		try {
			session = openSession();

			XyzOrg xyzOrg = (XyzOrg)session.get(XyzOrgImpl.class, primaryKey);

			if (xyzOrg == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchXyzOrgException(
					_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			return remove(xyzOrg);
		}
		catch (NoSuchXyzOrgException nsee) {
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
	protected XyzOrg removeImpl(XyzOrg xyzOrg) {
		Session session = null;

		try {
			session = openSession();

			if (!session.contains(xyzOrg)) {
				xyzOrg = (XyzOrg)session.get(
					XyzOrgImpl.class, xyzOrg.getPrimaryKeyObj());
			}

			if (xyzOrg != null) {
				session.delete(xyzOrg);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (xyzOrg != null) {
			clearCache(xyzOrg);
		}

		return xyzOrg;
	}

	@Override
	public XyzOrg updateImpl(XyzOrg xyzOrg) {
		boolean isNew = xyzOrg.isNew();

		if (!(xyzOrg instanceof XyzOrgModelImpl)) {
			InvocationHandler invocationHandler = null;

			if (ProxyUtil.isProxyClass(xyzOrg.getClass())) {
				invocationHandler = ProxyUtil.getInvocationHandler(xyzOrg);

				throw new IllegalArgumentException(
					"Implement ModelWrapper in xyzOrg proxy " +
						invocationHandler.getClass());
			}

			throw new IllegalArgumentException(
				"Implement ModelWrapper in custom XyzOrg implementation " +
					xyzOrg.getClass());
		}

		XyzOrgModelImpl xyzOrgModelImpl = (XyzOrgModelImpl)xyzOrg;

		if (Validator.isNull(xyzOrg.getUuid())) {
			String uuid = PortalUUIDUtil.generate();

			xyzOrg.setUuid(uuid);
		}

		Session session = null;

		try {
			session = openSession();

			if (xyzOrg.isNew()) {
				session.save(xyzOrg);

				xyzOrg.setNew(false);
			}
			else {
				xyzOrg = (XyzOrg)session.merge(xyzOrg);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (!_columnBitmaskEnabled) {
			finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}
		else if (isNew) {
			Object[] args = new Object[] {xyzOrgModelImpl.getUuid()};

			finderCache.removeResult(_finderPathCountByUuid, args);
			finderCache.removeResult(
				_finderPathWithoutPaginationFindByUuid, args);

			finderCache.removeResult(_finderPathCountAll, FINDER_ARGS_EMPTY);
			finderCache.removeResult(
				_finderPathWithoutPaginationFindAll, FINDER_ARGS_EMPTY);
		}
		else {
			if ((xyzOrgModelImpl.getColumnBitmask() &
				 _finderPathWithoutPaginationFindByUuid.getColumnBitmask()) !=
					 0) {

				Object[] args = new Object[] {
					xyzOrgModelImpl.getOriginalUuid()
				};

				finderCache.removeResult(_finderPathCountByUuid, args);
				finderCache.removeResult(
					_finderPathWithoutPaginationFindByUuid, args);

				args = new Object[] {xyzOrgModelImpl.getUuid()};

				finderCache.removeResult(_finderPathCountByUuid, args);
				finderCache.removeResult(
					_finderPathWithoutPaginationFindByUuid, args);
			}
		}

		entityCache.putResult(
			entityCacheEnabled, XyzOrgImpl.class, xyzOrg.getPrimaryKey(),
			xyzOrg, false);

		xyzOrg.resetOriginalValues();

		return xyzOrg;
	}

	/**
	 * Returns the xyz org with the primary key or throws a <code>com.liferay.portal.kernel.exception.NoSuchModelException</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the xyz org
	 * @return the xyz org
	 * @throws NoSuchXyzOrgException if a xyz org with the primary key could not be found
	 */
	@Override
	public XyzOrg findByPrimaryKey(Serializable primaryKey)
		throws NoSuchXyzOrgException {

		XyzOrg xyzOrg = fetchByPrimaryKey(primaryKey);

		if (xyzOrg == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchXyzOrgException(
				_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
		}

		return xyzOrg;
	}

	/**
	 * Returns the xyz org with the primary key or throws a <code>NoSuchXyzOrgException</code> if it could not be found.
	 *
	 * @param depId the primary key of the xyz org
	 * @return the xyz org
	 * @throws NoSuchXyzOrgException if a xyz org with the primary key could not be found
	 */
	@Override
	public XyzOrg findByPrimaryKey(long depId) throws NoSuchXyzOrgException {
		return findByPrimaryKey((Serializable)depId);
	}

	/**
	 * Returns the xyz org with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param depId the primary key of the xyz org
	 * @return the xyz org, or <code>null</code> if a xyz org with the primary key could not be found
	 */
	@Override
	public XyzOrg fetchByPrimaryKey(long depId) {
		return fetchByPrimaryKey((Serializable)depId);
	}

	/**
	 * Returns all the xyz orgs.
	 *
	 * @return the xyz orgs
	 */
	@Override
	public List<XyzOrg> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

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
	@Override
	public List<XyzOrg> findAll(int start, int end) {
		return findAll(start, end, null);
	}

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
	@Override
	public List<XyzOrg> findAll(
		int start, int end, OrderByComparator<XyzOrg> orderByComparator,
		boolean useFinderCache) {

		return findAll(start, end, orderByComparator);
	}

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
	@Override
	public List<XyzOrg> findAll(
		int start, int end, OrderByComparator<XyzOrg> orderByComparator) {

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

		List<XyzOrg> list = (List<XyzOrg>)finderCache.getResult(
			finderPath, finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(
					2 + (orderByComparator.getOrderByFields().length * 2));

				query.append(_SQL_SELECT_XYZORG);

				appendOrderByComparator(
					query, _ORDER_BY_ENTITY_ALIAS, orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_XYZORG;

				if (pagination) {
					sql = sql.concat(XyzOrgModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<XyzOrg>)QueryUtil.list(
						q, getDialect(), start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<XyzOrg>)QueryUtil.list(
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
	 * Removes all the xyz orgs from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (XyzOrg xyzOrg : findAll()) {
			remove(xyzOrg);
		}
	}

	/**
	 * Returns the number of xyz orgs.
	 *
	 * @return the number of xyz orgs
	 */
	@Override
	public int countAll() {
		Long count = (Long)finderCache.getResult(
			_finderPathCountAll, FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(_SQL_COUNT_XYZORG);

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
		return "depId";
	}

	@Override
	protected String getSelectSQL() {
		return _SQL_SELECT_XYZORG;
	}

	@Override
	protected Map<String, Integer> getTableColumnsMap() {
		return XyzOrgModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the xyz org persistence.
	 */
	@Activate
	public void activate() {
		XyzOrgModelImpl.setEntityCacheEnabled(entityCacheEnabled);
		XyzOrgModelImpl.setFinderCacheEnabled(finderCacheEnabled);

		_finderPathWithPaginationFindAll = new FinderPath(
			entityCacheEnabled, finderCacheEnabled, XyzOrgImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);

		_finderPathWithoutPaginationFindAll = new FinderPath(
			entityCacheEnabled, finderCacheEnabled, XyzOrgImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll",
			new String[0]);

		_finderPathCountAll = new FinderPath(
			entityCacheEnabled, finderCacheEnabled, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll",
			new String[0]);

		_finderPathWithPaginationFindByUuid = new FinderPath(
			entityCacheEnabled, finderCacheEnabled, XyzOrgImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByUuid",
			new String[] {
				String.class.getName(), Integer.class.getName(),
				Integer.class.getName(), OrderByComparator.class.getName()
			});

		_finderPathWithoutPaginationFindByUuid = new FinderPath(
			entityCacheEnabled, finderCacheEnabled, XyzOrgImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByUuid",
			new String[] {String.class.getName()},
			XyzOrgModelImpl.UUID_COLUMN_BITMASK);

		_finderPathCountByUuid = new FinderPath(
			entityCacheEnabled, finderCacheEnabled, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByUuid",
			new String[] {String.class.getName()});
	}

	@Deactivate
	public void deactivate() {
		entityCache.removeCache(XyzOrgImpl.class.getName());
		finderCache.removeCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	@Reference(
		target = vtPersistenceConstants.ORIGIN_BUNDLE_SYMBOLIC_NAME_FILTER,
		unbind = "-"
	)
	public void setConfiguration(Configuration configuration) {
		super.setConfiguration(configuration);

		_columnBitmaskEnabled = GetterUtil.getBoolean(
			configuration.get(
				"value.object.column.bitmask.enabled.com.sb2.training.model.XyzOrg"),
			true);
	}

	@Override
	@Reference(
		target = vtPersistenceConstants.ORIGIN_BUNDLE_SYMBOLIC_NAME_FILTER,
		unbind = "-"
	)
	public void setDataSource(DataSource dataSource) {
		super.setDataSource(dataSource);
	}

	@Override
	@Reference(
		target = vtPersistenceConstants.ORIGIN_BUNDLE_SYMBOLIC_NAME_FILTER,
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

	private static final String _SQL_SELECT_XYZORG =
		"SELECT xyzOrg FROM XyzOrg xyzOrg";

	private static final String _SQL_SELECT_XYZORG_WHERE =
		"SELECT xyzOrg FROM XyzOrg xyzOrg WHERE ";

	private static final String _SQL_COUNT_XYZORG =
		"SELECT COUNT(xyzOrg) FROM XyzOrg xyzOrg";

	private static final String _SQL_COUNT_XYZORG_WHERE =
		"SELECT COUNT(xyzOrg) FROM XyzOrg xyzOrg WHERE ";

	private static final String _ORDER_BY_ENTITY_ALIAS = "xyzOrg.";

	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY =
		"No XyzOrg exists with the primary key ";

	private static final String _NO_SUCH_ENTITY_WITH_KEY =
		"No XyzOrg exists with the key {";

	private static final Log _log = LogFactoryUtil.getLog(
		XyzOrgPersistenceImpl.class);

	private static final Set<String> _badColumnNames = SetUtil.fromArray(
		new String[] {"uuid"});

	static {
		try {
			Class.forName(vtPersistenceConstants.class.getName());
		}
		catch (ClassNotFoundException cnfe) {
			throw new ExceptionInInitializerError(cnfe);
		}
	}

}
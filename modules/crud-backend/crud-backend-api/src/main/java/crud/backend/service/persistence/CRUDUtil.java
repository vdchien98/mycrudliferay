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

package crud.backend.service.persistence;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import crud.backend.model.CRUD;

import java.io.Serializable;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence utility for the crud service. This utility wraps <code>crud.backend.service.persistence.impl.CRUDPersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author liferay
 * @see CRUDPersistence
 * @generated
 */
public class CRUDUtil {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#clearCache()
	 */
	public static void clearCache() {
		getPersistence().clearCache();
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#clearCache(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static void clearCache(CRUD crud) {
		getPersistence().clearCache(crud);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#countWithDynamicQuery(DynamicQuery)
	 */
	public static long countWithDynamicQuery(DynamicQuery dynamicQuery) {
		return getPersistence().countWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#fetchByPrimaryKeys(Set)
	 */
	public static Map<Serializable, CRUD> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<CRUD> findWithDynamicQuery(DynamicQuery dynamicQuery) {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<CRUD> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<CRUD> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<CRUD> orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static CRUD update(CRUD crud) {
		return getPersistence().update(crud);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static CRUD update(CRUD crud, ServiceContext serviceContext) {
		return getPersistence().update(crud, serviceContext);
	}

	/**
	 * Returns all the cruds where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching cruds
	 */
	public static List<CRUD> findByUuid(String uuid) {
		return getPersistence().findByUuid(uuid);
	}

	/**
	 * Returns a range of all the cruds where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CRUDModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of cruds
	 * @param end the upper bound of the range of cruds (not inclusive)
	 * @return the range of matching cruds
	 */
	public static List<CRUD> findByUuid(String uuid, int start, int end) {
		return getPersistence().findByUuid(uuid, start, end);
	}

	/**
	 * Returns an ordered range of all the cruds where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CRUDModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of cruds
	 * @param end the upper bound of the range of cruds (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching cruds
	 */
	public static List<CRUD> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<CRUD> orderByComparator) {

		return getPersistence().findByUuid(uuid, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the cruds where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CRUDModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of cruds
	 * @param end the upper bound of the range of cruds (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching cruds
	 */
	public static List<CRUD> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<CRUD> orderByComparator, boolean useFinderCache) {

		return getPersistence().findByUuid(
			uuid, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first crud in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching crud
	 * @throws NoSuchUDException if a matching crud could not be found
	 */
	public static CRUD findByUuid_First(
			String uuid, OrderByComparator<CRUD> orderByComparator)
		throws crud.backend.exception.NoSuchUDException {

		return getPersistence().findByUuid_First(uuid, orderByComparator);
	}

	/**
	 * Returns the first crud in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching crud, or <code>null</code> if a matching crud could not be found
	 */
	public static CRUD fetchByUuid_First(
		String uuid, OrderByComparator<CRUD> orderByComparator) {

		return getPersistence().fetchByUuid_First(uuid, orderByComparator);
	}

	/**
	 * Returns the last crud in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching crud
	 * @throws NoSuchUDException if a matching crud could not be found
	 */
	public static CRUD findByUuid_Last(
			String uuid, OrderByComparator<CRUD> orderByComparator)
		throws crud.backend.exception.NoSuchUDException {

		return getPersistence().findByUuid_Last(uuid, orderByComparator);
	}

	/**
	 * Returns the last crud in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching crud, or <code>null</code> if a matching crud could not be found
	 */
	public static CRUD fetchByUuid_Last(
		String uuid, OrderByComparator<CRUD> orderByComparator) {

		return getPersistence().fetchByUuid_Last(uuid, orderByComparator);
	}

	/**
	 * Returns the cruds before and after the current crud in the ordered set where uuid = &#63;.
	 *
	 * @param crudId the primary key of the current crud
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next crud
	 * @throws NoSuchUDException if a crud with the primary key could not be found
	 */
	public static CRUD[] findByUuid_PrevAndNext(
			long crudId, String uuid, OrderByComparator<CRUD> orderByComparator)
		throws crud.backend.exception.NoSuchUDException {

		return getPersistence().findByUuid_PrevAndNext(
			crudId, uuid, orderByComparator);
	}

	/**
	 * Removes all the cruds where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	public static void removeByUuid(String uuid) {
		getPersistence().removeByUuid(uuid);
	}

	/**
	 * Returns the number of cruds where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching cruds
	 */
	public static int countByUuid(String uuid) {
		return getPersistence().countByUuid(uuid);
	}

	/**
	 * Returns all the cruds where crudId = &#63;.
	 *
	 * @param crudId the crud ID
	 * @return the matching cruds
	 */
	public static List<CRUD> findByG_G(long crudId) {
		return getPersistence().findByG_G(crudId);
	}

	/**
	 * Returns a range of all the cruds where crudId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CRUDModelImpl</code>.
	 * </p>
	 *
	 * @param crudId the crud ID
	 * @param start the lower bound of the range of cruds
	 * @param end the upper bound of the range of cruds (not inclusive)
	 * @return the range of matching cruds
	 */
	public static List<CRUD> findByG_G(long crudId, int start, int end) {
		return getPersistence().findByG_G(crudId, start, end);
	}

	/**
	 * Returns an ordered range of all the cruds where crudId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CRUDModelImpl</code>.
	 * </p>
	 *
	 * @param crudId the crud ID
	 * @param start the lower bound of the range of cruds
	 * @param end the upper bound of the range of cruds (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching cruds
	 */
	public static List<CRUD> findByG_G(
		long crudId, int start, int end,
		OrderByComparator<CRUD> orderByComparator) {

		return getPersistence().findByG_G(
			crudId, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the cruds where crudId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CRUDModelImpl</code>.
	 * </p>
	 *
	 * @param crudId the crud ID
	 * @param start the lower bound of the range of cruds
	 * @param end the upper bound of the range of cruds (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching cruds
	 */
	public static List<CRUD> findByG_G(
		long crudId, int start, int end,
		OrderByComparator<CRUD> orderByComparator, boolean useFinderCache) {

		return getPersistence().findByG_G(
			crudId, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first crud in the ordered set where crudId = &#63;.
	 *
	 * @param crudId the crud ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching crud
	 * @throws NoSuchUDException if a matching crud could not be found
	 */
	public static CRUD findByG_G_First(
			long crudId, OrderByComparator<CRUD> orderByComparator)
		throws crud.backend.exception.NoSuchUDException {

		return getPersistence().findByG_G_First(crudId, orderByComparator);
	}

	/**
	 * Returns the first crud in the ordered set where crudId = &#63;.
	 *
	 * @param crudId the crud ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching crud, or <code>null</code> if a matching crud could not be found
	 */
	public static CRUD fetchByG_G_First(
		long crudId, OrderByComparator<CRUD> orderByComparator) {

		return getPersistence().fetchByG_G_First(crudId, orderByComparator);
	}

	/**
	 * Returns the last crud in the ordered set where crudId = &#63;.
	 *
	 * @param crudId the crud ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching crud
	 * @throws NoSuchUDException if a matching crud could not be found
	 */
	public static CRUD findByG_G_Last(
			long crudId, OrderByComparator<CRUD> orderByComparator)
		throws crud.backend.exception.NoSuchUDException {

		return getPersistence().findByG_G_Last(crudId, orderByComparator);
	}

	/**
	 * Returns the last crud in the ordered set where crudId = &#63;.
	 *
	 * @param crudId the crud ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching crud, or <code>null</code> if a matching crud could not be found
	 */
	public static CRUD fetchByG_G_Last(
		long crudId, OrderByComparator<CRUD> orderByComparator) {

		return getPersistence().fetchByG_G_Last(crudId, orderByComparator);
	}

	/**
	 * Removes all the cruds where crudId = &#63; from the database.
	 *
	 * @param crudId the crud ID
	 */
	public static void removeByG_G(long crudId) {
		getPersistence().removeByG_G(crudId);
	}

	/**
	 * Returns the number of cruds where crudId = &#63;.
	 *
	 * @param crudId the crud ID
	 * @return the number of matching cruds
	 */
	public static int countByG_G(long crudId) {
		return getPersistence().countByG_G(crudId);
	}

	/**
	 * Caches the crud in the entity cache if it is enabled.
	 *
	 * @param crud the crud
	 */
	public static void cacheResult(CRUD crud) {
		getPersistence().cacheResult(crud);
	}

	/**
	 * Caches the cruds in the entity cache if it is enabled.
	 *
	 * @param cruds the cruds
	 */
	public static void cacheResult(List<CRUD> cruds) {
		getPersistence().cacheResult(cruds);
	}

	/**
	 * Creates a new crud with the primary key. Does not add the crud to the database.
	 *
	 * @param crudId the primary key for the new crud
	 * @return the new crud
	 */
	public static CRUD create(long crudId) {
		return getPersistence().create(crudId);
	}

	/**
	 * Removes the crud with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param crudId the primary key of the crud
	 * @return the crud that was removed
	 * @throws NoSuchUDException if a crud with the primary key could not be found
	 */
	public static CRUD remove(long crudId)
		throws crud.backend.exception.NoSuchUDException {

		return getPersistence().remove(crudId);
	}

	public static CRUD updateImpl(CRUD crud) {
		return getPersistence().updateImpl(crud);
	}

	/**
	 * Returns the crud with the primary key or throws a <code>NoSuchUDException</code> if it could not be found.
	 *
	 * @param crudId the primary key of the crud
	 * @return the crud
	 * @throws NoSuchUDException if a crud with the primary key could not be found
	 */
	public static CRUD findByPrimaryKey(long crudId)
		throws crud.backend.exception.NoSuchUDException {

		return getPersistence().findByPrimaryKey(crudId);
	}

	/**
	 * Returns the crud with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param crudId the primary key of the crud
	 * @return the crud, or <code>null</code> if a crud with the primary key could not be found
	 */
	public static CRUD fetchByPrimaryKey(long crudId) {
		return getPersistence().fetchByPrimaryKey(crudId);
	}

	/**
	 * Returns all the cruds.
	 *
	 * @return the cruds
	 */
	public static List<CRUD> findAll() {
		return getPersistence().findAll();
	}

	/**
	 * Returns a range of all the cruds.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CRUDModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of cruds
	 * @param end the upper bound of the range of cruds (not inclusive)
	 * @return the range of cruds
	 */
	public static List<CRUD> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	 * Returns an ordered range of all the cruds.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CRUDModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of cruds
	 * @param end the upper bound of the range of cruds (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of cruds
	 */
	public static List<CRUD> findAll(
		int start, int end, OrderByComparator<CRUD> orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the cruds.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CRUDModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of cruds
	 * @param end the upper bound of the range of cruds (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of cruds
	 */
	public static List<CRUD> findAll(
		int start, int end, OrderByComparator<CRUD> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Removes all the cruds from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of cruds.
	 *
	 * @return the number of cruds
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static CRUDPersistence getPersistence() {
		return _persistence;
	}

	private static volatile CRUDPersistence _persistence;

}
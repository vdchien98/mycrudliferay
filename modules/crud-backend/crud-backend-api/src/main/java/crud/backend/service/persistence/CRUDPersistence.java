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

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import crud.backend.exception.NoSuchUDException;
import crud.backend.model.CRUD;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the crud service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author liferay
 * @see CRUDUtil
 * @generated
 */
@ProviderType
public interface CRUDPersistence extends BasePersistence<CRUD> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link CRUDUtil} to access the crud persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns all the cruds where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching cruds
	 */
	public java.util.List<CRUD> findByUuid(String uuid);

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
	public java.util.List<CRUD> findByUuid(String uuid, int start, int end);

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
	public java.util.List<CRUD> findByUuid(
		String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<CRUD>
			orderByComparator);

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
	public java.util.List<CRUD> findByUuid(
		String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<CRUD>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first crud in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching crud
	 * @throws NoSuchUDException if a matching crud could not be found
	 */
	public CRUD findByUuid_First(
			String uuid,
			com.liferay.portal.kernel.util.OrderByComparator<CRUD>
				orderByComparator)
		throws NoSuchUDException;

	/**
	 * Returns the first crud in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching crud, or <code>null</code> if a matching crud could not be found
	 */
	public CRUD fetchByUuid_First(
		String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<CRUD>
			orderByComparator);

	/**
	 * Returns the last crud in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching crud
	 * @throws NoSuchUDException if a matching crud could not be found
	 */
	public CRUD findByUuid_Last(
			String uuid,
			com.liferay.portal.kernel.util.OrderByComparator<CRUD>
				orderByComparator)
		throws NoSuchUDException;

	/**
	 * Returns the last crud in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching crud, or <code>null</code> if a matching crud could not be found
	 */
	public CRUD fetchByUuid_Last(
		String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<CRUD>
			orderByComparator);

	/**
	 * Returns the cruds before and after the current crud in the ordered set where uuid = &#63;.
	 *
	 * @param crudId the primary key of the current crud
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next crud
	 * @throws NoSuchUDException if a crud with the primary key could not be found
	 */
	public CRUD[] findByUuid_PrevAndNext(
			long crudId, String uuid,
			com.liferay.portal.kernel.util.OrderByComparator<CRUD>
				orderByComparator)
		throws NoSuchUDException;

	/**
	 * Removes all the cruds where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	public void removeByUuid(String uuid);

	/**
	 * Returns the number of cruds where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching cruds
	 */
	public int countByUuid(String uuid);

	/**
	 * Returns the crud where uuid = &#63; and groupId = &#63; or throws a <code>NoSuchUDException</code> if it could not be found.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching crud
	 * @throws NoSuchUDException if a matching crud could not be found
	 */
	public CRUD findByUUID_G(String uuid, long groupId)
		throws NoSuchUDException;

	/**
	 * Returns the crud where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching crud, or <code>null</code> if a matching crud could not be found
	 */
	public CRUD fetchByUUID_G(String uuid, long groupId);

	/**
	 * Returns the crud where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching crud, or <code>null</code> if a matching crud could not be found
	 */
	public CRUD fetchByUUID_G(
		String uuid, long groupId, boolean useFinderCache);

	/**
	 * Removes the crud where uuid = &#63; and groupId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the crud that was removed
	 */
	public CRUD removeByUUID_G(String uuid, long groupId)
		throws NoSuchUDException;

	/**
	 * Returns the number of cruds where uuid = &#63; and groupId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the number of matching cruds
	 */
	public int countByUUID_G(String uuid, long groupId);

	/**
	 * Returns all the cruds where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @return the matching cruds
	 */
	public java.util.List<CRUD> findByG_G(long groupId);

	/**
	 * Returns a range of all the cruds where groupId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CRUDModelImpl</code>.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param start the lower bound of the range of cruds
	 * @param end the upper bound of the range of cruds (not inclusive)
	 * @return the range of matching cruds
	 */
	public java.util.List<CRUD> findByG_G(long groupId, int start, int end);

	/**
	 * Returns an ordered range of all the cruds where groupId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CRUDModelImpl</code>.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param start the lower bound of the range of cruds
	 * @param end the upper bound of the range of cruds (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching cruds
	 */
	public java.util.List<CRUD> findByG_G(
		long groupId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<CRUD>
			orderByComparator);

	/**
	 * Returns an ordered range of all the cruds where groupId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CRUDModelImpl</code>.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param start the lower bound of the range of cruds
	 * @param end the upper bound of the range of cruds (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching cruds
	 */
	public java.util.List<CRUD> findByG_G(
		long groupId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<CRUD>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first crud in the ordered set where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching crud
	 * @throws NoSuchUDException if a matching crud could not be found
	 */
	public CRUD findByG_G_First(
			long groupId,
			com.liferay.portal.kernel.util.OrderByComparator<CRUD>
				orderByComparator)
		throws NoSuchUDException;

	/**
	 * Returns the first crud in the ordered set where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching crud, or <code>null</code> if a matching crud could not be found
	 */
	public CRUD fetchByG_G_First(
		long groupId,
		com.liferay.portal.kernel.util.OrderByComparator<CRUD>
			orderByComparator);

	/**
	 * Returns the last crud in the ordered set where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching crud
	 * @throws NoSuchUDException if a matching crud could not be found
	 */
	public CRUD findByG_G_Last(
			long groupId,
			com.liferay.portal.kernel.util.OrderByComparator<CRUD>
				orderByComparator)
		throws NoSuchUDException;

	/**
	 * Returns the last crud in the ordered set where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching crud, or <code>null</code> if a matching crud could not be found
	 */
	public CRUD fetchByG_G_Last(
		long groupId,
		com.liferay.portal.kernel.util.OrderByComparator<CRUD>
			orderByComparator);

	/**
	 * Returns the cruds before and after the current crud in the ordered set where groupId = &#63;.
	 *
	 * @param crudId the primary key of the current crud
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next crud
	 * @throws NoSuchUDException if a crud with the primary key could not be found
	 */
	public CRUD[] findByG_G_PrevAndNext(
			long crudId, long groupId,
			com.liferay.portal.kernel.util.OrderByComparator<CRUD>
				orderByComparator)
		throws NoSuchUDException;

	/**
	 * Removes all the cruds where groupId = &#63; from the database.
	 *
	 * @param groupId the group ID
	 */
	public void removeByG_G(long groupId);

	/**
	 * Returns the number of cruds where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @return the number of matching cruds
	 */
	public int countByG_G(long groupId);

	/**
	 * Caches the crud in the entity cache if it is enabled.
	 *
	 * @param crud the crud
	 */
	public void cacheResult(CRUD crud);

	/**
	 * Caches the cruds in the entity cache if it is enabled.
	 *
	 * @param cruds the cruds
	 */
	public void cacheResult(java.util.List<CRUD> cruds);

	/**
	 * Creates a new crud with the primary key. Does not add the crud to the database.
	 *
	 * @param crudId the primary key for the new crud
	 * @return the new crud
	 */
	public CRUD create(long crudId);

	/**
	 * Removes the crud with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param crudId the primary key of the crud
	 * @return the crud that was removed
	 * @throws NoSuchUDException if a crud with the primary key could not be found
	 */
	public CRUD remove(long crudId) throws NoSuchUDException;

	public CRUD updateImpl(CRUD crud);

	/**
	 * Returns the crud with the primary key or throws a <code>NoSuchUDException</code> if it could not be found.
	 *
	 * @param crudId the primary key of the crud
	 * @return the crud
	 * @throws NoSuchUDException if a crud with the primary key could not be found
	 */
	public CRUD findByPrimaryKey(long crudId) throws NoSuchUDException;

	/**
	 * Returns the crud with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param crudId the primary key of the crud
	 * @return the crud, or <code>null</code> if a crud with the primary key could not be found
	 */
	public CRUD fetchByPrimaryKey(long crudId);

	/**
	 * Returns all the cruds.
	 *
	 * @return the cruds
	 */
	public java.util.List<CRUD> findAll();

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
	public java.util.List<CRUD> findAll(int start, int end);

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
	public java.util.List<CRUD> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<CRUD>
			orderByComparator);

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
	public java.util.List<CRUD> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<CRUD>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the cruds from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of cruds.
	 *
	 * @return the number of cruds
	 */
	public int countAll();

}
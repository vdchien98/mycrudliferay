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

package crud.backend.model;

import com.liferay.portal.kernel.model.ModelWrapper;
import com.liferay.portal.kernel.model.wrapper.BaseModelWrapper;

import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link CRUD}.
 * </p>
 *
 * @author liferay
 * @see CRUD
 * @generated
 */
public class CRUDWrapper
	extends BaseModelWrapper<CRUD> implements CRUD, ModelWrapper<CRUD> {

	public CRUDWrapper(CRUD crud) {
		super(crud);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("uuid", getUuid());
		attributes.put("groupId", getGroupId());
		attributes.put("crudId", getCrudId());
		attributes.put("name", getName());
		attributes.put("department", getDepartment());
		attributes.put("phone", getPhone());
		attributes.put("email", getEmail());
		attributes.put("message", getMessage());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		String uuid = (String)attributes.get("uuid");

		if (uuid != null) {
			setUuid(uuid);
		}

		Long groupId = (Long)attributes.get("groupId");

		if (groupId != null) {
			setGroupId(groupId);
		}

		Long crudId = (Long)attributes.get("crudId");

		if (crudId != null) {
			setCrudId(crudId);
		}

		String name = (String)attributes.get("name");

		if (name != null) {
			setName(name);
		}

		String department = (String)attributes.get("department");

		if (department != null) {
			setDepartment(department);
		}

		String phone = (String)attributes.get("phone");

		if (phone != null) {
			setPhone(phone);
		}

		String email = (String)attributes.get("email");

		if (email != null) {
			setEmail(email);
		}

		String message = (String)attributes.get("message");

		if (message != null) {
			setMessage(message);
		}
	}

	@Override
	public CRUD cloneWithOriginalValues() {
		return wrap(model.cloneWithOriginalValues());
	}

	/**
	 * Returns the crud ID of this crud.
	 *
	 * @return the crud ID of this crud
	 */
	@Override
	public long getCrudId() {
		return model.getCrudId();
	}

	/**
	 * Returns the department of this crud.
	 *
	 * @return the department of this crud
	 */
	@Override
	public String getDepartment() {
		return model.getDepartment();
	}

	/**
	 * Returns the email of this crud.
	 *
	 * @return the email of this crud
	 */
	@Override
	public String getEmail() {
		return model.getEmail();
	}

	/**
	 * Returns the group ID of this crud.
	 *
	 * @return the group ID of this crud
	 */
	@Override
	public long getGroupId() {
		return model.getGroupId();
	}

	/**
	 * Returns the message of this crud.
	 *
	 * @return the message of this crud
	 */
	@Override
	public String getMessage() {
		return model.getMessage();
	}

	/**
	 * Returns the name of this crud.
	 *
	 * @return the name of this crud
	 */
	@Override
	public String getName() {
		return model.getName();
	}

	/**
	 * Returns the phone of this crud.
	 *
	 * @return the phone of this crud
	 */
	@Override
	public String getPhone() {
		return model.getPhone();
	}

	/**
	 * Returns the primary key of this crud.
	 *
	 * @return the primary key of this crud
	 */
	@Override
	public long getPrimaryKey() {
		return model.getPrimaryKey();
	}

	/**
	 * Returns the uuid of this crud.
	 *
	 * @return the uuid of this crud
	 */
	@Override
	public String getUuid() {
		return model.getUuid();
	}

	@Override
	public void persist() {
		model.persist();
	}

	/**
	 * Sets the crud ID of this crud.
	 *
	 * @param crudId the crud ID of this crud
	 */
	@Override
	public void setCrudId(long crudId) {
		model.setCrudId(crudId);
	}

	/**
	 * Sets the department of this crud.
	 *
	 * @param department the department of this crud
	 */
	@Override
	public void setDepartment(String department) {
		model.setDepartment(department);
	}

	/**
	 * Sets the email of this crud.
	 *
	 * @param email the email of this crud
	 */
	@Override
	public void setEmail(String email) {
		model.setEmail(email);
	}

	/**
	 * Sets the group ID of this crud.
	 *
	 * @param groupId the group ID of this crud
	 */
	@Override
	public void setGroupId(long groupId) {
		model.setGroupId(groupId);
	}

	/**
	 * Sets the message of this crud.
	 *
	 * @param message the message of this crud
	 */
	@Override
	public void setMessage(String message) {
		model.setMessage(message);
	}

	/**
	 * Sets the name of this crud.
	 *
	 * @param name the name of this crud
	 */
	@Override
	public void setName(String name) {
		model.setName(name);
	}

	/**
	 * Sets the phone of this crud.
	 *
	 * @param phone the phone of this crud
	 */
	@Override
	public void setPhone(String phone) {
		model.setPhone(phone);
	}

	/**
	 * Sets the primary key of this crud.
	 *
	 * @param primaryKey the primary key of this crud
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		model.setPrimaryKey(primaryKey);
	}

	/**
	 * Sets the uuid of this crud.
	 *
	 * @param uuid the uuid of this crud
	 */
	@Override
	public void setUuid(String uuid) {
		model.setUuid(uuid);
	}

	@Override
	protected CRUDWrapper wrap(CRUD crud) {
		return new CRUDWrapper(crud);
	}

}
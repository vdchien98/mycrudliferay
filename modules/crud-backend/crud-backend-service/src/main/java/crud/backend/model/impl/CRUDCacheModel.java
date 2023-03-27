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

package crud.backend.model.impl;

import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;

import crud.backend.model.CRUD;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/**
 * The cache model class for representing CRUD in entity cache.
 *
 * @author liferay
 * @generated
 */
public class CRUDCacheModel implements CacheModel<CRUD>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof CRUDCacheModel)) {
			return false;
		}

		CRUDCacheModel crudCacheModel = (CRUDCacheModel)object;

		if (crudId == crudCacheModel.crudId) {
			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, crudId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(15);

		sb.append("{uuid=");
		sb.append(uuid);
		sb.append(", crudId=");
		sb.append(crudId);
		sb.append(", name=");
		sb.append(name);
		sb.append(", department=");
		sb.append(department);
		sb.append(", phone=");
		sb.append(phone);
		sb.append(", email=");
		sb.append(email);
		sb.append(", message=");
		sb.append(message);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public CRUD toEntityModel() {
		CRUDImpl crudImpl = new CRUDImpl();

		if (uuid == null) {
			crudImpl.setUuid("");
		}
		else {
			crudImpl.setUuid(uuid);
		}

		crudImpl.setCrudId(crudId);

		if (name == null) {
			crudImpl.setName("");
		}
		else {
			crudImpl.setName(name);
		}

		if (department == null) {
			crudImpl.setDepartment("");
		}
		else {
			crudImpl.setDepartment(department);
		}

		if (phone == null) {
			crudImpl.setPhone("");
		}
		else {
			crudImpl.setPhone(phone);
		}

		if (email == null) {
			crudImpl.setEmail("");
		}
		else {
			crudImpl.setEmail(email);
		}

		if (message == null) {
			crudImpl.setMessage("");
		}
		else {
			crudImpl.setMessage(message);
		}

		crudImpl.resetOriginalValues();

		return crudImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		uuid = objectInput.readUTF();

		crudId = objectInput.readLong();
		name = objectInput.readUTF();
		department = objectInput.readUTF();
		phone = objectInput.readUTF();
		email = objectInput.readUTF();
		message = objectInput.readUTF();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		if (uuid == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(uuid);
		}

		objectOutput.writeLong(crudId);

		if (name == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(name);
		}

		if (department == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(department);
		}

		if (phone == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(phone);
		}

		if (email == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(email);
		}

		if (message == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(message);
		}
	}

	public String uuid;
	public long crudId;
	public String name;
	public String department;
	public String phone;
	public String email;
	public String message;

}
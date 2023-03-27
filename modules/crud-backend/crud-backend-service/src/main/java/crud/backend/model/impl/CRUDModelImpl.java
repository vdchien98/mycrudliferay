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

import com.liferay.expando.kernel.model.ExpandoBridge;
import com.liferay.expando.kernel.util.ExpandoBridgeFactoryUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.json.JSON;
import com.liferay.portal.kernel.model.CacheModel;
import com.liferay.portal.kernel.model.ModelWrapper;
import com.liferay.portal.kernel.model.impl.BaseModelImpl;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringUtil;

import crud.backend.model.CRUD;
import crud.backend.model.CRUDModel;

import java.io.Serializable;

import java.lang.reflect.InvocationHandler;

import java.sql.Blob;
import java.sql.Types;

import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import java.util.function.BiConsumer;
import java.util.function.Function;

/**
 * The base model implementation for the CRUD service. Represents a row in the &quot;CR_CRUD&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface <code>CRUDModel</code> exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link CRUDImpl}.
 * </p>
 *
 * @author liferay
 * @see CRUDImpl
 * @generated
 */
@JSON(strict = true)
public class CRUDModelImpl extends BaseModelImpl<CRUD> implements CRUDModel {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a crud model instance should use the <code>CRUD</code> interface instead.
	 */
	public static final String TABLE_NAME = "CR_CRUD";

	public static final Object[][] TABLE_COLUMNS = {
		{"uuid_", Types.VARCHAR}, {"crudId", Types.BIGINT},
		{"name", Types.VARCHAR}, {"department", Types.VARCHAR},
		{"phone", Types.VARCHAR}, {"email", Types.VARCHAR},
		{"message", Types.VARCHAR}
	};

	public static final Map<String, Integer> TABLE_COLUMNS_MAP =
		new HashMap<String, Integer>();

	static {
		TABLE_COLUMNS_MAP.put("uuid_", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("crudId", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("name", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("department", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("phone", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("email", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("message", Types.VARCHAR);
	}

	public static final String TABLE_SQL_CREATE =
		"create table CR_CRUD (uuid_ VARCHAR(75) null,crudId LONG not null primary key,name VARCHAR(75) null,department VARCHAR(75) null,phone VARCHAR(75) null,email VARCHAR(75) null,message VARCHAR(75) null)";

	public static final String TABLE_SQL_DROP = "drop table CR_CRUD";

	public static final String ORDER_BY_JPQL = " ORDER BY crud.crudId ASC";

	public static final String ORDER_BY_SQL = " ORDER BY CR_CRUD.crudId ASC";

	public static final String DATA_SOURCE = "liferayDataSource";

	public static final String SESSION_FACTORY = "liferaySessionFactory";

	public static final String TX_MANAGER = "liferayTransactionManager";

	/**
	 * @deprecated As of Athanasius (7.3.x), replaced by {@link #getColumnBitmask(String)}
	 */
	@Deprecated
	public static final long CRUDID_COLUMN_BITMASK = 1L;

	/**
	 * @deprecated As of Athanasius (7.3.x), replaced by {@link #getColumnBitmask(String)}
	 */
	@Deprecated
	public static final long UUID_COLUMN_BITMASK = 2L;

	/**
	 * @deprecated As of Athanasius (7.3.x), with no direct replacement
	 */
	@Deprecated
	public static void setEntityCacheEnabled(boolean entityCacheEnabled) {
	}

	/**
	 * @deprecated As of Athanasius (7.3.x), with no direct replacement
	 */
	@Deprecated
	public static void setFinderCacheEnabled(boolean finderCacheEnabled) {
	}

	public CRUDModelImpl() {
	}

	@Override
	public long getPrimaryKey() {
		return _crudId;
	}

	@Override
	public void setPrimaryKey(long primaryKey) {
		setCrudId(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _crudId;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	@Override
	public Class<?> getModelClass() {
		return CRUD.class;
	}

	@Override
	public String getModelClassName() {
		return CRUD.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		Map<String, Function<CRUD, Object>> attributeGetterFunctions =
			getAttributeGetterFunctions();

		for (Map.Entry<String, Function<CRUD, Object>> entry :
				attributeGetterFunctions.entrySet()) {

			String attributeName = entry.getKey();
			Function<CRUD, Object> attributeGetterFunction = entry.getValue();

			attributes.put(
				attributeName, attributeGetterFunction.apply((CRUD)this));
		}

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Map<String, BiConsumer<CRUD, Object>> attributeSetterBiConsumers =
			getAttributeSetterBiConsumers();

		for (Map.Entry<String, Object> entry : attributes.entrySet()) {
			String attributeName = entry.getKey();

			BiConsumer<CRUD, Object> attributeSetterBiConsumer =
				attributeSetterBiConsumers.get(attributeName);

			if (attributeSetterBiConsumer != null) {
				attributeSetterBiConsumer.accept((CRUD)this, entry.getValue());
			}
		}
	}

	public Map<String, Function<CRUD, Object>> getAttributeGetterFunctions() {
		return _attributeGetterFunctions;
	}

	public Map<String, BiConsumer<CRUD, Object>>
		getAttributeSetterBiConsumers() {

		return _attributeSetterBiConsumers;
	}

	private static final Map<String, Function<CRUD, Object>>
		_attributeGetterFunctions;
	private static final Map<String, BiConsumer<CRUD, Object>>
		_attributeSetterBiConsumers;

	static {
		Map<String, Function<CRUD, Object>> attributeGetterFunctions =
			new LinkedHashMap<String, Function<CRUD, Object>>();
		Map<String, BiConsumer<CRUD, ?>> attributeSetterBiConsumers =
			new LinkedHashMap<String, BiConsumer<CRUD, ?>>();

		attributeGetterFunctions.put("uuid", CRUD::getUuid);
		attributeSetterBiConsumers.put(
			"uuid", (BiConsumer<CRUD, String>)CRUD::setUuid);
		attributeGetterFunctions.put("crudId", CRUD::getCrudId);
		attributeSetterBiConsumers.put(
			"crudId", (BiConsumer<CRUD, Long>)CRUD::setCrudId);
		attributeGetterFunctions.put("name", CRUD::getName);
		attributeSetterBiConsumers.put(
			"name", (BiConsumer<CRUD, String>)CRUD::setName);
		attributeGetterFunctions.put("department", CRUD::getDepartment);
		attributeSetterBiConsumers.put(
			"department", (BiConsumer<CRUD, String>)CRUD::setDepartment);
		attributeGetterFunctions.put("phone", CRUD::getPhone);
		attributeSetterBiConsumers.put(
			"phone", (BiConsumer<CRUD, String>)CRUD::setPhone);
		attributeGetterFunctions.put("email", CRUD::getEmail);
		attributeSetterBiConsumers.put(
			"email", (BiConsumer<CRUD, String>)CRUD::setEmail);
		attributeGetterFunctions.put("message", CRUD::getMessage);
		attributeSetterBiConsumers.put(
			"message", (BiConsumer<CRUD, String>)CRUD::setMessage);

		_attributeGetterFunctions = Collections.unmodifiableMap(
			attributeGetterFunctions);
		_attributeSetterBiConsumers = Collections.unmodifiableMap(
			(Map)attributeSetterBiConsumers);
	}

	@JSON
	@Override
	public String getUuid() {
		if (_uuid == null) {
			return "";
		}
		else {
			return _uuid;
		}
	}

	@Override
	public void setUuid(String uuid) {
		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_uuid = uuid;
	}

	/**
	 * @deprecated As of Athanasius (7.3.x), replaced by {@link
	 *             #getColumnOriginalValue(String)}
	 */
	@Deprecated
	public String getOriginalUuid() {
		return getColumnOriginalValue("uuid_");
	}

	@JSON
	@Override
	public long getCrudId() {
		return _crudId;
	}

	@Override
	public void setCrudId(long crudId) {
		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_crudId = crudId;
	}

	/**
	 * @deprecated As of Athanasius (7.3.x), replaced by {@link
	 *             #getColumnOriginalValue(String)}
	 */
	@Deprecated
	public long getOriginalCrudId() {
		return GetterUtil.getLong(this.<Long>getColumnOriginalValue("crudId"));
	}

	@JSON
	@Override
	public String getName() {
		if (_name == null) {
			return "";
		}
		else {
			return _name;
		}
	}

	@Override
	public void setName(String name) {
		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_name = name;
	}

	@JSON
	@Override
	public String getDepartment() {
		if (_department == null) {
			return "";
		}
		else {
			return _department;
		}
	}

	@Override
	public void setDepartment(String department) {
		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_department = department;
	}

	@JSON
	@Override
	public String getPhone() {
		if (_phone == null) {
			return "";
		}
		else {
			return _phone;
		}
	}

	@Override
	public void setPhone(String phone) {
		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_phone = phone;
	}

	@JSON
	@Override
	public String getEmail() {
		if (_email == null) {
			return "";
		}
		else {
			return _email;
		}
	}

	@Override
	public void setEmail(String email) {
		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_email = email;
	}

	@JSON
	@Override
	public String getMessage() {
		if (_message == null) {
			return "";
		}
		else {
			return _message;
		}
	}

	@Override
	public void setMessage(String message) {
		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_message = message;
	}

	public long getColumnBitmask() {
		if (_columnBitmask > 0) {
			return _columnBitmask;
		}

		if ((_columnOriginalValues == null) ||
			(_columnOriginalValues == Collections.EMPTY_MAP)) {

			return 0;
		}

		for (Map.Entry<String, Object> entry :
				_columnOriginalValues.entrySet()) {

			if (!Objects.equals(
					entry.getValue(), getColumnValue(entry.getKey()))) {

				_columnBitmask |= _columnBitmasks.get(entry.getKey());
			}
		}

		return _columnBitmask;
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return ExpandoBridgeFactoryUtil.getExpandoBridge(
			0, CRUD.class.getName(), getPrimaryKey());
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		ExpandoBridge expandoBridge = getExpandoBridge();

		expandoBridge.setAttributes(serviceContext);
	}

	@Override
	public CRUD toEscapedModel() {
		if (_escapedModel == null) {
			Function<InvocationHandler, CRUD>
				escapedModelProxyProviderFunction =
					EscapedModelProxyProviderFunctionHolder.
						_escapedModelProxyProviderFunction;

			_escapedModel = escapedModelProxyProviderFunction.apply(
				new AutoEscapeBeanHandler(this));
		}

		return _escapedModel;
	}

	@Override
	public Object clone() {
		CRUDImpl crudImpl = new CRUDImpl();

		crudImpl.setUuid(getUuid());
		crudImpl.setCrudId(getCrudId());
		crudImpl.setName(getName());
		crudImpl.setDepartment(getDepartment());
		crudImpl.setPhone(getPhone());
		crudImpl.setEmail(getEmail());
		crudImpl.setMessage(getMessage());

		crudImpl.resetOriginalValues();

		return crudImpl;
	}

	@Override
	public CRUD cloneWithOriginalValues() {
		CRUDImpl crudImpl = new CRUDImpl();

		crudImpl.setUuid(this.<String>getColumnOriginalValue("uuid_"));
		crudImpl.setCrudId(this.<Long>getColumnOriginalValue("crudId"));
		crudImpl.setName(this.<String>getColumnOriginalValue("name"));
		crudImpl.setDepartment(
			this.<String>getColumnOriginalValue("department"));
		crudImpl.setPhone(this.<String>getColumnOriginalValue("phone"));
		crudImpl.setEmail(this.<String>getColumnOriginalValue("email"));
		crudImpl.setMessage(this.<String>getColumnOriginalValue("message"));

		return crudImpl;
	}

	@Override
	public int compareTo(CRUD crud) {
		long primaryKey = crud.getPrimaryKey();

		if (getPrimaryKey() < primaryKey) {
			return -1;
		}
		else if (getPrimaryKey() > primaryKey) {
			return 1;
		}
		else {
			return 0;
		}
	}

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof CRUD)) {
			return false;
		}

		CRUD crud = (CRUD)object;

		long primaryKey = crud.getPrimaryKey();

		if (getPrimaryKey() == primaryKey) {
			return true;
		}
		else {
			return false;
		}
	}

	@Override
	public int hashCode() {
		return (int)getPrimaryKey();
	}

	/**
	 * @deprecated As of Athanasius (7.3.x), with no direct replacement
	 */
	@Deprecated
	@Override
	public boolean isEntityCacheEnabled() {
		return true;
	}

	/**
	 * @deprecated As of Athanasius (7.3.x), with no direct replacement
	 */
	@Deprecated
	@Override
	public boolean isFinderCacheEnabled() {
		return true;
	}

	@Override
	public void resetOriginalValues() {
		_columnOriginalValues = Collections.emptyMap();

		_columnBitmask = 0;
	}

	@Override
	public CacheModel<CRUD> toCacheModel() {
		CRUDCacheModel crudCacheModel = new CRUDCacheModel();

		crudCacheModel.uuid = getUuid();

		String uuid = crudCacheModel.uuid;

		if ((uuid != null) && (uuid.length() == 0)) {
			crudCacheModel.uuid = null;
		}

		crudCacheModel.crudId = getCrudId();

		crudCacheModel.name = getName();

		String name = crudCacheModel.name;

		if ((name != null) && (name.length() == 0)) {
			crudCacheModel.name = null;
		}

		crudCacheModel.department = getDepartment();

		String department = crudCacheModel.department;

		if ((department != null) && (department.length() == 0)) {
			crudCacheModel.department = null;
		}

		crudCacheModel.phone = getPhone();

		String phone = crudCacheModel.phone;

		if ((phone != null) && (phone.length() == 0)) {
			crudCacheModel.phone = null;
		}

		crudCacheModel.email = getEmail();

		String email = crudCacheModel.email;

		if ((email != null) && (email.length() == 0)) {
			crudCacheModel.email = null;
		}

		crudCacheModel.message = getMessage();

		String message = crudCacheModel.message;

		if ((message != null) && (message.length() == 0)) {
			crudCacheModel.message = null;
		}

		return crudCacheModel;
	}

	@Override
	public String toString() {
		Map<String, Function<CRUD, Object>> attributeGetterFunctions =
			getAttributeGetterFunctions();

		StringBundler sb = new StringBundler(
			(5 * attributeGetterFunctions.size()) + 2);

		sb.append("{");

		for (Map.Entry<String, Function<CRUD, Object>> entry :
				attributeGetterFunctions.entrySet()) {

			String attributeName = entry.getKey();
			Function<CRUD, Object> attributeGetterFunction = entry.getValue();

			sb.append("\"");
			sb.append(attributeName);
			sb.append("\": ");

			Object value = attributeGetterFunction.apply((CRUD)this);

			if (value == null) {
				sb.append("null");
			}
			else if (value instanceof Blob || value instanceof Date ||
					 value instanceof Map || value instanceof String) {

				sb.append(
					"\"" + StringUtil.replace(value.toString(), "\"", "'") +
						"\"");
			}
			else {
				sb.append(value);
			}

			sb.append(", ");
		}

		if (sb.index() > 1) {
			sb.setIndex(sb.index() - 1);
		}

		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		Map<String, Function<CRUD, Object>> attributeGetterFunctions =
			getAttributeGetterFunctions();

		StringBundler sb = new StringBundler(
			(5 * attributeGetterFunctions.size()) + 4);

		sb.append("<model><model-name>");
		sb.append(getModelClassName());
		sb.append("</model-name>");

		for (Map.Entry<String, Function<CRUD, Object>> entry :
				attributeGetterFunctions.entrySet()) {

			String attributeName = entry.getKey();
			Function<CRUD, Object> attributeGetterFunction = entry.getValue();

			sb.append("<column><column-name>");
			sb.append(attributeName);
			sb.append("</column-name><column-value><![CDATA[");
			sb.append(attributeGetterFunction.apply((CRUD)this));
			sb.append("]]></column-value></column>");
		}

		sb.append("</model>");

		return sb.toString();
	}

	private static class EscapedModelProxyProviderFunctionHolder {

		private static final Function<InvocationHandler, CRUD>
			_escapedModelProxyProviderFunction =
				ProxyUtil.getProxyProviderFunction(
					CRUD.class, ModelWrapper.class);

	}

	private String _uuid;
	private long _crudId;
	private String _name;
	private String _department;
	private String _phone;
	private String _email;
	private String _message;

	public <T> T getColumnValue(String columnName) {
		columnName = _attributeNames.getOrDefault(columnName, columnName);

		Function<CRUD, Object> function = _attributeGetterFunctions.get(
			columnName);

		if (function == null) {
			throw new IllegalArgumentException(
				"No attribute getter function found for " + columnName);
		}

		return (T)function.apply((CRUD)this);
	}

	public <T> T getColumnOriginalValue(String columnName) {
		if (_columnOriginalValues == null) {
			return null;
		}

		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		return (T)_columnOriginalValues.get(columnName);
	}

	private void _setColumnOriginalValues() {
		_columnOriginalValues = new HashMap<String, Object>();

		_columnOriginalValues.put("uuid_", _uuid);
		_columnOriginalValues.put("crudId", _crudId);
		_columnOriginalValues.put("name", _name);
		_columnOriginalValues.put("department", _department);
		_columnOriginalValues.put("phone", _phone);
		_columnOriginalValues.put("email", _email);
		_columnOriginalValues.put("message", _message);
	}

	private static final Map<String, String> _attributeNames;

	static {
		Map<String, String> attributeNames = new HashMap<>();

		attributeNames.put("uuid_", "uuid");

		_attributeNames = Collections.unmodifiableMap(attributeNames);
	}

	private transient Map<String, Object> _columnOriginalValues;

	public static long getColumnBitmask(String columnName) {
		return _columnBitmasks.get(columnName);
	}

	private static final Map<String, Long> _columnBitmasks;

	static {
		Map<String, Long> columnBitmasks = new HashMap<>();

		columnBitmasks.put("uuid_", 1L);

		columnBitmasks.put("crudId", 2L);

		columnBitmasks.put("name", 4L);

		columnBitmasks.put("department", 8L);

		columnBitmasks.put("phone", 16L);

		columnBitmasks.put("email", 32L);

		columnBitmasks.put("message", 64L);

		_columnBitmasks = Collections.unmodifiableMap(columnBitmasks);
	}

	private long _columnBitmask;
	private CRUD _escapedModel;

}
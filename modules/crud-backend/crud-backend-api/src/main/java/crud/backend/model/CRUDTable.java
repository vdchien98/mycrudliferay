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

import com.liferay.petra.sql.dsl.Column;
import com.liferay.petra.sql.dsl.base.BaseTable;

import java.sql.Types;

/**
 * The table class for the &quot;CR_CRUD&quot; database table.
 *
 * @author liferay
 * @see CRUD
 * @generated
 */
public class CRUDTable extends BaseTable<CRUDTable> {

	public static final CRUDTable INSTANCE = new CRUDTable();

	public final Column<CRUDTable, String> uuid = createColumn(
		"uuid_", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<CRUDTable, Long> crudId = createColumn(
		"crudId", Long.class, Types.BIGINT, Column.FLAG_PRIMARY);
	public final Column<CRUDTable, String> name = createColumn(
		"name", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<CRUDTable, String> department = createColumn(
		"department", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<CRUDTable, String> phone = createColumn(
		"phone", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<CRUDTable, String> email = createColumn(
		"email", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<CRUDTable, String> message = createColumn(
		"message", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);

	private CRUDTable() {
		super("CR_CRUD", CRUDTable::new);
	}

}
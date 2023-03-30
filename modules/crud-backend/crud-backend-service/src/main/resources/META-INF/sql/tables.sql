create table CR_CRUD (
	uuid_ VARCHAR(75) null,
	groupId LONG,
	crudId LONG not null primary key,
	name VARCHAR(75) null,
	department VARCHAR(75) null,
	phone VARCHAR(75) null,
	email VARCHAR(75) null,
	message VARCHAR(75) null
);
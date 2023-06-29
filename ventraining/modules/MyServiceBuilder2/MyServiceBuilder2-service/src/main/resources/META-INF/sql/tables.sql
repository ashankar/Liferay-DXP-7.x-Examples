create table vt_Employee (
	uuid_ VARCHAR(75) null,
	empId LONG not null primary key,
	depId LONG,
	groupId LONG,
	companyId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null,
	age INTEGER,
	address VARCHAR(200) null
);

create table vt_XyzOrg (
	uuid_ VARCHAR(75) null,
	depId LONG not null primary key,
	depName VARCHAR(75) null
);
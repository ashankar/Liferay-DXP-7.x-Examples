create table mysb_Department (
	uuid_ LONG not null primary key,
	deptId LONG,
	name VARCHAR(75) null
);

create table mysb_Employee (
	empId LONG not null primary key,
	name VARCHAR(75) null,
	address VARCHAR(75) null,
	companyId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null,
	deptId LONG
);

create table mysb_Organization (
	orgId LONG not null primary key,
	name VARCHAR(75) null
);
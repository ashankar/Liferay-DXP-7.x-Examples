create table amolsb_Department (
	uuid_ LONG not null primary key,
	deptId LONG,
	name VARCHAR(200) null
);

create table amolsb_Employee (
	empId LONG not null primary key,
	name VARCHAR(200) null,
	address VARCHAR(300) null,
	companyId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null,
	deptId LONG
);
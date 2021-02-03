create table MyFirstSbNs_CustomUser (
	id_ LONG not null primary key
);

create table MyFirstSbNs_Department (
	uuid_ VARCHAR(75) null,
	deptId LONG not null primary key,
	name VARCHAR(75) null,
	hod VARCHAR(75) null
);

create table MyFirstSbNs_Employee (
	employeeId LONG not null primary key,
	groupId LONG,
	companyId LONG,
	userId LONG,
	userName VARCHAR(200) null,
	createDate DATE null,
	modifiedDate DATE null,
	dob DATE null,
	mobile INTEGER,
	address VARCHAR(500) null,
	deptId LONG
);

create table MyFirstSbNs_Salary (
	uuid_ VARCHAR(75) null,
	salId LONG not null primary key,
	amount LONG,
	employeeId LONG
);
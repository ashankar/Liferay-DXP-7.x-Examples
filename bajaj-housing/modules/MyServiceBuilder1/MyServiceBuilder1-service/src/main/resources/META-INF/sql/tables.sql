create table mybj_Department (
	uuid_ VARCHAR(75) null,
	depId LONG not null primary key,
	depName VARCHAR(75) null
);

create table mybj_Employee (
	uuid_ VARCHAR(75) null,
	empId LONG not null primary key,
	depId LONG,
	companyId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null,
	name VARCHAR(75) null,
	address VARCHAR(200) null,
	age INTEGER
);
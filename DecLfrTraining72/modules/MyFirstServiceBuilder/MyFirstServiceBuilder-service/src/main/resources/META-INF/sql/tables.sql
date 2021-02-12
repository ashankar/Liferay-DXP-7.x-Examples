create table mysbns_Employee (
	empId LONG not null primary key,
	name VARCHAR(75) null,
	mobile VARCHAR(75) null,
	address VARCHAR(75) null,
	jobTitle VARCHAR(75) null,
	groupId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null
);
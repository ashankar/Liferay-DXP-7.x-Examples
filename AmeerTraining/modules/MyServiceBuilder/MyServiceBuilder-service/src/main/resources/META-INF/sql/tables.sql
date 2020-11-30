create table MySbNs_Employee (
	employeeId LONG not null primary key,
	groupId LONG,
	companyId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null,
	address VARCHAR(75) null,
	mobile VARCHAR(75) null
);
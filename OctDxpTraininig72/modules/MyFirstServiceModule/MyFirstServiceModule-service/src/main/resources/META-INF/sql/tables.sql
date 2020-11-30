create table MyFirstSbNs_Employee (
	employeeId LONG not null primary key,
	groupId LONG,
	companyId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null,
	dob DATE null,
	mobile INTEGER,
	address VARCHAR(75) null
);
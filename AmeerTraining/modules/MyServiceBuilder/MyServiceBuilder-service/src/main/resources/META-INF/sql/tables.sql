create table MySbNs_Address (
	uuid_ VARCHAR(75) null,
	addrId VARCHAR(75) not null primary key,
	houseNo VARCHAR(75) null,
	StreetNo VARCHAR(75) null,
	city VARCHAR(75) null,
	state_ VARCHAR(75) null,
	country VARCHAR(75) null
);

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
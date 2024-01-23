create index IX_584B8631 on mybj_Department (uuid_[$COLUMN_LENGTH:75$]);

create index IX_FDCBCDBE on mybj_Employee (name[$COLUMN_LENGTH:75$]);
create index IX_E6DBF973 on mybj_Employee (uuid_[$COLUMN_LENGTH:75$], companyId);
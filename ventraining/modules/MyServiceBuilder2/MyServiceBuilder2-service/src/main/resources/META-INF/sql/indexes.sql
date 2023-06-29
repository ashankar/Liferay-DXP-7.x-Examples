create index IX_E8460B5F on vt_Employee (userName[$COLUMN_LENGTH:75$]);
create index IX_9C2115E9 on vt_Employee (uuid_[$COLUMN_LENGTH:75$], companyId);
create unique index IX_5B9802AB on vt_Employee (uuid_[$COLUMN_LENGTH:75$], groupId);

create index IX_E2D3B562 on vt_XyzOrg (uuid_[$COLUMN_LENGTH:75$]);
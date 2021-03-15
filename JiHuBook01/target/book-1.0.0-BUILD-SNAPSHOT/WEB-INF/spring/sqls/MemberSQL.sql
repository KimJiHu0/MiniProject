drop table member;

create table member(
	memberidx int unsigned auto_increment
	memberid varchar(100) not null,
	memberpw varchar(100) unique,
	membername varchar(100) not null,
	memberflag
	memberrole
);
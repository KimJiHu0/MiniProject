drop table user;

CREATE TABLE USER (
    USERNO INT AUTO_INCREMENT,
    USERID VARCHAR(100) NOT NULL,
    USERPW VARCHAR(1000) NOT NULL,
    USERNAME VARCHAR(100) NOT NULL,
    -- USER ROLE로 구분을 하기 떄문에 있어야한다고 한다.
    USERROLE VARCHAR(50) NOT NULL DEFAULT 'ROLE_USER',
    -- enabled는 무조건 있어야한다.
    ENABLED tinyint(1) unsigned zerofill DEFAULT '1',
    PRIMARY KEY (USERNO)
) ENGINE=InnoDB DEFAULT CHARSET=UTF8
DROP TABLE IF EXISTS NAMECARD;

CREATE TABLE NAMECARD ( ID INT(12) NOT NULL AUTO_INCREMENT, NAME varchar(12) NOT NULL, PHONENUMBER varchar(20), MEMO varchar(255),

PRIMARY KEY (ID) );

INSERT INTO NAMECARD VALUES(1, 'DEVIN', '010-555-5555', 'ujacha.factory@gmail.com');
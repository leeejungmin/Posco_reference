
CREATE TABLE MEMBER(
	ID VARCHAR(50) PRIMARY KEY, 
	PWD VARCHAR(50) NOT NULL,
	NAME VARCHAR(50) NOT NULL,
	EMAIL VARCHAR(50) UNIQUE,
	AUTH INT NOT NULL
);
-- PRIMARY KEY:빈칸안돼! + 같은 값안돼!
-- UNIQUE:빈칸돼 + 같은 값안돼!

select * from MEMBER;


DROP TABLE IF EXISTS STUDENTS;
CREATE TABLE STUDENTS(
   ID         INTEGER  NOT NULL PRIMARY KEY ,
   FIRST_NAME VARCHAR(255) NOT NULL,
   LAST_NAME  VARCHAR(255) NOT NULL,
   EMAIL      VARCHAR(255) NOT NULL,
   CONTRACT   VARCHAR(255) NOT NULL,
   JOBS       VARCHAR(255) NOT NULL,
   EXPERIENCE VARCHAR(255) NOT NULL,
   ACTIVITIES VARCHAR(255) NOT NULL
);
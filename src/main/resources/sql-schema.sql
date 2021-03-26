--Database schema file for the production db.
--Currently, this will reset the MySQL database each time the program is ran.
--You will need to expand this schema to include any relevant tables.
DROP SCHEMA `ims`;
CREATE SCHEMA IF NOT EXISTS `ims`;
USE `ims`;

CREATE TABLE CUSTOMERS (CustId INTEGER not NULL, FirstName VARCHAR(255),LastName VARCHAR(255),  PRIMARY KEY ( CustId ));

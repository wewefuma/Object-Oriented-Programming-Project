CREATE DATABASE dboop;

USE dboop;

CREATE TABLE tblaccount			# account
(
	ID int(2) PRIMARY KEY UNIQUE AUTO_INCREMENT not null,
	Name varchar(250) not null,
    User varchar(250) not null,
    Password varchar(250) not null,
    Access varchar(250) not null
);

INSERT INTO tblaccount (ID, Name, User, Password, Access)
VALUES ('1', 'Angelo', 'Champupoy', 'pop123123', 'Admin');
	
CREATE TABLE tblInventory		# inventory
(
	ID int(3) PRIMARY KEY UNIQUE auto_increment not null,
    ProductName varchar(250) not null,
    Quantity int(3) not null
);

CREATE TABLE tblSalesMonitoring	#salesmonitoring
(
	ID int(3) PRIMARY KEY UNIQUE auto_increment not null,
    ProductName varchar(250) not null,
	`Date&Time`	DATETIME not null      #DATETIME format is YYYY-MM-DD hh:mm:ss
);

CREATE TABLE tblLogbook			#logbook
(
	ID int(3) PRIMARY KEY unique auto_increment not null,
    Name varchar(250) not null,
    VariableChange varchar(250) not null,
    `Date&Time` DATETIME not null
);

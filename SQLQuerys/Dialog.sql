CREATE TABLE Dialog (
ID nvarchar(25) NOT NULL PRIMARY KEY,
Text nvarchar(255) NOT NULL,
Alternative1 nvarchar(25) NOT NULL,
Alternative2 nvarchar(25) NOT NULL,
Flag int NOT NULL,
Chosen_Attribute varchar(25)
);

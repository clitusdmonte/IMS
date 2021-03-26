--Database dummy-data file for the production db.
--Currently, this will be picked up by the MySQL database each time the program is ran, after being reset to the contents of your schema file.
--You will need to expand this file to include any relevant dummy-data.
INSERT INTO ims.Customers (CustId, FirstName, LastName) VALUES ( 1, 'Tom', 'B. Erichsen');
INSERT INTO ims.Customers (CustId, FirstName, LastName) VALUES ( 1, 'Mohan', 'B. Erichsen');
INSERT INTO ims.Customers (CustId, FirstName, LastName) VALUES ( 2, 'Raj', 'Erichsen');
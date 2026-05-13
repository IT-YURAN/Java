# Java Database Connectivity (JDBC)
**JDNC** is an API that helps applications to communicate with databases. <br>

## With JDBC, we can:

* Connect to a Database
* Insert Data
* Update Data
* Delete Data
* Ask for Data(Queries)
* Get data from the Database

### How does JDBC works?

Basic Flow:

`Java Application -> JDBC -> JDBC Driver -> Database`

## What is JDBC Driver?
JDBC Driver is a library that allows **Java** to interact with a specified **Database** <br>
**Each Database has its own Drive:**
1. MYSQL: mysql-connector-j
2. PostgresSQL: postgreSQL
3. SQL Server: mssql-jdbc
4. Oracle: ojdbc

## JDBC Architecture

* **DriverManager:** Creates Connection
* **Connection:**  Represents  the connection with the DB
* **Statement:** Executes SQL
* **PreparedStatement:** Executes parameterized SQL
* **ResultSet:** Save the data from queries**

## Components of JDBC

1. Application: It can be a Java application or servlet that communicates with a data source.
2. JDBC API: It allows Java programs to execute SQL queries and get results from the database. Some key components of JDBC API include: <br>
   **Interfaces like Driver, ResultSet, RowSet, PreparedStatement and Connection that helps managing different database tasks. <br>
   **Classes like DriverManager, Types, Blob and Clob that helps managing database connections.****

3. DriverManager: It plays an important role in the JDBC architecture. It uses some database-specific drivers to effectively connect enterprise applications to databases.
4. JDBC drivers: These drivers handle interactions between the application and the database.

## JDBC Classes and Interfaces

1. **DriverManager**	Manages JDBC drivers and establishes database connections.
2. **Connection**	Represents a session with a specific database.
3. **Statement**	Used to execute static SQL queries.
4. **PreparedStatement**	Precompiled SQL statement, used for dynamic queries with parameters.
5. **CallableStatement**	Used to execute stored procedures in the database.ResultSet	Represents the result set of a query, allowing navigation through the rows.
6. **SQLException**	Handles SQL-related exceptions during database operations.

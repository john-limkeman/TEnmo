# TEnmo
Inspired by Venmo, this program allows users to register for the service and transfer/request funds to and form other users.
Designed in a collaborative environment at Tech Elevator.

Program allows client to register a username and password and request/send money from their account to other accounts in the system. 

Client side communicates to the server side through RestTemplate API calls.

Server-side utilizes a JdbcTemplate and PostgreSQL to performs actions on the database.

All functionality in the application requires security authentication - users must be logged in to access account information or transfer funds.

# Elevation-Data-Query-with-Microservices

There are 4 Java Spring project for System. 

dtedelevationdb reads, parses and write informations to database

Eureka Server provides server, reads from DB and responses

Router Provides Load Balancing

Server serves the info by REST

Client sends query and get info .json file


There can be several servers running in the system.

application.properties files in projects arranges and provides connection between eureka server, router and servers.

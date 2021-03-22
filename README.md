Spring boot application

The project is based on a small web service which uses the following technologies
Java 11
Spring MVC with Spring Boot
PostgreSQL 9.4
Maven
Apachetomcat

•	DataTransferObjects: Objects which are used for outside communication via the API
•	Controller: Implements the processing logic of the web service, parsing of parameters


How to start the app
Build the war with following command
mvn clean 
mvn install
place the war in tomcat webapps folder access on locathost:8080 depends on postgresql to up and accessible I use nervous_elion alias to access pgsql on port 5432

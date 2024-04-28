# fake-menu-api

Fake Menu API provides Restfull CRUD operations endpoints for a fake menu

## Requirements

For building and running the application you need:

- [JDK 21](https://www.oracle.com/java/technologies/downloads/#java21)
- [Maven 3](https://maven.apache.org)
- [PostgreSQL 15.X](https://www.postgresql.org/ftp/source/v15.6/)

## Generate Database structure, tables and data

Execute the scripts that you will find in path db/db_structure.sql

## Database connection

Add the database connection data in the application.properties file

## Running the application locally

There are several ways to run a Spring Boot application on your local machine. One way is to execute the `main` method in the `de.codecentric.springbootsample.Application` class from your IDE.

Alternatively you can use the [Spring Boot Maven plugin](https://docs.spring.io/spring-boot/docs/current/reference/html/build-tool-plugins-maven-plugin.html) like so:

```shell
mvn spring-boot:run
```

The application will be run by default at http://localhost:8080/fake-menu-api

## Swagger documentation

Swagger endpoints documentation are exposed at http://localhost:8080/fake-menu-api/swagger-ui/index.html

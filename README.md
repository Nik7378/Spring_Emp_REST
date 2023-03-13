# Employee Management System - Spring REST

Designed and developed Employee Management System using Spring Boot, Java and MySQL as part of a Maven based project. Created functionalities for Admin roles. 

## Functionalities
```
Admin can:
-Add New Employee Record
-Search Employee (id,name based)
-Update Employee Record
-Delete Employee Record
-Read All Employee Records
```

## Getting Started
* Java
* MySQL
* Spring Boot
* Eclipse JEE
* Postman

## Prerequisites
```
-Downlaod and right click on project -> Maven -> Update project to install dependencies
-Crate database in MySQL with the name given in the src/main/resources/application.properties file
-Create table emp with columns 'id', 'name', 'salary' inside database
```

## Run
* Select Project -> RunOnServer -> Select the exisiting server(Apache Tomcat 9.0) Click Ok
* Project runs on port 8080.
* On postman run apis with http://localhost:8080/

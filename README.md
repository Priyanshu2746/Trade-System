# Trading System
### Introduction:
This is a Java-based trading system. It allows users to perform CRUD (Create, Read, Update, and Delete) operations on trades. The system also checks for valid trade versions and maturity dates.

### Technologies Used:
Java 8
Spring Framework (Spring Boot, Spring Data JPA)
MySQL

### Code Files

##### Trade.java
This file defines the Trade entity with its properties and annotations.

##### TradeRepository.java
This file contains the TradeRepository interface which extends JpaRepository and provides methods for CRUD operations.

##### TradeService.java
This file contains the TradeService interface with methods for performing business logic on Trade entities.

##### TradeServiceImpl.java
This file contains the implementation of TradeService with methods for business logic implementation.

##### TradeApplication.java
This is the main file that runs the Spring Boot application.

### Exception Handling
The system handles exceptions such as trade version mismatch and invalid maturity dates by returning null values.

### References
Spring Framework Documentation

Spring Boot Documentation

Spring Data JPA Documentatio

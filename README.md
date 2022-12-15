
<!-- ============================================  TITLE ======================================================  -->
# REST API for Online Trip Management System

<!-- ============================================  DETAILS ======================================================  -->

<li>A Collabrative Project Consisting Of the 5 Developer Depicting the implementation of the Trip Managment Platform like MakeMyTrip or Yatra.
<li>The REST API performs all the fundamental CRUD operations and business logics of any Trip Management System like MakeMyTrip with user authentication at every API endpoint.
<br>

<!-- ============================================  FEATURES ======================================================  -->
## Features

* Customer, Driver and Admin authentication & validation with session uuid having.
* Admin Features:
    * Administrator Role of the entire application
    * Only registered admins with valid session token can add/update/delete driver or customer from main database
    * Admin can access the details of different customers, drivers and trip bookings
* Customer Features:
    * Registering themselves with application, and logging in to get the valid session token
    * Viewing list of available cabs and booking a trip
    * Only logged in user can access his trip history, profile updation and other features.

<!-- ============================================  CONTRIBUTORS ======================================================  -->
## Our Team Members 👨‍💻
  - **[@Raushan Raj](https://github.com/raushanraj901)(Admin API)**
  - **[@Rajesh Pradhan](https://github.com/raje2)(Destination API)**
  - **[@Vijay Handal](https://github.com/vijay9969)(Customer Booking API)**
  - **[@Varsha Dhingra](https://github.com/varuvarshu)(Feedback API)**
  - **[@Naveen Saini](https://github.com/naveenSaini1)(Report API)**

<!-- ============================================  TECH STACK ======================================================  -->

## Tech Stack

* Java
* Spring Framework
* Spring Boot
* Spring Data JPA
* Hibernate
* MySQL
* Swagger UI

<!-- ============================================  MODULES ======================================================  -->

## Modules

* Login, Logout Module
* Packages Module
* Booking Module
* TicketDetails Module
* Route Module
* Travels Module
* Bus Module
* Hotel Module
* Report Module
* Feedback Module

<!-- ============================================  ER - DIAGRAM ======================================================  -->

# ER Diagram

The following Diagram depicts the flow of our Entity Relation Diagram to simplify the work flow.
<br>
<br>
![ER Diagram - DB Schema](https://github.com/raus376/OnlineTripManagementSystemApp/blob/addb16bf0cd504c3bd804e4cb9d4b7429055ac7a/DB%20Schema%20-%20ER%20Diagram.JPG)
<br>
<br>

<!-- ============================================  DOCUMENTATION ======================================================  -->

## Documentation

SWAGGER UI Documentation - `http://localhost:8888/swagger-ui/`

<!-- ============================================  INSTALLATION AND RUN ======================================================  -->

## Installation & Run

* Before running the API server, you should update the database config inside the [application.properties](E-Commerce-Backend\src\main\resources\application.properties) file. 
* Update the port number, username and password as per your local database config.

```
    server.port=8888

    spring.datasource.url=jdbc:mysql://localhost:3306/tripy;
    spring.datasource.driver-class-name=com.mysql.cj.jdbc.Driver
    spring.datasource.username=root
    spring.datasource.password=root
    spring.jpa.hibernate.ddl-auto=update
    spring.jpa.show-sql=true

    spring.mvc.pathmatch.matching-strategy= ANT_PATH_MATCHER

```

<!-- ============================================  API ROOT ENDPOINTS ======================================================  -->

## API Root Endpoint

`https://localhost:8888/`

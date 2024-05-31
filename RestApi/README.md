## #Assignment-CloudBees
```
To fulfill the requirements and implement the project using Java Spring Boot, Postman for API 
testing, and MySQL for databases, you'll need to follow several steps. Below is an outline of how you can approach this task:
```
## #Setup Development Environment:
```
Install Java Development Kit (JDK) and Apache Maven.
Set up MySQL and create a database for the project.
Install and configure Spring Boot.
```
## #Create a Spring Boot Project:
```
Spring Boot is utilized to build the backend of the application. It simplifies the setup and configuration of Spring-based applications, allowing developers to create stand-alone, production-grade Spring-based applications with minimal hassle. In this project, Spring Boot handles various aspects such as dependency injection, RESTful web service development, and database integration.

Use Spring Initializr to create a new Spring Boot project with necessary dependencies 
such as Spring Web, Spring Data JPA, and MySQL Driver.
```
## #Spring Tool Suite (STS): 
```
STS is an integrated development environment (IDE) based on Eclipse that is commonly used for developing Spring applications. It provides a range of features tailored specifically for Spring framework development, including code completion, debugging, and deployment tools. STS streamlines the development process and enhances productivity by offering a comprehensive set of tools and plugins for Spring-based projects.
```
## #Define Entity Classes:
```
Create entity classes such as User and Ticket to represent the data model.
Define relationships between entities if needed (e.g., User has a Ticket).
```
## #Implement Controllers:
```
Create controllers to handle HTTP requests and define APIs.
Implement endpoints for purchasing a ticket, viewing receipt details, viewing users and their seats, removing a user, and modifying a user's seat.
```
## #Implement Service Layer:
```
Create service classes to encapsulate business logic.
Implement methods to handle ticket purchase, user management, and seat allocation.
```
## #Implement Persistence Layer:
```
Use Spring Data JPA to interact with the database.
Define repositories for entities to perform CRUD operations.
```
## #Test with Postman:
```
Use Postman to test the implemented APIs.
Verify that the endpoints behave as expected and handle various scenarios.

Postman is a popular API client tool used for testing and debugging APIs. It allows developers to send HTTP requests to the backend server and inspect the responses. In this project, Postman can be employed to interact with the RESTful endpoints exposed by the Spring Boot application. Developers can use Postman to test the ticket purchase API, retrieve user details, allocate seats, remove users from the train, and modify user seats, thereby ensuring the proper functioning of the backend APIs.
```
## #Configure MySQL:
```
Update application.properties with MySQL database connection details.
Configure Hibernate dialect and other properties.

MySQL is chosen as the relational database management system (RDBMS) for storing and managing data related to train ticket purchases and user details. Spring Boot provides seamless integration with MySQL through Spring Data JPA, allowing developers to define entities, repositories, and service layers to interact with the database. MySQL stores information such as user details (first name, last name, email address), ticket purchases (from, to, price paid), and seat allocations (user-seat mapping), enabling efficient data storage and retrieval for the application.
```
## #Publish to GitHub:
```
Create a public repository on GitHub.
Push the codebase to the repository.
Ensure that the README.md file contains instructions for setting up and running the project.
```
In summary, the project leverages Spring Boot for backend development, STS as the IDE for Spring application development, Postman for API testing and debugging, and MySQL for persistent data storage. Together, these technologies form a robust and efficient solution for managing train ticket purchases and related functionalities.

### 1.Screenshot
![IMG_20240316_224831-transformed](https://github.com/abhishek-singh512/Assignment-CloudBees/assets/118076036/ead01bd6-8b1c-44bd-b748-9989dc2850ad) 
### 2.Screenshot
![IMG_20240316_224905](https://github.com/abhishek-singh512/Assignment-CloudBees/assets/118076036/6c07d5df-7b2a-49df-aaa2-9bdacf18fc3f)
### 3.Screenshot
![screenshot](https://github.com/abhishek-singh512/Assignment-CloudBees/assets/118076036/a155054d-8b91-4097-ab14-3fb2de918d9e)
```
1.I want to board a train from London to France. The train ticket will cost $20.
2.Create API where you can submit a purchase for a ticket. Details included in the receipt are:
3.From, To, User , price paid.
4.User should include first and last name, email address
5.The user is allocated a seat in the train. Assume the train has only 2 sections, section A and section B.
6.An API that shows the details of the receipt for the user.
7.An API that lets you view the users and seat they are allocated by the requested section
8.An API to remove a user from the train
9.An API to modify a user's seat
```
### 1.Screenshot
![Screenshot (1885)](https://github.com/abhishek-singh512/Assignment-CloudBees/assets/118076036/7cbf03ec-2744-4d54-8b5d-1b18223f01fc)
### 2.Screenshot
![Screenshot (1886)](https://github.com/abhishek-singh512/Assignment-CloudBees/assets/118076036/7b49cfbc-c8fb-4662-bf9b-e81235f5e538)
### 3.Screenshot
![Screenshot (1890)](https://github.com/abhishek-singh512/Assignment-CloudBees/assets/118076036/564f8fd0-b166-4dc1-9648-4678f4593adb)

### Conclusion
```
Overall, by following these guidelines and continuously striving for improvement, we can develop the train ticket booking application API in the best possible way, meeting the requirements 
effectively and delivering value to users and stakeholders.
```

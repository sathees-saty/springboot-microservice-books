# springboot-bicroservice-books
Creating a Simple Microservice for online books catalog service

Step 1: Create a Maven project “limits-service” using Spring Initializr https://start.spring.io/
Step 2: Add the following dependencies: Spring Web, Spring Boot DevTools, Spring Boot Actuator, Config Client.
Step 3: Open application.properties file and add data, we are using properties file instead of DB
Step 4: Create a class with name Configuration.java – POJO class mapped to application.properties  using @ConfigurationProperties("limits-service")
Step 5. Create a calls name LimitConfiguration.java – with setter and getters for microservice.
Step 6: Now create BooksConfigurationController.java. In this we will use Configuration and LimitConfiguration.
Step 7: Now Run LimitsServiceApplication.java.  As Spring Boot App
Step 8: Now Run http://localhost:8080/books in web browser
Step 9: Output
{
    "maximum": 9999,
    "minimum": 99,
    "booknames": "The Secret,Atomic Habits",
    "bookprices": "Rs 700,Rs 500"
}

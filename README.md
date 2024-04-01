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


Note: Refer pom.xml we are using new properties and dependency for microservice 
Hoxton.M2: Hoxton.M2 is the first release of Spring Cloud to include both blocking and non-blocking load balancer client implementations. It also includes a new load balancer implementation and documentation. 
spring-boot-starter-actuator: Spring Boot Actuator is a subproject of Spring Boot that provides a wide range of features for monitoring and managing Spring Boot applications (Endpoints, metrics, Audit).
spring-cloud-starter-config - Spring Cloud Config is a distributed configuration system for Spring Cloud applications. It provides a central place to store and manage externalized configuration properties, such as database connection strings, messaging queues, and other service endpoints. Spring Cloud Config also provides a client-side library that allows Spring Boot applications to access these properties at runtime.
spring-cloud-starter-bus-amqp - is a dependency management that enables Spring Cloud Bus, which connects nodes of a distributed system with a lightweight message broker. The broker can be used to broadcast state changes or other management instructions. Spring Cloud Bus includes AMQP and Kafka broker implementations. 
spring-boot-devtools - Several of the libraries supported by Spring Boot use caches to improve performance. Cache options are usually configured by settings in your application.properties file. 
Applications that use spring-boot-devtools will automatically restart whenever files on the classpath change.
spring-cloud-dependencies - Spring Cloud Dependencies is a project that provides a set of dependencies for building cloud-native applications. These dependencies can be used to build a variety of cloud-native applications, such as microservices, distributed systems, and event-driven systems.
Spring Milestones - Once all new features are implemented, the code would then usually go through various pre-release stages, such as betas and release candidates. When everyone is happy, a final version is released and the whole process begins again.
In Spring land this process goes:
GA = General availability (a release); should be very stable and feature complete
RC = Release candidate; probably feature complete and should be pretty stable - problems should be relatively rare and minor, but worth reporting to try to get them fixed for release.
M = Milestone build - probably not feature complete; should be vaguely stable (i.e. it's more than just a nightly snapshot) but may still have problems.
SR = Service Release (subsequent maintenance releases that come after major -RELEASE).

# Spring Boot Rest Api
This repository contains a simple implementation of a 
Java Spring Boot Rest API that I use for learning as well as 
testing deprecated update solutions and new features in the framework. 
If you are new to Spring Boot feel free to use this resource to help you understand the framework. Reference the [HELP.md](HELP.md) for more documentation references

## Dependency Notes

### Spring Web
Spring Web provides a comprehensive set of tools and features for building web applications in Java. By using Spring Web, you can focus on building the business logic of your web application while relying on Spring to handle many of the common tasks associated with web development.

Here are some of the main functions of Spring Web:
- @Component: A generic Spring-managed component that can be injected into other classes.
- @Service: A specialization of @Component for service classes.
- @Repository: A specialization of @Component for data access classes.
- @Controller: A Spring MVC controller that handles web requests.
- @RestController: A specialized version of @Controller that automatically converts responses to JSON or XML.
- @Configuration: A class that defines configuration for the Spring application context.
- @Bean: A method-level annotation that defines a bean to be managed by the Spring container.


### Lombrok
A Java library that helps reduce boilerplate code you need to write in your Java classes, making them more concise and easier to read. By using Lombok, you can focus on the business logic of your classes rather than the repetitive boilerplate code.
Here are some of the main functions of Lombok:

- Generating getters and setters: Lombok provides annotations such as @Getter and @Setter that generate getter and setter methods for class fields. This can help reduce the amount of boilerplate code you need to write in your classes.

- Generating constructors: Lombok provides annotations such as @NoArgsConstructor and @AllArgsConstructor that generate constructors for your classes. This can help reduce the amount of code you need to write to initialize your objects.

- Generating equals and hashCode methods: Lombok provides the @EqualsAndHashCode annotation that generates equals and hashCode methods based on the fields of your class. This can help you avoid writing these methods manually.

- Generating toString method: Lombok provides the @ToString annotation that generates a toString method for your class. This can help you avoid writing this method manually.

- Simplifying logging: Lombok provides the @Slf4j annotation that generates a logger field for your class using the SLF4J logging framework. This can help you avoid writing this field manually.

- Simplifying builders: Lombok provides the @Builder annotation that generates a builder class for your class. This can help simplify the process of creating objects with many fields.


### JPA
Java framework for managing relational data in Java applications that  provides a powerful set of tools for managing relational data in Java applications, allowing you to interact with the database using Java objects and methods rather than writing SQL queries directly. This makes it easier to develop and maintain complex database applications, while also improving performance and reducing errors.
Here are some of the main functions of JPA:

- Object-relational mapping (ORM): JPA provides a mechanism for mapping Java objects to relational database tables. This allows you to interact with the database using Java objects and methods, rather than writing SQL queries directly.

- Persistence context management: JPA provides a persistence context, which is a set of managed entities that represent a database transaction. JPA manages the persistence context, including entity lifecycle management, dirty checking, and transaction management.

- Entity mapping: JPA provides annotations that allow you to map Java classes to database tables, including specifying the relationships between entities.

- Querying: JPA provides a query language called JPQL (Java Persistence Query Language), which is similar to SQL but operates on Java objects rather than database tables. JPA also provides support for native SQL queries.

- Caching: JPA provides a caching mechanism that can help improve performance by reducing the number of database queries needed to fetch data.

- Transactions: JPA provides support for managing transactions, including the ability to commit or rollback a transaction, as well as defining transaction boundaries.

### Spring Security
Spring Security is a powerful framework that provides security services for Spring-based applications. By using it, you can ensure that your application is secure and protected against a variety of security threats.
Here are some of the main functions of Spring Security:

- Authentication: Spring Security provides authentication services, which allow you to verify the identity of users who access your application. This includes support for multiple authentication mechanisms, such as form-based authentication, basic authentication, and OAuth.

- Authorization: Spring Security provides authorization services, which allow you to control access to specific resources in your application. This includes support for role-based access control, fine-grained access control, and expression-based access control.

- User management: Spring Security provides support for managing user accounts, including password hashing, account locking, and user registration.

- Session management: Spring Security provides support for managing user sessions, including session fixation protection, session concurrency control, and session timeout management.

- Security events and auditing: Spring Security provides support for security events and auditing, which allow you to track security-related activities in your application.

- Integration with other Spring frameworks: Spring Security integrates with other Spring frameworks, such as Spring MVC and Spring Boot, to provide a seamless and comprehensive security solution for your application.

### OAuth 2 Client
OAuth2 client in Spring Boot is used for enabling third-party authentication and authorization for web applications, helping to provide users with a secure and seamless experience.
Here are some of the main functions of OAuth2 client in Spring Boot:

- Authentication and authorization: OAuth2 client in Spring Boot allows web applications to authenticate and authorize users using a third-party identity provider such as Google, Facebook, or GitHub. This eliminates the need for users to create a new set of login credentials for each application they use.

- Access token management: OAuth2 client in Spring Boot manages the access tokens required to access resources from the third-party identity provider. This includes acquiring, storing, refreshing, and revoking access tokens.

- User profile retrieval: OAuth2 client in Spring Boot allows web applications to retrieve user profile information from the third-party identity provider. This information can be used to customize the user experience of the application.

- Secure communication: OAuth2 client in Spring Boot uses HTTPS to securely communicate with the third-party identity provider, ensuring that sensitive information such as access tokens and user profile data are protected.

- Integration with Spring Security: OAuth2 client in Spring Boot integrates with Spring Security to provide a comprehensive security solution for web applications. This includes support for authorization based on the user's roles and permissions.

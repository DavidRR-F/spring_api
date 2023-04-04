# Spring Boot Rest Api
This repository contains a simple implementation of a 
Java Spring Boot Rest API that I use for learning as well as 
testing deprecated update solutions and new features in the framework. 
If you are new to Spring Boot feel free to use this resource to help you understand the framework. Reference the [HELP.md](HELP.md) for more documentation references

## Dependency Notes

### Spring Web
Spring Web provides a comprehensive set of tools and features for building web applications in Java. By using Spring Web, you can focus on building the business logic of your web application while relying on Spring to handle many of the common tasks associated with web development.

Here are some of the main functions of Spring Web:
- **@Component**: A generic Spring-managed component that can be injected into other classes.
- **@Service**: A specialization of @Component for service classes.
- **@Repository**: A specialization of @Component for data access classes.
- **@Controller**: A Spring MVC controller that handles web requests.
- **@RestController**: A specialized version of @Controller that automatically converts responses to JSON or XML.
- **@Configuration**: A class that defines configuration for the Spring application context.
- **@Bean**: A method-level annotation that defines a bean to be managed by the Spring container.


### Lombrok
A Java library that helps reduce boilerplate code you need to write in your Java classes, making them more concise and easier to read. By using Lombok, you can focus on the business logic of your classes rather than the repetitive boilerplate code.
Here are some of the main functions of Lombok:

- **Generating getters and setters**: Lombok provides annotations such as @Getter and @Setter that generate getter and setter methods for class fields. This can help reduce the amount of boilerplate code you need to write in your classes.

- **Generating constructors**: Lombok provides annotations such as @NoArgsConstructor and @AllArgsConstructor that generate constructors for your classes. This can help reduce the amount of code you need to write to initialize your objects.

- **Generating equals and hashCode methods**: Lombok provides the @EqualsAndHashCode annotation that generates equals and hashCode methods based on the fields of your class. This can help you avoid writing these methods manually.

- **Generating toString method**: Lombok provides the @ToString annotation that generates a toString method for your class. This can help you avoid writing this method manually.

- **Simplifying logging**: Lombok provides the @Slf4j annotation that generates a logger field for your class using the SLF4J logging framework. This can help you avoid writing this field manually.

- **Simplifying builders**: Lombok provides the @Builder annotation that generates a builder class for your class. This can help simplify the process of creating objects with many fields.


### JPA
Java framework for managing relational data in Java applications that  provides a powerful set of tools for managing relational data in Java applications, allowing you to interact with the database using Java objects and methods rather than writing SQL queries directly. This makes it easier to develop and maintain complex database applications, while also improving performance and reducing errors.
Here are some of the main functions of JPA:

- **Object-relational mapping (ORM)**: JPA provides a mechanism for mapping Java objects to relational database tables. This allows you to interact with the database using Java objects and methods, rather than writing SQL queries directly.

- **Persistence context management**: JPA provides a persistence context, which is a set of managed entities that represent a database transaction. JPA manages the persistence context, including entity lifecycle management, dirty checking, and transaction management.

- **Entity mapping**: JPA provides annotations that allow you to map Java classes to database tables, including specifying the relationships between entities.

- **Querying**: JPA provides a query language called JPQL (Java Persistence Query Language), which is similar to SQL but operates on Java objects rather than database tables. JPA also provides support for native SQL queries.

- **Caching**: JPA provides a caching mechanism that can help improve performance by reducing the number of database queries needed to fetch data.

- **Transactions**: JPA provides support for managing transactions, including the ability to commit or rollback a transaction, as well as defining transaction boundaries.

#### JPARepository vs EntityManager
EntityManager is part of the Java Persistence API (JPA) and provides a low-level API for interacting with a database. It is used to manage the lifecycle of JPA entities, which represent database records mapped to Java classes. EntityManager provides methods for querying, inserting, updating, and deleting records, and allows you to define relationships between entities. It also provides a cache for improved performance and transaction management for atomicity and consistency.

On the other hand, JpaRepository is part of the Spring Data JPA framework and provides a high-level, generic API for interacting with a database. It builds on top of JPA and EntityManager, and provides additional functionality such as pagination, sorting, and dynamic query generation. It is essentially a convenience interface that encapsulates the common database operations and reduces boilerplate code in your application.

In general, EntityManager is more appropriate for applications that require low-level control over database operations and for complex queries that cannot be easily expressed using JpaRepository. On the other hand, JpaRepository is more appropriate for applications that require a simpler, high-level interface for interacting with a database, and for applications that can benefit from the additional functionality it provides.

It is also worth noting that you can use both EntityManager and JpaRepository in the same application, and even in the same transaction, depending on the specific requirements of your use case.

### Spring Security
Spring Security is a powerful framework that provides security services for Spring-based applications. By using it, you can ensure that your application is secure and protected against a variety of security threats.
Here are some of the main functions of Spring Security:

- **Authentication**: Spring Security provides authentication services, which allow you to verify the identity of users who access your application. This includes support for multiple authentication mechanisms, such as form-based authentication, basic authentication, and OAuth.

- **Authorization**: Spring Security provides authorization services, which allow you to control access to specific resources in your application. This includes support for role-based access control, fine-grained access control, and expression-based access control.

- **User management**: Spring Security provides support for managing user accounts, including password hashing, account locking, and user registration.

- **Session management**: Spring Security provides support for managing user sessions, including session fixation protection, session concurrency control, and session timeout management.

- **Security events and auditing**: Spring Security provides support for security events and auditing, which allow you to track security-related activities in your application.

- **Integration with other Spring frameworks**: Spring Security integrates with other Spring frameworks, such as Spring MVC and Spring Boot, to provide a seamless and comprehensive security solution for your application.

### OAuth 2 Client
OAuth2 client in Spring Boot is used for enabling third-party authentication and authorization for web applications, helping to provide users with a secure and seamless experience.
Here are some of the main functions of OAuth2 client in Spring Boot:

- **Authentication and authorization**: OAuth2 client in Spring Boot allows web applications to authenticate and authorize users using a third-party identity provider such as Google, Facebook, or GitHub. This eliminates the need for users to create a new set of login credentials for each application they use.

- **Access token management**: OAuth2 client in Spring Boot manages the access tokens required to access resources from the third-party identity provider. This includes acquiring, storing, refreshing, and revoking access tokens.

- **User profile retrieval**: OAuth2 client in Spring Boot allows web applications to retrieve user profile information from the third-party identity provider. This information can be used to customize the user experience of the application.

- **Secure communication**: OAuth2 client in Spring Boot uses HTTPS to securely communicate with the third-party identity provider, ensuring that sensitive information such as access tokens and user profile data are protected.

- **Integration with Spring Security**: OAuth2 client in Spring Boot integrates with Spring Security to provide a comprehensive security solution for web applications. This includes support for authorization based on the user's roles and permissions.

### Hateoas
Constraint of the REST (Representational State Transfer) architectural style that emphasizes the use of hypermedia links to navigate through resources in a distributed system. In Java Spring Boot, HATEOAS is implemented through the Spring HATEOAS framework, which provides a set of classes and utilities to create hypermedia-driven REST APIs.

The key idea behind HATEOAS is that each resource in a distributed system should include links to related resources, allowing clients to navigate the system without requiring prior knowledge of the URI (Uniform Resource Identifier) structure. By embedding hypermedia links in the representation of each resource, the server can control the navigation flow of the client application, making it easier to evolve the API over time without breaking existing clients.

## Spring Boot Notes

### DAO (Service Layer)
DAO stands for Data Access Object, which is a design pattern used in Java Spring Boot to separate the persistence layer from the rest of the application. The DAO pattern provides an abstraction layer between the application and the database, allowing the application to interact with the database without knowing the details of how data is stored or retrieved.

In Spring Boot, a DAO is typically implemented as a Spring-managed bean that interacts with a database using an ORM (Object-Relational Mapping) framework such as Hibernate or MyBatis. The DAO typically provides methods that perform CRUD (Create, Read, Update, Delete) operations on database records, and can also provide more complex queries or transactions.

Benefits of using a DAO in Spring Boot:

- Separation of concerns: The DAO pattern allows the application to separate the persistence layer from the rest of the application, making the code more modular and easier to maintain.

- Abstraction: The DAO pattern provides an abstraction layer between the application and the database, allowing the application to interact with the database without knowing the details of how data is stored or retrieved.

- Reusability: The DAO pattern can be used across multiple parts of the application, allowing developers to reuse code and avoid duplicating functionality.

- Testing: The DAO pattern allows for easier testing of the application by providing a clear separation between the persistence layer and the rest of the application.

### Exception Handler Overrides

You are able to view the default ResponseEntityExceptionHandler methods and override them for custom error handling. 

- View extension hotkey: (ctrl + L click extension) 

- Override Method hotkey: (ctrl + o)

### Swagger
An open-source software framework used to describe and document RESTful web services. It provides a standard, language-agnostic way of describing the functionality and requirements of an API, allowing developers to quickly and easily understand how to interact with it.

Swagger consists of a set of specifications and tools, including the Swagger UI, which allows developers to visually interact with an API and explore its capabilities. With Swagger, developers can easily generate documentation for their APIs, automatically generate client libraries, and test their APIs.

#### Default OpenAPI Endpoints:

    - /swagger-ui/index.html
    - /v2/api-docs

### Actuators
Typically implemented as endpoints in an API that provide information about an application's internals, such as its configuration, environment, memory usage, and runtime statistics. They may also provide functionality to modify an application's behavior, such as changing its logging level or reloading its configuration.

Actuators are commonly used in microservices architecture, where multiple small services are used to build an application in combination with other monitoring tools, such as logging frameworks and health checkers, to provide a comprehensive view of an application's health and performance.

#### Default Endpoints
    -/actuator
    -/actuator/health
    -/actuator/health/{*path}
    -/browser/index.html

## Java Notes

### Primitive Types VS Wrapper Classes

Primitive types are the basic data types that are built into the Java language. They are used to represent simple values, such as numbers and characters. There are eight primitive types in Java:

- **boolean**: represents true or false values.
- **byte**: represents 8-bit signed integers.
- **short**: represents 16-bit signed integers.
- **int**: represents 32-bit signed integers.
- **long**: represents 64-bit signed integers.
- **float**: represents single-precision floating-point numbers.
- **double**: represents double-precision floating-point numbers.
- **char**: represents a single Unicode character.


Wrapper classes are classes that encapsulate the primitive types. They provide additional functionality that is not available with primitive types, such as methods and constants. There are eight wrapper classes in Java:

- **Boolean**: encapsulates a boolean value.
- **Byte**: encapsulates a byte value.
- **Short**: encapsulates a short value.
- **Integer**: encapsulates an int value.
- **Long**: encapsulates a long value.
- **Float**: encapsulates a float value.
- **Double**: encapsulates a double value.
- **Character**: encapsulates a char value.
Here are some of the differences between primitive types and wrapper classes:

Primitive types are faster and use less memory than wrapper classes, as they are built into the Java language and do not require additional objects.
Wrapper classes provide additional functionality, such as methods and constants, that are not available with primitive types.
Wrapper classes can be used in collections and other classes that require objects, as they are objects themselves.
Wrapper classes can be null, whereas primitive types cannot.
In general, you should use primitive types when possible, as they are faster and use less memory than wrapper classes. However, you may need to use wrapper classes in situations where objects are required, such as when working with collections or passing values to methods that require objects.

### POJO VS BEAN

#### Pojo
A pojo, is a Java class that does not extend or implement any framework or library-specific interfaces or classes. Pojos are typically used to represent data in the application domain model, and they typically do not have any dependencies on external libraries or frameworks. Pojos are often used for serialization and deserialization of objects in applications.

#### Bean
A bean, is a Java object that is instantiated, assembled, and managed by the Spring framework. A bean can be any object that is defined as a Spring bean, and it can be created using various mechanisms such as XML configuration, Java annotations, or Java code. A bean is typically a component of a larger Spring-based application and may have dependencies on other beans. Beans can be used to represent various application components such as services, controllers, or repositories.

Differences between a pojo and a bean in Java Spring Boot:

- **Purpose**: A pojo is a simple Java class that represents data in the application domain model, while a bean is a Spring-managed object that represents a component of a larger Spring-based application.
- **Dependencies**: A pojo typically has no dependencies on external libraries or frameworks, while a bean may have dependencies on other beans or external libraries.
- **Configuration**: A pojo typically does not require any specific configuration to work, while a bean needs to be configured as a Spring bean using mechanisms such as XML configuration, Java annotations, or Java code.
- **Lifecycle management**: A pojo has no lifecycle management by the Spring framework, while a bean is created, assembled, and managed by the Spring framework.

Overall, while pojos and beans are both Java classes, they serve different purposes in Java Spring Boot. Pojos are typically used to represent data in the application domain model, while beans are used to represent components of a larger Spring-based application and are managed by the Spring framework.

### Access Modifiers
access modifiers used to specify the visibility and accessibility of classes, methods, and variables in a program.

- **public**: most permissive access modifier, and makes the class, method, or variable accessible from any other class in the program.
- **private**: most restrictive access modifier, and makes the class, method, or variable accessible only within the same class in which it is defined.
- **protected**: makes the class, method, or variable accessible within the same package or any subclass of the class in which it is defined.
- **static**: modifier that indicates that the class, method, or variable is shared among all instances of the class, rather than being specific to any one instance.
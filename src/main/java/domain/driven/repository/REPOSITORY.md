## Repository Design Pattern
The Repository Pattern is a Domain-Driven Design (DDD) pattern that abstracts the data layer, providing a collection-like interface for accessing domain objects. 

It centralizes data access logic and provides a substitution point for the unit testing of domain classes with a database.

### Key concepts
- Separation of concerns: the pattern separates the logic for data access from the domain logic (business rules). This makes the domain model clean from persistence concerns.
- Abstraction Over Data Source: the repository abstracts the details of the data source. The domain logic interacts with the repository as if it's a collection, without needing to know about underlying databases, ORM (Object-Relational Mapping), or any data access code.
- Testability: by using repositories, you can more easily unit test your domain logic by mocking the repository interfaces.

### Scenario
In a web application, consider the case of a user management system where you need to perform operations like adding, updating, and retrieving user information.

### Use case
Take a look at ```UserService``` to see how we use our repository
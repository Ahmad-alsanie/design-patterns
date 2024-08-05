## Builder Design Pattern
The Builder Design Pattern is a creational pattern used to construct objects step by step. 

It separates the construction of an object from its representation, allowing the same construction process to create different representations. 

This pattern is particularly useful when an object needs to be created with many possible configurations and parameters, some of which may be optional.

### Components
- Builder: defines the methods to build the parts of the complex object
- Concrete Builder: provides specific implementations for the steps defined by the Builder
- Director: the class is responsible for managing the construction process. It accepts a `Builder` object and executes the building steps to construct the object.

### Scenario
Imagine you are developing a `RESTful` service for a social media platform. 

This service has an endpoint that returns user profile information. 

The information returned can vary significantly: a basic profile view might include just the user's name and username, while a detailed view might include additional information like email, a list of friends, recent posts, and settings preferences. 

Using the Builder pattern, you can create a flexible solution to construct these different representations of a user profile from the same base class.

### Use case
- The `UserProfile` class has a `UserProfileBuilder` class to construct `UserProfile` instances.
- The `UserProfileService` class uses the `UserProfileBuilder` to create a `UserProfile` object. It can decide to include only basic information or more detailed information based on the detailed parameter.
- This approach makes it easy to construct different representations of a `UserProfile` without having a constructor with many parameters, which can become unwieldy.

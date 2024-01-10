## Factory Design Pattern
The Factory Design Pattern is a creational pattern that provides an interface for creating objects in a superclass, but allows subclasses to alter the type of objects that will be created. 

This pattern is particularly useful when a system needs to be independent of how its objects are created, composed, and represented. 

It's often used when the exact types of objects to be created are not known until runtime.

### Ways to implement Factory
- Simple Factory: not officially part of the Gang of Four design patterns, but commonly used. It encapsulates the object creation process in one method.
- Factory Method: "we will focus on this one" where we define an interface for creating the object, and let subclasses decide which class to instantiate.
- Abstract Factory: Provides an interface for creating families of related or dependent objects without specifying their concrete classes.

### Scenario
Consider a web application for a job portal where different types of users, like job seekers and employers, can register. 

Each type of user has different properties and behaviors. 

You can use the Factory Method pattern to create a factory for generating different types of user objects.

### Use case
take a look at ```UserRegistrationService``` to see how it all works when we connect the dots using factory pattern
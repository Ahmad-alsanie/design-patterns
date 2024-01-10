## Facade Design Pattern
The Facade Design Pattern is a structural pattern that provides a simplified interface to a complex system of classes, library, or framework. 

The facade doesn't encapsulate the subsystem; instead, it provides a higher-level interface making the subsystem easier to use. 

It's often used when a system is very complex or difficult to understand because it has a large number of interdependent classes or its source code is unavailable.

### Scenario: 
Consider a web application for an online store. 

This store has complex subsystems like inventory management, order processing, and payment processing. 

To simplify interactions for clients (like web controllers), you can create a facade that provides simplified methods to handle common tasks like placing an order.

### Use case
Take a look at our ```StoreClient``` to see how we use the facade
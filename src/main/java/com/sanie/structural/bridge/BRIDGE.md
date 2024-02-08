## Bridge Design Pattern
The Bridge Design Pattern is a structural pattern that separates the abstraction from its implementation so that the two can vary independently. 

This pattern involves an interface which acts as a bridge between the abstraction class and implementer classes. 

It's especially useful in situations where an abstraction can have several implementations, and you want to separate the client code from the implementation.

### Components
- Abstraction: defines the abstraction's interface and maintains a reference to an object of the implementation type. It acts as a bridge between the client and the implementer classes.
- Refined Abstraction: extends or refines the interface defined by the `Abstraction`.
- Implementer: an interface that defines how the Implementer classes will carry out certain operations.
- Concrete Implementer: The classes that implement the `Implementer` interface and define specific operations.

### Scenario
Consider a web application with a multi-platform UI toolkit that needs to support different rendering engines (like HTML, SVG, Canvas). 

The Bridge pattern can be used to separate the UI elements (like buttons, text boxes) from the specific rendering mechanism, allowing them to work independently.

### Use case
Take a look at ```Application``` to see how it all works together
## State Design Pattern
The State Pattern is a behavioral design pattern that allows an object to change its behavior when its internal state changes. 

The pattern encapsulates varying behavior for the same routine based on the object's state, which appears as if the object changed its class.

### Components
- State Interface: defines a common interface for all concrete states, encapsulating all behavior associated with a particular state of the context.

- Concrete States: classes that implement the `State` interface and provide the implementation for the behavior associated with a state of the context.

- Context: The class that maintains an instance of a `ConcreteState` subclass that defines the current state. The context delegates the state-specific behavior to the current state object.

### Scenario
Consider a ticket booking system for a theater, where a ticket can be in different states such as `Available`, `Reserved`, or `Sold`. 

The behavior of the ticket (like reserving or purchasing) changes based on its current state.

### Use case
Take a look at our ```TicketBookingSystem```

### When to use
- when an object's behavior depends on its state, and it must be able to change its behavior at runtime depending on that state.
- in scenarios where code has many conditional statements that depend on the object's state.
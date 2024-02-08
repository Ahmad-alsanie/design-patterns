## Command Design Pattern
The Command Pattern is a behavioral design pattern that turns a request into a stand-alone object containing all information about the request. 

This transformation allows you to parameterize methods with different requests, delay or queue a request's execution, and support undoable operations.

### Components
- Command Interface: an interface that declares a method for executing a command.
- Concrete Command: implements the Command interface and defines the binding between a Receiver object and an action.
- Receiver: the object that performs the actual work when the command is executed.
- Invoker: the object that knows how to execute a command but doesn't know how the command has been implemented. It could send the command to the receiver.
- Client: creates a `ConcreteCommand` object and sets its receiver.

### Scenario
Consider a scenario in a remote control application for various home appliances like lights, fans, etc.

### Use case
Take a look at ```HomeAutomationApp```
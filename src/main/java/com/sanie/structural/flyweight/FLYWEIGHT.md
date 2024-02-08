## Flyweight Design Pattern
The Flyweight Design Pattern is a structural pattern used to efficiently manage large numbers of similar objects by sharing as much data as possible. 

It's particularly useful when a program requires a vast number of objects that have some shared state. 

In the Flyweight pattern, these shared states are moved to external data structures and shared among the objects.

### Components
- Flyweight: the interface through which flyweights can receive and act on extrinsic states.
- Concrete Flyweight: the implementation of the `Flyweight` interface. Concrete `Flyweights` must be sharable and capable of operating on external states.
- Flyweight Factory: manages and creates flyweight objects. It ensures that flyweights are shared properly. When a client requests a flyweight, the factory supplies an existing instance or creates a new one if it doesn't exist.
- Client: maintains a reference to flyweights and computes or stores the extrinsic state of the flyweights.

### Scenario
Consider a text editor that needs to handle a large number of character objects. 

Each character has a specific style, font, and position (extrinsic state). 

If every character is represented as a separate object, it can lead to an enormous number of objects, which is inefficient. 

The Flyweight pattern can be used to reduce the memory load by sharing the intrinsic state (style and font) of characters.

### Use case
Take a look at ```TextEditor``` to see how we deploy flyweight in real world scenario
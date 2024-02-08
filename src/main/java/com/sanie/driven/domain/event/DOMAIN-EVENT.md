## Domain Event Pattern
The Domain Event pattern is an important concept in Domain-Driven Design (DDD) used to model a significant change or occurrence within the domain. 
Domain events capture the memory of something interesting which affects the domain, and they typically signify a state change in the domain that might be of interest to other parts of the system or to external systems.


### Key concepts
- Event Representation: a domain event is a full-fledged object that represents something that happened in the domain.
- Immutable Record: once a domain event is created, it should be immutable – it is a record of something that happened at a specific point in time.
- Event Handling: domain events are processed by one or more interested parties, either within the same domain or in other domains.

### Scenario
In an e-commerce application, various significant events occur that might be of interest to different parts of the application. 

For example, when an order is placed, various subsystems such as inventory, shipping, and notifications may need to respond to this event.

### Use case

Domain events provides mechanisms for designing responsive, decoupled, and scalable systems. 

They play a crucial role in capturing and broadcasting important business moments in the domain.
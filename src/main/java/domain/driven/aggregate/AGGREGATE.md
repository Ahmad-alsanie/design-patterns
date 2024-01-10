## Aggregate pattern
The Aggregate Pattern is a core concept in Domain-Driven Design (DDD) that deals with how objects within a domain are grouped together. 
An Aggregate is a cluster of domain objects (entities and value objects) that can be treated as a single unit. The idea is to control and encapsulate access to a group of objects and enforce business rules across the aggregate.

### Key Concepts
- Root Entity (Aggregate Root): each aggregate has a single root entity, known as the Aggregate Root, which is the only member of the aggregate that outside objects are allowed to hold references to.
- Boundary: the aggregate root enforces the consistency rules throughout the aggregate and acts as the gatekeeper to all of its contained objects (entities and value objects).
- Consistency: the pattern ensures that the aggregate as a whole always remains in a consistent state, with all invariants applying both within and across the aggregate boundaries.

### Scenario
Consider an e-commerce application with an order processing system. An `Order` aggregate can include multiple entities like `OrderItems`, `PaymentDetails`, etc. The `Order` entity would be the Aggregate Root here, ensuring the consistency of the entire order.

### Use case
Take a look at ```OrderService``` to see how we enforcing invariants and consistency rules.

The Aggregate Pattern is crucial for managing complex domain models by ensuring consistency and enforcing business rules across multiple entities and value objects in a domain.
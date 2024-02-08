## Entity Pattern
The Entity Pattern in Domain-Driven Design (DDD) refers to an object that is not merely defined by its attributes, but rather by a thread of continuity and its identity. 

Entities are key in any domain model where you need to track and work with objects that change over time while still maintaining their identity.

### Key characteristics
- Identity: entities are primarily identified by their identity, rather than their attributes. This identity usually persists for the entire lifecycle of the entity.
- Mutability: unlike value objects, entities are mutable. They can change over time while still maintaining their identity.
- Distinctness: two entities may be completely identical in attributes but still be distinct entities because of their separate identities.

### Scenario 
In a customer management system of an e-commerce platform, a customer can be represented as an entity. 

A customer's name, address, or preferences can change over time, but they still remain the same customer.

### Use case
Take a look at our ```Customer``` class that represent an entity
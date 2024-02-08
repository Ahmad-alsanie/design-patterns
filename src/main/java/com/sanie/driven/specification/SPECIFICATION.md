## Specification Design Pattern
The Specification Pattern is a design pattern that allows for business rules to be recombined by chaining the business rules together using boolean logic. 

It's a structural pattern, typically used in the `domain-driven design` (DDD) context. 

The pattern is particularly useful for building complex criteria, especially when dealing with filtering or validation operations.

### Components
- Specification: an interface with a single `isSatisfiedBy` method, which returns a boolean value.
- Concrete Specifications: implementations of the `Specification` interface, each encapsulating one business rule.
- Combinators: methods or classes that implement boolean logic (AND, OR, NOT) and combine simple specifications into more complex ones.

### Scenario
Consider an e-commerce website where users can filter products based on various criteria like price range, color, size, brand, etc. 

Using the `Specification` Pattern, you can build each of these criteria as a separate specification and then combine them to apply multiple filters to the product list.

### Use case
Take a look at ```Store``` class to see how we use the specification pattern
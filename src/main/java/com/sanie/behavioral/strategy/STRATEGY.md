## Strategy Design Pattern
The Strategy Pattern is a behavioral design pattern that enables selecting an algorithm's behavior at runtime. 

Instead of implementing a single algorithm directly, code receives run-time instructions specifying which of a family of algorithms to use.

### Components
- Strategy Interface: this defines a common interface for all versions of an algorithm or behavior. The context uses this interface to call the algorithm defined by a ConcreteStrategy.
- Concrete Strategies: these are implementation classes for the strategy interface. Each implements a different variant of an algorithm or behavior.
- Context: the context maintains a reference to a strategy object and is configured with a ConcreteStrategy object. The context doesn't know which strategy is being used; it just knows how to execute the strategy's methods.

### Scenario
Consider a payment processing system in an e-commerce application where the payment method (e.g., credit card, PayPal, cryptocurrency) can be changed based on user preference or other factors.

### Use case
Take a look at our ```ShoppingCart``` class

### When to use
- When you have multiple algorithms for a specific task, and you want to decide the right algorithm at runtime.
- When you want to avoid using multiple conditional statements and make it easy to extend with new behaviors.
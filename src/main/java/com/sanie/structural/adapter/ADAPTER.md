## Adapter Design Pattern
The Adapter Design Pattern is a structural design pattern that allows objects with incompatible interfaces to work together. 

It acts as a bridge between two otherwise incompatible interfaces or classes. 

This pattern is particularly useful when you want to integrate new features or components into existing systems without changing the existing code.

### Components
- Target Interface: the interface that the client expects or knows how to work with.
- Adaptee: the class that needs to be adapted and has a different interface from what the client expects.
- Adapter: the class that implements the target interface and contains a reference to an instance of the adaptee. The adapter translates calls from the target interface into a form that the adaptee's interface can understand.

### Scenario: 
Imagine you have an e-commerce application that initially processes payments using a `PaymentProcessor`. 

Over time, you decide to integrate a new payment service, `StripePaymentProcessor`, but it has a different interface. 

To avoid major changes in your existing codebase, you can use the Adapter Pattern.

### Our Use-Case
In our use-case, `StripeAdapter` adapts the `StripePaymentProcessor` to be compatible with the `PaymentProcessor` interface. 
This allows the e-commerce application to process payments through Stripe without altering the existing codebase that expects a `PaymentProcessor`. 
This kind of scenario is common in web development, especially when integrating various third-party services and APIs.
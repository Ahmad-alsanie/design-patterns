## Decorator Design Pattern
The Decorator Design Pattern is a structural pattern used to extend the functionality of objects by wrapping them with one or more decorator classes. 

This pattern provides a flexible alternative to subclassing for extending functionality. 

It's particularly useful when you want to add responsibilities to individual objects dynamically and transparently, without affecting other objects.

### Components
- Component: an interface or abstract class defining the operations that can be altered by decorators.
- Concrete Component: a class implementing or extending the `Component`, defining an object to which additional responsibilities can be attached.
- Decorator: an abstract class that extends or implements the `Component` and has a reference to a `Component` object.
- Concrete Decorators: classes that extend the `Decorator` class and add new behaviors or responsibilities to the `Component` they are decorating.

### Scenario
Consider a web service for generating reports. 

Initially, you might only need plain text reports, but later on, you may require additional features like adding HTML formatting or compressing the report data. 

Using the Decorator pattern, you can add these new features without modifying the existing report generation code.

### Use case
Take a look at ```ReportService``` to see how we used our decorator

As you noticed we added responsibilities to individual objects without affecting other objects of the same class.
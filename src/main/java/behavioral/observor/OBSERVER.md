## Observer Design Pattern
The Observer Pattern is a behavioral design pattern that defines a one-to-many dependency between objects. 

When one object (the subject or observable) changes state, all its dependents (observers) are notified and updated automatically. 

This pattern is widely used for implementing distributed event handling systems and is integral to many reactive systems.

### Components
- Subject (Observable): an object that maintains a list of its dependents, called observers, and notifies them of any state changes, usually by calling one of their methods.
- Observer: an interface or abstract class defining the operations to be used to notify this object of changes in the subject.
- Concrete Observer: implements the observer interface and keeps a reference to the subject. It updates itself in response to changes in the subject.
- Concrete Subject (Concrete Observable): inherits or implements the subject interface. Notifies the registered observers about the changes.

### Scenario
Imagine a weather monitoring application where the weather station (subject) notifies multiple display elements (observers), like current conditions, forecast, etc., whenever new weather data is available.

### Use case
Take a look at our ```WeatherStation```

### Used when
- A change to one object requires changing others, and you don't know how many objects need to be changed.
- Implementing event notification systems.
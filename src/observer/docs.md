# Observer Pattern

The Observer pattern is a behavioral design pattern that defines a one-to-many relationship between objects. 
When one object (called the "subject") changes its state, all its dependents (called "observers") are notified and updated automatically. 
This pattern is often used to implement distributed event handling systems.

## Key Points

- **Subject**: The object that holds the state and notifies observers about changes. It maintains a list of observers.
- **Observer**: The object that wants to be notified of changes in the subject. It defines an update method that the subject calls when it changes.
- **ConcreteSubject**: A concrete implementation of the subject that stores the state of interest to the observers.
- **ConcreteObserver**: A concrete implementation of the observer that reacts to changes in the subject.

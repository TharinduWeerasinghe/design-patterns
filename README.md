# Java Design Patterns
Implement the code by reading Head First Design Patterns

## Observer Pattern

### The Observer Pattern defines a one-to-many dependency between objects so that when one object changes state, all its dependents are notified and updated automatically.

<div align="center">
<img src="https://github.com/TharinduWeerasinghe/design-patterns/blob/master/Assets/observer_img.png" width="auto" height="200px">
</div>

### Advantages of loosely coupled
1.	The subject known about an observer is that it implements a certain interface (the Observer interface).
2.	We can add new observers at any time.
3.	We never need to modify the subject to add new types of observers.
4.	We can reuse subjects or observers independently of each other.
5.	Changes to either the subject or an observer will not affect the other.


### Importants
•	Widely used this pattern and used in libraries and frameworks.

•	Subject update Observers using interface.

•	Subject doesn’t know much about observer. Observers are loosely coupled.

•	This pattern is found in Java Swing, RxJava, JavaBeans, RMI, Cocoa, swift and JavaScript events.

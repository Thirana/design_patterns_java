## Behavioral Design Patterns

---

### Strategy design pattern

**Let you define a family of algorithm, put each of them intgo a seperate class, and make their bjects interchangeable.**

- when you want to use different variants of an algorithm within an object and be able to switch from one algorithm to another during runtime.
- when you have a lot of similar classes that only differ in the way they execute some behavior.
- to isolate the business logic of a class from the implementation details of algorithms that may not be as important in the context of that logic.

we create a 'context' class that can accepts a 'strategy' as a parameter. In side the 'context' class we create public methods to execute, methods described in the 'strategy'. In the run time we create specific 'strategy' based on the required condition and pass it to the 'context'. Then we can execute specific methods related to 'strategy via 'context".
(all the 'strayegies' should follow common interface so that 'context' can use identical way to manage all the 'strategies' )

---

### Observer design pattern

**Let you define a subscription mechanism to notify multiple objects about any events that happen to the object the are observing.**

- Use the Observer pattern when changes to the state of one object may require changing other objects, and the actual set of objects is unknown beforehand or changes dynamically.
- Use the pattern when some objects in your app must observe others, but only for a limited time or in specific cases.

first we need to create a 'eventManager' class that maintain specific events and 'subscribers' who has subscribed for those specific events. All subscribers should follow common interface. (should have update() method.) 'eventManger' should have notify() method to evoke update() method of its subscribers.
then we need to create a 'editor' class (where actual events happens) that contain 'eventManager' object. under each event, we can specify corresponding notify() method.

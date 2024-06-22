## Structural Design Patterns

---

### Decorator design pattern

**Let you attache new behaviors to object by placing these objects inside special wrapper objects that contain the behaviors.**

- Use Decorator pattern when you need to be able to assign extra behaviors to object at runtime without breaking the code that uses these objects.
  - Decorator lets you structure your business logic into layers, create a decorator for each layedr and compose objects with combination of this logic at runtime.

#### How to Implement

1. Nake sure your business domain can be represented as a primary component with multiple optional layers over it.
2. Figure out what methods are common to both the primary component and the optional layers. Create a componenet interface and declare those methods there.
3. Create a concrete component class and define the base behaviors in it.
4. Create a base decorator class. It should have a field for storing a reference to a wrapped object. The field should be declared with the component interface type to allow linking to concrete components as well as decorators. The base decorator must delegate all work to the wrapped object.
5. Create concrete decorators by extending them from the base decorator. A concrete decorator must execute its behavior before or after the call to the parent method (which always delegates to the wrapped object).
6. The client code must be responsible for creating decorators and composing them in the way the client needs.

---

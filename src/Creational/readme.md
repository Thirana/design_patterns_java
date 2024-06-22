## Creational Design Patterns

---

### Factory design pattern

**Provides an interface for creating objects in a superclass, but allows subclasses to alter the type of objects that will be created.**

- The Factory Method separates product construction code from the code that actually uses the product. Therefore it’s easier to extend the product construction code independently from the rest of the code.
  - For example, to add a new product (object return by the factory class) to the app, you will only need to create a new creator subclass and override the factory method in it.

#### How to Implement

1. First 'Common Product" interface need to created and then we can create required products by following that interface
2. Then we need to create a 'Creator Class' that has Abstract factory method. -> Return type of this method should match the common product interface.
3. Despite its name, the creator's primary responsibility isn't creating products. Is usually contains some core business logic that relies on product objects returned by the factory method.
4. Subclasses can indirectly change that business logic by overriding the factory method and returning a different type of product from it
5. Then we can create set of 'Creator subclasses for each product and override the factory method in each subclass. if we want we can change other core businees logics as well.

---

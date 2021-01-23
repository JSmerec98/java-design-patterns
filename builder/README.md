# Builder

## Description:

**Builder** is a creational design pattern that lets you construct complex objects step by step. The pattern allows you to produce different types and representations of an object using the same construction code.

The Builder pattern suggests that you extract the object construction code out of its own class and move it to separate objects called *builders*.

**Applicability:**
* Use the Builder pattern to get rid of a “telescopic constructor”.
* Use the Builder pattern when you want your code to be able to create different representations of some product
* Use the Builder to construct Composite trees or other complex objects.

## Diagram:

![alt text](img/builder.png)

## Java Example:

In Java example, the Builder pattern allows step by step construction of different car models.
                 
The example also shows how Builder produces products of different kinds (car manual) using the same building steps.

The Director controls the order of the construction. It knows which building steps to call to produce this or that car model. It works with builders only via their common interface. This allows passing different types of builders to the director.

The end result is retrieved from the builder object because the director can’t know the type of resulting product. Only the Builder object knows what does it build exactly.
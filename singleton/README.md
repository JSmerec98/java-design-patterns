# Singleton

## Description:

**Singleton** is a creational design pattern that lets you ensure that a class has only one instance, while providing a global access point to this instance.

The Singleton pattern solves two problems at the same time, violating the Single Responsibility Principle:
1. Ensure that a class has just a single instance.
2. Provide a global access point to that instance.

**Applicability:**
* Use the Singleton pattern when a class in your program should have just a single instance available to all clients; for example, a single database object shared by different parts of the program.
* Use the Singleton pattern when you need stricter control over global variables.
  
## Diagram:

![alt text](img/singletion.png)

## Java Example:

In Java example, the Singleton class declares the static method *getInstance* that returns the same instance of its own class. 
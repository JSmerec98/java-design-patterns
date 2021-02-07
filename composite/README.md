# Composite

## Description:

**Composite** is a structural design pattern that lets you compose objects into tree structures and then work with these structures as if they were individual objects.

The Composite pattern provides you with two basic element types that share a common interface: simple leaves and complex containers. A container can be composed of both leaves and other containers. This lets you construct a nested recursive object structure that resembles a tree.

**Applicability:**
- Use the Composite pattern when you have to implement a tree-like object structure.
- Use the pattern when you want the client code to treat both simple and complex elements uniformly.

## Diagram:

![alt text](img/composite.png)

## Java Example:

This Java example shows how to create complex graphical shapes, composed of simpler shapes and treat both of them uniformly.


## Composite Design Pattern
The Composite Pattern is a structural design pattern that allows you to compose objects into tree-like structures to represent part-whole hierarchies. 

This pattern lets clients treat individual objects and compositions of objects uniformly. 

It's particularly useful when your code needs to manage a hierarchical collection of "part" and "whole" objects.

### Components
- Component: an interface or abstract class defining the common operations for both composite and leaf nodes. It could include methods like `add`, `remove`, and `display`.
- Leaf: a leaf objects in the composition. a leaf has no children and it defines behavior for primitive objects in the composition.
- Composite: A class that stores child components and implements methods defined in the component interface and performs operations on its children.

### Scenario
Consider a file system, where both files and folders can be treated uniformly. 

A file (leaf) is at the end of a composition, while a folder (composite) can contain multiple files and/or folders. 

Both files and folders should be able to perform some common operations like `showDetails`. 

The Composite Pattern allows you to call `showDetails` on a folder, and it will recursively call `showDetails` on all its contents - files and nested folders alike.


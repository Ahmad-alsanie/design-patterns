## Proxy Design Pattern
The Proxy Design Pattern is a structural pattern that provides a placeholder or surrogate for another object to control access to it. 

This pattern is used to create a representative object that controls access to another object, which may be remote, expensive to create, or in need of being secured.

### Ways to implement proxy
- Virtual Proxy: "we will implement this one" delays the creation and initialization of expensive objects until needed.
- Remote Proxy: represents an object in a different address space (like in network-based scenarios).
- Protection Proxy: controls access to the original object, useful in security situations.
- Smart Reference Proxy: performs additional actions when an object is accessed (e.g., counting the number of references to an object).

### Scenario
Consider a web application that displays high-resolution images. 

These images are large and take time to load. 

To improve performance and user experience, you can use a proxy to initially load a placeholder image, and only load the high-resolution image when it's actually needed.

### Use case
Take a look at ```Application``` class to see how we use our proxy

- `Image` interface represents both the real image and its proxy.
- `HighResolutionImage` is the real object that loads the actual image.
- `ImageProxy` acts as a surrogate for `HighResolutionImage`. It holds a reference to it and takes care of its lazy initialization.
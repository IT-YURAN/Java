# Generics

Generics in Java refer to parameterized types that allow writing code which works with multiple data types using a single class, interface, or method. <br>
They improve reusability and ensure type safety at compile time.

* Use type parameters (like <T>) to create flexible and reusable code
* Prevent runtime errors by enforcing type safety at compile time

## Why Use Generics?
* Before Generics java collections could store any type of **object**, everything was treated as an **object**, it had some problems.
* If you added a `String` java didn't remember its type. You had to manually cast it when retrieving, if the type was wrong, it caused a `Runtime Error`.
* With Generics, you can Specify the type the collections will hold. Like `ArrayList<String>`. Now, Java knows what to expect, and it checks at `compile` time, not at `Runtime`

# Types of Generics

### Generic Class
A Generic class is a class that can operate on object of different types. We use `< >`  to specify  parameter type in Generic class creation. 

`Note: In Parameter type, we can not use primitives like "int", "char" or "double". Use wrapper classes like Integer, Character, etc.`

#### How Type Parameter T Behaves Like a Normal Type

In a generic class, the type parameter T behaves like a normal data type within the class. Once a specific type is provided while creating an object, the compiler replaces T with that type.<br>
This means T can be used just like a regular type for:

    Declaring variables
    Method parameters
    Method return types
**We can also pass multiple Type parameters in Generic classes <T, U,...>.** 


### Generic Method
We can also write generic methods that can be called with different types of arguments based on the type of arguments passed to the generic method. The compiler handles each method.

### Type Parameter Naming Conventions

The type parameters naming conventions are important to learn generics thoroughly. The common type parameters are as follows:

    T: Type
    E: Element
    K: Key
    N: Number
    V: Value



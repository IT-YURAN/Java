# Lambda Expressions
Lambda expressions is a short block of code that takes parameters and returns a values. <br>
Lambdas look similar to methods, but they don't need a name, and they can be written right inside a method bod. <br>
Lambda expressions implement a **functional interface** (An interface with only one abstract function)

## Syntax
The simplest lambda expression contains a single parameter and an expression:
`parameter -> expression` <br>
To use more than one parameter, wrap them in parentheses:
`(parameter1, parameter2) -> expression` <br>

Simple expressions must return a value immediately. They cannot contain multiple statements, such as loops or if conditions.<br>
To do more complex work, use a code block with curly braces. If the lambda should return a value, use the return keyword: <br>
`(parameter1, parameter2) -> {` <br>
 code block <br>
`return result;
}` <br>
**Lambda expressions are widely used with Java Collections and Streams for concise operations**

## Java Functional Interfaces
A funcional Interface is an Interface that has only one **abstract method**.

* Use @FunctionalInterface to ensure only one abstract method (annotation is optional).
* Enable clean, concise code using lambdas and method references.

#### @FunctionalInterface Annotation

**@FunctionalInterface** annotation ensures that an interface cannot have more than one abstract method.
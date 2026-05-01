# EXCEPTION HANDLING
Exception handling is a mechanism used to handle exceptions in compilation time(Checked), and execution time(Unchecked). <br>
It allows a program to continue its execution without  problems even if an error occurs. <br>

## Try -Catch & Finally
* Try block executes code da might throw an exception.
* Catch block handles the exception if it occurs.
* Finally block is always executed even if an exception occurs.

## Throw and Throws KeyWords
### Throw 
Is used to throw a single exception. We use throw when something goes wrong(or something shouldn't happen ), and we want to interrupt the normal flow and handle it <br>

### Throws
Is used to declare exceptions that a method might throw, it tells the caller to handle it. They are mostly used with `checked` exceptions <br>
If a method calls another method that throw a checked exception must declare these exceptions 

### Hierarchy of Exceptions
In java all exceptions and erros are subclasses of `Throwable` . There are two main branches

1. Exception
2. Error

### Types od Exceptions

#### Built in Exceptions
These are pre-defined exception classes that java provide to handle common errors during a program execution

#### User-Defined Exception
Sometimes, the built-in exceptions in Java are not able to describe a certain situation. In such cases, users can also <br>
create exceptions, which are called "user-defined Exceptions".
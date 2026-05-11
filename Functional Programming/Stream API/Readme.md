# Stream API

Stream API was introduced in **Java 8**, the Stream API is used to process  collections of objects. <br>
It is a sequence of objects that supports various methods that can be pipelined to produce the desired result. 

### Use of Stream in Java

* Stream API is a way to express and process collections of objects.
* Enable us to perform operations like filtering, mapping, reducing and sorting.

### Java Stream Features

* A Stream is not a data structure; it just takes input from Collections, Arrays or I/O channels.
* Streams do not modify the original data; they only produce results using their methods.
* Intermediate operations (like filter, map, etc.) are lazy and return another Stream, so you can chain them together.
* A terminal operation (like collect, forEach, count) ends the stream and gives the final result.

### Different Operations On Streams

1. Intermediate Operations
2. Terminal Operations

##### Intermediate Operations

**Intermediate Operations are the types of operations in which multiple methods are chained in a row. <br>**
`INPUT → OPERATION 1 → OPERATION2 → OPERATION3 → TERMINAL OPERATION → OUTPUT`

### Important Intermediate Operations
1. **Map():** The method is used to return a steam consisting of the result of applying the given function of the elements of the stream.
2. **filter()** The filter method is used to select elements as per the predicate passed as an argument.
3. **sorted()** The sorted method is used to sort the stream.
4.  **flatMap()** The flatMap operation in Java Streams is used to flatten a stream of collections into a single stream of elements.
5.  **distinct()** Removes duplicate elements. It returns a stream consisting of the distinct elements (according to Object.equals(Object)).
6. **peek()** performs an action on each element without modifying the stream. It returns a stream consisting of the elements of this stream, additionally performing the provided action on each element as elements are consumed from the resulting stream.

#### Terminal Operations
Terminal Operations are the type of Operations that return the result. These Operations are not processed further just return a final result value.

### Important Terminal Operations

1. **collect()** The collect method is used to return the result of the intermediate operations performed on the stream.
2. **forEach()**  The forEach method is used to iterate through every element of the stream.
3. **reduce()**  The reduce method is used to reduce the elements of a stream to a single value. The reduce method takes a BinaryOperator as a parameter.
4. **count()** Returns the count of elements in the stream.
5. **findFirst()** Returns the first element of the stream, if present.
6. **allMatch()** Checks if all elements of the stream match a given predicate.
7. **anyMatch()** Checks if any element of the stream matches a given predicate.

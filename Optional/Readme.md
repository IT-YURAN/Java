# Optional

Optional is a container or box that may not contain a non-null value. If a value is present, `ispresent()` will return true and `get()` will return the value. <br>

## The idea
The idea of optional is to explicitly tell the user of a method that the value they are looking for  might noot exist.<br> 
We can think about optional as a box  that says : **_Hey, I might not have a value in here, so you have to be prepared to handle that situation_.**

## Where to use Optional
Optionals are intended to only be used as a return type, where without optional a method as a possibility of returning `null`

## Optional Methods 
The Optional class offers methods such as isPresent() orElse() and ifPresent() to handle potentially null values more safely and functionally. 

**empty()** → It returns an empty optional instance. No value is present for this optional <br> 

**of()** → Returns an Optional with the specified non-null value <br>

**ofNullable()** → Returns an Optional describing the specified value. if non-null, otherwise returns an empty optional.<br>

1. **get()** → If a value id present in this optional, returns the value, otherwise throws NoSuchElementException. <br>
2. **isPresent()** → Returns True if there is a value present, otherwise returns false.<br>
3. **ifPresent()** -> If a value is present, invoke the specified consumer with the value, otherwise do nothing. Throws` NullPointerException` if value is present and consumer is null <br>
4. **filter()** -> If a value is present, and the value matches the given predicate, return an Optional describing the value, otherwise return an empty Optional. <br>
5. **map()** -> If a value is present, apply the provided mapping function to it, and if the result is non-null, return an Optional describing the result. Otherwise, return an empty Optional. <br>
6. **flatMap()** -> If a value is present, apply the provided Optional-bearing mapping function to it, return that result, otherwise return an empty Optional. This method is similar to map(Function), but the provided mapper is one whose result is already an Optional, and if invoked, flatMap does not wrap it with an additional Optional. <br>
7. **orElse()** -> Return the value if present, otherwise return other. The value to be returned if there is no value present, may be null <br>
8. **orElseGet()** -> Return the value if present, otherwise invoke other and return the result of that invocation. Might return `NullPointerException ` if value is not present and other is null <br>
9. **orElseThrow()** ->Return the contained value, if present, otherwise throw an exception to be created by the provided supplier.<br>



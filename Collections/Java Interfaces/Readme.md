# Java Interfaces

## Collection Interface in Java

The Collection interface is the root of the Java Collections Framework, defined in the java.util package. It represents a group of individual objects as a single unit and provides basic operations for working with them.
Represents a group of objects as a single unit
* Dynamic in size (can grow or shrink)
* Provide simple methods like add(), remove(), and clear().
* Stores elements of a specific type using generics

## Sub-Interfaces of Collection Interface

### List
The List interface in Java extends the **Collection interface** and is part of the `java.util package`.<br>
It is used to store ordered collections where duplicates are allowed and elements can be accessed by their index.

* Maintains insertion order
* Allows duplicate elements
* Supports null elements (implementation dependent)
* Supports bidirectional traversal using ListIterator

##### The common implementation classes of the List interface are:

1. **ArrayList:** It is implemented using resizable array, offers fast random access but slower insert/delete.
2. **LinkedList:** It is implemented using Doubly-linked list, efficient for frequent insertions and deletions.
3. **Vector:** It is implemented using Legacy synchronized dynamic array, thread-safe but slower.
4. **Stack:** It is implemented using a LIFO (Last-In-First-Out) subclass of Vector for stack operations.


### Set
1. Set represents an unordered collection with no duplicate elements.
2. Implementing Classes: `HashSet, TreeSet, LinkedHashSet, EnumSet, CopyOnWriteArraySet`.

### SortedSet
1. SortedSet extends Set and maintains elements in a sorted order.
2. Provides methods to handle range-based operations.
3. Implementing Class: TreeSet.

### NavigableSet

NavigableSet extends SortedSet and provides navigation methods like **lower(), floor(), ceiling(), and higher()**.
Implementing Class: `TreeSet`.

### Queue

1. Queue represents a collection following **FIFO (First-In-First-Out)** order.
2. Implementing Classes:` PriorityQueue, ArrayDeque, LinkedList`.

### Deque

1. Deque extends Queue and allows elements to be added/removed from both ends.
2. Implementing Classes: `ArrayDeque, LinkedList`.




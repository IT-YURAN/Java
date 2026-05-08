# SET

In Java, **SET** interface is part of the java collections Framework, located in the `java.util package`. <br>
It represents a collections of unique elements, meaning it does not duplicate values.

* The **SEt** interface does nt allow duplicate elements.
* It can contain at most one null value  except for TreeSet implementation which does not allow null.
* The **SET** interface provides efficient search, insertion and Deletion operations.

### Declaration of Set Interface
`public interface Set<E> extends Collection <E>`

## Hierarchy of Set interface
### Classes that implement the Set interface

**HashSet:** A set that stores unique elements without any specific order, using a hash table and allows one null element.<br>
**EnumSet:** A high-performance set designed specifically for enum types, where all elements must belong to the same enum.<br>
**LinkedHashSet** A set that maintains the order of insertion while storing unique elements.<br>
**TreeSet** A set that stores unique elements in sorted order, either by natural ordering or a specified comparator.<br>

## Methods of Set Interface

1. **add(element)**  Adds element if not already present. Returns true if added.
2. **addAll(collection)**	Adds all elements from the given collection.
3. **clear()**	Removes all elements from the set.
4. **contains(element)**	Checks if the set contains the specified element.
5. **containsAll(collection**)	Checks if the set contains all elements from the given collection.
6. **hashCode()**	Returns the hash code of the set.
7. **isEmpty()**	This method is used to check whether the set is empty or not.
8. **iterator()**	This method is used to return the iterator of the set.
9. **remove(element)**	Removes the specified element from the set.
10. **removeAll(collection)**	Removes all elements in the given collection from the set.
11. **retainAll(collection)**	Retains only elements present in the given collection.
12. **size()**	Returns the number of elements in the set.
13. **toArray()**	This method is used to form an array of the same elements as that of the Set.


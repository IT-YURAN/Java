# Map

In Java, the Map Interface is part of the java.util package and represents a collection of key-value pairs, where Keys should be unique, but values can be duplicated.

* It provides efficient retrieval, insertion, and deletion operations based on keys.
* HashMap and LinkedHashMap allow one null key, and TreeMap does NOT allow null keys (if natural ordering is used).
* Use ConcurrentHashMap for thread-safe operations, or Collections.synchronizedMap() to make an existing map synchronized.

### Declaration of the Map interface
`public interface Map<K, V>` <br>
K → Type of keys maintained by the map <br>
V → Type of mapped values

#### Hierarchy of Map

It is part of the **Java Collections Framework**, and its key implementation classes include `HashMap, LinkedHashMap, TreeMap, and Hashtable`.

**Note:** ` Map does not extend the Collection interface and is used to efficiently store and retrieve data using keys.`

## Implemented Classes of Map Interface

**HashMap:** Tores key-value pairs using hashing for fast access, insertion, and deletions. <br>
**LinkedHashMap:** Similar to HashMap but maintains the insertion order of yhe key-value pairs. <br>
**TreeMap:** Stores key-value pairs in sorted order using natural ordering or a custom comparator.<br>
**Hashtable**: A synchronized Map implementation that doesn’t allow null keys or values.


## Operations on Map using HashMap

1. **Adding Elements**
We use `put()` method to add elements to a Map. In HasMap insertion order is not preserved, each element is stored based on its hash for faster access.

2. **Changing Element** 
To update a value, we use the `put()` method with the same key. The new value replaces the old value for that key.

3. **Removing Elements**
To remove an element from the map, we can use the `remove()` method. This method takes the key value and removes the mapping for a key from this map if it is present.

4. **Iterating through the Map**
There are multiple ways to iterate through the Map. The most famous way is to use a for-each loop and get the keys. The value of the key is found by using the getValue() method. 

## Methods in Java Map Interface

1. **clear()**	This method is used in Java Map Interface to clear and remove all of the elements or mappings from a specified Map collection.
2. **containsKey(Object)**	Checks if a key exists in the map.
3. **containsValue(Object)**	Checks if a value exists in the map.
4. **entrySet()**	Returns a set view of the map’s key-value pairs.
5. **equals(Object)**	Compares two maps for equality.
6. **get(Object)**	Returns the value for the given key, or null if not found.
7. **hashCode()**	This method is used in Map Interface to generate a hashCode for the given map containing keys and values.
8. **isEmpty()**	This method is used to check if a map is having any entry for key and value pairs. If no mapping exists, then this returns true.
9. **keySet()**	Returns a set view of the keys in the map.
10. **put(Object, Object)**	This method is used in Java Map Interface to associate the specified value with the specified key in this map.
11. **putAll(Map)**	This method is used in Map Interface in Java to copy all of the mappings from the specified map to this map.
12. **remove(Object)**	This method is used in Map Interface to remove the mapping for a key from this map if it is present in the map.
13. **size()**	This method is used to return the number of key/value pairs available in the map.
14. **values()**	Returns a collection view of the map’s values.
15. **getOrDefault(Object key, V defaultValue)**	Returns the value to which the specified key is mapped, or defaultValue if this map contains no mapping for the key.
16. **merge(K key, V value, BiFunction<? super V,? super V,? extends V> remappingFunction)**	If the specified key is not already associated with a value or is associated with null, associate it with the given non-null value.
17. **putIfAbsent(K key, V value)**	Adds a mapping only if the key is not already mapped.



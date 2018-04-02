package com.santha.hashcode;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

/**

1. Hashtable is synchronized, whereas HashMap is not. This makes HashMap better 
for non-threaded applications, as unsynchronized Objects typically perform better 
than synchronized ones.
2.
Hashtable does not allow null keys or values.  HashMap allows one null key and 
any number of null values.
3.
One of HashMap's subclasses is LinkedHashMap, so in the event that you'd want 
predictable iteration order (which is insertion order by default), you could 
easily swap out the HashMap for a LinkedHashMap. This wouldn't be as easy if 
you were using Hashtable.
____________________________________
1. HashMap is non synchronized. It is not-thread safe and can’t be shared between many threads 
without proper synchronization code whereas Hashtable is synchronized. It is thread-safe and can b
e shared with many threads.

2. HashMap allows one null key and multiple null values whereas Hashtable doesn’t allow any null key or value.
3. HashMap is generally preferred over HashTable if thread synchronization is not needed
____________________________________
== Why HashTable doesn’t allow null and HashMap does? ==
To successfully store and retrieve objects from a HashTable, the objects used as keys must implement 
the hashCode method and the equals method. Since null is not an object, it can’t implement 
these methods. HashMap is an advanced version and improvement on the Hashtable. HashMap was created later.
____________________________________
 *
 */
public class HashMapTableUsage {

	public static void main(String[] args) {
		
		System.out.println("-------------Hash table--------------");
        Hashtable<Integer,String> hTable=new Hashtable<Integer,String>();
        hTable.put(20,"Roger");
        hTable.put(30,"Roger");
        hTable.put(40,"Santha");
        hTable.put(50,"Perian");        
        for (Map.Entry m:hTable.entrySet()) {
            System.out.println(m.getKey()+" "+m.getValue());
        }

        System.out.println("-----------Hash map-----------");
        HashMap<Integer,String> hMap=new HashMap<Integer,String>();
        hMap.put(44,"Roger");
        hMap.put(33,"Roger");  // hash map allows duplicate values
        hMap.put(99,"Santha");
        hMap.put(22,"Perian");
        for (Map.Entry m:hMap.entrySet()) {
            System.out.println(m.getKey()+" "+m.getValue());
        }
	}

}

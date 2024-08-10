package com.mnadiger.collections;
import java.util.*;

//Vector:
//    -     The underlined data structure is Resizable Array or Growable Array
//    -     Duplicates allowed.
//    -     Insertion order is preserved.
//    -     Null insertion is possible
//    -     Heterogeneous Object are allowed [except TreeSet and TreeMap everywhere heterogeneous objects are allowed.]
//    -     Most of the methods present in Vector are Synchronized. Hence, Vector Object is Thread-Safe.
//    -     Best choice for Retrieval Operations.


//    It creates an empty Vector Object with default initial capacity 10.
//    Once Vector reaches its max capacity a new Vector Object will be created with "new capacity = (2 * currentCapacity)"

//For Adding Elements:
    //  add(Object o)     [from Collection  - List(l)]
    //  add(int index, Object o)   [From List]
    //  addElement(Object o)   [from Vector]

//For Removing Elements:
    //  remove(Object o)     [from Collection ]
    //  removeElement(Object o)     [from Vector]
    //  remove(int index)   [From List]
    //  removeElement(int index o)     [from Vector]
    //  clear() [from Collection]
    //  removeAllElements()   [from Vector]


//For Accessing elements:
    //  Object get(int index)  [from Collection]
    //  Object elementAt(int index)  [from vector]
    //  Object firstElement() [from vector]
    //  Object lastElement()  [from vector]


//Other methods:
    // int size()
    // int capacity()
    //Enumeration elements()



public class VectorDemo {

    public static void main(String[] args) {

        Vector<Number> v= new Vector<Number>();
        System.out.println("Initial Capacity:" + v.capacity());

        for(int i=0; i<= 10; i++) {
            v.addElement(i);
        }
        System.out.println(v.capacity());

        v.addElement(10);
        System.out.println(v.capacity());
        System.out.println(v);


//         Vector v1 = new Vector(int initialCapacity)
        Vector<Number> v1= new Vector<Number>(25);
        System.out.println("Initial Capacity:" + v1.capacity());

        for(int i=0; i<= 10; i++) {
            v1.addElement(i);
        }
        System.out.println(v1.capacity());

        v1.addElement(20);
        v1.addElement(30);
        v1.addElement(40);

        System.out.println(v1.capacity());
        System.out.println(v1);



//         Vector v2 = new Vector(int initialCapacity, int incrementalCapacity)
        Vector<Number> v2= new Vector<Number>(10, 5);
        System.out.println("Initial Capacity:" + v2.capacity());

        for(int i=0; i<= 10; i++) {
            v2.addElement(i);
        }
        System.out.println(v2.capacity());

        v2.addElement(30);
        System.out.println(v2.capacity());
        System.out.println(v2);
    }





}

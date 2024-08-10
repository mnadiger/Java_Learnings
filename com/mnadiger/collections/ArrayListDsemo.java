package com.mnadiger.collections;

import java.io.Serializable;
import java.util.*;


//ArrayList:
//    -   The underlined data structure is Resizable Array or Growable Array
//    -   Duplicates allowed.
//    -   Non-Synchronize (whereas Vector is Synchronize and its legacy class)
//    -   Insertion order is preserved.
//    -   Heterogeneous Object are allowed [except TreeSet and TreeMap everywhere heterogeneous objects are aloowed.]
//    - Null insertion is possible
//
//    It creates an empty Array List Object with default initial capacity 10.
//    Once Array List reaches its max capacity a new Array List will be created with "new capacity = (currentCapacity * 3/2) + 1"

//
//Array List and Vector classes implements RandomAccess interfaces so that we can access any Random element with the same speed
//
//Hence, if our frequent operation retrieval operation then ArrayList is the best choice.
// ArrayList is the worst choice if our frequent operation is insertion or
// deletion in the middle(because several shift operations are required.)



//RandomAccess Interface:
//- It doesn't contain any methods.
//- It is a marker interface.
//- Present in java.util package


// How to get Synchronized version of ArrayList object
//Ans: By default ArrayList object are non-synchronized but we can get
// synchronized version of ArrayList by using "Collection Class synchronizedList() method".

//Similarly, we can get Synchronized version of Set, Map Object by using the following methods of Collections class.
//public static Set synchronizedSet(Set s)
//public static Map synchronizedSet(Map m)

public class ArrayListDsemo {

    public static void main(String[] args) {

        //ArrayList al = new ArrayList();
        List al = new ArrayList();

        al.add("A");
        al.add(10);
        al.add("A");
        al.add(null);
        System.out.println("ArrayList elements: " + al);

        al.remove(2);
        System.out.println("ArrayList elements: " + al);

        al.add(2, "M");
        al.add(20);
        System.out.println("ArrayList elements: " + al);


//**************************************************************************************************
        // How to get Synchronized version of ArrayList object
        //Ans: By default ArrayList object are non-synchronized but we can get synchronized version of ArrayList by using "Collection Class synchronizedList() method".

        //Non-Synchronized
        ArrayList al2 = new ArrayList();
        al2.add(10);
        al2.add(20);
        al2.add(30);
        al2.add(40);
        al2.add(50);
        System.out.println("Non-Synchronized ArrayList: " + al2);

        //Synchronized
        List l= Collections.synchronizedList(al2);
        System.out.println("Synchronized ArrayList: " + l);

//**************************************************************************************************


        //Checking if ArrayList and LinkedList is Serializable, Cloneable, RandomAccess.....
        ArrayList a1 = new ArrayList();
        System.out.println("ArrayList is instance of serializable");
        System.out.println(a1 instanceof Serializable); // True

        System.out.println("ArrayList is instance of RandomAccess");
        System.out.println(a1 instanceof RandomAccess); // True

        System.out.println("ArrayList is instance of Cloneable");
        System.out.println(a1 instanceof Cloneable); // True


        LinkedList l1 = new LinkedList();
        System.out.println("LinkedList is instance of serializable");
        System.out.println(l1 instanceof Serializable); // True

        System.out.println("LinkedList is instance of RandomAccess");
        System.out.println(l1 instanceof RandomAccess); // False

        System.out.println("LinkedList is instance of Cloneable");
        System.out.println(l1 instanceof Cloneable); // True

    }



}

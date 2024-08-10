package com.mnadiger.collections;

//LinkedList:
//-   Underlying Data Structure is "Doubly Linked List".
//-   Insertion order is preserved.
//-   Duplicates are allowed.
//-   Heterogeneous Objects allowed.
//-   Null insertion is possible.
//-   LinkedList implements Serializable, and Cloneable but not RandomAccess interface.

//- Best Choice if our frequent operation is Insertion or Deletion in the middle.
//- Worst choice for if frequent operation is Retrieval operations.

//Usually, we can use LinkedList to implement the Stack and Queues to provide support.
// For this requirement LinkedList class defines the following specific methods:

        //  void addFirst();
        //  void addLst();
        //  Object getFirst();
        //  Object getLast();
        //  Object removeFirst();
        //  Object removeLast();


import java.io.Serializable;
import java.util.LinkedList;
import java.util.RandomAccess;

public class LinkedListDemo {

    public static void main(String[] args) {
        LinkedList l= new LinkedList();

        l.add("Mariyanna");
        l.add(20);
        l.add(null);
        l.add("nadiger");
        l.set(0, "software");
        l.add(0, "test");
        l.addFirst("AAA");

        System.out.println(l);



        //Checking if ArrayList and LinkedList is Serializable, Cloneable, RandomAccess.....
        LinkedList<Boolean> l1 = new LinkedList<Boolean> ();
        System.out.println("LinkedList is instance of serializable");
        System.out.println(l1 instanceof Serializable); // True

        System.out.println("LinkedList is instance of RandomAccess");
        System.out.println(l1 instanceof RandomAccess); // False

        System.out.println("LinkedList is instance of Cloneable");
        System.out.println(l1 instanceof Cloneable); // True
    }
}

//output:
//[AAA, test, software, 20, null, nadiger]
//LinkedList is instance of serializable
//true
//LinkedList is instance of RandomAccess
//false
//LinkedList is instance of Cloneable
//true
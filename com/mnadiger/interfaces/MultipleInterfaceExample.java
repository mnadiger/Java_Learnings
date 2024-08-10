package com.mnadiger.interfaces;

interface Interface1 {
    //Default method
    default void show() {
        System.out.println("****Default Interface 1 *****");
    }
}

interface Interface2 {
    //Default method
    default void show() {
        System.out.println("****Default Interface 2 *****");
    }
}

public class MultipleInterfaceExample implements Interface1, Interface2 {

    public void show() {
        //Using SUPER keyword to call the show() method of interface 1
        Interface1.super.show();

        //Using SUPER keyword to call the show() method of interface 2
        Interface2.super.show();
    }

    public static void main(String[] args) {
        MultipleInterfaceExample mi= new MultipleInterfaceExample();
        mi.show();
    }
}

////Output:
//Dafault Interface 1
//Default Interface 2
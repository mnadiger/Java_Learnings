package com.mnadiger.interfaces;


interface IntefaceExampleDemo {

    //public, static, and final data members
    int val = 10;
}
public class InterfaceExamples implements IntefaceExampleDemo {
    public void show() {
        System.out.println("I am Mariyanna");
    }

    public static void main(String[] args) {
        InterfaceExamples i = new InterfaceExamples();
        i.show();
        System.out.println("Value = " + val);
    }
}

package com.mnadiger.instanceinitializerblock;

// -Instance initializer Block(IIB) is used to initialize the instance data members
// - It runs each time when an Object of the class is created.System
// - It is created with "{  }" and the initialization statements are written inside the braces.
//
//      - Initialization blocks are executed whenever the class is initialized and before constructors are invoked.
//      - They are typically placed above the constructors within braces.
//      - It is not at all necessary to include them in your classes.

//        *****Rules:*****
//    - Created when instance of the class is crated.
//    - It is invoked after the Parent class is invoked after the Super() call.
//    - Can be added multiple blocks
//    - It executes in the order of they appear.
//
// How to execute Instance block withoiut creating the object
//It is also possible to execute an instance block without creating an object.
//To execute an instance block without creating an object we need to define it explicitly inside the main method.

public class InstanceInitializerBlock {

    // Instance Initialization Block - 1
    {
        System.out.println("IIB1 block");
    }

    // Instance Initialization Block - 2
    {
        System.out.println("IIB2 block");
    }

    // Constructor of class InstanceInitializerBlock
    public InstanceInitializerBlock() {
        System.out.println("***Statement Inn Constructor***");
    }

    // Instance Initialization Block - 3
    {
        System.out.println("IIB3 block");
    }

    public static void main(String[] args) {

        // Declaring instance block inside main method
        {
            System.out.println(
                    "Instance block inside main method called without creating an object");
        }


        InstanceInitializerBlock iib= new InstanceInitializerBlock();
    }
}


//Output
//IIB1 block
//IIB2 block
//IIB3 block
//***Statement Inn Constructor***

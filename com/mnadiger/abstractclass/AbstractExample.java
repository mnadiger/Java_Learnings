package com.mnadiger.abstractclass;

abstract class School {

        //Non-abstract method
        public void show() {
            System.out.println("****School Application****");
        }

        //Abstract method
        abstract int getAdmissionFee();

}


class RVSRSchool extends School {
    //Overriding the method from "School" class
    int getAdmissionFee() {
        return 10000;
    }
}


class CMNSchool extends School {
    //Overriding the method from "School" class
    int getAdmissionFee() {
        return 20000;
    }
}

class VidyaniketanSchool extends School {
    //Overriding the method from "School" class
    int getAdmissionFee() {
        return 40000;
    }
}

public class AbstractExample {
    public static void main(String[] args) {
        School s;
        s = new RVSRSchool();
        s.show();
        System.out.println("RVSR School Admission Fee:" + s.getAdmissionFee());

        s = new CMNSchool();
        System.out.println("CMN School Admission Fee:" + s.getAdmissionFee());

        s = new VidyaniketanSchool();
        System.out.println("Vidyaniketan School Admission Fee:" + s.getAdmissionFee());

    }
}
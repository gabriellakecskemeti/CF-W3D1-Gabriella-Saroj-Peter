package Gabriella.package1;

import Gabriella.package2.C;

public class A {

    protected void msg() {
        System.out.println("A");
    }

    public static void main(String[] args) {
        new B().msg();
    }


}

package com.java8;


import org.testng.annotations.Test;

public class AnnymsInrCls {

    @Test
    public void testMethod() {

        /*
  Condition to anonymous inner class:
    class does not have name is called "anonymous class"
    class that is inside another class is called "Inner class"
 */

        IFunctnl iFunctnl = new IFunctnl() {
            @Override
            public void print() {
                System.out.println("Anonymous inner class");
            }
        };

        iFunctnl.print();

/*
  Condition to lamda expression:
    Method return type should match
    Parameters to the method should match
    Interface should have only one abstract or unimplemented methods(Functional Interface)
 */

        IFunctnl iFunctnl1 = () -> System.out.println("Lamda expression");

        iFunctnl1.print();

    }
}
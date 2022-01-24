package com.java8;

/*
    Condition for FunctionalInterface:
    Only 1 abstract method
    any no of default methods or static methods
 */

@FunctionalInterface
public interface IFunctnl {

    static void smethod1() {
        System.out.print("Static Method1");
    }

    static void smethod2() {
        System.out.print("Static Method2");
    }

    public void print(); // abstract method

    default void method1() {
        System.out.print("Default Method1");
    }

    default void method2() {
        System.out.print("Default Method2");
    }

}

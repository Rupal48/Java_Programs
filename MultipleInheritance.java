/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.java.college;

/**
 *
 * @author Asus
 */
interface A {

    void methodA();
}

interface B {

    void methodB();
}

class MyClass implements A, B {

    @Override
    public void methodA() {
        System.out.println("This is methodA.");
    }

    @Override
    public void methodB() {
        System.out.println("This is methodB.");
    }
}

public class MultipleInheritance {

    public static void main(String[] args) {
        MyClass obj = new MyClass();
        obj.methodA();
        obj.methodB();
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.java.college;

/**
 *
 * @author Asus
 */
class First {

    public void one() {
        System.out.println("First");
    }
}

class Second extends First {

    void second() {
        System.out.println("Second");
    }
}

class Third extends Second {

    void third() {
        System.out.println("Multilevel inheritance occured.");
    }
}

public class MultilevelInheritance {

    public static void main(String args[]) {
        System.out.println("This program was made by Rupal Malhotra.");
        Third a = new Third();
        a.one();
        a.second();
        a.third();

    }
}

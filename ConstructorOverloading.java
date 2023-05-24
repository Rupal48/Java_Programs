/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.java.college;

/**
 *
 * @author Asus
 */
class Zack {

    Zack() {
        System.out.println("No arguements used in Constructor");
    }

    Zack(String a) {
        System.out.println("Constructor was invoked with 1 arguement using " + a);
    }

    Zack(String a, String b) {
        System.out.println("Constructor was invoked with 2 arguement using " + a + b);
    }
}

public class ConstructorOverloading {

    public static void main(String args[]) {
        System.out.println("This program was msde by Rupal Malhotra.");
        Zack a = new Zack();
        Zack b = new Zack("this.");
        Zack c = new Zack("this", " and that.");
    }
}

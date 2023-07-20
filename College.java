/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.java.college;

/**
 *
 * @author Asus
 */
import java.util.Scanner;

class A {

    private int data;

    void show() {
        System.out.print("Enter the private data: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        data = n;
        System.out.println(data);

    }

    public void display() {
        System.out.println("Public Data: ");
        System.out.println("Hello java");

    }

    protected int num;

}

class B extends A {

    void msg() {
        System.out.print("Enter protected data: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        num = n;
        System.out.println(num);

    }

}

public class College {

    public static void main(String[] args) {
        System.out.println("This program was made by Rupal Malhotra");
        B b = new B();

        b.show();

        b.display();

        b.msg();
    }
}

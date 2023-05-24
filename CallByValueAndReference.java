/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.java.college;

/**
 *
 * @author Asus
 */
public class CallByValueAndReference {

    public static void val(int x) {
        x++;
    }

    public static void ref(int[] arr) {
        arr[0]++;
    }

    public static void main(String args[]) {
        System.out.println("This program was made by Rupal Malhotra.");
        int arr[] = {1, 2, 3, 4};
        int num = 5;
        System.out.println("Number before Call : " + num);
        System.out.print("Array before Call : ");
        for (int x : arr) {
            System.out.print(x + " ");
        }
        val(num);
        ref(arr);
        System.out.println("\nNumber after Call : " + num + " (Call By Value)");
        System.out.print("Array after Call : ");
        for (int x : arr) {
            System.out.print(x + " ");
        }
        System.out.println("(Call By Reference)");
    }
}

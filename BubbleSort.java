/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.java.college;

import java.util.Scanner;

/**
 *
 * @author Asus
 */
public class BinarySort {

    public static void main(String args[]) {
        System.out.println("This program was made by Rupal Malhotra.");
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter no. of elements in the array : ");
        int n = scan.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter elements in your array : ");
        for (int i = 0; i < n; i++) {
            arr[i] = scan.nextInt();
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    arr[j] = arr[j] + arr[j + 1];
                    arr[j + 1] = arr[j] - arr[j + 1];
                    arr[j] = arr[j] - arr[j + 1];
                }
            }
        }
        System.out.print("Sorted Array : ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}

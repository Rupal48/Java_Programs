/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.java.college;

/**
 *
 * @author Asus
 */
import static java.lang.Math.pow;
import java.util.Scanner;

public class ArmstrongNo {

    public static int NoOfDigits(int n) {
        int count = 0;
        while (n != 0) {
            n = n / 10;
            count++;
        }
        return count;
    }

    public static void main(String args[]) {
        System.out.println("This program was made by Rupal malhotra.");
        System.out.print("Enter the no you wanna check : ");
        Scanner scan = new Scanner(System.in);
        int origNo = scan.nextInt();
        int m = NoOfDigits(origNo);
        int k = origNo;
        int i = 0;
        while (k != 0) {
            i += pow(k % 10, m);
            k = k / 10;
        }
        if (i == origNo) {
            System.out.println(origNo + " is an armstrong number.");
        } else {
            System.out.println(origNo + " is not an armstrong number.");
        }
    }
}

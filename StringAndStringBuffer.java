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
public class StringAndStringBuffer {
    public static void main(String[] args) {
         System.out.println("This program was made by Rupal Malhotra");
        System.out.print("Enter a string: ");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        
        // length() method
        int length = str.length();
        System.out.println("Length of the string: " + length);
        
        // charAt() method
        char ch = str.charAt(7);
        System.out.println("Character at index 7: " + ch);
        
        // substring() method
        String substring = str.substring(7);
        System.out.println("Substring from index 7 onwards: " + substring);
        
        // toUpperCase() method
//        String uppercase = str.toUpperCase();
//        System.out.println("Uppercase string: " + uppercase);
        
         System.out.print("Enter a string for StringBuffer: ");
             String obj = sc.nextLine();
         StringBuffer stringBuffer = new StringBuffer(obj);
        // StringBuffer methods
        // append() method
        stringBuffer.append(", World!");
        System.out.println("Appended string: " + stringBuffer);
        
        // insert() method
        stringBuffer.insert(5, " everyone");
        System.out.println("Inserted string: "+stringBuffer);
        
        // delete() method
        stringBuffer.delete(0, 6);
        System.out.println("Deleted string: " + stringBuffer);
        
        // reverse() method
//        stringBuffer.reverse();
//        System.out.println("Reversed string: " + stringBuffer);
    }
}

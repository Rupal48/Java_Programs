/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.java.college;

/**
 *
 * @author Asus
 */
import java.io.*;

public class ConvertFileToUppercase {
    public static void main(String[] args) {
       String filename = "C:\\Users\\Asus\\Desktop\\Java\\Javanew.txt";

        try {
            File file = new File(filename);
            BufferedReader reader = new BufferedReader(new FileReader(file));
            StringBuilder content = new StringBuilder();
            String line;

            // Read the content of the file
            while ((line = reader.readLine()) != null) {
                content.append(line).append("\n");
            }
            reader.close();

            // Convert the content to uppercase
            String uppercaseContent = content.toString().toUpperCase();

            // Write the uppercase content back to the file
            BufferedWriter writer = new BufferedWriter(new FileWriter(file));
            writer.write(uppercaseContent);
            writer.close();

            System.out.println("File content converted to uppercase and saved successfully.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
package com.java.college;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Asus
 */
class CustomException extends Exception {
    public CustomException(String message) {
        super(message);
    }
}

public class CustomExceptionProgram {
    public static void main(String[] args) {
        try {
            // Code that may throw the custom exception
            throwCustomException();
        } catch (CustomException ce) {
            System.out.println("Caught the custom exception: " + ce.getMessage());
        } catch (Exception e) {
            System.out.println("Caught a general exception: " + e.getMessage());
        } finally {
            System.out.println("Finally block executed, regardless of exceptions.");
        }
    }

    public static void throwCustomException() throws CustomException {
        throw new CustomException("Custom exception occurred!");
    }
}


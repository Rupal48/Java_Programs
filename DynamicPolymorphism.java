/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.java.college;

/**
 *
 * @author Asus
 */
public class DynamicPolymorphism {
    public interface Shape {
        double calculateArea();
    }
    public static class Circle implements Shape {
        private double radius;
        public Circle(double radius) {
            this.radius = radius;
        }
        public double calculateArea() {
            return Math.PI * radius * radius;
        }
    }
    public static class Rectangle implements Shape {
        private double length,width;
        public Rectangle(double length, double width) {
            this.length = length;
            this.width = width;
        }
        public double calculateArea() {
            return length * width;
        }
    }
    public static void main(String args[]) {
        System.out.println("This program was made by Rupal Malhotra.");
        Shape[] shapes = new Shape[2];
        shapes[0] = new Circle(1);
        shapes[1] = new Rectangle(2, 3);
        for (Shape shape : shapes)
            System.out.println("Area: " + shape.calculateArea());
    }
}

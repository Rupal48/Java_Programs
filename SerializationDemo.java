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

class Person implements Serializable {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}

public class SerializationDemo {
    public static void main(String[] args) {
        // Create an instance of the Person class
        Person person = new Person("Rupal Malhotra", 19);

        // Serialize the object to a file
        try {
            FileOutputStream fileOut = new FileOutputStream("person.ser");
            ObjectOutputStream objectOut = new ObjectOutputStream(fileOut);
            objectOut.writeObject(person);
            objectOut.close();
            fileOut.close();
            System.out.println("Person object has been serialized to person.ser");
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Deserialize the object from the file
        Person deserializedPerson = null;
        try {
            FileInputStream fileIn = new FileInputStream("person.ser");
            ObjectInputStream objectIn = new ObjectInputStream(fileIn);
            deserializedPerson = (Person) objectIn.readObject();
            objectIn.close();
            fileIn.close();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }

        // Display the deserialized object
        if (deserializedPerson != null) {
            System.out.println("Deserialized Person:");
            System.out.println("Name: " + deserializedPerson.getName());
            System.out.println("Age: " + deserializedPerson.getAge());
        }
    }
}

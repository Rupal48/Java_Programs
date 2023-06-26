/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.java.college;

/**
 *
 * @author Asus
 */
import java.util.LinkedList;

public class ProducerConsumerExample {
    public static void main(String[] args) {
        Buffer buffer = new Buffer(5); // Create a buffer with a capacity of 5

        Producer producer = new Producer(buffer);
        Consumer consumer = new Consumer(buffer);

        Thread producerThread = new Thread(producer);
        Thread consumerThread = new Thread(consumer);

        producerThread.start();
        consumerThread.start();
    }
}

class Buffer {
    private LinkedList<Integer> buffer;
    private int maxSize;

    public Buffer(int maxSize) {
        this.buffer = new LinkedList<>();
        this.maxSize = maxSize;
    }

    public synchronized void produce(int value) throws InterruptedException {
        while (buffer.size() == maxSize) {
            wait(); // Wait if the buffer is full
        }

        buffer.add(value);
        System.out.println("Produced: " + value);
        notifyAll(); // Notify waiting consumers that a value is produced
    }

    public synchronized int consume() throws InterruptedException {
        while (buffer.size() == 0) {
            wait(); // Wait if the buffer is empty
        }

        int value = buffer.removeFirst();
        System.out.println("Consumed: " + value);
        notifyAll(); // Notify waiting producers that a value is consumed

        return value;
    }
}

class Producer implements Runnable {
    private Buffer buffer;

    public Producer(Buffer buffer) {
        this.buffer = buffer;
    }

    @Override
    public void run() {
        try {
            for (int i = 0; i <= 2; i++) {
                buffer.produce(i);
                Thread.sleep(1000); // Simulate some delay
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

class Consumer implements Runnable {
    private Buffer buffer;

    public Consumer(Buffer buffer) {
        this.buffer = buffer;
    }

    @Override
    public void run() {
        try {
            for (int i = 0; i <= 1; i++) {
                int value = buffer.consume();
                Thread.sleep(2000); // Simulate some processing time
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

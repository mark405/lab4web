package org.example;

public class Dog implements Animal{
    @Override
    public void sound() {
        System.out.println("Barrrr");
    }

    @Override
    public String toString() {
        return "I am Dog";
    }
}

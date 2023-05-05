package org.example;

public class Cat implements Animal{
    @Override
    public void sound() {
        System.out.println("Myaaau");
    }

    @Override
    public String toString() {
        return "I am Cat";
    }
}

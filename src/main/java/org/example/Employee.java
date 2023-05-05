package org.example;

public class Employee extends Person{
    String job;

    public Employee(String name, int age, String job) {
        super(name, age);
        this.job = job;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "job='" + job + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}

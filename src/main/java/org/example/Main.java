package org.example;

import org.springframework.web.client.RestTemplate;

import java.util.Map;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        int age = 31;
        Integer ageWrapper = age;
        final String name = "Mark";

        System.out.println(age);
        System.out.println(name);

        int[] numbers = {1, 3, 0, 7, 4, 5, 6, 9};

        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i]);
        }
        System.out.println();
        for (int num: numbers) {
            System.out.print(num);
        }
        System.out.println();

        String firstPart = "Hello";
        String secondPart = "world";
        System.out.println(firstPart + secondPart);

        String wrongString = "Puthon";
        String newString = wrongString.replace('u', 'y');
        System.out.println(newString);

        Employee employee = new Employee("bob", 32, "programmer");

        System.out.println(employee);

        Animal dog = new Dog();
        System.out.println(dog);
        dog.sound();

        Animal cat = new Cat();
        System.out.println(cat);
        cat.sound();

        MyLogger.log("hello I am logger");

        Map<Integer, String> map = new HashMap<>();
        map.put(ageWrapper, name);
        map.put(40, "Bob");

        for (Map.Entry<Integer, String> entry: map.entrySet()) {
            System.out.println(entry.getKey());
            System.out.println(entry.getValue());
        }

        RestTemplate restTemplate = new RestTemplate();
        final String url = "https://www.randomnumberapi.com/api/v1.0/random?min=100&max=1000&count=5";
        String response = restTemplate.getForObject(url, String.class);
        System.out.println(response);


    }
}
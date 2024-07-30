package org.example;

public class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        if (name == null || name.isEmpty() || name.length() > 40) {
            throw new IllegalArgumentException("Name cannot be null, empty, or longer than 40 characters.");
        }
        if (age < 0 || age > 120) {
            throw new IllegalArgumentException("Age must be between 0 and 120.");
        }

        this.name = name;
        this.age = age;
    }

    public String getName() {
        return this.name;
    }

    public int getAge() {
        return this.age;
    }

    public static void main(String[] args) {
        // Valid person
        Person person1 = new Person("John Doe", 25);
        System.out.println("Name: " + person1.getName());
        System.out.println("Age: " + person1.getAge());

        // Invalid person
         Person person2 = new Person("", 25);

    }
}

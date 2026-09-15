package org.example;

public class Person {
    String firstName;
    String lastName;
    int age;

    // Kendi eklediğim 3 ek instance variable
    String country;
    String profession;
    boolean isStudent;

    // 3 parametreli constructor
    public Person(String firstName, String lastName, int age) {
        this(firstName, lastName, age, "Unknown", "Unknown", false);
    }

    // Overload edilmiş, ek parametreleri de alan constructor
    public Person(String firstName, String lastName, int age, String country, String profession, boolean isStudent) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.country = country;
        this.profession = profession;
        this.isStudent = isStudent;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public boolean isTeen() {
        if (age >= 13 && age <= 19) {
            return true;
        }
        return false;
    }
}
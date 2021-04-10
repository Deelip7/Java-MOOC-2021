package com.lab.overloading;

public class Main {

    public static void main(String[] args) {

        Cat cat1 = new Cat("meowCat");
        Dog dog1 = new Dog("doggo");

        Person pers1 = new Person("mike");
        Person pers2 = new Person("John");

        pers1.setPet(cat1);
        pers2.setPet(dog1);

        System.out.println(pers1.getPet().getName());
        System.out.println(pers2.getPet().getName());

    }
}

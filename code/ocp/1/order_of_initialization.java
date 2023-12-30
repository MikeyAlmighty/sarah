package main;

public class Main {
    public static void main(String[] args){
        System.out.println("Hello, World!");
        Person p = new Person("Shrek");
    }
}

class Person {

    String name = "Deadpool";
    { // Initialization block
        System.out.println("My name is : " + name);
    }
    public Person(String name){
        this.name = name;
        System.out.println("Creating new Person: " + this.name);
    }
}

/* OUTPUT

Hello, World!
My name is : Deadpool
Creating new PersonShrek
 */

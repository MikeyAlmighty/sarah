public class Animal {
    private int age;

    public Animal(int age) {
        super(); // Refers to constructor in java.lang.Object
        this.age = age;
    }
}

public class Zebra extends Animal {
    public Zebra(int age) {
        super(age); // Refers to constructor in Animal
    }
    public Zebra() {
        this(4); // Refers to constructor in Zebra with ~int~ argument
    }
}

public class Zoo {
    public Zoo() {
        System.out.println("Zoo created");
        super(); // DOES NOT COMPILE
    }
}
public class Zoo {
    public Zoo() {
        super();
        System.out.println("Zoo created");
        super(); // DOES NOT COMPILE
    }
}

public class Animal {
    private int age;
    private String name;

    public Animal(int age, String name) { // First Constructor
        super();
        this.age = age;
        this.name = name;
    }

    public Animal(int age) { // Second Constructor
        super();
        this.age = age;
        this.name = null;
    }
}

public class Gorilla extends Animal {
    public Gorilla(int age) {
        super(age,"Gorilla"); // Calls the first Animal constructor
    }
    public Gorilla() {
        super(5); // Calls the second Animal constructor
    }
}

public class Donkey {}

public class Donkey {
    public Donkey() {}
}

public class Donkey {
    public Donkey() {
        super();
    }
}

public class Hamster {
    private String color;
    private int weight;

    public Hamster(int weight, String color) { // First constructor
        this.weight = weight;
        this.color = color;
    }

    public Hamster(int weight) { // Second constructor
        this.weight = weight;
        color = "brown";
    }
}

public class Hamster {
    private String color;
    private int weight;

    public Hamster(int weight, String color) { // First constructor
        this.weight = weight;
        this.color = color;
    }

    public Hamster(int weight) {
        this(weight, "brown");
    }
}

public Hamster(int weight) {
    System.out.println("chew");
    // Set weight and default color
    this(weight, "brown"); // DOES NOT COMPILE
}

public class Gopher {
    public Gopher(int dugHoles) {
        this(5); // DOES NOT COMPILE
    }
}

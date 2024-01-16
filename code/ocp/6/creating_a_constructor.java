public class Bunny {
    public Bunny() {
        System.out.println("Hop");
    }
    public bunny() {} // DOES NOT COMPILE
    public void Bunny() {} // DOES NOT COMPILE
}

public class Bonobo {
    public Bonobo(var food) { // DOES NOT COMPILE

    }
}

public class Turtle {
    private String name;
    public Turtle() {
        name = "John Doe";
    }
    public Turtle(int age) {}
    public Turtle(long age) {}
    public Turtle(String newName, String... favoriteFoods) {
    name = newName;
    }
}

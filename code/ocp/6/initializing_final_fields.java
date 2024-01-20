public class MouseHouse {
    private final int volume;
    private final String name = "The Mouse House"; // Declaration assignment
    {
        volume = 10; // Instance Initializer assignment
    }
}

public class MouseHouse {
    private final int volume;
    private final String name;
    public MouseHouse() {
        this.name = "Empty House"; // Constructor assignment
    }
    {
        volume = 10; // Instance initializer assignment
    }
}

public class MouseHouse {
    private final int volume;
    private final String type;

    {
        this.volume = 10;
    }

    public MouseHouse(String type) {
        this.type = type;
    }

    public MouseHouse() { // DOES NOT COMPILE
        this.volume = 2; // DOES NOT COMPILE
    }
}

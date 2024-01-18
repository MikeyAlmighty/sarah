public class Mammal {
    public Mammal(int age) {}
}

public class Seal extends Mammal {} // DOES NOT COMPILE

public class Elephant extends Mammal {
    public Elephant() {} // DOES NOT COMPILE
}

public class Seal extends Mammal {
    public Seal() {
        super(); // DOES NOT COMPILE
    }
}

public class Elephant extends Mammal {
    public Elephant() {
        super(); // DOES NOT COMPILE
    }
}

public class Seal extends Mammal {
    public Seal() {
        super(6); // Explicit call to parent constructor
    }
}

public class Elephant extends Mammal {
    public Elephant() {
        super(4); // Explicit call to parent constructor
    }
}

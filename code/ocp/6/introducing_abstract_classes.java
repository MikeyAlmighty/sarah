public abstract class Canine {}

public class Wolf extends Canine {}
public class Fox extends Canine {}
public class Coyote extends Canine {}

public abstract class Canine {
    public abstract String getSound();
    public void bark() {
        System.out.println(getSound());
    }
}

public class Wolf extends Canine {
    public String getSound() {
        return "Wooooooof!";
    }
}

public class Fox extends Canine {
    public String getSound() {
        return "Squeak!";
    }
}

public class Coyote extends Canine {
    public String getSound() {
        return "Roar!";
    }
}

public static void main(String[] p) {
    Canine w = new Fox();
    w.bark(); // Squeak!
}

abstract class Alligator {
    public static void main(String... food) {
        var a = new Alligator(); // DOES NOT COMPILE
    }
}

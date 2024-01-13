public class MantaRay {
    private String name = "Sammy";
    public static void first() { }
    public static void second() { }

    public void third() { System.out.print(name); }

    public static void main(String args[]) {
        first();
        second();
        third(); // DOES NOT COMPILE (Not static)
    }
}

public static void third() { System.out.print(name); } // DOES NOT COMPILE

public class MantaRay {
    private static String name = "Sammy";
    // ...
    public static void third() { System.out.print(name); }
    // ...
}

public class MantaRay {
    private String name = "Sammy";
    public static void first() { }
    public static void second() { }
    public void third() { System.out.print(name); }

    public static void main(String args[]) {
        first();
        second();
        var ray = new MantaRay();
        ray.third();
    }
}

public class Giraffe {
    public void eat(Giraffe g) {}
    public void drink() {};
    public static void allGiraffeGoHome(Giraffe g) {}
    public static void allGiraffeComeOut() {}
}

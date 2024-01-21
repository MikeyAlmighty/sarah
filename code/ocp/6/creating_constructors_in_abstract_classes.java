abstract class Mammal {
    abstract CharSequence chew();

    public Mammal() {
        System.out.println(chew());
    }
}

public class Platypus extends Mammal {
    String chew() {
        return "yummy!";
    }

    public static void main(String[] args) {
        new Platypus();
    }
}

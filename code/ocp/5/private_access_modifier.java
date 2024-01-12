package pond.duck;

public class FatherDuck {
    private String noise = "quack";
    private void quack() {
        System.out.print(noise); // private access is ok
    }
}

package pond.duck;

public class BadDuckling {
    public void makeNoise() {
        var duck = new FatherDuck();
        duck.quack(); // DOES NOT COMPILE
        System.out.print(duck.noise); // DOES NOT COMPILE
    }
}

package pond.duck;

public class MotherDuck {
    String noise = "quack";
    void quack() {
    System.out.print(noise); // package access is ok
    }
}

package pond.duck;

public class GoodDuckling {
    public void makeNoise() {
        var duck = new MotherDuck();
        duck.quack(); // package access is ok
        System.out.print(duck.noise); // package access is ok
    }
}

package pond.swan;

// import another package
import pond.duck.MotherDuck;

public class BadCygnet {
    public void makeNoise() {
        var duck = new MotherDuck();
        duck.quack(); // DOES NOT COMPILE
        System.out.print(duck.noise); // DOES NOT COMPILE
    }
}

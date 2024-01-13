public class Fish {}
public class ClownFish extends Fish {}

// Parent Class
package pond.shore;

public class Bird {
    protected String text = "floating";
    protected void floatInWater() {
        System.out.print(text); // protected access is ok
    }
}

// subclass (Different package than Bird):
package pond.goose;

import pond.shore.Bird;

public class Gosling extends Bird {
    public void swim() {
        floatInWater(); // protected access is ok
        System.out.print(text); // protected access is ok
    }
    public static void main(String[] args) {
        new Gosling().swim();
    }
}

package pond.shore; // Same package as Bird

public class BirdWatcher {
    public void watchBird() {
        Bird bird = new Bird();
        bird.floatInWater(); // protected access is ok
        System.out.print(bird.text); // protected access is ok
    }
}

package pond.inland; // Different package than Bird

import pond.shore.Bird;

public class BirdWatcherFromAfar { // Not a subclass of Bird
    public void watchBird() {
        Bird bird = new Bird();
        bird.floatInWater(); // DOES NOT COMPILE
        System.out.print(bird.text); // DOES NOT COMPILE
    }
}

package pond.swan; // Different package than Bird

import pond.shore.Bird;

public class Swan extends Bird { // Swan is a subclass of Bird
    public void swim() {
        floatInWater(); // LINE 5: protected access is ok
        System.out.print(text); // LINE 6: protected access is ok
    }
    public void helpOtherSwanSwim() {
        Swan other = new Swan(); // LINE 9

        other.floatInWater(); // LINE 10: subclass access to superclass
        System.out.print(other.text); // LINE 11: subclass access to superclass
    }

    public void helpOtherBirdSwim() {
        Bird other = new Bird(); // LINE: 14

        other.floatInWater(); // LINE 15: DOES NOT COMPILE
        System.out.print(other.text); // LINE 16: DOES NOT COMPILE
    }
}

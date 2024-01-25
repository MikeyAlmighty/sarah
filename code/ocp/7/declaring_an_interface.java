public abstract interface CanBurrow {
  public abstract Float getSpeed(int age); // Abstract Interface Method
  public static final int MINIMUM_DEPTH = 2; // Constant
}

public abstract interface WalksOnTwoLegs {}

public class Biped {
    public static void main(String[] args) {
        var e = new WalksOnTwoLegs(); // DOES NOT COMPILE
    }
}

public final interface WalksOnEightLegs {} // DOES NOT COMPILE

public class FieldMouse implements Climb, CanBurrow {
    public Float getSpeed(int age) {
        return 11f;
    }
}

public class Bird {
    public final boolean hasFeathers() {
        return true;
    }
    public final static void flyAway() {}
}

public class Penguin extends Bird {
    public final boolean hasFeathers() { // DOES NOT COMPILE
        return false;
    }
    public final static void flyAway() {} // DOES NOT COMPILE
}

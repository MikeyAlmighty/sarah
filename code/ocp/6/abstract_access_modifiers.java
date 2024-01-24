public abstract final class Tortoise {// DOES NOT COMPILE
    public abstract final void walk(); // DOES NOT COMPILE
}

public abstract class Whale {
    private abstract void sing(); // DOES NOT COMPILE
}

public class HumpbackWhale extends Whale {
    private void sing() {
        System.out.println("Humpback whale is singing");
    }
}

public abstract class Whale {
    protected abstract void sing();
}

public class HumpbackWhale extends Whale {
    private void sing() { // DOES NOT COMPILE
        System.out.println("Humpback whale is singing");
    }
}

abstract class Hippopotamus {
    abstract static void swim(); // DOES NOT COMPILE
}

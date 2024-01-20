public abstract class Llama {
    public void chew() {}
}

public class Egret { // DOES NOT COMPILE
    public abstract void peck();
}

abstract public class Tiger {
    abstract public int claw();
}

public class abstract Bear { // DOES NOT COMPILE
    public int abstract howl(); // DOES NOT COMPILE
}

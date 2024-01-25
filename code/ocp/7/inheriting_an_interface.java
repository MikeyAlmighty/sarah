public interface HasTail {
    public int getTailLength();
}

public interface HasWhiskers {
    public int getNumberOfWhiskers();
}

public abstract class HarborSeal implements HasTail, HasWhiskers {}

public class CommonSeal extends HarborSeal {} // DOES NOT COMPILE

public interface CanRun {}
public class Cheetah extends CanRun {} // DOES NOT COMPILE

public class Hyena {}
public interface HasFur extends Hyena {} // DOES NOT COMPILE

public abstract interface Herbivore {
    public void eatPlants();
}

public abstract interface Omnivore {
    public void eatPlants();
}

public class Bear implements Herbivore, Omnivore {
    public void eatPlants() {
        System.out.println("Eating plants");
    }
}

public abstract interface Herbivore {
    public void eatPlants();
}

public abstract interface Omnivore {
    public int eatPlants();
}

public class Tiger implements Herbivore, Omnivore { // DOES NOT COMPILE
...
}

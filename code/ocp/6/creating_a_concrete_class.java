public abstract class Mammal {
    abstract void showHorn();
    abstract void eatLeaf();
}

public abstract class Rhino extends Mammal {
    void showHorn() {} // Inherited from Mammal
}

public class BlackRhino extends Rhino {
    void eatLeaf() {} // Inherited from Mammal
}

public abstract class Animal {
    abstract String getName();
}

public abstract class BigCat extends Animal {
    protected abstract void roar();
}

public class Lion extends BigCat {
    public String getName() {
        return "Lion";
    }
    public void roar() {
        System.out.println("The Lion lets out a loud ROAR!");
    }
}

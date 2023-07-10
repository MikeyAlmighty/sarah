public class GenericList<T> {
    private T[] items = (T[]) new Object[10];
    private int count;

    public void add(T item) {
        items[count++] = item;
    }

    public T get(int index) {
        return items[index];
    }
}

public class Main {
    public static void main(String[] args) {
       var stringList = new GenericList<String>();
       stringList.add("DeadPool");
       stringList.add("Batman");
       System.out.println(stringList.get(1));
       var numList = new GenericList<Integer>();
       numList.add(69);
       numList.add(420);
       System.out.println(numList.get(0));
    }
}

public static void main(String[] args) {
  GenericList<String> stringList = new GenericList<>(); // No need for unnecessary second Wrapper reference <String>
  GenericList<Integer> numList = new GenericList<>();
  numList.add(1); // Boxing
  var number = numList.get(0); // Unboxing
}

// GenericList.java
public class GenericList<T extends Number> {
    private T[] items = (T[]) new Object[10];
    private int count;

    public void add(T item) {
        items[count++] = item;
    }

    public T get(int index) {
        return items[index];
    }
}
// Main.java
public static void main(String[] args) {
    GenericList<String> stringList = new GenericList<>(); // Compilation Error
    GenericList<Integer> numList = new GenericList<>();  // Okay
}

public class GenericList<T extends Comparable & Cloneable> {
    private T[] items = (T[]) new Object[10];
    private int count;

    public void add(T item) {
        items[count++] = item;
    }

    public T get(int index) {
        return items[index];
    }
}

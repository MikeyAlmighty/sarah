public class VisitAttractions {
    public void walk1(int... steps) {}
    public void walk2(int start, int... steps) {}
    public void walk3(int... steps, int start) {} // DOES NOT COMPILE
    public void walk4(int... start, int... steps) {} // DOES NOT COMPILE
}

// Pass an array
int[] data = new int[] {1, 2, 3};
walk1(data);

// Pass a list of values
walk1(1,2,3);

public void walk1(int... steps) {
    int[] step2 = steps; // Not necessary, but shows steps is of type int[]
    System.out.print(step2.length);
}

public static void run(int... steps) {
    System.out.print(steps[1]);
}
public static void main(String[] args) {
    run(11, 77);// 77
}

public class DogWalker {
    public static void walkDog(int start, int... steps) {
        System.out.println(steps.length);
    }

    public static void main(String[] args) {
        walkDog(1); // 0
        walkDog(1, 2); // 1
        walkDog(1, 2, 3); // 2
        walkDog(1, new int[] {4, 5}); // 2
        walkDog(1, null); // Triggers NullPointerException
    }
}

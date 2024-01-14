import java.util.List;
import java.util.Arrays;

public class Imports {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("one", "two");
    }
}

import java.util.List;
import static java.util.Arrays.asList; // static import

public class ZooParking {
    public static void main(String[] args) {
        List<String> list = asList("one", "two"); // No Arrays. prefix
    }
}

import static java.util.Arrays; // DOES NOT COMPILE (Tries to use a static import to import a class)
import static java.util.Arrays.asList;
static import java.util.Arrays.*; // DOES NOT COMPILE

public class BadZooParking {
    public static void main(String[] args) {
        Arrays.asList("one"); // DOES NOT COMPILE (Should just be asList("One");)
    }
}

import static zoo.A.TYPE;
import static zoo.B.TYPE; // DOES NOT COMPILE

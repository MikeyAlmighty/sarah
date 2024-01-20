public class ZooTickets {
    private String name = "BestZoo"; // Line: 2
    { System.out.print(name + "-"); } // Line: 3

    private static int COUNT = 0; // Line: 4
    static { System.out.print(COUNT + "-"); } // Line: 5
    static { COUNT += 10; System.out.print(COUNT + "-"); } // Line: 6

    public ZooTickets() { // Line: 8
        System.out.print("z-"); // Line: 9
    } // Line: 10

    public static void main(String... patrons) {
        new ZooTickets(); // Line: 13
    }
}
//Output: ~0-10­BestZoo­z-~

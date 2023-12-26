public class Light {
  // Fields:
  int     noOfWatts;      // Wattage
  boolean indicator;      // On or off
  String  location;       // Placement

  // Constructor:
  public Light(int noOfWatts, boolean indicator, String site) {
    // Local Variable
    String location;

    this.noOfWatts = noOfWatts;   // (1) Assignment to field
    indicator = indicator;        // (2) Incorrect Assignment to parameter
    location = site;              // (3) Incorrect Assignment to local variable
    this.superfluous();           // (4)
    superfluous();                // equivalent to call at as it does not shadow a class member(4)
  }

  // Instance method:
  public void superfluous() {
    System.out.printf("Current object: %s%n", this); // (5)
  }

  // Static method:
  public static void main(String[] args) {
    Light light = new Light(100, true, "loft");
    System.out.println("No. of watts: " + light.noOfWatts); // Prints 100
    System.out.println("Indicator:    " + light.indicator); // Prints false
    System.out.println("Location:     " + light.location); // Prints null
  }
}
/*
    Output:
    Current object: Light@1bc4459
    Current object: Light@1bc4459
    No. of watts: 100
    Indicator: false
    Location: null
*/

public void printDayOfWeek(int day) {
    var result = switch(day) {
        case 0 -> "Sunday";
        case 1 -> "Monday";
        case 2 -> "Tuesday";
        case 3 -> "Wednesday";
        case 4 -> "Thursday";
        case 5 -> "Friday";
        case 6 -> "Saturday";
        default -> "Invalid Value";
    };
    System.out.print(result);
}

int measurement = 10;
int size = switch(measurement) {
    case 5 -> 1;
    case 10 -> (short)2;
    default -> 5;
    case 20 -> "3"; // DOES NOT COMPILE
    case 40 -> 4L; // DOES NOT COMPILE
    case 50 -> null; // DOES NOT COMPILE
};

int fish = 5;
int length = 12;
var name = switch(fish) {
    case 1 -> "Goldfish";
    case 2 -> { yield "Trout"; }
    case 3 -> {
        if(length > 10)
            yield "Blobfish";
        else
            yield "Green";
    }
    default -> "Swordfish";
};

public static String printSeason(int month) throws IllegalStateException {
    return switch(month) {
        case 1, 2, 3 -> "Winter";
        case 4, 5, 6 -> "Spring";
        case 7, 8, 9 -> "Summer";
        case 10, 11, 12 -> "Fall";
        default -> throw new IllegalStateException("Unexpected value: " + month);
    };
}

var name = switch(fish) {
    case 1 -> "Goldfish" // DOES NOT COMPILE (missing semicolon)
    case 2 -> { yield "Trout"; }; // DOES NOT COMPILE (extra semicolon)
} // DOES NOT COMPILE (missing semicolon)

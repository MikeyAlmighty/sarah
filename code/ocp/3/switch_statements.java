public void printDayOfWeek(int day) {
    switch(day) {
        case 0:
            System.out.print("Sunday");
            break;
        case 1:
            System.out.print("Monday");
            break;
        case 2:
            System.out.print("Tuesday");
            break;
        case 3:
            System.out.print("Wednesday");
            break;
        case 4:
            System.out.print("Thursday");
            break;
        case 5:
            System.out.print("Friday");
            break;
        case 6:
            System.out.print("Saturday");
            break;
        default:
            System.out.print("Invalid value");
            break;
    }
}

final int getCookies() { return 4; }

void feedAnimals() {
    final int bananas = 1;
    int apples = 2;
    int numberOfAnimals = 3;
    final int cookies = getCookies();

    switch(numberOfAnimals) {
    case bananas:
    case apples: // DOES NOT COMPILE
    case getCookies(): // DOES NOT COMPILE
    case cookies: // DOES NOT COMPILE
    case 3 * 5 :
    }
}

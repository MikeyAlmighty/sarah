void compareIntegers(Number number) {
    if(number instanceof Integer) {
        Integer data = (Integer)number;
        System.out.print(data.compareTo(5));
    }
}

void compareIntegers(Number number) {
    if(number instanceof Integer data) {
        System.out.print(data.compareTo(5));
    }
}

if(number instanceof Integer data) {
    data = 10;
}

if(number instanceof final Integer data) {
    data = 10; // DOES NOT COMPILE
}

void printIntegersGreaterThan5(Number number) {
    if(number instanceof Integer data && data.compareTo(5) > 0)
        System.out.print(data);
}

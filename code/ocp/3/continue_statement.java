optionalLabel: while(booleanExpression) {
    // Body
    // Somewhere in the loop
    continue optionalLabel; // semicolon required
}

for (int i = 1; i < 11; i++){
    if (i == 5) {
        continue; // Just continue
    }
    System.out.println("The value is: " + i);
}

/*
    The value is: 1
    The value is: 2
    The value is: 3
    The value is: 4
    The value is: 6
    The value is: 7
    The value is: 8
    The value is: 9
    The value is: 10
*/

for (int i = 1; i < 11; i++){
    if (i == 5) {
        break; // Break out
    }
    System.out.println("The value is: " + i);
}

/*
    The value is: 1
    The value is: 2
    The value is: 3
    The value is: 4
*/

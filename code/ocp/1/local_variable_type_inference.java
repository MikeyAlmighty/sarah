public class Zoo {
    public void whatTypeAmI() {
        var name = "Hello";
        var size = 7;
    }
}

// Invalid assignment using var type inference
public void reassignment() {
    var number = 7;
    number = 4;
    number = "five"; // DOES NOT COMPILE
}

public void twoTypes() {
    int a, var b = 3; // DOES NOT COMPILE
    var n = null;// DOES NOT COMPILE
}

/*
*/
public void doesNotCompile(boolean check) {
    var question;
    question = 1;
    var answer;
    if (check) {
        answer = 2;
    } else {
        answer = 3;
    }
    System.out.println(answer);
}

public int addition(var a, var b) { // DOES NOT COMPILE
    return a + b;
}

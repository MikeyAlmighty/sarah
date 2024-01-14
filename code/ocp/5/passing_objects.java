public class Dog {
    public static void main(String[] args) {
        String name = "Webby";
        speak(name);
        System.out.print(name); // Webby
    }
    public static void speak(String name) {
        name = "Georgette";
    }
}

public static void main(String[] args) {
    StringBuilder name = new StringBuilder("Webby");
    speak(name);
    System.out.println(name); // WebbyGeorgette
}

public static void speak(StringBuilder sb) {
    sb.append("Georgette");
}

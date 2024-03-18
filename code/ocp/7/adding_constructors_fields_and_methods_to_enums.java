public enum Season{
    WINTER("Low"), SPRING("High"), SUMMER("Medium"), Fall("Low");

    private final String humidity;

    private Season(String humidity) {
        this.humidity = humidity;
    }

    public void printHumidity() {
        System.out.println("Humidity " + humidity);
    }
}

public enum OnlyOne {
    ONCE(true);
    private OnlyOne(boolean b) {
        System.out.print("constructing,");
    }
}
public class PrintTheOne {
    public static void main(String[] args) {
        System.out.print("begin,");
        OnlyOne firstCall = OnlyOne.ONCE; // Prints constructing,
        OnlyOne secondCall = OnlyOne.ONCE; // Doesn't print anything
        System.out.print("end");
    }
}

public enum Season {
    WINTER {
        public String getHours() { return "10am-3pm"; }
    },
    SPRING {
        public String getHours() { return "9am-5pm"; }
    },
    SUMMER {
        public String getHours() { return "9am-7pm"; }
    },
    FALL {
        public String getHours() { return "9am-5pm"; }
    };
    public abstract String getHours();

public interface Weather { int getAverageTemperature(); }

public enum Season implements Weather {
    WINTER,
    SPRING,
    SUMMER {
        @Override
        public int getAverageTemperature() {
            return 50;
        }
    },
    Fall;
    public int getAverageTemperature(){
        return 30;
    }
}

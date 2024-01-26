public interface IsColdBlooded {
    boolean hasScales();

    default double getTemperature() {
        return 10.0;
    }
}

public class Snake implements IsColdBlooded {
    public boolean hasScales() { // Required override
        return true;
    }

    public double getTemperature() { // Optional override
        return 12;
    }
}

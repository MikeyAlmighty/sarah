// ...
var employee = new Employee(50_000, 20);
// ...

public class Employee {
    private int baseSalary;
    private int hourlyRate;

    public Employee(int baseSalary, int hourlyRate) {
        setBaseSalary(baseSalary);
        setHourlyRate(hourlyRate);
    }

    public void setBaseSalary(int baseSalary) {
        if (baseSalary <= 0) throw new IllegalArgumentException("Salary can not be 0 or less.");
        this.baseSalary = baseSalary;
    }

    public void setHourlyRate(int hourlyRate) {
        if (hourlyRate <= 0) throw new IllegalArgumentException("Hourly rate can not be 0 or less.");
        this.hourlyRate = baseSalary;
    }
}

// ...
var employee = new Employee(50_000); // Constructor 1
var employee = new Employee(50_000, 20); // Constructor 2
// ...
public class Employee {
    private int baseSalary;
    private int hourlyRate;

    // Constructor 1
    public Employee(int baseSalary) {
        setBaseSalary(baseSalary);
        setHourlyRate(0);
    }

    // Constructor 2
    public Employee(int baseSalary, int hourlyRate) {
        setBaseSalary(baseSalary);
        setHourlyRate(hourlyRate);
    }

    public void setBaseSalary(int baseSalary) {
        if (baseSalary <= 0) throw new IllegalArgumentException("Salary can not be 0 or less.");
        this.baseSalary = baseSalary;
    }

    public void setHourlyRate(int hourlyRate) {
        if (hourlyRate <= 0) throw new IllegalArgumentException("Hourly rate can not be 0 or less.");
        this.hourlyRate = baseSalary;
    }
}

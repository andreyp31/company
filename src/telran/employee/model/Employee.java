package telran.employee.model;

public abstract class Employee {
    protected static double minWage = 30;
    private final int id;
    private String firstName;
    private String lastName;
    protected double hours;

    public Employee(int id, String firstName, String lastName, double hours) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.hours = hours;
    }

    public static double getMinWage() {
        return minWage;
    }

    public static void setMinWage(double minWage) {
        Employee.minWage = minWage;
    }

    public int getId() {
        return id;
    }

    public double getHours() {
        return hours;
    }

    public void setHours(double hours) {
        this.hours = hours;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    protected double fixSalary(double salary){
        if (salary < hours * minWage){
            salary = hours * minWage;
        }
        return salary;
    }

    public abstract double calcSalary();

    @Override
    public String toString() {
        return "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", hours=" + hours +
                ", salary=" + calcSalary();
    }

    @Override
    public final boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Employee employee)) return false;

        return id == employee.id;
    }

    @Override
    public int hashCode() {
        return id;
    }
}

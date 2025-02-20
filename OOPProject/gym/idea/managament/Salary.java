package gym.idea.managament;

public class Salary {
    private double baseSalary;
    private int hoursWorked;

    public Salary(double baseSalary, int hoursWorked) {
        try {
            if (baseSalary < 0 || hoursWorked < 0) {
                throw new IllegalArgumentException("Salary and hours worked cannot be negative.");
            }
            this.baseSalary = baseSalary;
            this.hoursWorked = hoursWorked;
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
            this.baseSalary = 0;
            this.hoursWorked = 0;
        }
    }

    public double getSalary() {
        return baseSalary + (hoursWorked * 20);
    }

    @Override
    public String toString() {
        return "Base Salary: " + baseSalary + ", Hours Worked: " + hoursWorked + " Total Salary: " + getSalary();
    }
}

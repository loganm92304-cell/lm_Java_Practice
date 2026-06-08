public class Employee {

    private String firstName;
    private String lastName;
    private double monthlySalary;

    // Constructor
    public Employee(String firstName, String lastName,
                    double monthlySalary) {

        this.firstName = firstName;
        this.lastName = lastName;

        if (monthlySalary > 0) {
            this.monthlySalary = monthlySalary;
        } else {
            this.monthlySalary = 0.0;
        }
    }

    // Getters
    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public double getMonthlySalary() {
        return monthlySalary;
    }

    // Setter
    public void setMonthlySalary(double monthlySalary) {
        if (monthlySalary > 0) {
            this.monthlySalary = monthlySalary;
        }
    }

    // Calculate annual salary
    public double getAnnualSalary() {
        return monthlySalary * 12;
    }

    // Give raise
    public void giveRaise(double percent) {
        monthlySalary += monthlySalary * percent / 100;
    }
}
public class TestEmployee {

    public static void main(String[] args) {

        // Create employees
        Employee john = new Employee("John", "Smith", 4500);
        Employee james = new Employee("James", "Brown", 5000);

        // Annual salaries
        System.out.println("John Annual Salary: $" +
                john.getAnnualSalary());

        System.out.println("James Annual Salary: $" +
                james.getAnnualSalary());

        // Give 20% raise
        john.giveRaise(20);
        james.giveRaise(20);

        System.out.println();

        // New salaries
        System.out.println("John New Monthly Salary: $" +
                john.getMonthlySalary());

        System.out.println("James New Monthly Salary: $" +
                james.getMonthlySalary());
    }
}
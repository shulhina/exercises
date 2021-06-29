package Day1.ex2;

public class Employee {
    private String firstname;
    private String lastname;
    private double monthlySalary;


    public Employee(String firstname, String lastname, double monthlySalary) {
        this.firstname = firstname;
        this.lastname = lastname;
        if (monthlySalary > 0) {
            this.monthlySalary = monthlySalary;
        }
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public double getMonthlySalary() {
        return monthlySalary;
    }

    public void setMonthlySalary(double monthlySalary) {
        if (monthlySalary > 0) {
            this.monthlySalary = monthlySalary;
        }
    }
}

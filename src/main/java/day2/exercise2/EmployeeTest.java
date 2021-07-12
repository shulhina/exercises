package day2.exercise2;

public class EmployeeTest {
    public static void main(String... args) {
        Employee employee1 = new Employee("Dasha", "Snigyr", 4366.89);
        Employee employee2 = new Employee("Ksenia", "Snigyr", 4788.89);

        System.out.println("Employee1's first name: " + employee1.getFirstname());
        System.out.println("Employee1's last name: " + employee1.getLastname());
        System.out.println("Employee1's monthly salary: " + employee1.getMonthlySalary());
        System.out.println();

        System.out.println("Employee2's first name: " + employee2.getFirstname());
        System.out.println("Employee2's last name: " + employee2.getLastname());
        System.out.println("Employee2's monthly salary: " + employee2.getMonthlySalary());
        System.out.println();

        employee1.setMonthlySalary(1.1 * employee1.getMonthlySalary());
        employee2.setMonthlySalary(1.1 * employee2.getMonthlySalary());

        System.out.println("Employee1's monthly salary after 10% raise: " + employee2.getMonthlySalary());
        System.out.println("Employee2's monthly salary after 10% raise: " + employee2.getMonthlySalary());

    }
}


package Practice;
import java.util.ArrayList;
import java.util.List;
import java.util.Comparator;

public class Companyyy {

    public static void main(String[] args) {

        List<Employee> employees = new ArrayList<>();

        String[] departments = {"Department P", "Department Q", "Department R", "Department S"};
        String[] designations = {"Senior Manager", "Junior Manager", "Store Keeper", "Clerk", "Peon"};

        int[] numEmployees = {1, 2, 3, 2, 2};

        for (int i = 0; i < departments.length; i++) {
            for (int j = 0; j < designations.length; j++) {
                for (int k = 0; k < numEmployees[j]; k++) {
                    String name = departments[i] + " - " + designations[j] + " " + (k + 1);
                    int salary = (int) (Math.random() * 50000 + 50000); 
                    employees.add(new Employee(name, departments[i], designations[j], salary));
                }
            }
        }

        Employee managerWithHighestSalary = employees.stream()
                .filter(e -> e.getDesignation().equals("Manager"))
                .max(Comparator.comparing(Employee::getSalary))
                .orElse(null);
        if (managerWithHighestSalary != null) {
            System.out.println("Manager with highest salary: " + managerWithHighestSalary.getName() + " - $" + managerWithHighestSalary.getSalary());
        }

        Employee peonWithLowestSalary = employees.stream()
                .filter(e -> e.getDesignation().equals("Peon"))
                .min(Comparator.comparing(Employee::getSalary))
                .orElse(null);
        if (peonWithLowestSalary != null) {
            System.out.println("Peon with lowest salary: " + peonWithLowestSalary.getName() + " - $" + peonWithLowestSalary.getSalary());
        }
    }

    private static class Employee {
        private String name;
        private String department;
        private String designation;
        private int salary;

        public Employee(String name, String department, String designation, int salary) {
            this.name = name;
            this.department = department;
            this.designation = designation;
            this.salary = salary;
        }

        public String getName() {
            return name;
        }

        public String getDesignation() {
            return designation;
        }

        public int getSalary() {
            return salary;
        }

        public String toString() {
            return String.format("%s (%s, %s) - $%d", name, department, designation, salary);
        }
    }
}
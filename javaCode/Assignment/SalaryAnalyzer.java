import java.util.*;

public class SalaryAnalyzer {

    public static void main(String[] args) {
        // Create a map to store the employees and their salaries
        Map<String, Integer> employeeSalaries = new HashMap<>();

        // Add the employees and their salaries for each department
        addEmployeesAndSalaries(employeeSalaries, "Department 1", 10);
        addEmployeesAndSalaries(employeeSalaries, "Department 2", 10);
        addEmployeesAndSalaries(employeeSalaries, "Department 3", 10);
        addEmployeesAndSalaries(employeeSalaries, "Department 4", 10);

        // Find the manager with the highest salary
        String highestManager = findHighestSalaryEmployeeByDesignation(employeeSalaries, "Manager");
        System.out.println("Manager with the highest salary: " + highestManager);

        // Find the peon with the lowest salary
        String lowestPeon = findLowestSalaryEmployeeByDesignation(employeeSalaries, "Peon");
        System.out.println("Peon with the lowest salary: " + lowestPeon);
    }

    // Method to add employees and their salaries to the map
    public static void addEmployeesAndSalaries(Map<String, Integer> employeeSalaries, String department, int numEmployees) {
        String[] designations = {"Manager", "Supervisor", "Store Keeper", "Clerk", "Peon"};
        Random random = new Random();

        for (int i = 1; i <= numEmployees; i++) {
            String name = "Employee " + i + " - " + department;
            String designation = designations[random.nextInt(designations.length)];
            int salary = random.nextInt(100000) + 50000;
            employeeSalaries.put(name + " (" + designation + ")", salary);
        }
    }

    // Method to find the employee with the highest salary for a given designation
    public static String findHighestSalaryEmployeeByDesignation(Map<String, Integer> employeeSalaries, String designation) {
        String highestEmployee = "";
        int highestSalary = 0;

        for (String employee : employeeSalaries.keySet()) {
            if (employee.contains(designation)) {
                int salary = employeeSalaries.get(employee);
                if (salary > highestSalary) {
                    highestEmployee = employee;
                    highestSalary = salary;
                }
            }
        }

        return highestEmployee;
    }

    // Method to find the employee with the lowest salary for a given designation
    public static String findLowestSalaryEmployeeByDesignation(Map<String, Integer> employeeSalaries, String designation) {
        String lowestEmployee = "";
        int lowestSalary = Integer.MAX_VALUE;

        for (String employee : employeeSalaries.keySet()) {
            if (employee.contains(designation)) {
                int salary = employeeSalaries.get(employee);
                if (salary < lowestSalary) {
                    lowestEmployee = employee;
                    lowestSalary = salary;
                }
            }
        }

        return lowestEmployee;
    }
}

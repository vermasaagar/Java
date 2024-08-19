import java.util.Map;
import java.util.HashMap;

public class SalaryProgram {
	public static void main(String[] args) {
		Map<String, Integer> salaryMap = new HashMap<String, Integer>();
		salaryMap.put("Manager", 80000);
		salaryMap.put("Assistant Manager", 60000);
		salaryMap.put("Programmer", 50000);
		salaryMap.put("Clerk", 40000);
		
		Map<String, Integer> employeeCountMap = new HashMap<String, Integer>();
		employeeCountMap.put("Manager", 5);
		employeeCountMap.put("Assistant Manager", 10);
		employeeCountMap.put("Programmer", 20);
		employeeCountMap.put("Clerk", 30);
		
		for (String designation : salaryMap.keySet()) {
			int totalSalary = salaryMap.get(designation) * employeeCountMap.get(designation);
			int averageSalary = totalSalary / employeeCountMap.get(designation);
			
			System.out.println("Designation: " + designation + ", Average Salary: " + averageSalary);
			
			int aboveAverageCount = 0;
			int belowAverageCount = 0;
			
			for (int salary : salaryMap.values()) {
				if (salary > averageSalary) {
					aboveAverageCount++;
				} else if (salary < averageSalary) {
					belowAverageCount++;
				}
			}
			
			System.out.println("Employees Above Average Salary: " + aboveAverageCount + ", Employees Below Average Salary: " + belowAverageCount);
		}
	}
}
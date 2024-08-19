import java.util.Scanner;

public class SalaryCalculator {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter Basic Pay: ");
            double basicPay = sc.nextDouble();

            System.out.print("Enter Dearness Allowance (DA): ");
            double dearnessAllowance = sc.nextDouble();

            System.out.print("Enter House Rent Allowance (HRA): ");
            double houseRentAllowance = sc.nextDouble();

            System.out.print("Enter Medical Allowance: ");
            double medicalAllowance = sc.nextDouble();

            System.out.print("Enter Family Allowance: ");
            double familyAllowance = sc.nextDouble();

            double grossSalary = basicPay + dearnessAllowance + houseRentAllowance + medicalAllowance + familyAllowance;

            System.out.print("Enter Tax Deducted at Source (TDS): ");
            double tds = sc.nextDouble();

            System.out.print("Enter Provident Fund (PF) Deduction: ");
            double providentFund = sc.nextDouble();

            double totalDeductions = tds + providentFund;

            double netSalary = grossSalary - totalDeductions;

            System.out.println("Gross Salary: " + grossSalary);
            System.out.println("Net Salary: " + netSalary);
        }
    }
}

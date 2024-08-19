import java.util.Scanner;

public class Satish {
  public static void main(String[] args) {
    try (Scanner scan = new Scanner(System.in)) {
      // Input basic pay, DA, HRA, and other allowances
      System.out.print("Enter basic pay: ");
      double basicPay = scan.nextDouble();
      System.out.print("Enter DA: ");
      double da = scan.nextDouble();
      System.out.print("Enter HRA: ");
      double hra = scan.nextDouble();
      System.out.print("Enter medical allowance: ");
      double medicalAllowance = scan.nextDouble();
      System.out.print("Enter family allowance: ");
      double familyAllowance = scan.nextDouble();

      // Calculate total income
      double totalIncome = basicPay + da + hra + medicalAllowance + familyAllowance;

      // Input TDS, tax, and fund for gratuity
      System.out.print("Enter TDS: ");
      double tds = scan.nextDouble();
      System.out.print("Enter tax: ");
      double tax = scan.nextDouble();
      System.out.print("Enter fund for gratuity: ");
      double fundForGratuity = scan.nextDouble();

      // Calculate total deductions
      double totalDeductions = tds + tax + fundForGratuity;
      System.out.println("Total deduction "+totalDeductions);
      // Calculate net income under old tax design
      double netIncomeOld = totalIncome - totalDeductions;

      // Calculate net income under new tax design
      double newTax = 0.0;
      if (totalIncome <= 500000) {
        newTax = 0.05 * totalIncome;
      } else if (totalIncome <= 1000000) {
        newTax = 0.1 * totalIncome + 25000;
      } else {
        newTax = 0.15 * totalIncome + 125000;
      }
      double netIncomeNew = totalIncome - newTax - totalDeductions;

      // Printing both the tax design
      System.out.println("Net income under old tax design: " + netIncomeOld);
      System.out.println("Net income under new tax design: " + netIncomeNew);

      // Compare and display results
      System.out.println();
      if (netIncomeOld > netIncomeNew) {
        System.out.println("You will have more net income under the old tax design.");
      } else {
        System.out.println("You will have more net income under the new tax design.");
      }
    }
    
  }

}


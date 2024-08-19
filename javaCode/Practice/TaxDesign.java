import java.util.Scanner;

public class TaxDesign {
  public static void main(String[] args) {


    try (Scanner sc = new Scanner(System.in)) {
      System.out.print("Enter Basic pay: ");
      double basic = sc.nextDouble();
      System.out.print("Enter Dearness Allowance (DA): ");
      double da = sc.nextDouble();
      System.out.print("Enter House Rent Allowance (HRA): ");
      double hra = sc.nextDouble();
      System.out.print("Enter medical allowance (MA): ");
      double medicalAllowance = sc.nextDouble();
      System.out.print("Enter family allowance: ");
      double familyAllowance = sc.nextDouble();

      double totalIncome = basic + da + hra + medicalAllowance + familyAllowance;
      System.out.print("Enter TDS: ");
      double tds = sc.nextDouble();
      System.out.print("Enter tax: ");
      double tax = sc.nextDouble();
      System.out.print("Enter fund for gratuity: ");
      double fundForGratuity = sc.nextDouble();
      double totalDeductions = tds + tax + fundForGratuity;
      System.out.println("Total deduction "+totalDeductions);
      double netIncomeOld = totalIncome - totalDeductions;


      double newTax = 0.0;
      if (totalIncome <= 500000) 
      {
        newTax = 0.05 * totalIncome;
      } 
      else if (totalIncome <= 1000000) 
      {
        newTax = 0.1 * totalIncome + 25000;
      } else 
      
      {
        newTax = 0.15 * totalIncome + 125000;
      }
      double netIncomeNew = totalIncome - newTax - totalDeductions;
      System.out.println("Net income under old tax design: " + netIncomeOld);
      System.out.println("Net income under new tax design: " + netIncomeNew);
      System.out.println();

      if (netIncomeOld > netIncomeNew) {
        System.out.println("You will have more net income under the old tax design.");
      } else {
        System.out.println("You will have more net income under the new tax design.");
}
    }
}
}
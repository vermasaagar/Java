package Practice;

import java.util.Scanner;

public class TaxComparison {
   private static int oldTaxLiability;
   private static int newTaxLiability;




   public static void main(String[] args) {
      try (Scanner input = new Scanner(System.in)) {
         double basicPay, da, hra, medicalAllowance, familyAllowance, grossIncome;
         double tds, pf, fundForGratuity;

         System.out.print("Enter Basic Pay: ");
         basicPay = input.nextDouble();

         System.out.print("Enter Dearness Allowance (DA): ");
         da = input.nextDouble();

         System.out.print("Enter House Rent Allowance (HRA): ");
         hra = input.nextDouble();

         System.out.print("Enter Medical Allowance (MA): ");
         medicalAllowance = input.nextDouble();

         System.out.print("Enter Family Allowance: ");
         familyAllowance = input.nextDouble();
         grossIncome = basicPay + da + hra + medicalAllowance + familyAllowance;
         
         System.out.print("Enter Gross Income: " + grossIncome);


         System.out.print("Enter Tax Deducted at Source (TDS):  ");
         tds = input.nextDouble();

         System.out.print("Enter Provident Fund (PF) Deduction: ");
         pf = input.nextDouble();
         
         System.out.print("Enter fund for gratuity: ");
         fundForGratuity = input.nextDouble();

         double totalDeductions = tds + pf + fundForGratuity;
         System.out.println("Total deduction "+totalDeductions);
         double TaxLiability = grossIncome - totalDeductions;
         System.out.print("Old Tax Liability :" +TaxLiability );
   

   
    

         calculateTaxLiabilityUnderOldTaxDesign(grossIncome, tds, pf, fundForGratuity);
         calculateTaxLiabilityUnderNewTaxDesign(grossIncome, tds, pf, fundForGratuity);
      }
     
      if (oldTaxLiability < newTaxLiability) 
      {
         System.out.println("\n It's better to choose the old tax design.");
      } 
      else if (newTaxLiability < oldTaxLiability)
      
      {
         System.out.println("\n It's better to choose the new tax design.");
      } 
      
    else
       {
         System.out.println("Both tax designs result in the same tax liability.");
       }
   }

   public static double calculateTaxLiabilityUnderOldTaxDesign(double grossIncome, double tds, double pf, double fundForGratuity) 
   {
 
      double taxableIncome = grossIncome - tds - pf - fundForGratuity;
      return taxableIncome * 0.3;
      
     
   }
   
   
   

   public static double calculateTaxLiabilityUnderNewTaxDesign(double grossIncome, double tds, double pf, double fundForGratuity)
    {
      
      double taxableIncome = grossIncome - tds - pf - fundForGratuity;
      return taxableIncome * 0.25;
   }
   

}

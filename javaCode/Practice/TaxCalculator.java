package Practice;

import java.util.Scanner;

public class TaxCalculator {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter your taxable income: ");
            double taxableIncome = sc.nextDouble();

            System.out.println("\nOld Tax Design");
            double oldTax = calculateOldTax(taxableIncome);
            System.out.println("Tax amount: " + oldTax);
            double oldTakeHome = taxableIncome - oldTax;
            System.out.println("Take-home salary: " + oldTakeHome);

            System.out.println("\nNew Tax Design");
            double newTax = calculateNewTax(taxableIncome);
            System.out.println("Tax amount: " + newTax);
            double newTakeHome = taxableIncome - newTax;
            System.out.println("Take-home salary: " + newTakeHome);

            if (oldTakeHome > newTakeHome) {
                System.out.println("\nYou should choose the Old Tax Design as it gives you a higher take-home salary.");
            } else if (oldTakeHome < newTakeHome) {
                System.out.println("\nYou should choose the New Tax Design as it gives you a higher take-home salary.");
            } else {
                System.out.println("\nBoth tax designs give you the same take-home salary.");
            }
        }
    }

    private static double calculateOldTax(double taxableIncome) {
        double tax = 0;
        if (taxableIncome <= 200000) {
            tax = 0;
        } else if (taxableIncome <= 500000) {
            tax = 0.1 * (taxableIncome - 200000);
        } else {
            tax = 0.1 * (300000) + 0.2 * (taxableIncome - 500000);
        }
        return tax;
    }

    private static double calculateNewTax(double taxableIncome) 
    
    {
        double tax = 0;
        if (taxableIncome <= 300000) 
        {
            tax = 0;
        } 
        else if (taxableIncome <= 500000) 
        
        {
            tax = 0.05 * (taxableIncome - 300000);
        } 
        
        else if (taxableIncome <= 1000000)
        {
            tax = 0.05 * (200000) + 0.1 * (taxableIncome - 500000);
        } 
        else 
        
        {
            tax = 0.05 * (200000) + 0.1 * (500000) + 0.15 * (taxableIncome - 1000000);
        }
        return tax;
    }
}



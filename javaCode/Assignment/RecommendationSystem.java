import java.util.Scanner;

public class RecommendationSystem {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.println("Enter your current savings: ");
            double savings = input.nextDouble();
            
            System.out.println("Enter your monthly income: ");
            double income = input.nextDouble();
            
            System.out.println("Enter your monthly expenses: ");
            double expenses = input.nextDouble();
            
            System.out.println("Enter your investment goal: ");
            double goal = input.nextDouble();
            
            System.out.println("Based on your financial information, we recommend investing in the following public sector savings scheme:");
            if (income - expenses >= goal) {
                System.out.println("National Saving Certificates (NSC)");
            } else if (savings >= goal) {
                System.out.println("Public Provident Fund (PPF)");
            } else {
                System.out.println("Employee Provident Fund (EPF)");
            }
        }
        
        System.out.println("This recommendation is based on your savings, income, expenses, and investment goal. Consider seeking the advice of a financial advisor before making any investment decisions.");
    }
}

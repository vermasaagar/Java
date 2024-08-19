import java.util.*;
   public class SavingsRecommendation {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Enter your name");
            String name= scanner.nextLine();
            System.out.println("welcome:"+name);
      
                System.out.println("Are you having any baby girl?\n Enter true or false : ");
                boolean babyStatus=scanner.nextBoolean();
                if(babyStatus==true)
                {
                    System.out.println("You should be considering to invest in Kanya sumangla yojna!");

                    System.out.println("Enter your savings goal: ");
                    int savingsGoal = scanner.nextInt();
                    
                    System.out.println("Enter your investment period (in years): ");
                    int investmentPeriod = scanner.nextInt();
                    double rate=10.0;
                    double amount=savingsGoal*(Math.pow((1+rate/100),investmentPeriod));

                    
                    System.out.println("Total amount " +amount);
                }
            
else
{
            System.out.println("Enter your savings goal: ");
            int savingsGoal = scanner.nextInt();
            
            System.out.println("Enter your investment period (in years): ");
            int investmentPeriod = scanner.nextInt();
            
            System.out.println("Enter your risk tolerance (1 for low, 2 for medium, 3 for high): ");
            int riskTolerance = scanner.nextInt();
            
            System.out.println("\nBased on your inputs, we recommend the following savings scheme:");
            
            switch (riskTolerance) {
                case 1:
                    System.out.println("National Savings Certificate (NSC)");
                    System.out.println("Interest rate: 8% per annum");
                    System.out.println("Investment period: 5 years");
                    System.out.println("Estimated returns: " + savingsGoal * 0.08 * 5 / investmentPeriod + " per year");
                    break;
                case 2:
                    System.out.println("Public Provident Fund (PPF)");
                    System.out.println("Interest rate: 7.1% per annum");
                    System.out.println("Investment period: 15 years");
                    System.out.println("Estimated returns: " + savingsGoal * 0.071 * 15 / investmentPeriod + " per year");
                    break;
                case 3:
                    System.out.println("Equity Linked Savings Scheme (ELSS)");
                    System.out.println("Interest rate: Market-linked");
                    System.out.println("Investment period: 3 years");
                    System.out.println("Estimated returns: Market-linked ="+ savingsGoal * 0.091 * 15 / investmentPeriod + " per year");
                    break;
                default:
                    System.out.println("Invalid risk tolerance input. Please enter 1 for low, 2 for medium, or 3 for high.");
                    break;
            }
}
        } 
    }
}
    


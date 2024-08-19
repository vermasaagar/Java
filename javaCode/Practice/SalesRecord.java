import java.util.Scanner;

public class SalesRecord {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int[][] cash = new int[4][7]; 
            int[][] paytm = new int[4][7];
            
            boolean continueSales = true;
            
            while(continueSales) {
                System.out.println("Enter week (1-4): ");
                int weekNumber = scanner.nextInt() - 1; 
                System.out.println("Enter day (1-7): ");

                int dayNumber = scanner.nextInt() - 1; 
                System.out.println("mode of payment (1 for cash, 2 for Paytm): ");
                int paymentMode = scanner.nextInt();
                System.out.println("Enter the amount of sale: ");
                int saleAmount = scanner.nextInt();
                
                if(paymentMode == 1) {
                    cash[weekNumber][dayNumber] += saleAmount;
                } else if(paymentMode == 2) {
                    paytm[weekNumber][dayNumber] += saleAmount;
                }
                
                System.out.println("Do you want to continue sales (Y/N)? ");
                String continueOption = scanner.next();
                if(continueOption.equalsIgnoreCase("N")) {
                    continueSales = false;
                }
            }
            System.out.println("Monthly sales summary for cash:");
            int monthlySales = 0;
            for(int i = 0; i < 4; i++) {
                for(int j = 0; j < 5; j++) {
                    monthlySales += cash[i][j];
                }
            }
            System.out.println("Total sales: " + monthlySales);
            
            // Print monthly sales summary for Paytm
            System.out.println("Monthly sales summary for Paytm:");
            monthlySales = 0;
            for(int i = 0; i < 4; i++) {
                for(int j = 0; j < 5; j++) {
                    monthlySales += paytm[i][j];
                }
            }
            System.out.println("Total sales: " + monthlySales);
        }
}
}
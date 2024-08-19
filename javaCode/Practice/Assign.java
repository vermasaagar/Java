import java.util.Scanner;

public class Assign {
    public static void main(String[] args) 
{
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your age: ");
        int age = input.nextInt();
        System.out.println("Enter your Salary: ");
        int sal = input.nextInt();
        System.out.println("Enter your investment amount: ");
        int investmentAmount = input.nextInt();
        System.out.println("Enter the time frame for investment (in years): ");
        int timeFrame = input.nextInt();
        System.out.println("Enter your risk tolerance (1 for low risk, 2 for moderate risk, 3 for high risk): ");
        int riskTolerance = input.nextInt();

        String savingsScheme = "";
    
        if (age < 25 && investmentAmount < 100000)
         {  
            
            savingsScheme = "National Pension System (NPS)";
            float InterestRate = 4.0f;
            System.out.println("InterestRate:" +InterestRate );
            
             
        } 
        else if (age >= 25 && age < 40 && investmentAmount >= 25000 && investmentAmount < 50000) 
        {   
            savingsScheme = "Public Provident Fund (PPF)";
            float InterestRate = 4.5f;
            System.out.println("InterestRate" +InterestRate  );
            

        } 
        else if (age >= 30 && age < 45 && investmentAmount >= 300000 && investmentAmount < 70000) 
        {   
            savingsScheme = "savingsScheme = Employees Provident Fund (EPF)";

            float InterestRate = 5.0f;
            System.out.println("InterestRate" +InterestRate  );
        }  
        else if (age >= 45 && age < 50 && investmentAmount >= 400000 && investmentAmount < 90000) 
        {   
            savingsScheme = "Post Office Saving Account (POSA)";
            float InterestRate = 4.3f;
            System.out.println("InterestRate" +InterestRate  );
        } 
        else if (age >= 50 && age < 60 && investmentAmount >= 60000 && investmentAmount < 100000) 
        {   
            savingsScheme = "Atal Pension Yojana(APY)";
            float InterestRate = 7.0f;
            System.out.println("InterestRate" +InterestRate  );
        }   
        else if (age >= 30 && investmentAmount >= 1000) 
        {
            if (riskTolerance == 1  && timeFrame <= 3)
             {  
               
               savingsScheme = "Senior Citizen Savings Scheme (SCSS)";
               float InterestRate = 4.0f;
               System.out.println("InterestRate:" +InterestRate );
               

            } 
            else if (riskTolerance == 2 && timeFrame >= 5)
             {
                
                savingsScheme = "Unit Linked Insurance Plan (ULIP)";
                float InterestRate = 5.0f;
                System.out.println("InterestRate:" +InterestRate ); 
               

            } 
            else 
            {
                
                savingsScheme = "Equity Linked Savings Scheme (ELSS)";
                float InterestRate = 7.0f; 
                System.out.println("InterestRate:" +InterestRate  );
                

            }
        }
        System.out.println("we recommend investing this savings scheme is beneficial for you: \n1 " + savingsScheme );
        
        
    }
}
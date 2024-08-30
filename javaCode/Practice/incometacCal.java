
package Practice;

import java.util.Scanner;

public class incometacCal {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {


            int tax;

            System.out.println("Enter you salary per year");

            int salary = sc.nextInt();
            System.out.println("Salary : "+salary);

            if(salary<=500000)
            {
                 tax=0;
                 tax = (salary*tax)/100;
                 salary = salary - tax;

            }

            else if(salary >= 500000 && salary < 1000000 ){
                tax=20;
                tax = (salary*tax)/100;
                salary = salary - tax;
               

            }

            else{
                tax=30;
                tax = (salary*tax)/100;
                salary = salary - tax;
                
            }

            System.out.println("Your tax amount : "+tax);
           System.out.println("Your Total Salary: "+salary );



        }
    }
    
}

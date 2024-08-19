
import java.util.*;
public class primeNumber {

    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Check Number is Prime or not");

            int n =sc.nextInt();
            


            if(n==2){
                System.out.println("Prime Number");
            }

            else{
            boolean isPrime = true;
            for(int i = 2; i <=n-1; i++){
                if(n%i==0){
                    
                    isPrime = false;
                   

                }
            }

           if(isPrime==true){
            System.out.println("Prime Number");
           }
           else{
            System.out.println("Not prime");
           }

        }
    }
         
        
    }
}
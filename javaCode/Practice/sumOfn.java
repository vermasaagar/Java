
import java.util.*;
public class sumOfn {

    public static void main(String[] args) {

        try( Scanner sc = new Scanner(System.in)){

         int n;
         int sum = 0;
      
         System.out.println("To find the sum of n natural number");
         System.out.println("Enter the value of n ");
         

         n = sc.nextInt();

         int i = 0;
         while(i<=n){
            
            sum = sum+i;
            i++;

         }

         System.out.println("Sum of n natural number : "+sum);

        }
        
        
    }
    
}

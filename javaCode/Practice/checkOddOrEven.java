import java.util.Scanner;

public class checkOddOrEven {
    public static void main(String[] args) {
        
        try (Scanner sc = new Scanner(System.in)) {

            System.out.println("Check Even Or Odd");
            System.out.println("Enter a number");
            int num = sc.nextInt();

            if(num%2==0){
                System.out.println("Even");
            }

            else{
                System.out.println("ODD");
            }
        }
         
    }
    
}

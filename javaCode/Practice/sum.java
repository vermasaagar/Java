import java.util.*;
public class sum {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int a,b;


            System.out.println("Enter the value of a");
            a = sc.nextInt();
            System.out.println("Enter the value of b");
            b = sc.nextInt();

            int sum = a+b;
            int sub = a-b;
            int prod = a*b;
            float  div = a/b;
            int rem = a%b; 
            System.out.println("Sum" +sum + sub +prod +div +rem);







            // // String input = sc.next();
            // String input =sc.nextLine();
            // System.out.println(input);
            // sc.nextLine();
        }

        
    }
    
}

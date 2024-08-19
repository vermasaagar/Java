import java.util.Scanner;

public class var1 {
   

    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in)) {

            int a,b,c;
            System.out.println("Enter the value of a");
            a = sc.nextInt();
        

            System.out.println("Enter the value of b");
            b = sc.nextInt();
           

            System.out.println("Enter the value of c");
            c = sc.nextInt();
         

            int sum = a+b+c;
            System.out.println("Sum: "+sum);

            int avg = sum/3;
            System.out.println("Average :"+avg);
        }
        
        
    }
    
}

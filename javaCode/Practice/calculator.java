import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {
        
        try (Scanner sc = new Scanner(System.in)) {

            System.out.println("Enter the value of a : ");
            int a = sc.nextInt();

            System.out.println("Enter the value of a : ");
            int b = sc.nextInt();

            System.out.println("Enter your operator");
            int operator = sc.next().charAt(0);

            switch(operator){
                case '+' : System.out.println(a+b);
                break;

                case '-': System.out.println(a-b);
                break;

                case '*': System.out.println(a*b);
                break;

                case '/': System.out.println(a / b);
                break;

                case '%': System.out.println(a % b);
                break;

                

                
            }
        }
        
    }
    
}



package Practice;



import java.util.*;

public class fac {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter a number: ");
            int num = scanner.nextInt();

            
            int factorial = 1;
            for(int i = 1; i <= num; ++i) {
                factorial *= i;
            }
            System.out.printf("Factorial of %d = %d", num, factorial);
        }
    }
}

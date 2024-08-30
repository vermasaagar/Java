package Practice;
import java.util.*;

public class aa {

    public static int factorial(int n) {

        int fac = 1;
        for (int i = 1; i <= n; i++) {

            fac = fac * i;
        }

        System.out.println(fac);
        return fac;

    }

    public static int binomial(int n, int r) {
        System.out.println("Binomial Cofficient");

        int fac_n = factorial(n);
        
        int fac_r = factorial(r);
      

        int fac_n_r = factorial(n - r);

         System.out.print("Binomial of nCr = ");

        int binomial_of_n = fac_n / (fac_r * fac_n_r);

        return binomial_of_n;

        // System.out.println(binomial_of_n);

    }

    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        // System.out.println("Enter a number");
        // int n = sc.nextInt();
        // factorial(n);
        System.out.println(binomial(5, 3));

    }

}

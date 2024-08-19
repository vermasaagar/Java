
import java.util.*;

public class factorialfunction {

    public static void factorial(int num) {

        int fac = 1;
        for (int i = 1; i <= num; ++i) {

            fac = fac * i;

        }
        System.out.println("factorial is : " + fac);

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = sc.nextInt();

        factorial(num);

    }
}
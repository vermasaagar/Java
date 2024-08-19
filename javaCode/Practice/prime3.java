import java.util.*;

public class prime3 {

    public static boolean isPrime(int n) {

       boolean isprime=true;
        for (int i = 2; i <= n - 1; i++) {
            if (n % i == 0) {
                return false;
            }
        }

        return true;

    }

    public static void PrimeInRange(int t) {
        for (int i = 2; i <= t; i++) {
            if (isPrime(i)) {//true
                System.out.print(i+ " ");
            }

        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Range of prime Number");
        int n = sc.nextInt();
        PrimeInRange(n); // 2to n

    }

}

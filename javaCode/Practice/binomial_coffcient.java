


// import java.util.*;
public class binomial_coffcient{

    public static void factorial(int num){


        int fac = 1;
        for(int i=1; i<=num; ++i){

            fac =fac*i;
           
        }
         System.out.println("factorial is : "+fac);

    }



    public static boolean binomial(int n, int r){
          n = fac(n);
          r = fac(r);
          int nmr = fac(n-r);

          int binomial = n=r*nmr;
          System.out.println(binomial);


    }

    private static int fac(int n) {
        return 0;
    }



    public static void main(String[] args) {
        // Scanner sc= new Scanner(System.in);
        // System.out.println("Enter a number");
        // int num = sc.nextInt();
        int n=5;
        int r=4;
        
        // factorial(num);
        System.out.println(binomial(5, 2));

        


        
    }
}

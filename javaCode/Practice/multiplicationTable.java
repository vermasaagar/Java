package Practice;

import java.util.*;
public class multiplicationTable {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Print multiplication of a given number");
            System.out.println("Enter a number");
            int n = sc.nextInt();
            int mul;
            System.out.println();
            

            for(int i=1; i<=10; i++){
                mul = n*i;
                System.out.println(mul);

            }
        }

    }

    
}



package Practice;

import java.util.*;//packages have many classes

public class input{
    /**
     * @param args
     */
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
           
           
           //taking input as integer
           int number = sc.nextInt();
           System.out.println(number);


           float value = sc.nextFloat();
           System.out.println(value);




           double value1 = sc.nextDouble();
           System.out.println(value1);

           short small = sc.nextShort();
           System.out.println(small);

           long large = sc.nextLong();
           System.out.println(large);





           
           
           
           
           
           
            //taking input as a string
            String input = sc.next();
            System.out.println(input);

           
           
           
           
            // output in nextline
            String name = sc.nextLine();
            System.out.println(name);
        }

      
    }

}
import java.util.Scanner;

public class TypeCasting {
    public static void main(String[] args) {

        // type casting

        // byte(1 byte) ->short(2)->int(4)->float(4)->long(8)->double(8) : only data is store in large size of data type.
        // boolean(1 bit)
        // char( 2 byte): store a single character or ascii value 



         //  TypeCasting: Implicit conversion: small size dt to large size data type
        // int a= 25;
        // float b =a;
        // System.out.println(b);


         //  TypeCasting



        // try (Scanner sc = new Scanner(System.in)) {
        //     float number = sc.nextInt();
        //     System.out.println(number);
        // }



        //  TypeCasting: Explicit conversion or narrowing : large to small data type
        // float a= 25.99f;
        // int b = (int) a;
        // System.out.println(b);





        char a ='A';
        char b = 'B';
        int num1 = a;
        int num2 = b;
        System.out.println(num1);
        System.out.println(num2);


    }
    
}

import java.util.*;
public class swap {

    public static void swapTwo(int a, int b){
        
        a=a+b;
        b=a-b;
        a=a-b;


        System.out.println("A : "+a);
        System.out.println("B : "+b);


    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        swapTwo(a, b);
        
        
    }
    
}

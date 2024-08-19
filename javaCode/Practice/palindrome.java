import java.util.*;
public class palindrome {
    public static void main(String[] args) {
        

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to check the number is palindrome or not");
        int n=sc.nextInt();

        int rem,pal=0;
        int c=n;

        while(n>0){

            rem=n%10;
            pal=pal*10+rem;
            n=n/10;

        }
        if(c==pal){
        System.out.println("Palindrome");
        }
        else{
            System.out.println("The given number is not a palindrome Number");
        }

    }
    
}

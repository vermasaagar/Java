


import java.util.*;


public class SearchingArrayElement {
    public static void main(String[] args) {
        
        System.out.println("Enter the Element that you want search");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int i;
        int A[] = {3,9,7,8,12,6,15,5,4,10};
         
         
        for(i=0; i<A.length; i++){
            if(num==A[i]){
                System.out.println("Number found at Index : " +i);
                break;

            }
        }
       
        System.out.println("Number not found, Try again");
       
       


    }
    
}

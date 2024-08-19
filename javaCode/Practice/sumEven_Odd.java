

public class sumEven_Odd {

    public static void main(String[] args) {
 

        int sumEven =0;
        int sumOdd  =0;
        for(int i =1; i<=10; i++){
            if(i%2==0){
                sumEven = sumEven+i;
                
            }
            else {
                sumOdd = sumOdd + i;
            }

           
        }
         System.out.println("Sum of Even Number : "+sumEven);
         System.out.println("Sum of Odd number : "+sumOdd);

        
    }
    
}

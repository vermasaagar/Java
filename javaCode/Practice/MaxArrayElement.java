package Practice;

public class MaxArrayElement {
    public static void main(String[] args) {

        int[] A  = {3,7,9,2,15,11,12,25,16,19,13,1};

         int max = A[0];

         for(int i=0; i<A.length; i++){
            if(A[i]>max){
                max = A[i];
            }
         }
         System.out.println("Max Value : " +max);

        
    }
    
}


public class SecondLarge {
    public static void main(String[] args) {
        int[] A = {3 ,7, 9, 4, 8, 14, 26, 23, 19, 18};

        int max1 = A[0];
        int max2 = A[0];

        for(int i = 0; i<A.length; i++){
            if(A[i]>max1){
                max2=max1;
                max1= A[i];
            }
            else if(A[i] >max2 && A[i] != max1){
                max2 = A[i];
                 
            }
        }

        System.out.println("Second Largest Number is : "+max2);

        
    }
    
}

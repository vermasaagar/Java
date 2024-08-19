
public class TwoDarray {

    public static void main(String[] args) {
        

        int A[][] = {{1,3,4}, {2,4,5}, {3,1,4}, {2,3,5}};

        for(int i=0; i<=A.length; i++){
            for(int j=0; j<A[0].length; j++){
                System.out.print(A[i][j] +" ");
            }
            System.out.println();
        }
    }
    
}

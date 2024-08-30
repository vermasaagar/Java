

package Practice;

public class Pattrn_Inverted_triangle {

    public static void main(String[] args) {
          


        for(int i = 1; i<=4; i++){
            for(int j = 4; j>=i; j--){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    
}

public class Pattrn_Print_Character {

    public static void main(String[] args) {
        

        // char A = 65;
        char ch = 'A';
        for(int i = 1; i<=4; i++){

            for(int j=1; j<=i; j++){
                System.out.print(ch);
                ch++;
            }
            System.out.println();
        }
    }
    
}

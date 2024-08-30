package Practice;
import java.util.Scanner;

public class areaOfSquare {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            
            System.out.println("Enter the side of square");
            int side = sc.nextInt();


            int area = side*side;
            System.out.println("Area of Square "+area);

        }
        
    }
    
}

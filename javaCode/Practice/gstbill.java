
import java.util.*;
public class gstbill {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {

            System.out.println("Enter the price of pencil");
            float pencil = sc.nextFloat();


            System.out.println("Enter the price of pen");
            float pen = sc.nextFloat();

            System.out.println("Enter the price of eraser");
            float eraser = sc.nextFloat();

            float sum = pencil+pen+eraser;
            float gst = (sum*18)/100;
            System.out.println("gst charge: "+gst);
            float bill = sum+gst;
            System.out.println("Customer Total Bill : "+bill);
        }
    }
}


import java.util.ArrayDeque;
import java.util.ArrayList;



public class RetailAll {
    public static void main(String[] args) {


        ArrayDeque<String> queue = new ArrayDeque<String>();
        queue.add("Apple");
        queue.add("Banana");
        queue.add("WaterMelon");
        queue.add("pomogranate");
        queue.add("lemon");
        System.out.println(queue);

        ArrayList<String> list = new ArrayList<String>();
        list.add("Apple");
        list.add("Banana");
        list.add("WaterMelon");
        list.add("papaya");
        list.add("Onion");
        System.out.println(list);

        list.retainAll(queue);
        System.out.println(list);
        
    }
    
}

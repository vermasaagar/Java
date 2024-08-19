
import java.util.LinkedHashSet;

public class LinkedHashSetExample
 {
    public static void main(String[] args) {

    // it maintains insertion order  
    // internally uses doubly linked list for manipulation
  
    LinkedHashSet<Integer> list = new LinkedHashSet<>();

    list.add(12);
    list.add(14);
    list.add(10);
    list.add(11);
    list.add(15);
   
    System.out.println("Maintain insertion order: " +list);
    System.out.println(list.reversed());

    list.remove(14);
    System.out.println(list);

    System.out.println(list.reversed());
        
    }
    
}

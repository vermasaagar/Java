
import java.util.Set;
import java.util.TreeMap;


public class TreeMapExample {
    public static void main(String[] args) {
       
         TreeMap<Integer, String> map = new TreeMap<>();

      //   map.put(null, "Apple"); // throws an error
         map.put(11,"Banana");
         map.put(10, "Lemon");
         map.put(23, "Orange");

         System.out.println(map);

         Set<Integer> keys = map.keySet();

         for(Integer key: keys){
            System.out.println(map.get(key));

         }

    }
    
}

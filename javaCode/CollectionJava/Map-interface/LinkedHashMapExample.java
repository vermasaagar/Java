
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;


public class LinkedHashMapExample {

    public static void main(String[] args) {
    

        Map<Integer, String> map = new LinkedHashMap<>();

        map.put(null,"A");
        map.put(11, "B");
        map.put(15, "C");
        map.put(19, "D");
        map.put(10, "E");
        System.out.println(map);
       
        System.out.println(" Replace Method : "+ map.replace(15, "C", "S"));
        System.out.println("Get Method : " +map.get(15));
       


        Set<Integer> keys = map.keySet();

        // for(Integer key: keys){
        //     System.out.println(map.get(key));
        // }


        Iterator<Integer> itr = keys.iterator();
        while(itr.hasNext()){
            System.out.println("Elements : "+ map.get(itr.next()));
        }
        
    }
    
}

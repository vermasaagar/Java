
import java.util.HashSet;
public class HashSetExample {
public static void main(String[] args) {


    // unordered collection 
    // does not maintain insertion order , 
    // elements are sorted based on thier hash code
    // internally usses hashing or hash table for storing elements 

    HashSet<Integer> list = new HashSet<>();

  
    list.add(4);
    list.add(6);
    list.add(2);
    list.add(9);
    
  
  
    System.out.println("unordered collection of item{}" +list);

    System.out.println(list.contains(5));

    System.out.println(list.isEmpty());

    // remove value by value not there index
    list.remove(4);
    System.out.println(list);

    // cant reverse the list
   






    // Iterator<Integer> itr = list.iterator();
    // while(itr.hasNext()){
    //     System.out.println(itr.next());
    // }
    // System.out.println(list.size());

    // System.out.println(list.hashCode());


    
}
    
}

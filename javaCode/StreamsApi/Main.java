
package StreamsApi;
import java.util.*;
import java.util.stream.Collectors;
import java.util.List;

public class Main {
    public static void main(String[] args) {
      //   List<Integer> list1 = Arrays.asList(2, 3, 4, 5, 6, 77, 82, 43, 62, 77);
      
      List<Integer> list1 = Arrays.asList(2, 3, 4, 5, 6, 77, 82, 43, 62, 77);
        System.out.println(list1);
    
     
        // for(Integer i: list1){
        //     if(i%2==0){
        //         list2.add(i);
        //     }
        // }
        
     List<Integer> list2 = list1.stream().filter(e-> e%2==0).collect(Collectors.toList());
      System.out.println(list2);
         
      //   list1.stream().filter(e->e%2==0).forEach(e->System.out.println(e));
        
     
    }
}

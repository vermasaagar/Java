package StreamsApi;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class RemoveDuplicate {
    public static void main(String[] args) {

        List<Integer> list =  Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 1, 1, 2, 2, 2);

     // List<Integer> list2 = list.stream().distinct().collect(Collectors.toList());
    
        List<Integer> distinctList = new ArrayList<>();

       for(Integer i : list){
        if(!distinctList.contains(i)){
             distinctList.add(i);
       } 
    }
    System.out.println(distinctList);
}

}


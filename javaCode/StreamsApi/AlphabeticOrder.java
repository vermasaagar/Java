package StreamsApi;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;





public class AlphabeticOrder {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Banana");
        list.add("Apple");
        list.add("Watermelon");
        list.add("Lemon");

        System.out.println(list);


        // By default sorted method sorting the list in ascending ordering
        //Ascending sorting
        List<String> list2 = list.stream().sorted().collect(Collectors.toList());
        System.out.println("Ascending order list : " +list2);

        // Descending sorting
        List<String> list3 = list.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
        System.out.println("Descending Order list : " +list3);
      

    
    }
    
}

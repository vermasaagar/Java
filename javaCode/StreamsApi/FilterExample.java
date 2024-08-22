
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

// filter method is used to filter elements based on the condition and return list based on the condition

public class FilterExample{
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        list.add(11);
        list.add(22);
        list.add(13);
        list.add(14);
        list.add(75);
        list.add(36);

        List<Integer> list2 = list.stream().filter(n-> n%2 == 0).collect(Collectors.toList());
        System.out.println(list2);


        
        
    }
    
}
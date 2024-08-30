package StreamsApi;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

// map method is used to perform certain operation on elements and return list.
public class MapExample{
    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(12, 14, 18, 11, 13, 30, 22);
    
        List<Integer> list2 = list.stream().map(n->n*2).collect(Collectors.toList());
        System.out.println(list2);

    }
}
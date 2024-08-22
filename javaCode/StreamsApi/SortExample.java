
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

// sort element in ascending order
public class SortExample {
    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(12, 15, 11, 13, 19, 17);
        // return elements
        // list.stream().sorted().collect(Collectors.toList()).forEach(n->System.out.println(n));

        // return array
        List<Integer> list2 = list.stream().sorted().collect(Collectors.toList());
        System.out.println(list2);
    }
    
}

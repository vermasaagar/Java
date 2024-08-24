import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SecondMax{
    public static void main(String[] args) {

      List<Integer> list = Arrays.asList(12, 14, 23, 32, 14, 18, 17);

      List<Integer> list2 = list.stream().distinct().sorted().collect(Collectors.toList());
      System.out.println("Ascending Order List : " + list2);


      List<Integer> list3 = list2.stream().sorted((a, b) -> Integer.compare(b, a)).collect(Collectors.toList());
      System.out.println("Descending Order List : " +list3);


       int secondMax = list.stream().distinct().sorted((a,b)->Integer.compare(b, a)).skip(1).findFirst().orElse(null);System.out.println("Second Largest Value  : " +secondMax);

    }
}


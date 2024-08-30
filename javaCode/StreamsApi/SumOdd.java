package StreamsApi;


import java.util.Arrays;
import java.util.List;

public class SumOdd {
    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
         int sumOdd = list.stream().filter(n->n%2 ==1).reduce(0, Integer::sum);
         System.out.println(sumOdd);
        
    }
    
}

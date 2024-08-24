
import java.util.Arrays;
import java.util.List;



// Write a Java program to find the maximum and minimum values in a list of integers using streams.

public class MaxValue{
    public static void main(String[] args) {
        
        List<Integer> list = Arrays.asList(21, 12, 11, 15, 17, 32, 29);
        int x = list.stream().max(Integer::compare).orElse(null);
        System.out.println(x);
    
    }
    
}

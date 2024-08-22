
import java.util.Arrays;
import java.util.List;



// Write a Java program to calculate the average of a list of integers using streams.

public class ListAverage {
    public static void main(String[] args) {

       List<Integer> list = Arrays.asList(15, 10, 15, 20, 20);

    //    double average = list.stream().mapToInt(Integer::intValue).average().getAsDouble();
    //     int sum = list.stream().reduce(0, (a,b) -> a+b) : reduce(0, Integer::sum) internally reduce(0, (a,b) -> a+b)
          int sum = list.stream().reduce(0, Integer::sum);
          double average =  sum / list.size();


       System.out.println( "Average : " + average);
        
    }
    
}

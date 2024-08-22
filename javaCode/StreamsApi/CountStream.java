
import java.util.Arrays;
import java.util.List;



// Write a Java program to count the number of strings in a list that start with a specific letter using streams.

public class CountStream {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("Apple", "Mango", "Orange", "MaterWelon");

        char startingList = 'M';
        
       long chr =  list.stream().filter(s->s.startsWith(String.valueOf(startingList))).count();
       System.out.println(chr);



  
       
        
    }
    
}

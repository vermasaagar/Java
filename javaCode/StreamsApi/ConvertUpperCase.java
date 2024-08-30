package StreamsApi;
import java.util.ArrayList;
import java.util.stream.Collectors;


// Write a Java program to convert a list of strings to uppercase or lowercase using streams.
public class ConvertUpperCase {
    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();
        list.add("Apple");
        list.add("Mango");
        list.add("watermelon");
        list.add("banana");

      //   list.stream().map(n-> n.toUpperCase()).collect(Collectors.toList()).forEach(n->System.out.println(n));
      list.stream().map(String::toUpperCase).collect(Collectors.toList()).forEach(n->System.out.println(n));
        
    }
}

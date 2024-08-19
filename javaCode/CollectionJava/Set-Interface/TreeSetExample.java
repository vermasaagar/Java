import java.util.TreeSet;

public class TreeSetExample {

    public static void main(String[] args) {
        TreeSet<Integer> list = new TreeSet<>();

        list.add(12);
        list.add(11);
        list.add(10);
        list.add(15);

        // does not allow null values
        // list.add(null);


        // element are sorted
        System.out.println(list);
      
        
    }

    
}

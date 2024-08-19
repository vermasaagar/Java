import java.util.ArrayList;

public class ArrayListEx2 {

    public static void main(String[] args) {

    ArrayList<String> list = new ArrayList<>();

    list.add("Apple");
    list.add("Mango");
    list.add("Watermelon");
    list.add("Orange");
    list.add("Banana");

    // Iterator<String> itr = list.iterator();

    // while(itr.hasNext()){
    //     System.out.println(itr.next());
    // }

    System.out.println(list);
    list.add(2,"Pomogranate");
    System.out.println(list);

    list.remove(2);
    System.out.println(list);
    System.out.println(list.contains("Orange"));
    System.out.println(list.size());

    }}

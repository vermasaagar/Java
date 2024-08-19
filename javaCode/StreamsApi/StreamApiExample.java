import java.util.ArrayList;

public class StreamApiExample {
    public static void main(String[] args) {
        


        ArrayList<Integer> list = new ArrayList<>();
        list.add(3);
        list.add(7);
        list.add(9);
        list.add(2);

      
       int x =   list.stream()
         .sorted()
         .filter(n->n%2==1)
         .map(n->n*2)
        //  .forEach(e->System.out.println(e))
         .reduce(0, (c,e)->c+e);

         System.out.println(x);


        //  Stream<Integer> data = list.stream();
         // data.forEach(e -> System.out.println(e));
         // data.forEach(e -> System.out.println(e)); //  throw IllegalStateException
         // once we can use the stream we cannot reuse this
    }
}

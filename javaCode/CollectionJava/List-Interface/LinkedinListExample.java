
import java.util.LinkedList;


public class LinkedinListExample {
    public static void main(String[] args) {

        LinkedList<Integer> list = new LinkedList<>();
        list.add(14);
        list.add(19);
        list.add(19);
        list.add(13);
        list.add(2);
        list.add(11);

        // System.out.println(list);

        // // insertion 
        // list.addFirst(19);
        // System.out.println(list);

        // list.add(1, 12);
        // System.out.println(list);

        // // deletion
        // list.removeFirst();
        // System.out.println(list);

        // list.removeLast();
        // System.out.println(list);

        // list.remove(3);
        // System.out.println(list);
        // // get
        // System.out.println(list.get(2));
        // System.out.println(list.contains(19));


        // System.out.println(list);
        // System.out.println("Size of List : "+list.size());

       
       
        System.out.println(list);
        
        list.notify();
        System.out.println(list);
    
}
}


import java.util.ArrayList;

class ArrayListExample{
    public static void main(String[] args){


        // add
        ArrayList<String> list = new ArrayList<>();
        list.add("Mango");
        list.add("Mango");
        list.add("Apple");
        list.add("Banana");
        list.add("Watermelon");
        System.out.println(list);


        //add-indexed
        list.add(1, "Lemon");
        System.out.println(list);


        //update-indexed

        list.set(1, "Orange");
        System.out.println(list);


        // get-indexed
        System.out.println(list.get(1));

        //delete-indexed
        list.remove(1);
        System.out.println(list);


        //check items in there are not
        System.out.println(list.contains("Watermelon"));

        // check size of the list
        System.out.println(list.size());


    
        System.out.println(list.indexOf("Watermelon"));
     

}
}



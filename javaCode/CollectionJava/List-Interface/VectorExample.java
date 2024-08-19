import java.util.Vector;

public class VectorExample {

    public static void main(String[] args){

        Vector<Integer> list  =  new Vector<>();
        list.add(5);
        list.add(4);
        list.add(2);
        list.add(2);
        list.add(7);

        // Allow null values
        // list.add(null);
        // list.add(null);

        list.addElement(3);


        // System.out.println("First Element : " +list.firstElement());
        // System.out.println("last Element : "+list.lastElement());
        // System.out.println("Size : " +list.size());
        // System.out.println("Index at value : " +list.elementAt(4));
        // list.removeElementAt(0);
        // System.out.println("After Removing element through Index :" + list);

        
        // System.out.println("List of objects");

        // list.forEach((n)-> System.out.println(n));

        System.out.println(list);
        System.out.println(list.getClass());

     

       //  list.clear();
      //   list.removeAll(list);
        System.out.println(list);


        
        
        


    
    }
    
}

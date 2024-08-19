import java.util.Iterator;
import java.util.Stack;

public class StackExample {
    public static void main(String[] args) {
        

        Stack<String> list = new Stack<>();

        list.push("Apple");
        list.push("Banana");
        list.push("WaterMelon");
        list.push("Orange");
        list.pop();

        System.out.println(list.capacity());
        list.remove(1);
        System.out.println(list);

        list.add(2, "Lemon");
        System.out.println(list);

       
    
}
}
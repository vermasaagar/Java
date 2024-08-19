
import java.util.ArrayDeque;
import java.util.Deque;





public class ArrayDequeueExample{
    public static void main(String[] args) {

    Deque<Integer> queue = new ArrayDeque<>();
    queue.offerLast(10);
    queue.offerLast(20);
    queue.offerLast(15);
    queue.offerLast(5);
    queue.offerFirst(1);
    queue.offerFirst(2);
    queue.offerFirst(3);
    queue.offerFirst(4);

    System.out.println(queue);

        
    }
}
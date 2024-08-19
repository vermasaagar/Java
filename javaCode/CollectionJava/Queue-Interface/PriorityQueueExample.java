
import java.util.PriorityQueue;

public class PriorityQueueExample {
    public static void main(String[] args) {
        
        // internally uses priority heap or binary tree to store the elements
        // A priority heap is a binary tree where each parent node has a priority greater than or equal to its children (max heap) or less than or equal to its children (min heap).
        PriorityQueue<Integer> queue = new PriorityQueue<Integer>();
        queue.add(20);
        queue.add(10);
        queue.add(30);
        queue.add(5);
        queue.add(15);
        queue.add(3);
       

        System.out.println(queue);
        // highest priority element is deleted
        System.out.println("After removing : "+queue.remove());
        System.out.println(queue);
       

    }
}

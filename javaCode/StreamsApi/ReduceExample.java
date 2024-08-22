import java.util.ArrayList;

public class ReduceExample {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        list.add(1);
        list.add(2);
        list.add(1);
        list.add(1);
        list.add(7);
        list.add(3);

        int result = list.stream().reduce(0, (a, b) -> a + b);
        System.out.println(result); // Output: 171
    }
}

import java.util.ArrayList;
import java.util.List;


public class MyCollections {

    private static int index;
    public static void main(String[] args) {

        List<Integer> list = new ArrayList();

        List<Integer> nums = new ArrayList<>();
        nums.add(4);
        nums.add(5);
        nums.add(6);
        nums.add(7);

        System.out.println(((ArrayList<Integer>) nums).indexOf(2));

        // System.out.println(nums.get(index:4));

        for (Object n : nums) {
            int num = (Integer)n;
            System.out.println(num * 2);

        }

    }

}

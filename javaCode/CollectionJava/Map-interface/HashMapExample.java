
// HashMap : we use when fast access is required and sorting does not matter. element are sorted based on the hash code
// 1- O(1) constant time for accessing element
// 2- allow only one null key and multiple null value is allow
// 3- internally uses bucket of array . each bucket is a LinkedList or balanced tree.

// Tree-Map : we use when sorted elements is required.
// 1- log(n) time for accessing element.
// 2- does not null key but multiple value is allow.
// 3- Internally red black tree which is a self balanacing binary seach tree.


// LinkedHashMap: we use when fast acces is required and insertion order is required.
// internally uses hash table and doubly-linked list.
// Hash table used for fast access and doubly linked list maintains the insertion order of elements.


import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapExample {
    public static void main(String[] args) {

        Map<Integer, String> map = new HashMap<>();

        // value can be repeat but key cannot be repeat

        map.put(20, "vishal");
        map.put(11, "vishal");
        map.put(12, "Shradha");

        System.out.println(map);

        System.out.println(map.get(2));
        // map.put("actor", "RajKumar Rao");

        System.out.println(map);
        Set<Integer> keys = map.keySet();
        for (Integer key : keys) {
            System.out.println(map.get(key));
        }
    }

}
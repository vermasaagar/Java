import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FunctionalInterface {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        System.out.println(list);

        List<Integer> list2 =list.stream().
        filter(n->n%2==0).
        collect(Collectors.toList());
        System.out.println(list2);


        
        // Lambda Expression :Lambda expression provide clear and concise way to represent a function without name or anonymous function expression
        // lambda expression implements the functional interfacein java .
        // Anonymous function : function without name is called anonymous function.
        // Functional interface : An interface that has only one abstract method is functional interface.
        // there are pre-defined functional interface in java named : predicate interface, consumer interface, supplier.

        // Predicate Interface : Predicate interface is a functional interface that represent a single argument function and return boolena value;

        // Consumer interface : Consumer interface is a functional interface that represent an operation that accept single argument ...

        // Supplier interface : Supplier interface is a functional interface that return a result without taking any input;

        ArrayList<Integer> list3 = new ArrayList<>();
        list3.add(3);
        list3.add(5);
        list3.add(2);
        list3.add(6);
        list3.add(12);
        list3.add(7);
        

        // Return an array
        System.out.println(list3);

        // Traversing each and every elemment one by one
        // Iterator<Integer> itr = list3.iterator();
        // while(itr.hasNext()){
        //     System.out.print(itr.next() + " ");
        // } 
     
        // Predicate Example
        Predicate<Integer> isEven = n->n%2 ==0;
        List<Integer> list4 = list3.
        stream().
        filter(isEven).
        collect(Collectors.toList());
        System.out.println("Predicate Example : " +list4);


        List<Integer> list5 = Arrays.asList(2, 4, 4, 5, 6, 7, 8, 8, 5, 4, 3, 12);
        // Consumer Example : 
        System.out.println(" Consumer Example : ");
    
        Consumer<Integer> print = number -> System.out.print(number + " ") ; 
        list5.forEach(print);

        // Supplier Interface : give result without taking inpurt
        System.out.println();
        System.out.println("Supplier Example :");
        Supplier<String> xyz = () -> "Hello, world!";
        Stream<String> stream =  Stream.generate(xyz).limit(5);
        stream.forEach(System.out::println);


        
        }
    }

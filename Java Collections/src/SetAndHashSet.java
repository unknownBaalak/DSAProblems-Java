import java.util.*;

public class SetAndHashSet {
    public static void main(String[] args) {

        // Declaration and Initialisation
        Set<String> names = new HashSet<>();

        // To add element in the set
        names.add("Walter");
        names.add("Jesse");
        names.add("Skyler");
        names.add("Mike");
        names.add("Saul");
        System.out.println(names);

        // Methods to transverse the set:-
        // 1. For-each loop (enhanced for loop)
        for (String name: names) {
            System.out.println(name);
        }

        // 2. Lambda method
        names.forEach(System.out::println);

        // 3. Iterator method
        Iterator<String> namesIterator = names.iterator();
        while (namesIterator.hasNext()) {
            System.out.println(namesIterator.next());
        }

        /* Why do we use set if almost every function is same as List?
        Reason: It's because whenever we want to solve problems and find if there are duplicates or not/ or to remove duplicates
        from the data because set doesn't contain duplicates even if passed explicitly it doesn't.
        */

        // Example (Removing duplicates)
        List<Integer> numberList = new ArrayList<>();
        numberList.add(3);
        numberList.add(2);
        numberList.add(1);
        numberList.add(2);
        numberList.add(3);
        System.out.println(numberList);

        // Passed the numberList as an argument
        Set<Integer> numberSet = new HashSet<>(numberList);
        System.out.println(numberSet);
    }
}

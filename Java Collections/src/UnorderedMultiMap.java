import java.util.*;

public class UnorderedMultiMap {
    public static void main(String[] args) {

        // It is used when a key have more than one value/ has to store more than one value
        Map<String, List<Integer>> multiMap = new HashMap<>();

        // Adding key and the list
        multiMap.put("apple", new ArrayList<>());

        // Adding/Putting value of key in the list - (02)
        multiMap.get("apple").add(1);
        System.out.println(multiMap);

        // computeIfAbsent means if there is no key named "like apple, etc." then create an ArrayList for it and then add value.
        multiMap.computeIfAbsent("apple", apple -> new ArrayList<>(List.of(1, 2, 5)));

        // Similar to (02)
        multiMap.get("apple").add(2);
        System.out.println(multiMap);
    }
}

import java.util.*;

public class UnorderedMultiMap {
    public static void main(String[] args) {

        // It is used when a key have more than one value/ has to store more than one value
        Map<String, List<Integer>> multiMap = new HashMap<>();

        // adding key and the list
        multiMap.put("apple", new ArrayList<>());

        // adding/putting value of key in the list - (02)
        multiMap.get("apple").add(1);
        System.out.println(multiMap);

        // computeIfAbsent means if there is no key named "anything like apple, cat, etc." then create an arraylist for it and then add value.
        multiMap.computeIfAbsent("apple", apple -> new ArrayList<>(List.of(1, 2, 5)));

        // similar to (02)
        multiMap.get("apple").add(2);
        System.out.println(multiMap);
    }
}

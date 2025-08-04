import java.util.HashMap;
import java.util.Map;

public class UnorderedMultiset {
    public static void main(String[] args) {

        // declaration and initialisation
        Map<String, Integer> multiSet = new HashMap<>();

        // adding key and its count
        multiSet.put("apple", 1);
        System.out.println(multiSet);

        // to add the element and increase its count by 1
        multiSet.put("apple", multiSet.getOrDefault("apple", 0) + 1);
        System.out.println(multiSet);

        // to remove an occurrence
        multiSet.put("apple", multiSet.get("apple") - 1);
        System.out.println(multiSet);
        multiSet.put("apple", multiSet.get("apple") - 1);
        System.out.println(multiSet);

        // to remove the key if its (count = 0)
        if (multiSet.get("apple") == 0) {
            multiSet.remove("apple");
        }
        System.out.println(multiSet);
    }
}

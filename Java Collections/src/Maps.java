import java.util.HashMap;
import java.util.TreeMap;

public class Maps {
    public static void main(String[] args) {

        // Declaration and Initialisation
        HashMap<String, Integer> empIDs = new HashMap<>();

        // To add/put the value
        empIDs.put("John", 1);
        empIDs.put("Carl", 2);
        empIDs.put("Jerry", 3);
        System.out.println(empIDs);

        // To get the value of key (eg: Carl)
        System.out.println(empIDs.get("Carl"));

        // To check if the map contains the passed key/value
        System.out.println(empIDs.containsKey("Ayush"));
        System.out.println(empIDs.containsValue(2));

        // To add/put the value (putting a new value to an existing key will overwrite its previous value)
        empIDs.put("John", 4);
        System.out.println(empIDs);

        // To replace the value of key
        empIDs.replace("John", 5);
        System.out.println(empIDs);

        // To add/put a key with value only if it is not already present!
        empIDs.putIfAbsent("Kramer", 6);
        System.out.println(empIDs);

        // To remove basically
        empIDs.remove("Kramer");
        System.out.println(empIDs);

        // TreeMap (Sorted by key)
        TreeMap<Integer, String> map = new TreeMap<>();
        map.put(1, "Dog");
        map.put(2, "Cat");
        map.put(3, "Bat");
        map.put(4, "Animal");
        System.out.println(map);
    }
}

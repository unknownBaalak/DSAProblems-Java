import java.util.HashMap;
import java.util.Map;

public class MajorityElement {
    // Brute force approach
    static int majorityElement0(int[] arr) {
        int n = arr.length;
        for (int k : arr) {
            int count = 0;
            for (int i : arr) {
                if (i == k) {
                    count++;
                }
            }
            if (count > n / 2) return k;
        }
        return 0;
    }

    // My approach! (This is the better approach too)
    static int majorityElement1(int[] arr) {
        int n = arr.length;
        Map<Integer, Integer> map = new HashMap<>();

        for (int number : arr) {
            map.put(number, map.getOrDefault(number, 0) + 1);
        }

        for (Map.Entry<Integer, Integer> it : map.entrySet()) {
            if (it.getValue() > n / 2) return it.getKey();
        }

        return 0;
    }

    // Optimal approach!
    static int majorityElement2(int[] arr) {
        int n = arr.length;
        int count = 0;
        int el = 0;
        for (int it : arr) {
            if (count == 0) {
                count = 1;
                el = it;
            } else if (it == el) {
                count++;
            } else {
                count--;
            }
        }

        int count1 = 0;
        for (int it : arr) {
            if (it == el) count1++;
        }
        if (count1 > n / 2) {
            return el;
        }
        return 0;
    }

    public static void main(String[] args) {
        int[] arr = new int[] {2,2,1,1,1,2,2};
        System.out.println(majorityElement0(arr));
        System.out.println(majorityElement1(arr));
        System.out.println(majorityElement2(arr));
    }
}

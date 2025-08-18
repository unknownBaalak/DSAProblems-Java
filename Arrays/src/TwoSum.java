import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    // My approach!
    static int[] twoSum0(int[] arr, int target) {
        int n = arr.length;
        int[] ans = new int[2];
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                int index = 0;
                if (arr[i] + arr[j] == target) {
                    ans[index] = i;
                    index++;
                    ans[index] = j;
                }
            }
        }
        return ans;
    }

    // Better approach (Using hashing, Best for variant 2 "indexes")
    static int[] twoSum1(int[] arr, int target) {
        int n = arr.length;
        int[] ans = new int[2];
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            int number = arr[i];
            int remaining = target - number;
            if (map.containsKey(remaining)) {
                ans[0] = map.get(remaining);
                ans[1] = i;
            }
            map.putIfAbsent(number, i);
        }
        return ans;
    }

    // Optimal approach (Only applicable for variant 1 "Yes/No", Not optimal for variant 2 "indexes")
    static String twoSum2(int[] arr, int target) {
        int n = arr.length;
        int left = 0, right = n - 1;
        Arrays.sort(arr);
        while (left < right) {
            int sum = arr[left] + arr[right];
            if (sum == target) {
                return "Yes";
            } else if (sum > target) {
                right--;
            } else left++;
        }
        return "No";
    }

    public static void main(String[] args) {
        int[] arr = new int[] {3, 2, 3};
        int target = 6;
        System.out.println(Arrays.toString(twoSum0(arr, target)));
        System.out.println(Arrays.toString(twoSum1(arr, target)));
        System.out.println((twoSum2(arr, target)));
    }
}

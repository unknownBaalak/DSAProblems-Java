import java.util.HashMap;
import java.util.Map;

public class LongestSubarrayK {
    // Brute force approach
    static int maxLength0(int[] arr, int k) {
        int length = 0;
        for (int i = 0; i < arr.length; i++) {
            int sum = 0;
            for (int j = i; j < arr.length; j++) {
                sum += arr[j];
                if (sum == k) length = Math.max(length, j - i + 1);
            }
        }
        return length;
    }

    // Better approach (Works for positives, negatives and zeroes using hashing)
    static int maxLength1(int[] arr, int k) {
        int length = 0;
        int prefixSum = 0;
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            prefixSum += arr[i];
            if (prefixSum == k) {
                length = i + 1;
            } else if (map.containsKey(prefixSum - k)) {
                length = Math.max(length, i - map.get(prefixSum - k));
            }
            map.putIfAbsent(prefixSum, i);
//            if (!map.containsKey(prefixSum)) {
//                map.put(prefixSum, i);
//            }
        }
        return length;
    }

    // Optimal approach (Only for positives and zeroes, negatives fail!)
    static int maxLength2(int[] arr, int k) {
        int left = 0, right = 0;
        int sum = arr[0];
        int length = 0;

        while (right < arr.length) {
            if (left < right && sum > k) {
                sum -= arr[left];
                left++;
            }

            if (sum == k) {
                length = Math.max(length, right - left + 1);
            }

            right++;
            if (right < arr.length) sum += arr[right];
        }
        return length;
    }

    public static void main(String[] args) {
        int[] arr = new int[] {1, 2, 3, 1, 1, 1, 1, 3, 3};
        int k = 6;
        System.out.println(maxLength0(arr, k));
        System.out.println(maxLength1(arr, k));
        System.out.println(maxLength2(arr, k));
    }
}

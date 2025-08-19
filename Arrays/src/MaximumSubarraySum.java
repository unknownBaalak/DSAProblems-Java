import java.util.ArrayList;
import java.util.List;

public class MaximumSubarraySum {
    // Better approach (No need for brute)
    static int sum0(int[] arr) {
        int n = arr.length;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            int sum = 0;
            for (int j = i; j < n; j++) {
                sum += arr[j];
                max = Math.max(max, sum);
            }
        }
        return max;
    }

    // Optimal approach
    static int sum1(int[] arr) {
        int n = arr.length;
        int sum = 0, max = Integer.MIN_VALUE;

        for (int element : arr) {
            sum += element;

            if (sum > max) {
                max = sum;
            }

            if (sum < 0) {
                sum = 0;
            }
        }
        return max;
    }

    // What if they ask to print the subarray having maximum sum??
    static List<Integer> printSubarray(int[] arr) {
        int n = arr.length;
        int sum = 0, max = Integer.MIN_VALUE;
        int start = 0, ansStart = -1, ansEnd = -1;

        for (int i = 0; i < n; i++) {
            if (sum == 0) start = i;
            sum += arr[i];

            if (sum > max) {
                max = sum;
                ansStart = start;
                ansEnd = i;
            }

            if (sum < 0) {
                sum = 0;
            }
        }

        List<Integer> subarray = new ArrayList<>();
        for (int i = ansStart; i <= ansEnd; i++) {
            subarray.add(arr[i]);
        }
        return subarray;
    }

    public static void main(String[] args) {
        int[] arr = new int[] {-2, -3, 4, -1, -2, 1, 5, -3};
        System.out.println(sum0(arr));
        System.out.println(sum1(arr));
        System.out.println(printSubarray(arr));
    }
}

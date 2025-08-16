import java.util.Arrays;

public class TwoSum {
    // My approach!
    static int[] twoSum(int[] arr, int target) {
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

    public static void main(String[] args) {
        int[] arr = new int[] {3, 2, 3};
        int target = 6;
        System.out.println(Arrays.toString(twoSum(arr, target)));
    }
}

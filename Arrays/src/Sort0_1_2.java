import java.util.Arrays;

public class Sort0_1_2 {
    // Brute force approach (Not good to be used)
    static void sort0(int[] arr) {
        Arrays.sort(arr);
    }

    // Better approach
    static void sort1(int[] arr) {
        int n = arr.length;
        int count0 = 0, count1 = 0;

        for (int element : arr) {
            if (element == 0) count0++;
            if (element == 1) count1++;
        }

        for (int i = 0; i < count0; i++) arr[i] = 0;
        for (int i = count0; i < count0 + count1; i++) arr[i] = 1;
        for (int i = count0 + count1; i < n; i++) arr[i] = 2;
    }

    // Optimal approach! (Using Dutch national flag algorithm)
    static void sort2(int[] arr) {
        int n = arr.length;
        int low = 0, mid = 0, high = n - 1;

        while (mid <= high) {
            if (arr[mid] == 0) {
                int temp = arr[low];
                arr[low] = arr[mid];
                arr[mid] = temp;
                low++;
                mid++;
            } else if (arr[mid] == 1) {
                mid++;
            } else {
                int temp = arr[high];
                arr[high] = arr[mid];
                arr[mid] = temp;
                high--;
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = new int[] {0, 1, 2, 0, 1, 2, 1, 2, 0, 0, 0, 1};
        sort0(arr);
        sort1(arr);
        sort2(arr);
        System.out.println(Arrays.toString(arr));
    }
}

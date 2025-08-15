import java.util.Arrays;

public class Extra {
    public static void main(String[] args) {
        int[] arr = new int[] {5, 9, 7, 4, 1, 6};
        rotate(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void rotate(int[] arr) {
        int n = arr.length;
        int temp = arr[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            arr[i + 1] = arr[i];
        }
        arr[0] = temp;
    }
}

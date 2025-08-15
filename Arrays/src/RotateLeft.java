import java.util.Arrays;

public class RotateLeft {
    public static void main(String[] args) {
        int[] arr = new int[] {5, 9, 7, 4, 1, 6};
        rotateLeft(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void rotateLeft(int[] arr) {
        int n = arr.length;
        int temp = arr[0];
        for (int i = 1; i < n; i++) {
            arr[i - 1] = arr[i];
        }
        arr[n - 1] = temp;
    }
}

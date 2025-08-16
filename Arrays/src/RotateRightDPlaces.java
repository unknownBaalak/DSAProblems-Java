import java.util.Arrays;
import java.util.Scanner;

public class RotateRightDPlaces {
    static void rotateRight(int[] arr, int d) {
        int n = arr.length;
        d %= n;
        reverse(arr, n - d, n - 1);
        reverse(arr, 0, n - d - 1);
        reverse(arr, 0, n - 1);

    }

    static void reverse(int[] arr, int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] arr = new int[] {4, 8, 9, 7, 6, 2, 1};
        System.out.print("Enter the d: ");
        int d = in.nextInt();
        rotateRight(arr, d);
        System.out.println(Arrays.toString(arr));
    }
}

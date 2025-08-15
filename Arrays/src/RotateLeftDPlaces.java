import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class RotateLeftDPlaces {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Please enter the size of array: ");
        int size = in.nextInt();

        int[] arr = new int[size];
        System.out.print("Enter the elements of the array: ");
        for (int i = 0; i < size; i++) {
            arr[i] = in.nextInt();
        }

        System.out.print("Please enter d: ");
        int d = in.nextInt();

        rotateDPlaces0(arr, d);
        rotateDPlaces1(arr, d);

        System.out.println(Arrays.toString(arr));
    }

    // Brute force approach
    static void rotateDPlaces0(int[] arr, int d) {
        int n = arr.length;
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < d; i++) {
            list.add(arr[i]);
        }

        for (int i = d; i < n; i++) {
            arr[i - d] = arr[i];
        }

        for (int i = n - d; i < n; i++) {
            arr[i] = list.get(i - (n - d));
        }
    }

    // Optimal approach!
    static void rotateDPlaces1(int[] arr, int d) {
        int n = arr.length;
        d %= n;
        reverse(arr, 0, d - 1);
        reverse(arr, d, n - 1);
        reverse(arr, 0, n - 1);
    }

    static void reverse(int[] arr, int start, int end) {
        while (start <= end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
}

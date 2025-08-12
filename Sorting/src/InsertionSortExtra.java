import java.util.Arrays;
import java.util.Scanner;

public class InsertionSortExtra {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Please enter the size of the array: ");
        int size = in.nextInt();

        // Creating an array
        int[] arr = new int[size];
        System.out.print("Enter the elements of the array: ");
        for (int i = 0; i < size; i++) {
            arr[i] = in.nextInt();
        }

        // Calling the function
        insertionSortDescending(arr);

        // To print the sorted array
        System.out.println(Arrays.toString(arr));
    }

    static void insertionSortDescending(int[] arr) {
        int n = arr.length;
        for (int i = 1; i < n; i++) {
            for (int j = i; j > 0; j--) {
                if (arr[j - 1] < arr[j]) {
                    int temp = arr[j - 1];
                    arr[j - 1] = arr[j];
                    arr[j] = temp;
                } else break;
            }
        }
    }
}

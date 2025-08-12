import java.util.Arrays;
import java.util.Scanner;

public class BubbleSort {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Please enter the size of array: ");
        int size = in.nextInt();

        // Creating an array
        int[] array = new int[size];
        System.out.print("Enter the elements of the array: ");
        for (int i = 0; i < size; i++) {
            array[i] = in.nextInt();
        }

        // Calling the sorting function
        sorting(array);
        bubbleSort(array);

        // To print the sorted array
        System.out.print(Arrays.toString(array));
    }

    // 1st method
    static void sorting(int[] array) {
        int n = array.length;
        for (int i = n - 1; i > 0; i--) {
            int didSwap = 0;
            for (int j = 0; j <= i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j + 1];
                    array[j + 1] = array[j];
                    array[j] = temp;
                    didSwap = 1;
                }
            }
            if (didSwap == 0) {
                break;
            }
        }
    }

    // 2nd method
    static void bubbleSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i <= n - 2; i++) {
            boolean swapped = false;
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }
            if (!swapped) break;
        }
    }
}

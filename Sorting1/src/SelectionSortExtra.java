import java.util.Arrays;
import java.util.Scanner;

public class SelectionSortExtra {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Please enter the size of the array: ");
        int size = in.nextInt();

        // Creating an array
        int[] array = new int[size];
        System.out.print("Enter the elements of the array: ");
        for (int i = 0; i < size; i++) {
            array[i] = in.nextInt();
        }

        // Calling the function
        selectionSort(array);

        // To print the sorted array
        System.out.println(Arrays.toString(array));
    }

    static void selectionSort(int[] array) {
        int n = array.length;
        for (int i = 0; i < n - 1; i++) {
            int max = 0;
            for (int j = 1; j <= n - i - 1; j++) {
                if (array[j] > array[max]) max = j;
            }
            int temp = array[max];
            array[max] = array[n - i - 1];
            array[n - i - 1] = temp;
        }
    }
}

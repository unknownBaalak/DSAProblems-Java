import java.util.Arrays;
import java.util.Scanner;

public class InsertionSort {
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

        // To print the sorted array
        System.out.print(Arrays.toString(array));
    }

    static void sorting(int[] array) {
        int n = array.length;
        for (int i = 0; i <= n - 1; i++) {
            int j = i;
            while (j > 0 && array[j - 1] > array[j]) {
                int temp = array[j - 1];
                array[j - 1] = array[j];
                array[j] = temp;
                j--;
            }
        }
    }
}

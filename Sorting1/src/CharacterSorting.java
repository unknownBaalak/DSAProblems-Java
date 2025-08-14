import java.util.Arrays;
import java.util.Scanner;

public class CharacterSorting {
    public static void main(String[] args) {
        // Taking input
        Scanner in = new Scanner(System.in);
        System.out.print("Please enter the size of the array: ");
        int size = in.nextInt();

        // Creating an char array
        char[] array = new char[size];
        System.out.print("Enter the elements of the array: ");
        for (int i = 0; i < size; i++) {
            array[i] = in.next().charAt(0);
        }

        // Calling the function
        sortingChar(array);

        // To print the sorted array
        System.out.println(Arrays.toString(array));
    }

    static void sortingChar(char[] array) {
        int n = array.length;
        for (int i = 0; i < n - 1; i++) {
            int min = i;
            for (int j = i + 1; j <= n - 1; j++) {
                if (array[j] < array[min]) min = j;
            }
            char temp = array[min];
            array[min] = array[i];
            array[i] = temp;
        }
    }
}

import java.util.*;

public class Practice {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Please enter the size of the array: ");
        int size = in.nextInt();

        // Creating an array
        int[] array = new int[size];
        System.out.print("Array: ");
        for (int i = 0; i < size; i++) {
            array[i] = in.nextInt();
        }

        // Finding max value in the array
        int max = array[0];
        for (int i = 0; i < size; i++) {
            if (array[i] > max) max = array[i];
        }

        // Precompute
        int size1 = max + 1;
        int[] hashArray = new int[size1];
        for (int i = 0; i < size; i++) {
            hashArray[array[i]]++;
        }

        // Fetch
        List<Integer> list = new ArrayList<>();
        for (int element : hashArray) {
            list.add(element);
        }
        System.out.println(list);
    }
}

import java.util.Scanner;

public class HashArrayNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // Creating an array and taking input
        System.out.print("Please enter the size of array: ");
        int size = in.nextInt();
        int[] array = new int[size];
        System.out.println("Enter the elements in the array");
        for (int i = 0; i < size; i++) {
            array[i] = in.nextInt();
        }

        // Finding max value in the array
        int max = array[0];
        for (int i = 0; i < size; i++) {
            if (array[i] > max) max = array[i];
        }

        // Precompute (max + 1 as size cuz it will create an array till max value)
        int [] hashArray = new int[max + 1];
        for (int i = 0; i < size; i++) {
            hashArray[array[i]] += 1;
        }

        // Taking queries
        System.out.print("Please enter the number of queries: ");
        int noOfQueries = in.nextInt();
        while (noOfQueries-- > 0) {
            System.out.println("Enter the number you want query for");
            int number = in.nextInt();

            // Fetch:-
            // Condition to check if the query input exceeds max value!
            if (number >= 0 && number <= max) {
                System.out.println(hashArray[number]);
            } else {
                System.out.println("0 (Number not in array)");
            }
        }
    }
}

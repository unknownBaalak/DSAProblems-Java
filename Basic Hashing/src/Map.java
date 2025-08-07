import java.util.Scanner;
import java.util.TreeMap;

public class Map {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Please enter the size of array: ");
        int size = in.nextInt();
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = in.nextInt();
        }

        // Precompute
        java.util.Map<Integer, Integer> freqMap = new TreeMap<>();
        for (int i = 0; i < size; i++) {
            freqMap.put(array[i], freqMap.getOrDefault(array[i], 0) + 1);
        }

        // To iterate over keys
        for (int key : freqMap.keySet()) {
            System.out.printf("%d -> %d", key, freqMap.get(key));
            System.out.println();
        }

        // Iterate over entries
        for (java.util.Map.Entry<Integer, Integer> entry : freqMap.entrySet()) {
            System.out.printf("%d -> %d", entry.getKey(), entry.getValue());
            System.out.println();
        }

        System.out.print("Please enter the number of queries: ");
        int q = in.nextInt();
        while (q-- > 0) {
            int number = in.nextInt();

            // Fetch
            System.out.println(freqMap.getOrDefault(number, 0));
        }
    }
}

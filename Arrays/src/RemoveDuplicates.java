import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicates {
    public static void main(String[] args) {
        int[] arr = new int[] {1, 1, 2, 2, 2, 3, 3};
        System.out.println(Arrays.toString(arr));
        System.out.println(removeDuplicates0(arr));
        System.out.println(removeDuplicates1(arr));
    }

    // Brute force approach
    static int removeDuplicates0(int[] arr) {
        Set<Integer> set = new LinkedHashSet<>();
        for (int element : arr) {
            set.add(element);
        }

        int index = 0;
        for (int it : set) {
            arr[index] = it;
            index++;
        }
        return index;
    }

    // Optimal solution!
    static int removeDuplicates1(int[] arr) {
        int i = 0;
        for (int j = 1; j < arr.length; j++) {
            if (arr[j] != arr[i]) {
                arr[i + 1] = arr[j];
                i++;
            }
        }
        return i + 1;
    }
}

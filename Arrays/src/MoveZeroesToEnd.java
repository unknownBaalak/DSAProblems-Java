import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MoveZeroesToEnd {
    public static void main(String[] args) {
        int[] arr = new int[] {5, 0, 9, 4, 0, 6, 7, 3, 0, 2};
//        moveZeroes0(arr);
        moveZeroes1(arr);
        System.out.println(Arrays.toString(arr));
    }

    // Brute force approach
    static void moveZeroes0(int[] arr) {
        int n = arr.length;
        List<Integer> list = new ArrayList<>();
        for (int elements : arr) {
            if (elements != 0) {
                list.add(elements);
            }
        }

        for (int i = 0; i < list.size(); i++) {
            arr[i] = list.get(i);
        }

        for (int i = list.size(); i < n; i++) {
            arr[i] = 0;
        }
    }

    // Optimal approach!
    static void moveZeroes1(int[] arr) {
        int n = arr.length;
        int j = -1;
        for (int i = 0; i < n; i++) {
            if (arr[i] == 0) {
                j = i;
                break;
            }
        }

        for (int i = j + 1; i < n; i++) {
            if (arr[i] != 0) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                j++;
            }
        }
    }
}

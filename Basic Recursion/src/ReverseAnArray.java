import java.util.Arrays;

public class ReverseAnArray {
    public static void main(String[] args) {
        int[] array = {2, 4, 6, 8};
//        System.out.print(Arrays.toString(reverseAnArray0(0, array.length - 1, array)));
        System.out.print(Arrays.toString(reverseAnArray1(0, array)));
    }

    // My approach and striver's 1st method (Two pointer method)
    static int[] reverseAnArray0(int i, int r, int[] array) {
        if (i >= r) {
            return array;
        }

        int temp = array[i];
        array[i] = array[r];
        array[r] = temp;

        return reverseAnArray0(i + 1, r - 1, array);
    }

    // Striver's 2nd method (Single pointer method)
    static int[] reverseAnArray1(int i, int[] array) {
        if (i >= (array.length / 2)) {
            return array;
        }

        int temp = array[i];
        array[i] = array[array.length - i - 1];
        array[array.length - i - 1] = temp;

        return reverseAnArray1(i + 1, array);
    }
}

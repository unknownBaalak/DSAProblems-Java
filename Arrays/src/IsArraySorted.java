public class IsArraySorted {
    static boolean isSorted(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < arr[i - 1]) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int[] arr = new int[] {3, 5, 8, 2, 3};
        System.out.println(isSorted(arr));
    }
}

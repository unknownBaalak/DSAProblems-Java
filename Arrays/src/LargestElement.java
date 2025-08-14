public class LargestElement {
    public static void main(String[] args) {
        int[] arr = new int[] {2, 4, 6, 8, 10};
        System.out.println(largest(arr));
    }

    static int largest(int[] arr) {
        int largest = arr[0];
        for (int element : arr) {
            if (element > largest) {
                largest = element;
            }
        }
        return largest;
    }
}

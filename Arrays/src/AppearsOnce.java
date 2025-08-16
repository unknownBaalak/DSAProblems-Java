public class AppearsOnce {
    static int appearsOnce(int[] arr) {
        int xor = 0;
        for (int element : arr) {
            xor ^= element;
        }
        return xor;
    }

    public static void main(String[] args) {
        int[] arr = new int[] {1, 1, 6, 4, 4, 3, 7, 3, 7, 9, 9};
        System.out.println(appearsOnce(arr));
    }
}

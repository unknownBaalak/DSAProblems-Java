public class FindMaximum {
    static int maximumCount(int[] arr) {
        int max = 0;
        int count = 0;
        for (int element : arr) {
            if (element == 1) {
                count++;
                max = Math.max(max, count);
            } else {
                count = 0;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int[] arr = new int[] {1, 1, 0, 1, 1, 1, 0, 1, 1};
        System.out.println(maximumCount(arr));
    }
}

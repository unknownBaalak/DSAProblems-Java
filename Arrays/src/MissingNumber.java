public class MissingNumber {
    // Optimal approach (Using XOR concept)
    static int findMissing(int[] arr, int N) {
        int xor1 = 0;
        int xor2 = 0;
        for (int i = 0; i < N - 1; i++) {
            xor1 = xor1 ^ arr[i];
            xor2 = xor2 ^ (i + 1);
        }
        xor2 = xor2 ^ N;
        return xor1 ^ xor2;
    }

    public static void main(String[] args) {
        int[] arr = new int[] {0, 1};
        int N = 2;
        System.out.println(findMissing(arr, N));
    }
}

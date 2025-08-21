public class Stocks {
    static int bestTime(int[] arr) {
        int min = arr[0];
        int profit = 0;
        int n = arr.length;

        for (int i = 1; i < n; i++) {
            int cost = arr[i] - min;
            profit = Math.max(profit, cost);
            min = Math.min(min, arr[i]);
        }
        return profit;
    }

    public static void main(String[] args) {
        int[] arr = new int[] {7, 1, 5, 3, 6, 4};
        System.out.println(bestTime(arr));
    }
}

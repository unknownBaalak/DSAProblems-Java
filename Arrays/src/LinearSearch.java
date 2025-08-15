import java.util.Scanner;

public class LinearSearch {
    static int search(int[] arr, int num) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            if (arr[i] == num) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] arr = new int[] {2, 6, 8, 0, 4, 6, 1};
        System.out.print("Enter the number you wanna search: ");
        int num = in.nextInt();
        System.out.println(search(arr, num));
    }
}

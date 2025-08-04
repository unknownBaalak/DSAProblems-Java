import java.util.Scanner;

public class Pattern22 {
    public static void main(String[] args) {
        // Taking input
        Scanner in = new Scanner(System.in);
        System.out.print("Please enter n: ");
        int n = in.nextInt();

        // Calling function!
        pattern(n);
    }

    static void pattern(int n) {
        for (int i = 0; i < 2 * n - 1; i++) {
            for (int j = 0; j < 2 * n - 1; j++) {
                int top = i;
                int left = j;
                int down = (2 * n - 2) - i;
                int right = (2 * n - 2) - j;
                System.out.print(n - Math.min(Math.min(top, down), Math. min(left, right)));
            }
            System.out.println();
        }
    }
}

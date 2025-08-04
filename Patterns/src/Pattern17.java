import java.util.Scanner;

public class Pattern17 {
    public static void main(String[] args) {
        // Taking input
        Scanner in = new Scanner(System.in);
        System.out.print("Please enter n: ");
        int n = in.nextInt();

        // Calling function!
        pattern(n);
    }

    static void pattern(int n) {
        // My method
        for (int i = 1; i <= n; i++) {
            // Space
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }

            // Letters
            char ch = 'A';
            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print(ch);
                if (k >= i) ch--;
                else ch++;
            }

            // Space
            for (int l = 1; l <= n - i; l++) {
                System.out.print(" ");
            }
            System.out.println();
        }

        // Striver's method
        for (int i = 0; i < n; i++) {
            // Space
            for (int j = 0; j < n - i - 1; j++) {
                System.out.print(" ");
            }

            // Letter
            char ch = 'A';
            int breakpoint = (2 * i + 1)/ 2;
            for (int k = 1; k <= 2 * i + 1; k++) {
                System.out.print(ch);
                if (k <= breakpoint) ch++;
                else ch--;
            }

            // Space
            for (int l = 0; l < n - i - 1; l++) {
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}

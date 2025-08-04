import java.util.Scanner;

public class Pattern20 {
    public static void main(String[] args) {
        // Taking input
        Scanner in = new Scanner(System.in);
        System.out.print("Please enter n: ");
        int n = in.nextInt();

        // Calling function!
//        upperPattern(n);
//        lowerPattern(n);
//        pattern(n);
        myUpdatedPattern(n);
    }

    // My method
    static void upperPattern(int n) {
        for (int i = 1; i <= n; i++) {
            // Stars
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }

            // Spaces
            for (int k = 1; k <= 2 * (n - i); k++) {
                System.out.print(" ");
            }

            // Stars
            for (int l = 1; l <= i; l++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void lowerPattern(int n) {
        for (int i = n - 1; i >= 1; i--) {
            // Stars
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }

            // Spaces
            for (int k = 1; k <= 2 * (n - i); k++) {
                System.out.print(" ");
            }

            // Stars
            for (int l = 1; l <= i; l++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    // Striver's method
    static void pattern(int n) {
        int spaces = 2 * (n - 1);
        for (int i = 1; i <= 2 * n - 1; i++) {
            int stars = i;
            if (stars > n) stars = 2 * n - i;
            // Stars
            for (int j = 1; j <= stars; j++) {
                System.out.print("*");
            }

            // Spaces
            for (int k = 1; k <= spaces; k++) {
                System.out.print(" ");
            }

            // Stars
            for (int j = 1; j <= stars; j++) {
                System.out.print("*");
            }
            System.out.println();
            if (i < n) spaces -= 2;
            else spaces += 2;
        }
    }

    static void myUpdatedPattern(int n) {
        for (int i = 1; i <= 2 * n - 1; i++) {
            int stars = i <= n ? i : 2 * n - i;
            int spaces = 2 * (n - stars);

            // Stars
            for (int j = 1; j <= stars; j++) System.out.print("*");

            // Spaces
            for (int j = 1; j <= spaces; j++) System.out.print(" ");

            // Stars
            for (int j = 1; j <= stars; j++) System.out.print("*");

            System.out.println();
        }
    }
}

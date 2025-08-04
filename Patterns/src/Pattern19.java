import java.util.Scanner;

public class Pattern19 {
    public static void main(String[] args) {
        // Taking input
        Scanner in = new Scanner(System.in);
        System.out.print("Please enter n: ");
        int n = in.nextInt();

        // Calling function!
        pattern0(n);
//        pattern1(n);
    }

    static void pattern0(int n) {
        // My method
        for (int i = 0; i < n; i++) {
            // Stars
            for (int j = n; j > i; j--) {
                System.out.print("*");
            }

            // Spaces
            for (int k = 0; k < 2 * i; k++) {
                System.out.print(" ");
            }

            // Stars
            for (int l = n; l > i; l--) {
                System.out.print("*");
            }
            System.out.println();
        }

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

    static void pattern1(int n) {
        // Striver's method
        int iniS = 0;
        for (int i = 0; i < n; i++) {
            // Stars
            for (int j = 1; j <= n - i; j++) {
                System.out.print("*");
            }

            // Spaces
            for (int k = 0; k < iniS; k++) {
                System.out.print(" ");
            }

            // Stars
            for (int l = 1; l <= n - i; l++) {
                System.out.print("*");
            }
            iniS += 2;
            System.out.println();
        }

        iniS = 8;
        for (int i = 1; i <= n; i++) {
            // Stars
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }

            // Spaces
            for (int k = 0; k < iniS; k++) {
                System.out.print(" ");
            }

            // Stars
            for (int l = 1; l <= i; l++) {
                System.out.print("*");
            }
            iniS -= 2;
            System.out.println();
        }
    }
}

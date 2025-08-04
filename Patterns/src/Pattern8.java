import java.util.Scanner;

public class Pattern8 {
    public static void main(String[] args) {
        // Taking input
        Scanner in = new Scanner(System.in);
        System.out.print("Please enter a number: ");
        int number = in.nextInt();

        // Calling function!
        pattern(number);
    }

    static void pattern(int number) {
        // My method
        for (int i = number; i > 0; i--) {
            // Space
            for(int j = 0; j <= number - i - 1; j++) {
                System.out.print(" ");
            }

            // Star
            for (int k = 0; k < 2 * i - 1; k++) {
                System.out.print("*");
            }

            // Space
            for(int l = 0; l <= number - i - 1; l++) {
                System.out.print(" ");
            }
            System.out.println();
        }

        // Striver's method
        for (int i = 0; i < number; i++) {
            // Space
            for(int j = 0; j < i; j++) {
                System.out.print(" ");
            }

            // Star
            for (int k = 0; k < 2 * number - (2 * i + 1); k++) {
                System.out.print("*");
            }

            // Space
            for(int l = 0; l < i; l++) {
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}

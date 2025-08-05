import java.util.Scanner;

public class Pattern8 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Please enter a number: ");
        int number = in.nextInt();
        pattern0(number);
        pattern1(number);
    }

    // My method
    static void pattern0(int number) {

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
    }

    // Striver's method
    static void pattern1(int number) {
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

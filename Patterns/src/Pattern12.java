import java.util.Scanner;

public class Pattern12 {
    public static void main(String[] args) {
        // Taking input
        Scanner in = new Scanner(System.in);
        System.out.print("Please enter a number: ");
        int number = in.nextInt();

        // Calling function!
        pattern(number);
    }

    static void pattern(int number) {
        int space = 2 * (number - 1);
        for (int i = 1; i <= number; i++) {
            // Numbers
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }

            // Spaces
            for (int k = 1; k <= space; k++) {
                System.out.print(" ");
            }

            // Numbers
            for (int l = i; l >= 1; l--) {
                    System.out.print(l);
            }
            System.out.println();
            space -= 2;
        }
    }
}

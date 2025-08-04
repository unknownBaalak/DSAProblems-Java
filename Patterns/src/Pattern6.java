import java.util.Scanner;

public class Pattern6 {
    public static void main(String[] args) {
        // Taking input
        Scanner in = new Scanner(System.in);
        System.out.print("Please enter a number: ");
        int number = in.nextInt();

        // Calling function!
        pattern(number);
    }

    static void pattern(int number) {
        for (int i = 1; i <= number; i++) {
            for (int j = 1; (j <= number - i + 1); j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}

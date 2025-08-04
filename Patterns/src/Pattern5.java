import java.util.Scanner;

public class Pattern5 {
    public static void main(String[] args) {
        // Taking input
        Scanner in = new Scanner(System.in);
        System.out.print("Please enter a number: ");
        int number = in.nextInt();

        // Calling function!
        pattern(number);
    }

    static void pattern(int number) {
        for (int i = number; i > 0; i--) {
            for (int j = i; j > 0; j--) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}

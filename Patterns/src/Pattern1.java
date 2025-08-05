import java.util.Scanner;

public class Pattern1 {
    public static void main(String[] args) {

        // First method (Simple logic)
        for (int i = 0; i < 6; i++) {
            System.out.println("* * * * *");
        }

        // Taking input from the user for patter() function!
        Scanner in = new Scanner(System.in);
        System.out.print("Please enter a number: ");
        int number = in.nextInt();
        pattern(number);
    }

    // Second method (Nested-loop logic)
    static void pattern(int number) {
        for (int i = 0; i < number; i++) {
            for (int j = 0; j < number; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}

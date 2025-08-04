import java.util.Scanner;

public class Pattern11 {
    public static void main(String[] args) {
        // Taking input
        Scanner in = new Scanner(System.in);
        System.out.print("Please enter a number: ");
        int number = in.nextInt();

        // Calling function!
        pattern(number);
    }

    static void pattern(int number) {
        int start;
        for (int i = 0; i < number; i++) {

            if (i % 2 == 0) start = 1;
            else start = 0;

            for(int j = 0; j <= i; j++) {
                System.out.print(start + " ");

                // Flipping value of start (from 1 to 0 or vice versa)
                start = 1 - start;
            }
            System.out.println();
        }
    }
}

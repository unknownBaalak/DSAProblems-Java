import java.util.Scanner;

public class Pattern16 {
    public static void main(String[] args) {
        // Taking input
        Scanner in = new Scanner(System.in);
        System.out.print("Please enter n: ");
        int n = in.nextInt();

        // Calling function!
        pattern(n);
    }

    static void pattern(int n) {
        char letter = 'A';
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(letter);
            }
            letter += 1;
            System.out.println();
        }
    }
}

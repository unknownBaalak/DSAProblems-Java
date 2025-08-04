import java.util.Scanner;

public class Pattern14 {
    public static void main(String[] args) {
        // Taking input
        Scanner in = new Scanner(System.in);
        System.out.print("Please enter n: ");
        int n = in.nextInt();

        // Calling function!
        pattern(n);
    }

    static void pattern(int n) {
        // My method
        char letter = 'A';
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print((char) (letter + j));
            }
            System.out.println();
        }

        // Striver's method
        for (int i = 0; i < n; i++) {
            for (char ch = 'A'; ch <= 'A' + i; ch++) {
                System.out.print(ch + " ");
            }
            System.out.println();
        }
    }
}

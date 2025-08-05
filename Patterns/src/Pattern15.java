import java.util.Scanner;

public class Pattern15 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Please enter n: ");
        int n = in.nextInt();
        pattern0(n);
        pattern1(n);
    }

    // My method
    static void pattern0(int n) {
        char letter = 'A';
        for (int i = n; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print((char) (letter + j));
            }
            System.out.println();
        }
    }

    // Striver's method
    static void pattern1(int n) {
        for (int i = 0; i < n; i++) {
            for (char ch = 'A'; ch <= 'A' + (n - i - 1); ch++) {
                System.out.print(ch + " ");
            }
            System.out.println();
        }
    }
}

import java.util.Scanner;

public class Pattern18 {
    public static void main(String[] args) {
        // Taking input
        Scanner in = new Scanner(System.in);
        System.out.print("Please enter n: ");
        int n = in.nextInt();

        // Calling function!
        pattern(n);
    }

    static void pattern(int n) {
        for (int i = n; i >= 1; i--) {
            for (char ch = (char) (64 + i); ch <= (char) (64 + n); ch++) {
                System.out.print(ch + " ");
            }
            System.out.println();
        }
    }
}
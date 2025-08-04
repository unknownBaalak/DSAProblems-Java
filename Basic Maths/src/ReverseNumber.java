import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Please enter a number: ");
        int number = in.nextInt();
        System.out.println(reverse(number));
    }

    public static int reverse(int x) {
        int original = x;
        int reverseNumber = 0;

        int absolute = Math.abs(x);
        while (absolute > 0) {
            int remainder = absolute % 10;
            reverseNumber = reverseNumber * 10 + remainder;
            absolute /= 10;
        }

        if (original < 0) {
            reverseNumber = -reverseNumber;
        } else {
            return reverseNumber;
        }

        return reverseNumber;
    }
}

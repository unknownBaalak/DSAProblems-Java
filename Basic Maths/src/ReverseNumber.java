import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Please enter a number: ");
        int number = in.nextInt();
        System.out.println(reverse(number));
    }

    public static int reverse(int x) {
        int reversedNumber = 0;
        while (x != 0) {
            int remainder = x % 10;

            if (reversedNumber > Integer.MAX_VALUE / 10 || (reversedNumber == Integer.MAX_VALUE / 10 && remainder > 7)) {
                return 0;
            }
            if (reversedNumber < Integer.MIN_VALUE / 10 || (reversedNumber == Integer.MIN_VALUE / 10 && remainder < -8)) {
                return 0;
            }

            reversedNumber = reversedNumber * 10 + remainder;
            x /= 10;
        }
        return reversedNumber;
    }
}

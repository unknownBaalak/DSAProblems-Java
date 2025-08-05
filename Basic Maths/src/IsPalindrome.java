import java.util.Scanner;

public class IsPalindrome {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Please enter a number: ");
        int number = in.nextInt();
        System.out.println(isPalindrome(number));
    }

    public static boolean isPalindrome(int x) {
        int original = x;
        int reverseNumber = 0;
        while (x > 0) {
            int remainder = x % 10;
            reverseNumber = reverseNumber * 10 + remainder;
            x /= 10;
        }
        return reverseNumber == original;
    }
}

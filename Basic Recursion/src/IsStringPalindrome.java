import java.util.Scanner;

public class IsStringPalindrome {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Please enter a string: ");
        String str = in.next();
        System.out.println(isPalindrome(0, str));
    }

    // Striver's method
    static boolean isPalindrome(int i, String string) {
        if (i >= string.length() / 2) {
            return true;
        }

        if (string.charAt(i) != string.charAt(string.length() - i - 1)) {
            return false;
        }

        return isPalindrome(i + 1, string);
    }
}

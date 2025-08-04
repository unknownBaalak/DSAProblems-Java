import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Please enter a number: ");
        int number = in.nextInt();
        System.out.println(armstrongNumber(number));
    }

    static boolean armstrongNumber(int n) {
        int original = n;
        int digits = 0;

        while (n > 0) {
            digits++;
            n /= 10;
        }

        n = original;
        int num = 0;
        while (n > 0) {
            int remainder = n % 10;
            num += (int) Math.pow(remainder, digits);
            n /= 10;
        }

        if (num == original) {
            return true;
        } else {
            return false;
        }
    }
}

import java.util.Scanner;

public class CountDigits {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Please enter a number: ");
        int number = in.nextInt();
        System.out.println(countDigits(number));
    }

    public static int countDigits(int n) {
        int count = 0;

        while (n > 0) {
            count++;
            n /= 10;
        }
        return count;
    }
}

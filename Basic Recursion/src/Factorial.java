import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Please enter a number: ");
        int number = in.nextInt();
        System.out.println(factorial(number));
    }

    static long factorial(int number) {
        if (number < 1) {
            return 1;
        }
        return number * factorial(number - 1);
    }
}

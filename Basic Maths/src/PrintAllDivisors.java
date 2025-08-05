import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class PrintAllDivisors {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Please enter a number: ");
        int number = in.nextInt();
        printDivisors(number);
    }

    public static void printDivisors(int n) {
        List<Integer> divisors = new ArrayList<>();

        for (int i = 1; Math.sqrt(n) >= i; i++) {
            if (n % i == 0) {
                divisors.add(i);

                if (n / i != i) {
                    divisors.add(n / i);
                }
            }
        }

        Collections.sort(divisors);
        for (int divisor : divisors) {
            System.out.print(divisor + " ");
        }
    }
}

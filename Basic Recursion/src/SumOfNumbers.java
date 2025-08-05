import java.util.Scanner;

public class SumOfNumbers {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Please enter a number: ");
        int number = in.nextInt();
        int sum1 = sum0(1, number);
        System.out.println(sum1);
        System.out.println(sum1(number));
        sum2(number, 0);
        System.out.println(sum3(number));
    }

    // My method
    static int sum0(int i, int n) {
        if (i > n) {
            return 0;
        }
        return (i + sum0(i + 1, n));
    }

    // My 2nd approach
    static int sum1(int n) {
        if (n < 0) {
            return 0;
        }
        return (n + sum1(n - 1));
    }

    // Striver's first method
    static void sum2(int i, int sum) {
        if (i < 1) {
            System.out.println(sum);
            return;
        }
        sum2(i - 1, sum + i);
    }

    // Striver's second method
    static int sum3(int n) {
        if (n == 0) return 0;
        return (n + sum3(n - 1));
    }
}

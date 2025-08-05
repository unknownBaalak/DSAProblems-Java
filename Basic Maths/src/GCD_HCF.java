import java.util.Scanner;

public class GCD_HCF {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Please enter first number: ");
        int firstNumber = in.nextInt();
        System.out.print("Please enter second number: ");
        int secondNumber = in.nextInt();
        System.out.println(gcd(firstNumber, secondNumber ));
    }

    public static int gcd(int a, int b) {
        while (a > 0 && b > 0) {
            if (a > b) a = a % b;
            else b = b % a;
        }

        if (a == 0) return b;
        else return a;
    }
}

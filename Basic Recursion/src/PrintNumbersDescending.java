import java.util.Scanner;

public class PrintNumbersDescending {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Please enter a number: ");
        int number = in.nextInt();
        printNumbers0(number, 1);
        printNumbers1(number);
    }

    // My method
    static void printNumbers0(int number, int i) {
        if (number < i) {
            return;
        }
        System.out.print(number + " ");
        printNumbers0(number - 1, i);
    }

    // Striver's method
    static void printNumbers1(int i) {
        if (i < 1) {
            return;
        }
        System.out.print(i + " ");
        printNumbers1(i - 1);
    }
}

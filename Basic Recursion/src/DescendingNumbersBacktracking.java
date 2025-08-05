import java.util.Scanner;

public class DescendingNumbersBacktracking {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Please enter a number: ");
        int number = in.nextInt();
        printNumbers(1, number);
    }

    static void printNumbers(int i, int number) {
        if (i > number) {
            return;
        }
        printNumbers(i + 1, number);
        System.out.print(i + " ");
    }
}

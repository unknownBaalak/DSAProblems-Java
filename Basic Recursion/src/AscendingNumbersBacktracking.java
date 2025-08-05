import java.util.Scanner;

public class AscendingNumbersBacktracking {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Please enter a number: ");
        int number = in.nextInt();
        printNumbers(number);
    }

    static void printNumbers(int i) {
        if (i < 1) {
            return;
        }
        printNumbers(i - 1);
        System.out.print(i + " ");
    }
}

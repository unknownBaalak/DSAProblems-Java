import java.util.Scanner;

public class PrintNumbersAscending {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Please enter a number: ");
        int number = in.nextInt();
        printNumbers0(1, number);
    }

    static void printNumbers0(int i, int number) {
        if (i > number) {
            return;
        }
        System.out.print(i + " ");
        printNumbers0(i + 1, number);
    }
}

import java.util.Scanner;

public class PrintName {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Please enter a number: ");
        int number = in.nextInt();
        printName(1, number);
    }

    // Without using global variable
    static void printName(int i, int number) {
        if (i > number) {
            return;
        }
        String name = "Ayush";
        System.out.println(name);
        printName(i + 1, number);
    }
}

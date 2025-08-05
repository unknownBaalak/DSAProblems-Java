import java.util.Scanner;

public class Pattern10 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Please enter a number: ");
        int number = in.nextInt();
        pattern(number);
    }

    static void pattern(int number) {
        for (int i = 1; i <= (2 * number - 1); i++) {
            int stars = i;
            if (i > number) {
                stars = 2 * number - i;
            }
            for(int j = 1; j <= stars; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

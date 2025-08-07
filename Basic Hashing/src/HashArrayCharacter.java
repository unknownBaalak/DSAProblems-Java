import java.util.Scanner;

public class HashArrayCharacter {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String string = in.next();

        // Precompute
        int[] hash = new int[26];
        for (int i = 0; i < string.length(); i++) {
            hash[string.charAt(i) - 'a']++;
        }

        System.out.print("Please enter the number of queries: ");
        int q = in.nextInt();
        while (q-- > 0) {
            int ch = in.next().charAt(0);

            // Fetch
            System.out.println(hash[ch - 'a']);
        }
    }
}

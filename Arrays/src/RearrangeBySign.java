import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class RearrangeBySign {
    // Brute force (Negatives and positives are equal)
    static int[] rearrange0(int[] arr) {
        int n = arr.length;
        int posIndex = 0, negIndex = 0;
        int[] positive = new int[n / 2];
        int[] negative = new int[n / 2];

        for (int it : arr) {
            if (it > 0) {
                positive[posIndex++] = it;
            } else {
                negative[negIndex++] = it;
            }
        }

        for (int j = 0; j < n / 2; j++) {
            arr[2 * j] = positive[j];
            arr[2 * j + 1] = negative[j];
        }
        return arr;
    }

    // Optimal approach! (Negatives and positives are equal)
    static List<Integer> rearrange1(int[] arr) {
        int n = arr.length;
        List<Integer> ans = new ArrayList<>(Collections.nCopies(n, 0));
        int posIndex = 0, negIndex = 1;

        for (int it : arr) {
            if (it < 0) {
                ans.set(negIndex, it);
                negIndex += 2;
            } else {
                ans.set(posIndex, it);
                posIndex += 2;
            }
        }
        return ans;
    }

    /* What if positive != negatives? (Optimal can't be modified as it is based on equality of positives and negatives
    i.e. going with brute force)
    */
    static int[] rearrange2(int[] arr) {
        List<Integer> positives = new ArrayList<>();
        List<Integer> negatives = new ArrayList<>();

        for (int it : arr) {
            if (it < 0) {
                negatives.add(it);
            } else {
                positives.add(it);
            }
        }

        if (positives.size() > negatives.size()) {
            for (int i = 0; i < negatives.size(); i++) {
                arr[2 * i] = positives.get(i);
                arr[2 * i + 1] = negatives.get(i);
            }

            int index = 2 * negatives.size();
            for (int i = negatives.size(); i < positives.size(); i++) {
                arr[index++] = positives.get(i);
            }
        } else {
            for (int i = 0; i < positives.size(); i++) {
                arr[2 * i] = positives.get(i);
                arr[2 * i + 1] = negatives.get(i);
            }

            int index = 2 * positives.size();
            for (int i = positives.size(); i < negatives.size(); i++) {
                arr[index++] = negatives.get(i);
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] arr = new int[] {-1, 2, 3, 4, -3, 1};
        System.out.println(Arrays.toString(rearrange2(arr)));
    }
}

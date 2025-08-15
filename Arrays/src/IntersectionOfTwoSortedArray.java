import java.util.ArrayList;
import java.util.List;

public class IntersectionOfTwoSortedArray {
    // Brute force approach
    static List<Integer> intersection0(int[] arr1, int[] arr2) {
        List<Integer> ans = new ArrayList<>();
        int[] visited = new int[arr2.length];
        for (int elements : arr1) {
            for (int j = 0; j < arr2.length; j++) {
                if (elements == arr2[j] && visited[j] == 0) {
                    ans.add(elements);
                    visited[j] = 1;
                    break;
                }
                if (arr2[j] > elements) break;
            }
        }
        return ans;
    }

    // Optimal approach!
    static List<Integer> intersection1(int[] arr1, int[] arr2) {
        int i = 0;
        int j = 0;
        List<Integer> ans = new ArrayList<>();
        while (i < arr1.length && j < arr2.length) {
            if (arr1[i] < arr2[j]) {
                i++;
            }
            else if (arr2[j] < arr1[i]) {
                j++;
            }
            else {
                ans.add(arr1[i]);
                i++;
                j++;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] arr1 = new int[] {1, 2};
        int[] arr2 = new int[] {3, 4};
//        System.out.println(intersection0(arr1, arr2));
        System.out.println(intersection1(arr1, arr2));
    }
}

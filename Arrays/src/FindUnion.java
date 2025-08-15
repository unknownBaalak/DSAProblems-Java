import java.util.*;

public class FindUnion {
    // Brute force approach
    static int[] union(int[] arr1, int[] arr2) {
        Set<Integer> set = new TreeSet<>();

        for (int elements : arr1) {
            set.add(elements);
        }

        for (int elements : arr2) {
            set.add(elements);
        }

        int[] unionArray = new int[set.size()];
        int i = 0;
        for (int it : set) {
            unionArray[i++] = it;
        }
        return unionArray;
    }

    // Optimal approach!
    static List<Integer> union(List<Integer> list1, List<Integer> list2) {
        int a = list1.size();
        int b = list2.size();
        int i = 0;
        int j = 0;

        List<Integer> union = new ArrayList<>();
        while (i < a && j < b) {
            if (list1.get(i) <= list2.get(j)) {
                if (union.isEmpty() || !union.getLast().equals(list1.get(i))) {
                    union.add(list1.get(i));
                }
                i++;
            } else {
                if (union.isEmpty() || !union.getLast().equals(list2.get(j))) {
                    union.add(list2.get(j));
                }
                j++;
            }
        }

        while (i < a) {
            if (union.isEmpty() || !union.getLast().equals(list1.get(i))) {
                union.add(list1.get(i));
            }
            i++;
        }

        while (j < b) {
            if (union.isEmpty() || !union.getLast().equals(list2.get(j))) {
                union.add(list2.get(j));
            }
            j++;
        }
        return union;
    }

    public static void main(String[] args) {
        int[] arr1 = new int[] {4, 4, 6, 8, 4, 9, 1, 3, 2, 7, 3};
        int[] arr2 = new int[] {5, 4, 6, 5, 9, 9, 1, 2, 7, 3};
        int[] unionArray = union(arr1, arr2);
        System.out.println(Arrays.toString(unionArray));
        List<Integer> list1 = new ArrayList<>(Arrays.asList(2, 4, 6, 6, 7, 9));
        List<Integer> list2 = new ArrayList<>(Arrays.asList(1, 4, 5, 6, 8, 9));
        System.out.println(union(list1, list2));
    }
}

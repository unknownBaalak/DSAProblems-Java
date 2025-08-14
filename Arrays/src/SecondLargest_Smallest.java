public class SecondLargest_Smallest {
    static int secondLargest(int[] arr) {
        int largest = arr[0];
        int secondLargest = Integer.MIN_VALUE;

        for (int element : arr) {
            if (element > largest) {
                secondLargest = largest;
                largest = element;
            } else if (element < largest && element > secondLargest) {
                secondLargest = element;
            }
        }
        return secondLargest;
    }

    static int secondSmallest(int[] arr) {
        int smallest = arr[0];
        int secondSmallest = Integer.MAX_VALUE;

        for (int element : arr) {
            if (element < smallest) {
                secondSmallest = smallest;
                smallest = element;
            } else if (element != smallest && element < secondSmallest) {
                secondSmallest = element;
            }
        }
        return secondSmallest;
    }

    public static void main(String[] args) {
        int[] arr = new int[] {-5, -1, -5, 0};
        System.out.println(secondLargest(arr));
        System.out.println(secondSmallest(arr));
    }
}

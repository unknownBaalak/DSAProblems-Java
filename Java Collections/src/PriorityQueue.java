import java.util.Collections;
import java.util.Queue;

public class PriorityQueue {
    public static void main(String[] args) {

        /* What is a PriorityQueue and how it works?
        Answer: PriorityQueue is a subset of queue or a class which implements queue. Now, it works on the FIFO (First In, First Out)
        principle, but it prioritizes the order of your entries and print them according.
        */

        // As Queue is an interface, its object cannot be created hence we use PriorityQueue
        Queue<Double> queue = new java.util.PriorityQueue<>();

        // To add/enqueue element in the queue
        queue.offer(3.0);
        queue.offer(2.5);
        queue.offer(4.0);
        queue.offer(1.5);
        queue.offer(2.0);

        // Loop to iterate till queue is empty, it prints and remove the element from the queue
        while (!queue.isEmpty()) {
            System.out.println(queue.poll());
        }

        /* In the above example,
        Output: 1.5
                2.0
                2.5
                3.0
                4.0
        So, it prints in ascending order (in a priority by sorting the queue first before printing/processing)
        */

        // As Queue is an interface, its object cannot be created hence we use PriorityQueue (Used a comparator here to reverse order)
        Queue<String> stringQueue = new java.util.PriorityQueue<>(Collections.reverseOrder());

        // To add/enqueue element in the queue
        stringQueue.offer("D");
        stringQueue.offer("A");
        stringQueue.offer("E");
        stringQueue.offer("C");
        stringQueue.offer("B");

        // Loop to iterate till queue is empty, it prints and remove the element from the queue
        while (!stringQueue.isEmpty()) {
            System.out.println(stringQueue.poll());
        }

        /* In the above example,
        Output: E
                D
                C
                B
                A
        So, it prints in descending order (in a priority by sorting the queue first before printing/processing)
        because of passing a comparator in the constructor which reverse the natural order.
        */
    }
}

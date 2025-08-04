import java.util.LinkedList;

public class Queue {
    public static void main(String[] args) {

        /* What is a Queue and how it works?
        Answer: Queue is an data structure which is used to store data linearly. Queue is an interface i.e. its object cannot be
        formed, and it extends to (inherit) Collection class and use LinkedList/PriorityQueue (Will study later) to instantiate
        the object. Now, it works on the FIFO (First In, First Out) principle as it stores the data in a line so they all are
        right behind each other and the first element added would be at the head of the queue (means at 1st position) and the
        last element would be at the tail (last position until another element is passed)
        */

        // As Queue is an interface, its object cannot be created hence we use LinkedList
        java.util.Queue<String> queue = new LinkedList<>();

        // To add/enqueue element in the queue
        queue.offer("Karen");
        queue.offer("Chad");
        queue.offer("Steve");
        queue.offer("Harold");

        // To print the queue
        System.out.println(queue);

        // Queue is an interface and inherits Collections class so it can perform its functions like (.isEmpty(), .size())
        System.out.println(queue.isEmpty());
        System.out.println(queue.size());
        System.out.println(queue.contains("Steve"));

        // To check the first element/member of the queue
        System.out.println(queue.peek());

        // As poll function return the object, we can define a variable to assign that value
        String top = queue.poll();
        System.out.println(top);

        // To remove/dequeue the element from the queue
        queue.poll();
        queue.poll();
        queue.poll();
        System.out.println(queue.peek());
    }
}

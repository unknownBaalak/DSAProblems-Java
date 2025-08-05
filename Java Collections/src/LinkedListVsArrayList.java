import java.util.ArrayList;
import java.util.LinkedList;

public class LinkedListVsArrayList {
    public static void main(String[] args) {

        // Initialisation and Declaration (LinkedList)
        LinkedList<String> namesLinkedList = new LinkedList<>();

        // To add an element in the list
        namesLinkedList.add("John");
        namesLinkedList.add("Paul");
        namesLinkedList.add("George");
        namesLinkedList.add("Ringo");

        // To print the element at (index = 2)
        System.out.println(namesLinkedList.get(2));

        // Adding an element at (index = 1)
        namesLinkedList.add(1, "Jerry");
        System.out.println(namesLinkedList);

        // To remove an element from the list
        namesLinkedList.remove("Paul");
        System.out.println(namesLinkedList);


        // Initialisation and Declaration (ArrayList)
        ArrayList<String> namesArrayList = new ArrayList<>();

        // To add an element in the list
        namesArrayList.add("John");
        namesArrayList.add("Paul");
        namesArrayList.add("George");
        namesArrayList.add("Ringo");

        // To print the element at (index = 2)
        System.out.println(namesArrayList.get(2));

        // Adding an element at (index = 1)
        namesArrayList.add(1, "Jerry");
        System.out.println(namesArrayList);

        // To remove an element from the list
        namesArrayList.remove("Paul");
        System.out.println(namesArrayList);

        /* If syntax and functions are same for both ArrayList and LinkedList then why do you need both and which one to use? and when?
        Answer: It totally depends on what's your need, maybe they look same or have same functionality but the way they implement in
        backend makes the whole difference.

        Case1: You want a program to retrieve/get a certain value/element from the list?
        Answer: Then you should use ArrayList in this case, why? cuz ArrayList basically creates Array of the elements so when you want
        to get an element it transverse through the array quickly and get you the required element so fast. While LinkedList makes chain
        using nodes which references to the previous and the next element in the list so when you try to do the same thing here it just
        takes so long to perform the same task (especially in a big list) because it has to go over and search till it gets the element.

        Case2: If you want a program to add/remove a certain value/element to/from the list then you should use LinkedList, why?
        Answer: In this case, LinkedList would be your go-to method, why? cuz as you know LinkedList basically have referencing through
        nodes so when you want to add/remove an element it begins from the start and get to the (desired indexing) and just make new
        reference connecting the node to next and previous element to it. While ArrayList needs to make whole new Array and copy the
        stuff you want to keep while adding or removing an element which is a time-taking task so here LinkedList takes an edge.
        */
    }
}

public class Stack {
    public static void main(String[] args) {

        /* What is a Stack and how it works?
        Answer: Stack is an data structure which is used to store data vertically. Now, it works on the LIFO (Last In, First Out)
        principle as it stores the data in a vertically so they all are stacked right onto each other and the first element added
        would be at the bottom of the stack (means at last position cuz top considered as 1st position in stack) and the
        last element would be at the top (1st position until another element is passed)
        */

        // Declaration and Initialization
        java.util.Stack<String> stack = new java.util.Stack<>();

        // Basic stack function to check if the stack is empty or not (returns boolean)
        System.out.println(stack.empty());

        // To add element in the stack (first goes to the bottom, rest stack onto each other like "stack of books")
        stack.push("Minecraft");
        stack.push("Skyrim");
        stack.push("DOOM");
        stack.push("Borderlands");
        stack.push("FFVII");

        // To print the stack
        System.out.println(stack);

        /* To remove the element from the stack and as pop() returns the object we can store the value in a variable
         (top element gets removed first)
        */
        String myFavGame = stack.pop();
        System.out.println(myFavGame);

        // To check the topmost element/member of the stack without removing it like pop()
        System.out.println(stack.peek());

        // To search for an element/member in the stack (it returns an integer value specifying their position in the stack)
        System.out.println(stack.search("GTA V"));
    }
}

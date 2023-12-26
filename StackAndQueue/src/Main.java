public class Main {
    public static void main(String[] args) {
        System.out.println("program for Stack");
        displayStack();
        System.out.println("\nProgram for queue");
        displayQueue();
    }

    public static void displayQueue() {
        Queue<Integer> queue = new Queue<Integer>();

        queue.enqueue(56);
        queue.enqueue(30);
        queue.enqueue(70);

        // Print the queue
        System.out.println("Initial Queue:");
        queue.printQueue();

        // Dequeue until the queue is empty
        System.out.println("Queue after dequeue operations:");
        while (!queue.isEmpty()) {
            System.out.println("Dequeue: " + queue.dequeue());
            queue.printQueue();
        }

    }

    public static void displayStack() {
        Stack<Integer> stack = new Stack<Integer>();
        stack.push(56);
        stack.push(30);
        stack.push(70);

        System.out.println("Initial Stack:");
        stack.printStack();

        // Peek and pop until the stack is empty
        System.out.println("Stack after peek and pop operations:");
        while (!stack.isEmpty()) {
            System.out.println("Peek: " + stack.peek());
            // System.out.println("Pop: " + stack.pop());
            stack.pop();
            stack.printStack();
        }
    }

}


// head--->

public class Stack<T> {

    private Node<T> top;

    public Stack() {
        this.top = null;
    }

    public void push(T val) {
        Node<T> newNode = new Node<T>(val);
        newNode.next = top;
        top = newNode;
    }

    public T pop() {
        if (isEmpty()) {
            throw new IllegalStateException("Stack is empty");
        }
        T val = top.value;
        top = top.next;
        return val;
    }

    public T peek() {
        if (isEmpty()) {
            throw new IllegalStateException("Stack is empty");
        }

        return top.value;
    }

    public boolean isEmpty() {
        return top == null;
    }

    public void printStack() {
        Node<T> current = top;
        while (current != null) {
            System.out.print(current.value + "->");
            current = current.next;
        }
        System.out.println();
    }

}

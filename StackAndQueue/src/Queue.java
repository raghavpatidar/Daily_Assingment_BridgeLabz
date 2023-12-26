public class Queue<T> {
    private Node<T> front, rear;

    public Queue() {
        this.front = this.rear = null;
    }

    public void enqueue(T data) {
        Node<T> newNode = new Node<T>(data);
        if (isEmpty()) {
            front = rear = newNode;
        } else {
            rear.next = newNode;
            rear = newNode;
        }
    }

    public T dequeue() {
        if (isEmpty()) {
            throw new IllegalStateException("Queue is empty");
        }
        T dequeuedValue = front.value;
        front = front.next;
        if (front == null) {
            rear = null;
        }
        return dequeuedValue;
    }

    public boolean isEmpty() {
        return front == null;
    }

    public void printQueue() {
        Node<T> current = front;
        while (current != null) {
            System.out.print(current.value + "->");
            current = current.next;
        }
        System.out.println();
    }
}

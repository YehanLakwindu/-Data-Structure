class QueueNode {
    int data;
    QueueNode next;

    QueueNode(int data) {
        this.data = data;
        this.next = null;
    }
}
public class QueueUsingLinkedList {

    private QueueNode front, rear;

    public QueueUsingLinkedList() {
        this.front = this.rear = null;
    }

    // Enqueue operation to add an element to the queue
    public void enqueue(int data) {
        QueueNode newNode = new QueueNode(data);
        if (this.rear == null) {
            this.front = this.rear = newNode;
        } else {
            this.rear.next = newNode;
            this.rear = newNode;
        }
        System.out.println(data + " enqueued to queue");
    }

    // Dequeue operation to remove an element from the queue
    public int dequeue() {
        if (this.front == null) {
            System.out.println("Queue is empty");
            return Integer.MIN_VALUE;
        } else {
            int dequeuedData = this.front.data;
            this.front = this.front.next;

            // If front becomes null, then change rear also to null
            if (this.front == null) {
                this.rear = null;
            }
            return dequeuedData;
        }
    }

    // Peek operation to view the front element of the queue
    public int peek() {
        if (this.front == null) {
            System.out.println("Queue is empty");
            return Integer.MIN_VALUE;
        } else {
            return this.front.data;
        }
    }

    // Check if the queue is empty
    public boolean isEmpty() {
        return this.front == null;
    }

    // Print all elements in the queue
    public void printQueue() {
        if (this.front == null) {
            System.out.println("Queue is empty");
            return;
        }
        QueueNode currentNode = this.front;
        while (currentNode != null) {
            System.out.print(currentNode.data + " ");
            currentNode = currentNode.next;
        }
        System.out.println();
    }

    // Main method to test the queue implementation
    public static void main(String[] args) {
        QueueUsingLinkedList queue = new QueueUsingLinkedList();
        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        queue.enqueue(40);
        queue.enqueue(50);
        queue.enqueue(60);
        queue.enqueue(70);
        queue.enqueue(80);

        System.out.println("Front element is " + queue.peek());

        System.out.println("Queue elements:");
        queue.printQueue();

        System.out.println(queue.dequeue() + " dequeued from queue");
        System.out.println("Front element is " + queue.peek());

        System.out.println("Queue elements after dequeue:");
        queue.printQueue();
    }
}

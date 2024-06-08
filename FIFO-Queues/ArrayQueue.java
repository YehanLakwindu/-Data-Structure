import java.util.NoSuchElementException;

class ArrayQueue {
    private int[] queue;
    private int front;
    private int rear;
    private int size;
    private int capacity;

    public ArrayQueue(int capacity) {
        this.capacity = capacity;
        queue = new int[capacity];
        front = 0;
        rear = -1;
        size = 0;
    }

    public void enqueue(int element) {
        if (isFull()) {
            throw new IllegalStateException("Queue is full");
        }
        rear = (rear + 1) % capacity;
        queue[rear] = element;
        size++;
    }

    public int dequeue() {
        if (isEmpty()) {
            throw new NoSuchElementException("Queue is empty");
        }
        int element = queue[front];
        front = (front + 1) % capacity;
        size--;
        return element;
    }

    public int peek() {
        if (isEmpty()) {
            throw new NoSuchElementException("Queue is empty");
        }
        return queue[front];
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean isFull() {
        return size == capacity;
    }

    public int size() {
        return size;
    }

    public static void main(String[] args) {
        ArrayQueue queue = new ArrayQueue(5);
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);
        queue.enqueue(4);
        queue.enqueue(5);
        System.out.println(queue.dequeue()); 
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
        System.out.println(queue.peek());    
        System.out.println(queue.size());    
    }
}

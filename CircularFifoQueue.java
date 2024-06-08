import java.util.NoSuchElementException;

class CircularFifoQueue<T> {
    private Object[] queue;
    private int front;
    private int rear;
    private int size;
    private int capacity;

    public CircularFifoQueue(int capacity) {
        this.capacity = capacity;
        queue = new Object[capacity];
        front = 0;
        rear = -1;
        size = 0;
    }

    public void enqueue(T element) {
        if (isFull()) {
            throw new IllegalStateException("Queue is full");
        }
        rear = (rear + 1) % capacity;
        queue[rear] = element;
        size++;
    }

    @SuppressWarnings("unchecked")
    public T dequeue() {
        if (isEmpty()) {
            throw new NoSuchElementException("Queue is empty");
        }
        T element = (T) queue[front];
        queue[front] = null;
        front = (front + 1) % capacity;
        size--;
        return element;
    }

    @SuppressWarnings("unchecked")
    public T peek() {
        if (isEmpty()) {
            throw new NoSuchElementException("Queue is empty");
        }
        return (T) queue[front];
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
        CircularFifoQueue<Integer> queue = new CircularFifoQueue<>(7);
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(5);
        queue.enqueue(24);  
        queue.enqueue(18);
        queue.enqueue(65);
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
        System.out.println(queue.size());
        queue.enqueue(55);
        System.out.println(queue.dequeue());
        System.out.println(queue.peek());    
        System.out.println(queue.size());    
    }
}

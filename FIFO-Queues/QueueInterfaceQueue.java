import java.util.Queue;
import java.util.LinkedList;
import java.util.NoSuchElementException;

class QueueInterfaceQueue {
    private Queue<Integer> queue;

    public QueueInterfaceQueue() {
        queue = new LinkedList<>();
    }

    public void enqueue(int element) {
        queue.offer(element);
    }

    public int dequeue() {
        if (isEmpty()) {
            throw new NoSuchElementException("Queue is empty");
        }
        return queue.poll();
    }

    public int peek() {
        if (isEmpty()) {
            throw new NoSuchElementException("Queue is empty");
        }
        return queue.peek();
    }

    public boolean isEmpty() {
        return queue.isEmpty();
    }

    public int size() {
        return queue.size();
    }

    public static void main(String[] args) {
        QueueInterfaceQueue queue = new QueueInterfaceQueue();
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(7);
        queue.enqueue(87);
        queue.enqueue(25);
        queue.enqueue(3);
        queue.enqueue(78);
        System.out.println(queue.dequeue());
        System.out.println(queue.peek());
        System.out.println(queue.dequeue());
        System.out.println(queue.size());  
        System.out.println(queue.dequeue());
        System.out.println(queue.peek());
        System.out.println(queue.dequeue());
  
        System.out.println(queue.size());    
    }
}

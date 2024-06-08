import java.util.LinkedList;
import java.util.NoSuchElementException;

class LinkedListQueue {
    private LinkedList<Integer> queue;

    public LinkedListQueue() {
        queue = new LinkedList<>();
    }

    public void enqueue(int element) {
        queue.addLast(element);
    }

    public int dequeue() {
        if (isEmpty()) {
            throw new NoSuchElementException("Queue is empty");
        }
        return queue.removeFirst();
    }

    public int peek() {
        if (isEmpty()) {
            throw new NoSuchElementException("Queue is empty");
        }
        return queue.getFirst();
    }

    public boolean isEmpty() {
        return queue.isEmpty();
    }

    public int size() {
        return queue.size();
    }

    public static void main(String[] args) {
        LinkedListQueue queue = new LinkedListQueue();
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(10);
        queue.enqueue(8);
        queue.enqueue(9);
        System.out.println(queue.dequeue()); 
        System.out.println(queue.dequeue()); 
        System.out.println(queue.dequeue()); 
        System.out.println(queue.peek());    
        System.out.println(queue.size());    
    }
}

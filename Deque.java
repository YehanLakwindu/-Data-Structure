import java.util.LinkedList;
import java.util.NoSuchElementException;

class Deque<T> {
    private LinkedList<T> front;
    private LinkedList<T> rear;

    public Deque() {
        front = new LinkedList<>();
        rear = new LinkedList<>();
    }

    public void addFirst(T element) {
        front.addFirst(element);
    }

    public void addLast(T element) {
        rear.addLast(element);
    }

    public T removeFirst() {
        if (isEmpty()) {
            throw new NoSuchElementException("Deque is empty");
        }
        if (front.isEmpty()) {
            while (!rear.isEmpty()) {
                front.addLast(rear.removeFirst());
            }
        }
        return front.removeFirst();
    }

    public T removeLast() {
        if (isEmpty()) {
            throw new NoSuchElementException("Deque is empty");
        }
        if (rear.isEmpty()) {
            while (!front.isEmpty()) {
                rear.addFirst(front.removeLast());
            }
        }
        return rear.removeLast();
    }

    public T peekFirst() {
        if (isEmpty()) {
            throw new NoSuchElementException("Deque is empty");
        }
        if (front.isEmpty()) {
            while (!rear.isEmpty()) {
                front.addLast(rear.removeFirst());
            }
        }
        return front.peekFirst();
    }

    public T peekLast() {
        if (isEmpty()) {
            throw new NoSuchElementException("Deque is empty");
        }
        if (rear.isEmpty()) {
            while (!front.isEmpty()) {
                rear.addFirst(front.removeLast());
            }
        }
        return rear.peekLast();
    }

    public boolean isEmpty() {
        return front.isEmpty() && rear.isEmpty();
    }

    public int size() {
        return front.size() + rear.size();
    }

    public static void main(String[] args) {
        Deque<Integer> deque = new Deque<>();
        deque.addFirst(1);
        deque.addLast(2);
        deque.addFirst(3);
        deque.addLast(4);
        deque.addFirst(5);
        deque.addLast(6);
        System.out.println(deque.removeFirst()); 
        System.out.println(deque.removeLast());  
        System.out.println(deque.peekFirst());   
        System.out.println(deque.peekLast()); 
        System.out.println(deque.removeFirst()); 
        System.out.println(deque.removeLast()); 
        System.out.println(deque.size());        
    }
}

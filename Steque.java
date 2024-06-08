import java.util.LinkedList;
import java.util.NoSuchElementException;

class Steque<T> {
    private LinkedList<T> list;

    public Steque() {
        list = new LinkedList<>();
    }

   
    public void push(T element) {
        list.addFirst(element);
    }

  
    public void enqueue(T element) {
        list.addLast(element);
    }

    
    public T pop() {
        if (isEmpty()) {
            throw new NoSuchElementException("Steque is empty");
        }
        return list.removeFirst();
    }

   
    public T dequeue() {
        if (isEmpty()) {
            throw new NoSuchElementException("Steque is empty");
        }
        return list.removeLast();
    }

    
    public T peek() {
        if (isEmpty()) {
            throw new NoSuchElementException("Steque is empty");
        }
        return list.getFirst();
    }

 
    public int size() {
        return list.size();
    }

  
    public boolean isEmpty() {
        return list.isEmpty();
    }

    public static void main(String[] args) {
        Steque<Integer> steque = new Steque<>();
        steque.push(1);
        steque.push(10);
        steque.push(19);
        steque.enqueue(2);
        steque.push(3);
        System.out.println(steque.pop());     
        System.out.println(steque.dequeue());  
        System.out.println(steque.peek());     
        System.out.println(steque.size());     
    }
}

import java.util.Deque;
import java.util.ArrayDeque;
import java.util.EmptyStackException;

class DequeStack {
    private Deque<Integer> stack;

    public DequeStack() {
        stack = new ArrayDeque<>();
    }

    public void push(int element) {
        stack.push(element);
    }

    public int pop() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        return stack.pop();
    }

    public int peek() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        return stack.peek();
    }

    public boolean isEmpty() {
        return stack.isEmpty();
    }

    public int size() {
        return stack.size();
    }

    public static void main(String[] args) {
        DequeStack stack = new DequeStack();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        stack.push(6);
        System.out.println(stack.pop()); 
        System.out.println(stack.peek()); 
        System.out.println(stack.pop()); 
        System.out.println(stack.peek()); 
        System.out.println(stack.size()); 
    }
}

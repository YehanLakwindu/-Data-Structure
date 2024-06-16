class StackNode {
    int data;
    StackNode next;

    StackNode(int data) {
        this.data = data;
        this.next = null;
    }
}
public class StackUsingLinkedList {

    private StackNode top;

    public StackUsingLinkedList() {
        this.top = null;
    }

    // Push operation to add an element to the stack
    public void push(int data) {
        StackNode newNode = new StackNode(data);
        if (top == null) {
            top = newNode;
        } else {
            newNode.next = top;
            top = newNode;
        }
        System.out.println(data + " pushed to stack");
    }

    // Pop operation to remove an element from the stack
    public int pop() {
        if (top == null) {
            System.out.println("Stack is empty");
            return Integer.MIN_VALUE;
        } else {
            int poppedData = top.data;
            top = top.next;
            return poppedData;
        }
    }

    // Peek operation to view the top element of the stack
    public int peek() {
        if (top == null) {
            System.out.println("Stack is empty");
            return Integer.MIN_VALUE;
        } else {
            return top.data;
        }
    }

    // Check if the stack is empty
    public boolean isEmpty() {
        return top == null;
    }

    // Print all elements in the stack
    public void printStack() {
        if (top == null) {
            System.out.println("Stack is empty");
            return;
        }
        StackNode currentNode = top;
        while (currentNode != null) {
            System.out.print(currentNode.data + " ");
            currentNode = currentNode.next;
        }
        System.out.println();
    }

    // Main method to test the stack implementation
    public static void main(String[] args) {
        StackUsingLinkedList stack = new StackUsingLinkedList();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.push(50);

        System.out.println("Top element is " + stack.peek());

        System.out.println("Stack elements:");
        stack.printStack();

        System.out.println(stack.pop() + " popped from stack");
        System.out.println("Top element is " + stack.peek());

        System.out.println("Stack elements after pop:");
        stack.printStack();
    }
}

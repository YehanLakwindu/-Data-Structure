public class DoublyLinkedListTest {


    class Node {
        int item;
        Node previous;
        Node next;

        public Node(int item) {
            this.item = item;
        }
    }

 
    Node head, tail = null;

    
    public void addNode(int item) {
        
        Node newNode = new Node(item);

    
        if (head == null) {
            head = tail = newNode;
            // head's previous will be null
            head.previous = null;
            // tail's next will be null
            tail.next = null;
        } else {
        
            tail.next = newNode;
            // newNode->previous set to tail
            newNode.previous = tail;
            // newNode becomes new tail
            tail = newNode;
            // tail's next points to null
            tail.next = null;
        }
    }

    // Print all the nodes of doubly linked list
    public void printNodes() {
        // Node current will point to head
        Node current = head;
        if (head == null) {
            System.out.println("Doubly linked list is empty");
            return;
        }
        System.out.println("Nodes of doubly linked list:");
        while (current != null) {
            // Print each node and then go to the next.
            System.out.print(current.item + " ");
            current = current.next;
        }
        System.out.println(); // for a new line after printing the list
    }

    // Main method to run the test
    public static void main(String[] args) {
        // Create a DoublyLinkedListTest object
        DoublyLinkedListTest dl_List = new DoublyLinkedListTest();
        // Add nodes to the list
        dl_List.addNode(10);
        dl_List.addNode(20);
        dl_List.addNode(30);
        dl_List.addNode(40);
        dl_List.addNode(50);
        dl_List.addNode(60);
        dl_List.addNode(70);
        dl_List.addNode(80);
        dl_List.addNode(90);

        // Print the nodes of DoublyLinkedList
        dl_List.printNodes();
    }
}

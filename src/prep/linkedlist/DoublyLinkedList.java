package prep.linkedlist;
class DoublyLinkedList {
    // Node class represents a node in the doubly linked list
    class Node {
        int data; // Data stored in the node
        Node next; // Reference to the next node
        Node prev; // Reference to the previous node

        // Constructor to initialize the node
        public Node(int data) {
            this.data = data;
            this.next = null;
            this.prev = null;
        }
    }

    Node head; // Reference to the head of the linked list

    // Constructor to initialize an empty linked list
    public DoublyLinkedList() {
        this.head = null;
    }

    // Method to insert a new node at the end of the linked list
    public void insert(int data) {
        Node newNode = new Node(data);

        // If the list is empty, set the new node as the head
        if (head == null) {
            head = newNode;
        } else {
            // Traverse the list to find the last node
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }

            // Set the new node as the next node of the last node
            current.next = newNode;
            newNode.prev = current;
        }
    }

    // Method to display the elements of the linked list in both directions
    public void display() {
        Node current = head;

        // Traverse the list and print each element from the head to tail
        System.out.print("Forward: ");
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }

        System.out.println();

        // Traverse the list in reverse and print each element from tail to head
        System.out.print("Backward: ");
        current = head;
        while (current.next != null) {
            current = current.next;
        }

        while (current != null) {
            System.out.print(current.data + " ");
            current = current.prev;
        }

        System.out.println();
    }

    // Main method to test the doubly linked list
    public static void main(String[] args) {
        // Create a new doubly linked list
        DoublyLinkedList doublyLinkedList = new DoublyLinkedList();

        // Insert elements into the linked list
        doublyLinkedList.insert(1);
        doublyLinkedList.insert(2);
        doublyLinkedList.insert(3);

        // Display the elements of the doubly linked list
        doublyLinkedList.display();
    }
}
//Node data,next ,prev.
//head always important new node then add data changes to temp & connect the head.
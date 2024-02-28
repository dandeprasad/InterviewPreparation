package prep.linkedlist;

class CircularLinkedList {
    // Node class represents a node in the circular linked list
    class Node {
        int data; // Data stored in the node
        Node next; // Reference to the next node

        // Constructor to initialize the node
        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    Node head; // Reference to the head of the linked list

    // Constructor to initialize an empty linked list
    public CircularLinkedList() {
        this.head = null;
    }

    // Method to insert a new node at the end of the circular linked list
    public void insert(int data) {
        Node newNode = new Node(data);

        // If the list is empty, set the new node as the head and make it circular
        if (head == null) {
            head = newNode;
            head.next = head;
        } else {
            // Traverse the list to find the last node
            Node current = head;
            while (current.next != head) {
                current = current.next;
            }

            // Set the new node as the next node of the last node and make it circular
            current.next = newNode;
            newNode.next = head;
        }
    }

    // Method to display the elements of the circular linked list
    public void display() {
        if (head == null) {
            System.out.println("Circular Linked List is empty.");
            return;
        }

        Node current = head;

        // Traverse the circular list and print each element
        do {
            System.out.print(current.data + " ");
            current = current.next;
        } while (current != head);

        System.out.println();
    }

    // Main method to test the circular linked list
    public static void main(String[] args) {
        // Create a new circular linked list
        CircularLinkedList circularLinkedList = new CircularLinkedList();

        // Insert elements into the circular linked list
        circularLinkedList.insert(1);
        circularLinkedList.insert(2);
        circularLinkedList.insert(3);

        // Display the elements of the circular linked list
        circularLinkedList.display();
    }
}

//Node data,next ,final node next to head
//head always important new node then add data changes to temp & connect the head
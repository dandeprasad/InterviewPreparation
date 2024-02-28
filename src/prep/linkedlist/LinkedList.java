package prep.linkedlist;

// Node class represents a node in the linked list
class Node {
    int data; // Data stored in the node
    Node next; // Reference to the next node

    // Constructor to initialize the node
    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

// LinkedList class represents the linked list
class LinkedList {
    Node head; // Reference to the head of the linked list

    // Constructor to initialize an empty linked list
    public LinkedList() {
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
        }
    }

    // Method to display the elements of the linked list
    public void display() {
        Node current = head;

        // Traverse the list and print each element
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }



    public static void main(String[] args) {
        // Create a new linked list
        LinkedList linkedList = new LinkedList();

        // Insert elements into the linked list
        linkedList.insert(1);
        linkedList.insert(2);
        linkedList.insert(3);

        // Display the elements of the linked list
        System.out.print("Linked List: ");
        linkedList.display();
    }
}

// Define the LinkedList class
class LinkedList {
    Node head; // Head of the list

    // Define a Node
    class Node {
        int data;
        Node next;

        Node(int d) { // Constructor
            data = d;
            next = null;
        }
    }

    // Insert a node at the beginning
    public void insertAtBeginning(int newData) {
        Node newNode = new Node(newData); // Create a new node
        newNode.next = head; // Link new node to the old head
        head = newNode; // Make new node the head
    }

    // Insert a node at the end
    public void insertAtEnd(int newData) {
        Node newNode = new Node(newData); // Create a new node
        if (head == null) { // If list is empty, make it head
            head = newNode;
            return;
        }
        Node temp = head;
        while (temp.next != null) { // Traverse to last node
            temp = temp.next;
        }
        temp.next = newNode; // Link last node to new node
    }

    // Delete a node from the beginning
    public void deleteFromBeginning() {
        if (head == null) { // If list is empty
            System.out.println("List is empty");
            return;
        }
        head = head.next; // Move head to next node
    }

    // Print the linked list
    public void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    // Main method to test the linked list
    public static void main(String[] args) {
        LinkedList list = new LinkedList();

        list.insertAtBeginning(10);
        list.insertAtEnd(20);
        list.insertAtBeginning(5);
        list.printList(); // Output: 5 -> 10 -> 20 -> null

        list.deleteFromBeginning();
        list.printList(); // Output: 10 -> 20 -> null
    }
}

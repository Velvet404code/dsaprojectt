import java.util.NoSuchElementException;

//Node class
class Node {
    int data;
    Node next;

    Node(int d) {
        this.data = d; 
        this.next = null;
    }
}

//LinkedList class
class LinkedList {
    private Node head; // Head of the list

    // Insert node at the beginning
    public void addFirst(int newData) {
        Node newNode = new Node(newData);
        newNode.next = head;
        head = newNode;
    }

    // Insert node at the end
    public void addLast(int newData) {
        Node newNode = new Node(newData);
        if (head == null) {
            head = newNode;
            return;
        }
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
    }

    // Delete node from the beginning
    public void deleteFromBeginning() {
        if (head == null) {
            throw new NoSuchElementException("List is empty");
        }
        head = head.next;
    }

    // Print linked list
    public String printList() {
        StringBuilder result = new StringBuilder();
        Node temp = head;
        while (temp != null) {
            result.append(temp.data).append(" -> ");
            temp = temp.next;
        }
        result.append("null");
        return result.toString();
    }

    // Main method to test linked list
    public static void main(String[] args) {
        LinkedList list = new LinkedList();

        list.addFirst(10);
        list.addLast(20);
        list.addFirst(5);
        System.out.println(list.printList()); // Output: 5 -> 10 -> 20 -> null

        list.deleteFromBeginning();
        System.out.println(list.printList()); // Output: 10 -> 20 -> null
    }
}
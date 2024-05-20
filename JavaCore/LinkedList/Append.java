package LinkedList;

public class Append {
    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);

        System.out.print("Original list: ");
        printList(head);

        append(head, 4);

        System.out.print("List after: ");
        printList(head);
    }

    public static class Node {
        public int data;
        public Node next;

        public Node(int data) {
            this.data = data;
        }
    }

    public static void append(Node head, int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        Node current = head;
        while (current.next != null) {
            current = current.next;
        }
        current.next = newNode;
    }

    public static void printList(Node head) {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }



}

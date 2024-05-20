package LinkedList;

public class Insert {
    public static class Node {
        public int data;
        public Node next;

        public Node(int data) {
            this.data = data;
        }
    }

    public static Node insertAtPosition(Node head, int data, int position) {

        Node newNode = new Node(data);
        if (position == 0) {
            newNode.next = head;
            return newNode; // New node becomes the head
        }

        Node current = head;
        int count = 0;
        while (current != null && count < position - 1) {
            current = current.next;
            count++;
        }

        if (current == null || position < 0) {
            System.out.println("Invalid position");
            return head;
        }

        newNode.next = current.next;
        current.next = newNode;
        return head;
    }

    public static void printList(Node head) {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);

        printList(head);

        head = insertAtPosition(head, 4, 2);

        printList(head);

    }

}
